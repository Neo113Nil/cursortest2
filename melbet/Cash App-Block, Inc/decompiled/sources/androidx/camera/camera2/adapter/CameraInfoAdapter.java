package androidx.camera.camera2.adapter;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import androidx.camera.view.PreviewStreamStateObserver;
import androidx.compose.ui.window.Api33Impl;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.fillr.n;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import squareup.cash.earnings.EarningsTimeFrame;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraInfoAdapter implements CameraInfoInternal, UnsafeWrapper {
    public final Lazy _physicalCameraInfos$delegate;
    public final Lazy camera2CameraInfo$delegate;
    public final CameraCallbackMap cameraCallbackMap;
    public final n.a cameraConfig;
    public final CameraControlStateAdapter cameraControlStateAdapter;
    public final CameraPipeCameraProperties cameraProperties;
    public final CameraQuirks cameraQuirks;
    public final CameraStateAdapter cameraStateAdapter;
    public final EncoderProfilesProvider encoderProfilesProvider;
    public final Lazy isLegacyDevice$delegate;
    public final StreamConfigurationMapCompat streamConfigurationMapCompat;

    public CameraInfoAdapter(CameraPipeCameraProperties cameraPipeCameraProperties, n.a aVar, CameraStateAdapter cameraStateAdapter, CameraControlStateAdapter cameraControlStateAdapter, CameraCallbackMap cameraCallbackMap, FocusMeteringControl focusMeteringControl, CameraQuirks cameraQuirks, EncoderProfilesProvider encoderProfilesProvider, StreamConfigurationMapCompat streamConfigurationMapCompat, IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl, Recorder.AnonymousClass1 anonymousClass1) {
        String str;
        cameraPipeCameraProperties.getClass();
        aVar.getClass();
        cameraStateAdapter.getClass();
        cameraControlStateAdapter.getClass();
        cameraCallbackMap.getClass();
        focusMeteringControl.getClass();
        cameraQuirks.getClass();
        encoderProfilesProvider.getClass();
        streamConfigurationMapCompat.getClass();
        intrinsicZoomCalculatorImpl.getClass();
        anonymousClass1.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.cameraConfig = aVar;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraControlStateAdapter = cameraControlStateAdapter;
        this.cameraCallbackMap = cameraCallbackMap;
        this.cameraQuirks = cameraQuirks;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Camera2CameraMetadata camera2CameraMetadata = (Camera2CameraMetadata) cameraMetadata;
        camera2CameraMetadata.getClass();
        Object obj = camera2CameraMetadata.get(key);
        Integer num = (Integer) (obj != null ? obj : -1);
        final int i = 1;
        final int i2 = 2;
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        final int i3 = 0;
        this._physicalCameraInfos$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ CameraInfoAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                CameraInfoAdapter cameraInfoAdapter = this.f$0;
                switch (i4) {
                    case 0:
                        CameraPipeCameraProperties cameraPipeCameraProperties2 = cameraInfoAdapter.cameraProperties;
                        Set set = (Set) ((Camera2CameraMetadata) cameraPipeCameraProperties2.metadata)._physicalCameraIds.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((CameraId) it.next()).value;
                            n.a aVar2 = new n.a(str2, 1);
                            Camera2CameraMetadata camera2CameraMetadata2 = (Camera2CameraMetadata) cameraPipeCameraProperties2.metadata;
                            camera2CameraMetadata2.getClass();
                            if (!((Set) camera2CameraMetadata2._physicalCameraIds.getValue()).contains(new CameraId(str2))) {
                                throw new IllegalStateException((((Object) CameraId.m46toStringimpl(str2)) + " is not a valid physical camera on " + camera2CameraMetadata2).toString());
                            }
                            linkedHashSet.add(new PhysicalCameraInfoAdapter(new CameraPipeCameraProperties(aVar2, camera2CameraMetadata2.metadataProvider.m72awaitCameraMetadataEfqyGwQ(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        CameraMetadata.Companion companion = CameraMetadata.Companion;
                        CameraMetadata cameraMetadata2 = cameraInfoAdapter.cameraProperties.metadata;
                        companion.getClass();
                        return Boolean.valueOf(CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2));
                    default:
                        CameraPipeCameraProperties cameraPipeCameraProperties3 = cameraInfoAdapter.cameraProperties;
                        cameraPipeCameraProperties3.getClass();
                        return new Camera2CameraInfo(cameraPipeCameraProperties3);
                }
            }
        });
        this.isLegacyDevice$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ CameraInfoAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                CameraInfoAdapter cameraInfoAdapter = this.f$0;
                switch (i4) {
                    case 0:
                        CameraPipeCameraProperties cameraPipeCameraProperties2 = cameraInfoAdapter.cameraProperties;
                        Set set = (Set) ((Camera2CameraMetadata) cameraPipeCameraProperties2.metadata)._physicalCameraIds.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((CameraId) it.next()).value;
                            n.a aVar2 = new n.a(str2, 1);
                            Camera2CameraMetadata camera2CameraMetadata2 = (Camera2CameraMetadata) cameraPipeCameraProperties2.metadata;
                            camera2CameraMetadata2.getClass();
                            if (!((Set) camera2CameraMetadata2._physicalCameraIds.getValue()).contains(new CameraId(str2))) {
                                throw new IllegalStateException((((Object) CameraId.m46toStringimpl(str2)) + " is not a valid physical camera on " + camera2CameraMetadata2).toString());
                            }
                            linkedHashSet.add(new PhysicalCameraInfoAdapter(new CameraPipeCameraProperties(aVar2, camera2CameraMetadata2.metadataProvider.m72awaitCameraMetadataEfqyGwQ(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        CameraMetadata.Companion companion = CameraMetadata.Companion;
                        CameraMetadata cameraMetadata2 = cameraInfoAdapter.cameraProperties.metadata;
                        companion.getClass();
                        return Boolean.valueOf(CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2));
                    default:
                        CameraPipeCameraProperties cameraPipeCameraProperties3 = cameraInfoAdapter.cameraProperties;
                        cameraPipeCameraProperties3.getClass();
                        return new Camera2CameraInfo(cameraPipeCameraProperties3);
                }
            }
        });
        this.camera2CameraInfo$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda0
            public final /* synthetic */ CameraInfoAdapter f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                CameraInfoAdapter cameraInfoAdapter = this.f$0;
                switch (i4) {
                    case 0:
                        CameraPipeCameraProperties cameraPipeCameraProperties2 = cameraInfoAdapter.cameraProperties;
                        Set set = (Set) ((Camera2CameraMetadata) cameraPipeCameraProperties2.metadata)._physicalCameraIds.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            String str2 = ((CameraId) it.next()).value;
                            n.a aVar2 = new n.a(str2, 1);
                            Camera2CameraMetadata camera2CameraMetadata2 = (Camera2CameraMetadata) cameraPipeCameraProperties2.metadata;
                            camera2CameraMetadata2.getClass();
                            if (!((Set) camera2CameraMetadata2._physicalCameraIds.getValue()).contains(new CameraId(str2))) {
                                throw new IllegalStateException((((Object) CameraId.m46toStringimpl(str2)) + " is not a valid physical camera on " + camera2CameraMetadata2).toString());
                            }
                            linkedHashSet.add(new PhysicalCameraInfoAdapter(new CameraPipeCameraProperties(aVar2, camera2CameraMetadata2.metadataProvider.m72awaitCameraMetadataEfqyGwQ(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        CameraMetadata.Companion companion = CameraMetadata.Companion;
                        CameraMetadata cameraMetadata2 = cameraInfoAdapter.cameraProperties.metadata;
                        companion.getClass();
                        return Boolean.valueOf(CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata2));
                    default:
                        CameraPipeCameraProperties cameraPipeCameraProperties3 = cameraInfoAdapter.cameraProperties;
                        cameraPipeCameraProperties3.getClass();
                        return new Camera2CameraInfo(cameraPipeCameraProperties3);
                }
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void addSessionCaptureCallback(Executor executor, PreviewStreamStateObserver.AnonymousClass2 anonymousClass2) {
        executor.getClass();
        this.cameraCallbackMap.addCaptureCallback(anonymousClass2, executor);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getAvailableCapabilities() {
        Set set;
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (iArr != null) {
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    set = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length));
                    for (int i : iArr) {
                        set.add(Integer.valueOf(i));
                    }
                } else {
                    set = SetsKt__SetsJVMKt.setOf(Integer.valueOf(iArr[0]));
                }
            } else {
                set = EmptySet.INSTANCE;
            }
            if (set != null) {
                return set;
            }
        }
        return EmptySet.INSTANCE;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getCameraCharacteristics() {
        Object unwrapAs = ((Camera2CameraMetadata) this.cameraProperties.metadata).unwrapAs(Reflection.factory.getOrCreateKotlinClass(CameraCharacteristics.class));
        unwrapAs.getClass();
        return (CameraCharacteristics) unwrapAs;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final String getCameraId() {
        return this.cameraConfig.b;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Quirks getCameraQuirks() {
        return this.cameraQuirks.getQuirks();
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getCameraState() {
        return this.cameraStateAdapter.cameraState;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.encoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        return ((Boolean) this.isLegacyDevice$delegate.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            return 0;
        }
        int i = 1;
        if (intValue != 1) {
            i = 2;
            if (intValue != 2) {
                if (!StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                    return -1;
                }
                Log.w("CXCP", "Unrecognized lens facing: " + intValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Rect getSensorRect() {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i) {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        return GenieForEachViewKt.getRelativeImageRotation(GenieForEachViewKt.surfaceRotationToDegrees(i), ((Number) obj).intValue(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedDynamicRanges() {
        return ((DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl) Api33Impl.fromCameraMetaData(this.cameraProperties.metadata).this$0).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighSpeedResolutions() {
        List list;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.streamConfigurationMapCompat.impl.mClientFragmentManager;
        Size[] highSpeedVideoSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizes() : null;
        return (highSpeedVideoSizes == null || (list = ArraysKt___ArraysKt.toList(highSpeedVideoSizes)) == null) ? EmptyList.INSTANCE : list;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighSpeedResolutionsFor(Range range) {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            StreamConfigurationMapCompat streamConfigurationMapCompat = this.streamConfigurationMapCompat;
            streamConfigurationMapCompat.getClass();
            BiometricPrompt biometricPrompt = streamConfigurationMapCompat.impl;
            biometricPrompt.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) biometricPrompt.mClientFragmentManager;
            Size[] highSpeedVideoSizesFor = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoSizesFor(range) : null;
            failure = highSpeedVideoSizesFor != null ? ArraysKt___ArraysKt.toList(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        List list = (List) (failure instanceof Result.Failure ? null : failure);
        return list == null ? EmptyList.INSTANCE : list;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedOutputFormats() {
        Set set;
        Integer[] outputFormats = this.streamConfigurationMapCompat.impl.getOutputFormats();
        return (outputFormats == null || (set = ArraysKt___ArraysKt.toSet(outputFormats)) == null) ? EmptySet.INSTANCE : set;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedResolutions(int i) {
        List list;
        Size[] outputSizes = this.streamConfigurationMapCompat.getOutputSizes(i);
        return (outputSizes == null || (list = ArraysKt___ArraysKt.toList(outputSizes)) == null) ? EmptyList.INSTANCE : list;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Timebase getTimebase() {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        key.getClass();
        Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
        obj.getClass();
        int intValue = ((Number) obj).intValue();
        Timebase timebase = Timebase.UPTIME;
        return (intValue == 0 || intValue != 1) ? timebase : Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getTorchState() {
        return this.cameraControlStateAdapter.torchControl._torchState;
    }

    @Override // androidx.camera.core.CameraInfo
    public final LiveData getZoomState() {
        return (MutableLiveData) this.cameraControlStateAdapter.zoomControl._zoomState$delegate.getValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        return EarningsTimeFrame.TimeFrame.isFlashAvailable$default(this.cameraProperties);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isExternalCamera() {
        if (getLensFacing() == 2) {
            return true;
        }
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((Camera2CameraMetadata) cameraMetadata).get(key);
        return num != null && num.intValue() == 4;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isHighSpeedSupported() {
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        companion.getClass();
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (iArr == null) {
            iArr = CameraMetadata.Companion.EMPTY_INT_ARRAY;
        }
        return ArraysKt___ArraysKt.contains(iArr, 9);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isPreviewStabilizationSupported() {
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        companion.getClass();
        return CameraMetadata.Companion.getSupportsPreviewStabilization(cameraMetadata);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isVideoStabilizationSupported() {
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        return iArr != null && ArraysKt___ArraysKt.contains(iArr, 1);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        cameraCaptureCallback.getClass();
        CameraCallbackMap cameraCallbackMap = this.cameraCallbackMap;
        cameraCallbackMap.getClass();
        synchronized (cameraCallbackMap.callbackMap) {
            cameraCallbackMap.callbackMap.remove(cameraCaptureCallback);
            cameraCallbackMap.callbacks = MapsKt__MapsKt.toMap(cameraCallbackMap.callbackMap);
        }
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.cameraConfig + ".cameraId>";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(Camera2CameraInfo.class))) {
            Camera2CameraInfo camera2CameraInfo = (Camera2CameraInfo) this.camera2CameraInfo$delegate.getValue();
            camera2CameraInfo.getClass();
            return camera2CameraInfo;
        }
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(CameraPipeCameraProperties.class));
        CameraPipeCameraProperties cameraPipeCameraProperties = this.cameraProperties;
        if (equals) {
            cameraPipeCameraProperties.getClass();
            return cameraPipeCameraProperties;
        }
        if (!kClass.equals(reflectionFactory.getOrCreateKotlinClass(CameraMetadata.class))) {
            return ((Camera2CameraMetadata) cameraPipeCameraProperties.metadata).unwrapAs(kClass);
        }
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        cameraMetadata.getClass();
        return cameraMetadata;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
