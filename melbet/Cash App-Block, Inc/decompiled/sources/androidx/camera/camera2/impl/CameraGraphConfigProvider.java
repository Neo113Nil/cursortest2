package androidx.camera.camera2.impl;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.SurfaceHolder;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.internal.DynamicRangeConversions;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt;
import androidx.camera.camera2.pipe.CameraGraph$Config;
import androidx.camera.camera2.pipe.CameraGraph$Flags;
import androidx.camera.camera2.pipe.CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.InputStream$Config;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.MetadataTransform;
import androidx.camera.camera2.pipe.OutputStream$Config;
import androidx.camera.camera2.pipe.OutputStream$DynamicRangeProfile;
import androidx.camera.camera2.pipe.OutputStream$MirrorMode;
import androidx.camera.camera2.pipe.OutputStream$StreamUseCase;
import androidx.camera.camera2.pipe.OutputStream$StreamUseHint;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.compat.CameraPipeKeys;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewView;
import androidx.compose.ui.window.Api33Impl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.android.gms.dynamite.zzo;
import com.squareup.scannerview.CameraOperator$cameraOpenCallback$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.atomicfu.AtomicRef;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import squareup.cash.overdraft.OverdraftStatus;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraGraphConfigProvider {
    public final CameraCallbackMap callbackMap;
    public final n.a cameraConfig;
    public final Recorder.AnonymousClass1 cameraInteropStateCallbackRepository;
    public final CameraMetadata cameraMetadata;
    public final CameraQuirks cameraQuirks;
    public final CameraXConfig cameraXConfig;
    public final PreviewView.AnonymousClass1 closeCameraOnCameraGraphClose;
    public final ComboRequestListener requestListener;
    public final DynamicRangeProfiles supportedDynamicRangeProfiles;
    public final TemplateParamsOverride templateParamsOverride;
    public final ZslControl zslControl;

    public final class CameraGraphCreationResult {
        public final CameraGraph$Config config;
        public final Map streamConfigMap;

        public CameraGraphCreationResult(CameraGraph$Config cameraGraph$Config, Map map) {
            map.getClass();
            this.config = cameraGraph$Config;
            this.streamConfigMap = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CameraGraphCreationResult)) {
                return false;
            }
            CameraGraphCreationResult cameraGraphCreationResult = (CameraGraphCreationResult) obj;
            return this.config.equals(cameraGraphCreationResult.config) && Intrinsics.areEqual(this.streamConfigMap, cameraGraphCreationResult.streamConfigMap);
        }

        public final int hashCode() {
            return this.streamConfigMap.hashCode() + (this.config.hashCode() * 31);
        }

        public final String toString() {
            return "CameraGraphCreationResult(config=" + this.config + ", streamConfigMap=" + this.streamConfigMap + ')';
        }
    }

    public CameraGraphConfigProvider(CameraCallbackMap cameraCallbackMap, ComboRequestListener comboRequestListener, n.a aVar, CameraQuirks cameraQuirks, ZslControl zslControl, TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, Recorder.AnonymousClass1 anonymousClass1) {
        Recorder.AnonymousClass6 fromCameraMetaData;
        cameraCallbackMap.getClass();
        comboRequestListener.getClass();
        aVar.getClass();
        cameraQuirks.getClass();
        zslControl.getClass();
        this.callbackMap = cameraCallbackMap;
        this.requestListener = comboRequestListener;
        this.cameraConfig = aVar;
        this.cameraQuirks = cameraQuirks;
        this.zslControl = zslControl;
        this.templateParamsOverride = templateParamsOverride;
        this.cameraMetadata = cameraMetadata;
        this.cameraXConfig = cameraXConfig;
        this.cameraInteropStateCallbackRepository = anonymousClass1;
        this.closeCameraOnCameraGraphClose = new PreviewView.AnonymousClass1(4);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (i >= 33 && cameraMetadata != null && (fromCameraMetaData = Api33Impl.fromCameraMetaData(cameraMetadata)) != null) {
            if (i < 33) {
                Path$$ExternalSyntheticBUOutline0.m((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", " (requires API 33)"));
                throw null;
            }
            dynamicRangeProfiles = ((DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl) fromCameraMetaData.this$0).unwrap();
        }
        this.supportedDynamicRangeProfiles = dynamicRangeProfiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b2, code lost:
    
        if (kotlin.collections.ArraysKt___ArraysKt.contains(r8, r14.value) == true) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* renamed from: create-79VDu0o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CameraGraphCreationResult m31create79VDu0o(int i, SessionConfig sessionConfig, boolean z, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, Integer num, Map map, Map map2) {
        ArrayList arrayList;
        boolean z2;
        LinkedHashMap linkedHashMap;
        int i2;
        Range expectedFrameRateRange;
        CameraStream.Config config;
        CameraXConfig cameraXConfig;
        ArrayList arrayList2;
        CameraStream.Config config2;
        String str;
        OutputStream$MirrorMode outputStream$MirrorMode;
        OutputStream$MirrorMode outputStream$MirrorMode2;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList3;
        OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile;
        String str2;
        OutputStream$MirrorMode outputStream$MirrorMode3;
        OutputStream$MirrorMode outputStream$MirrorMode4;
        MetadataTransform.AnonymousClass1 anonymousClass1;
        int i3;
        OutputStream$StreamUseCase outputStream$StreamUseCase;
        OutputStream$StreamUseHint outputStream$StreamUseHint;
        Iterator it;
        int i4;
        LinkedHashMap linkedHashMap3;
        MetadataTransform.AnonymousClass1 anonymousClass12;
        MetadataTransform.AnonymousClass1 anonymousClass13 = MetadataTransform.AnonymousClass1.SURFACE;
        Integer num2 = 0;
        map.getClass();
        map2.getClass();
        boolean z3 = i == 2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        boolean z4 = z3;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        if (sessionConfig != null) {
            CaptureConfig captureConfig = sessionConfig.mRepeatingCaptureConfig;
            Recorder.AnonymousClass1 anonymousClass14 = this.cameraInteropStateCallbackRepository;
            if (anonymousClass14 != null) {
                CameraOperator$cameraOpenCallback$1 cameraOperator$cameraOpenCallback$1 = (CameraOperator$cameraOpenCallback$1) anonymousClass14.val$videoEncoderSession;
                cameraOperator$cameraOpenCallback$1.getClass();
                AtomicRef atomicRef = (AtomicRef) cameraOperator$cameraOpenCallback$1.this$0;
                List list = sessionConfig.mDeviceStateCallbacks;
                list.getClass();
                atomicRef.value = CollectionsKt.toList(list);
                Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) anonymousClass14.this$0;
                anonymousClass4.getClass();
                AtomicRef atomicRef2 = (AtomicRef) anonymousClass4.this$0;
                List list2 = sessionConfig.mSessionStateCallbacks;
                list2.getClass();
                atomicRef2.value = CollectionsKt.toList(list2);
            }
            int i5 = captureConfig.mTemplateType;
            if (i5 == -1) {
                i5 = 1;
            }
            linkedHashMap5.putAll(this.templateParamsOverride.mo25getOverrideParamsxlOpshk(new RequestTemplate(i5)));
            linkedHashMap5.putAll(OverdraftStatus.State_.toParameters(captureConfig.mImplementationOptions));
            if (i == 2) {
                Metadata.Key key = CameraPipeKeys.camera2ExtensionMode;
                num.getClass();
                linkedHashMap5.put(key, num);
            }
            OptionsBundle optionsBundle = sessionConfig.mRepeatingCaptureConfig.mImplementationOptions;
            new Camera2ImplConfig(optionsBundle);
            String str3 = (String) optionsBundle.retrieveOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, null);
            Iterator it2 = sessionConfig.mOutputConfigs.iterator();
            CameraStream.Config config3 = null;
            while (it2.hasNext()) {
                AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig = (AutoValue_SessionConfig_OutputConfig) it2.next();
                MetadataTransform.AnonymousClass1 anonymousClass15 = anonymousClass13;
                DeferrableSurface deferrableSurface = autoValue_SessionConfig_OutputConfig.surface;
                int i6 = i5;
                int i7 = autoValue_SessionConfig_OutputConfig.surfaceGroupId;
                deferrableSurface.getClass();
                String str4 = str3;
                String str5 = str3 == null ? null : str4;
                DynamicRange dynamicRange = autoValue_SessionConfig_OutputConfig.dynamicRange;
                dynamicRange.getClass();
                int i8 = autoValue_SessionConfig_OutputConfig.mirrorMode;
                boolean z5 = z4;
                int i9 = Build.VERSION.SDK_INT;
                Iterator it3 = it2;
                if (i9 >= 33) {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    OutputStream$DynamicRangeProfile outputStream$DynamicRangeProfile2 = new OutputStream$DynamicRangeProfile(1L);
                    DynamicRangeProfiles dynamicRangeProfiles = this.supportedDynamicRangeProfiles;
                    if (dynamicRangeProfiles != null) {
                        Long dynamicRangeToFirstSupportedProfile = DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
                        if (dynamicRangeToFirstSupportedProfile != null) {
                            outputStream$DynamicRangeProfile = new OutputStream$DynamicRangeProfile(dynamicRangeToFirstSupportedProfile.longValue());
                        } else if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                            Log.e("CXCP", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + dynamicRange);
                        }
                    }
                    outputStream$DynamicRangeProfile = outputStream$DynamicRangeProfile2;
                } else {
                    linkedHashMap2 = linkedHashMap4;
                    arrayList3 = arrayList4;
                    outputStream$DynamicRangeProfile = null;
                }
                Size size = deferrableSurface.mPrescribedSize;
                size.getClass();
                int i10 = deferrableSurface.mPrescribedStreamFormat;
                if (str5 == null) {
                    str2 = null;
                } else {
                    CameraId.m45constructorimpl(str5);
                    str2 = str5;
                }
                if (i8 == 0) {
                    outputStream$MirrorMode3 = new OutputStream$MirrorMode(1);
                } else if (i8 != 1) {
                    outputStream$MirrorMode4 = null;
                    if (z) {
                        Class cls = autoValue_SessionConfig_OutputConfig.surface.mContainerClass;
                        if (Intrinsics.areEqual(cls, MediaCodec.class)) {
                            anonymousClass12 = MetadataTransform.AnonymousClass1.MEDIA_CODEC;
                        } else if (Intrinsics.areEqual(cls, SurfaceHolder.class)) {
                            anonymousClass12 = MetadataTransform.AnonymousClass1.SURFACE_VIEW;
                        } else if (Intrinsics.areEqual(cls, SurfaceTexture.class)) {
                            anonymousClass12 = MetadataTransform.AnonymousClass1.SURFACE_TEXTURE;
                        }
                        anonymousClass1 = anonymousClass12;
                        if (z5) {
                            i3 = i10;
                            outputStream$StreamUseCase = null;
                        } else {
                            CameraMetadata cameraMetadata = this.cameraMetadata;
                            Long l = (Long) map.get(deferrableSurface);
                            i3 = i10;
                            OutputStream$StreamUseCase outputStream$StreamUseCase2 = l != null ? new OutputStream$StreamUseCase(l.longValue()) : null;
                            if (i9 >= 33 && outputStream$StreamUseCase2 != null && cameraMetadata != null) {
                                CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                                key2.getClass();
                                long[] jArr = (long[]) ((Camera2CameraMetadata) cameraMetadata).get(key2);
                                if (jArr != null) {
                                }
                            }
                            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                                Log.w("CXCP", "Expected stream use case for " + deferrableSurface + ", " + outputStream$StreamUseCase2 + " cannot be set!");
                            }
                            outputStream$StreamUseCase2 = null;
                            outputStream$StreamUseCase = outputStream$StreamUseCase2;
                        }
                        if (z5) {
                            outputStream$StreamUseHint = null;
                        } else {
                            Long l2 = (Long) map2.get(deferrableSurface);
                            outputStream$StreamUseHint = l2 != null ? new OutputStream$StreamUseHint(l2.longValue()) : null;
                        }
                        OutputStream$Config m48createvBYXiEU$default = MetadataTransform.AnonymousClass1.m48createvBYXiEU$default(i3, 544, size, anonymousClass1, outputStream$DynamicRangeProfile, outputStream$MirrorMode4, outputStream$StreamUseCase, outputStream$StreamUseHint, str2);
                        List list3 = autoValue_SessionConfig_OutputConfig.sharedSurfaces;
                        list3.getClass();
                        it = CollectionsKt.plus((Collection) list3, (Object) deferrableSurface).iterator();
                        while (it.hasNext()) {
                            DeferrableSurface deferrableSurface2 = (DeferrableSurface) it.next();
                            CameraStream.Config config4 = new CameraStream.Config(CollectionsKt__CollectionsJVMKt.listOf(m48createvBYXiEU$default));
                            linkedHashMap6.put(config4, deferrableSurface2);
                            if (i7 != -1) {
                                linkedHashMap3 = linkedHashMap2;
                                List list4 = (List) linkedHashMap3.get(Integer.valueOf(i7));
                                if (list4 == null) {
                                    i4 = i7;
                                    linkedHashMap3.put(Integer.valueOf(i7), CollectionsKt__CollectionsKt.mutableListOf(config4));
                                } else {
                                    i4 = i7;
                                    list4.add(config4);
                                }
                            } else {
                                i4 = i7;
                                linkedHashMap3 = linkedHashMap2;
                            }
                            if (Intrinsics.areEqual(deferrableSurface2, deferrableSurface)) {
                                ZslControl zslControl = this.zslControl;
                                deferrableSurface2.getClass();
                                if (zslControl.isZslSurface(deferrableSurface2, sessionConfig)) {
                                    config3 = config4;
                                }
                            }
                            linkedHashMap2 = linkedHashMap3;
                            i7 = i4;
                        }
                        str3 = str4;
                        anonymousClass13 = anonymousClass15;
                        i5 = i6;
                        z4 = z5;
                        it2 = it3;
                        linkedHashMap4 = linkedHashMap2;
                        arrayList4 = arrayList3;
                    }
                    anonymousClass1 = anonymousClass15;
                    if (z5) {
                    }
                    if (z5) {
                    }
                    OutputStream$Config m48createvBYXiEU$default2 = MetadataTransform.AnonymousClass1.m48createvBYXiEU$default(i3, 544, size, anonymousClass1, outputStream$DynamicRangeProfile, outputStream$MirrorMode4, outputStream$StreamUseCase, outputStream$StreamUseHint, str2);
                    List list32 = autoValue_SessionConfig_OutputConfig.sharedSurfaces;
                    list32.getClass();
                    it = CollectionsKt.plus((Collection) list32, (Object) deferrableSurface).iterator();
                    while (it.hasNext()) {
                    }
                    str3 = str4;
                    anonymousClass13 = anonymousClass15;
                    i5 = i6;
                    z4 = z5;
                    it2 = it3;
                    linkedHashMap4 = linkedHashMap2;
                    arrayList4 = arrayList3;
                } else {
                    outputStream$MirrorMode3 = new OutputStream$MirrorMode(2);
                }
                outputStream$MirrorMode4 = outputStream$MirrorMode3;
                if (z) {
                }
                anonymousClass1 = anonymousClass15;
                if (z5) {
                }
                if (z5) {
                }
                OutputStream$Config m48createvBYXiEU$default22 = MetadataTransform.AnonymousClass1.m48createvBYXiEU$default(i3, 544, size, anonymousClass1, outputStream$DynamicRangeProfile, outputStream$MirrorMode4, outputStream$StreamUseCase, outputStream$StreamUseHint, str2);
                List list322 = autoValue_SessionConfig_OutputConfig.sharedSurfaces;
                list322.getClass();
                it = CollectionsKt.plus((Collection) list322, (Object) deferrableSurface).iterator();
                while (it.hasNext()) {
                }
                str3 = str4;
                anonymousClass13 = anonymousClass15;
                i5 = i6;
                z4 = z5;
                it2 = it3;
                linkedHashMap4 = linkedHashMap2;
                arrayList4 = arrayList3;
            }
            int i11 = i5;
            ArrayList arrayList5 = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            if (sessionConfig.mInputConfiguration == null || config3 == null) {
                arrayList = arrayList5;
            } else {
                arrayList = arrayList5;
                arrayList.add(new InputStream$Config(config3, ((OutputStream$Config) CollectionsKt.single(config3.outputs)).f838format));
            }
            i2 = i11;
        } else {
            arrayList = arrayList4;
            z2 = z4;
            linkedHashMap = linkedHashMap4;
            i2 = 1;
        }
        CameraQuirks cameraQuirks = this.cameraQuirks;
        if (cameraQuirks.getQuirks().contains(CaptureSessionStuckQuirk.class) && StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
        }
        String str6 = Build.MODEL;
        str6.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = str6.toLowerCase(locale);
        lowerCase.getClass();
        CameraGraph$Flags cameraGraph$Flags = new CameraGraph$Flags((!z2 || DeviceQuirks.getAll().get(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && DeviceQuirks.getAll().get(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30, new zzo(cameraQuirks.getQuirks().contains(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior.AT_LEAST), StringsKt__StringsJVMKt.startsWith(lowerCase, "cph", false) ? 1 : 0, ((CloseCameraDeviceOnCameraGraphCloseQuirk) this.closeCameraOnCameraGraphClose.this$0) != null ? (CloseCameraDeviceOnCameraGraphCloseQuirk.isXiaomiProblematicDevice || !(!CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungProblematicDevice || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7570Device || CloseCameraDeviceOnCameraGraphCloseQuirk.isSamsungExynos7870Device)) ? z2 : true : false, 9);
        if (sessionConfig != null) {
            CaptureConfig captureConfig2 = sessionConfig.mRepeatingCaptureConfig;
            captureConfig2.getClass();
            Integer num3 = (Integer) captureConfig2.mImplementationOptions.retrieveOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, num2);
            Objects.requireNonNull(num3);
            int intValue = num3.intValue();
            Integer num4 = (Integer) captureConfig2.mImplementationOptions.retrieveOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, num2);
            Objects.requireNonNull(num4);
            int intValue2 = num4.intValue();
            if (intValue != 1 && intValue2 != 1) {
                if (intValue == 2) {
                    num2 = 2;
                } else if (intValue2 == 2) {
                    num2 = 1;
                }
            }
            expectedFrameRateRange = sessionConfig == null ? sessionConfig.mRepeatingCaptureConfig.getExpectedFrameRateRange() : null;
            if (Intrinsics.areEqual(expectedFrameRateRange, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                expectedFrameRateRange = null;
            }
            MapBuilder mapBuilder = new MapBuilder();
            if (z2) {
                mapBuilder.put(CameraPipeKeys.ignore3ARequiredParameters, Boolean.TRUE);
            }
            if (num2 != null) {
                mapBuilder.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(num2.intValue()));
            }
            mapBuilder.put(CameraPipeKeys.camera2CaptureRequestTag, "android.hardware.camera2.CaptureRequest.setTag.CX");
            if (expectedFrameRateRange != null) {
                mapBuilder.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, expectedFrameRateRange);
            }
            MapBuilder build = mapBuilder.build();
            if (expectedFrameRateRange != null) {
                linkedHashMap5.put(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, expectedFrameRateRange);
            }
            if (num2 != null) {
                linkedHashMap5.put(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num2);
            }
            if (sessionConfig == null) {
                OptionsBundle optionsBundle2 = sessionConfig.mRepeatingCaptureConfig.mImplementationOptions;
                new Camera2ImplConfig(optionsBundle2);
                String str7 = (String) optionsBundle2.retrieveOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, null);
                AutoValue_SessionConfig_OutputConfig autoValue_SessionConfig_OutputConfig2 = sessionConfig.mPostviewOutputConfig;
                if (autoValue_SessionConfig_OutputConfig2 != null) {
                    DeferrableSurface deferrableSurface3 = autoValue_SessionConfig_OutputConfig2.surface;
                    deferrableSurface3.getClass();
                    if (str7 == null) {
                        str7 = null;
                    }
                    int i12 = autoValue_SessionConfig_OutputConfig2.mirrorMode;
                    Size size2 = deferrableSurface3.mPrescribedSize;
                    size2.getClass();
                    int i13 = deferrableSurface3.mPrescribedStreamFormat;
                    if (str7 == null) {
                        str = null;
                    } else {
                        CameraId.m45constructorimpl(str7);
                        str = str7;
                    }
                    if (i12 == 0) {
                        outputStream$MirrorMode = new OutputStream$MirrorMode(1);
                    } else if (i12 != 1) {
                        outputStream$MirrorMode2 = null;
                        config2 = new CameraStream.Config(CollectionsKt__CollectionsJVMKt.listOf(MetadataTransform.AnonymousClass1.m48createvBYXiEU$default(i13, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, size2, null, null, outputStream$MirrorMode2, null, null, str)));
                        linkedHashMap6.put(config2, deferrableSurface3);
                    } else {
                        outputStream$MirrorMode = new OutputStream$MirrorMode(2);
                    }
                    outputStream$MirrorMode2 = outputStream$MirrorMode;
                    config2 = new CameraStream.Config(CollectionsKt__CollectionsJVMKt.listOf(MetadataTransform.AnonymousClass1.m48createvBYXiEU$default(i13, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, size2, null, null, outputStream$MirrorMode2, null, null, str)));
                    linkedHashMap6.put(config2, deferrableSurface3);
                } else {
                    config2 = null;
                }
                config = config2;
            } else {
                config = null;
            }
            cameraXConfig = this.cameraXConfig;
            if (cameraXConfig == null) {
                AutoValue_Config_Option autoValue_Config_Option = Camera2CaptureRequestConfiguratorKt.OPTION_CAPTURE_REQUEST_CONFIGURATOR;
                arrayList2 = null;
                if (cameraXConfig.mConfig.retrieveOption(Camera2CaptureRequestConfiguratorKt.OPTION_CAPTURE_REQUEST_CONFIGURATOR, null) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
            } else {
                arrayList2 = null;
            }
            return new CameraGraphCreationResult(new CameraGraph$Config(this.cameraConfig.b, CollectionsKt.toList(linkedHashMap6.keySet()), CollectionsKt.toList(linkedHashMap.values()), !arrayList.isEmpty() ? arrayList2 : arrayList, config, i2, linkedHashMap5, i, build, CollectionsKt__CollectionsKt.listOf((Object[]) new Request.Listener[]{this.callbackMap, this.requestListener}), CollectionsKt__CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), cameraGraph$Flags), MapsKt__MapsKt.toMap(linkedHashMap6));
        }
        num2 = null;
        if (sessionConfig == null) {
        }
        if (Intrinsics.areEqual(expectedFrameRateRange, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
        }
        MapBuilder mapBuilder2 = new MapBuilder();
        if (z2) {
        }
        if (num2 != null) {
        }
        mapBuilder2.put(CameraPipeKeys.camera2CaptureRequestTag, "android.hardware.camera2.CaptureRequest.setTag.CX");
        if (expectedFrameRateRange != null) {
        }
        MapBuilder build2 = mapBuilder2.build();
        if (expectedFrameRateRange != null) {
        }
        if (num2 != null) {
        }
        if (sessionConfig == null) {
        }
        cameraXConfig = this.cameraXConfig;
        if (cameraXConfig == null) {
        }
        return new CameraGraphCreationResult(new CameraGraph$Config(this.cameraConfig.b, CollectionsKt.toList(linkedHashMap6.keySet()), CollectionsKt.toList(linkedHashMap.values()), !arrayList.isEmpty() ? arrayList2 : arrayList, config, i2, linkedHashMap5, i, build2, CollectionsKt__CollectionsKt.listOf((Object[]) new Request.Listener[]{this.callbackMap, this.requestListener}), CollectionsKt__CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), cameraGraph$Flags), MapsKt__MapsKt.toMap(linkedHashMap6));
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) CameraId.m46toStringimpl(this.cameraConfig.b)) + '>';
    }
}
