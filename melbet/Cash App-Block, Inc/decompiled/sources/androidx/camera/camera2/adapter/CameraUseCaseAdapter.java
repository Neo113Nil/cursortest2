package androidx.camera.camera2.adapter;

import android.app.Application;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.streamsharing.StreamSharingBuilder;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import squareup.cash.overdraft.OverdraftStatus;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraUseCaseAdapter implements UseCaseConfigFactory {
    public final DisplayInfoManager displayInfoManager;

    public final class CaptureCallbackContainer extends CameraCaptureCallback {
        public final CameraCaptureSession.CaptureCallback captureCallback;

        public CaptureCallbackContainer(CameraCaptureSession.CaptureCallback captureCallback) {
            this.captureCallback = captureCallback;
        }
    }

    public class DefaultCaptureOptionsUnpacker {
        public static final DefaultCaptureOptionsUnpacker INSTANCE = new DefaultCaptureOptionsUnpacker();

        public void unpack(UseCaseConfig useCaseConfig, TraceParser traceParser) {
            useCaseConfig.getClass();
            CaptureConfig captureConfig = (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, null);
            OptionsBundle optionsBundle = OptionsBundle.EMPTY_BUNDLE;
            optionsBundle.getClass();
            AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_ROTATION;
            HashSet hashSet = new HashSet();
            MutableOptionsBundle create = MutableOptionsBundle.create();
            ArrayList arrayList = new ArrayList();
            MutableTagBundle create2 = MutableTagBundle.create();
            ArrayList arrayList2 = new ArrayList(hashSet);
            OptionsBundle from = OptionsBundle.from(create);
            ArrayList arrayList3 = new ArrayList(arrayList);
            TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = create2.mTagMap;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            int i = -1;
            new CaptureConfig(arrayList2, from, -1, arrayList3, new TagBundle(arrayMap));
            if (captureConfig != null) {
                i = captureConfig.mTemplateType;
                traceParser.addAllCameraCaptureCallbacks(captureConfig.mCameraCaptureCallbacks);
                optionsBundle = captureConfig.mImplementationOptions;
                ((MutableTagBundle) traceParser.threadAttrs).mTagMap.putAll((Map) captureConfig.mTagBundle.mTagMap);
                List unmodifiableList = Collections.unmodifiableList(captureConfig.mSurfaces);
                unmodifiableList.getClass();
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    ((HashSet) traceParser.logger).add((DeferrableSurface) it.next());
                }
            }
            traceParser.projectPackages = MutableOptionsBundle.from((Config) optionsBundle);
            new Camera2ImplConfig(useCaseConfig);
            Object retrieveOption = useCaseConfig.retrieveOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i));
            retrieveOption.getClass();
            traceParser.state = ((Number) retrieveOption).intValue();
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) useCaseConfig.retrieveOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, null);
            if (captureCallback != null) {
                traceParser.addCameraCaptureCallback(new CaptureCallbackContainer(captureCallback));
            }
            StreamSharingBuilder streamSharingBuilder = new StreamSharingBuilder();
            useCaseConfig.findOptions(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(0, streamSharingBuilder, useCaseConfig));
            traceParser.addImplementationOptions(new BiometricPrompt(OptionsBundle.from(streamSharingBuilder.mMutableConfig)));
        }
    }

    public final class DefaultSessionOptionsUnpacker {
        public static final DefaultSessionOptionsUnpacker INSTANCE = new DefaultSessionOptionsUnpacker();
    }

    public final class ImageCaptureOptionUnpacker extends DefaultCaptureOptionsUnpacker {
        public static final ImageCaptureOptionUnpacker INSTANCE = new ImageCaptureOptionUnpacker();

        @Override // androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker
        public final void unpack(UseCaseConfig useCaseConfig, TraceParser traceParser) {
            useCaseConfig.getClass();
            super.unpack(useCaseConfig, traceParser);
            if (!(useCaseConfig instanceof ImageCaptureConfig)) {
                a$$ExternalSyntheticBUOutline0.m$3("config is not ImageCaptureConfig");
                return;
            }
            MutableOptionsBundle create = MutableOptionsBundle.create();
            ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
            if (((ImageCapturePixelHDRPlusQuirk) DeviceQuirks.getAll().get(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
                if (imageCaptureConfig.containsOption(autoValue_Config_Option)) {
                    int intValue = ((Integer) imageCaptureConfig.retrieveOption(autoValue_Config_Option)).intValue();
                    if (intValue == 0) {
                        CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key.getClass();
                        create.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        key2.getClass();
                        create.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key2), Boolean.FALSE);
                    }
                }
            }
            traceParser.addImplementationOptions(new Camera2ImplConfig(OptionsBundle.from(create)));
        }
    }

    public CameraUseCaseAdapter(Context context) {
        context.getClass();
        this.displayInfoManager = DisplayInfoManager.Companion.getInstance(context);
        if ((context instanceof Application) && StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[LOOP:0: B:20:0x00b1->B:22:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161 A[LOOP:1: B:43:0x015b->B:45:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2;
        int ordinal;
        int i3;
        UseCaseConfigFactory.CaptureType captureType2;
        captureType.getClass();
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Creating config for " + captureType);
        }
        MutableOptionsBundle create = MutableOptionsBundle.create();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        MutableOptionsBundle create2 = MutableOptionsBundle.create();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = MutableTagBundle.create().mTagMap;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int ordinal2 = captureType.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
            if (ordinal2 == 3) {
                i2 = DeviceQuirks.getAll().get(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
                AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG;
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                OptionsBundle from = OptionsBundle.from(create2);
                ArrayList arrayList10 = new ArrayList(arrayList);
                TagBundle tagBundle = TagBundle.EMPTY_TAGBUNDLE;
                ArrayMap arrayMap2 = new ArrayMap();
                for (String str : arrayMap.keySet()) {
                    arrayMap2.put(str, arrayMap.get(str));
                }
                create.insertOption(autoValue_Config_Option, new SessionConfig(arrayList5, arrayList6, arrayList7, arrayList8, new CaptureConfig(arrayList9, from, i2, arrayList10, new TagBundle(arrayMap2)), null, null, 0, null));
                HashSet hashSet2 = new HashSet();
                MutableOptionsBundle create3 = MutableOptionsBundle.create();
                ArrayList arrayList11 = new ArrayList();
                ArrayMap arrayMap3 = MutableTagBundle.create().mTagMap;
                ordinal = captureType.ordinal();
                if (ordinal == 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        if (ordinal == 3) {
                            i3 = DeviceQuirks.getAll().get(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
                        } else if (ordinal != 4 && ordinal != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    i3 = 1;
                } else {
                    i3 = i == 2 ? 5 : 2;
                }
                AutoValue_Config_Option autoValue_Config_Option2 = UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG;
                ArrayList arrayList12 = new ArrayList(hashSet2);
                OptionsBundle from2 = OptionsBundle.from(create3);
                ArrayList arrayList13 = new ArrayList(arrayList11);
                TagBundle tagBundle2 = TagBundle.EMPTY_TAGBUNDLE;
                ArrayMap arrayMap4 = new ArrayMap();
                for (String str2 : arrayMap3.keySet()) {
                    arrayMap4.put(str2, arrayMap3.get(str2));
                }
                create.insertOption(autoValue_Config_Option2, new CaptureConfig(arrayList12, from2, i3, arrayList13, new TagBundle(arrayMap4)));
                create.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType != UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.INSTANCE : DefaultCaptureOptionsUnpacker.INSTANCE);
                create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, DefaultSessionOptionsUnpacker.INSTANCE);
                captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
                DisplayInfoManager displayInfoManager = this.displayInfoManager;
                if (captureType == captureType2) {
                    create.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, displayInfoManager.getPreviewSize());
                }
                AutoValue_Config_Option autoValue_Config_Option3 = ImageOutputConfig.OPTION_TARGET_ROTATION;
                MeteringRepeating.Builder builder = DisplayInfoManager.Companion;
                create.insertOption(autoValue_Config_Option3, Integer.valueOf(displayInfoManager.getMaxSizeDisplay(true).getRotation()));
                return OptionsBundle.from(create);
            }
            if (ordinal2 != 4 && ordinal2 != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        i2 = 1;
        AutoValue_Config_Option autoValue_Config_Option4 = UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG;
        ArrayList arrayList52 = new ArrayList(linkedHashSet);
        ArrayList arrayList62 = new ArrayList(arrayList2);
        ArrayList arrayList72 = new ArrayList(arrayList3);
        ArrayList arrayList82 = new ArrayList(arrayList4);
        ArrayList arrayList92 = new ArrayList(hashSet);
        OptionsBundle from3 = OptionsBundle.from(create2);
        ArrayList arrayList102 = new ArrayList(arrayList);
        TagBundle tagBundle3 = TagBundle.EMPTY_TAGBUNDLE;
        ArrayMap arrayMap22 = new ArrayMap();
        while (r6.hasNext()) {
        }
        create.insertOption(autoValue_Config_Option4, new SessionConfig(arrayList52, arrayList62, arrayList72, arrayList82, new CaptureConfig(arrayList92, from3, i2, arrayList102, new TagBundle(arrayMap22)), null, null, 0, null));
        HashSet hashSet22 = new HashSet();
        MutableOptionsBundle create32 = MutableOptionsBundle.create();
        ArrayList arrayList112 = new ArrayList();
        ArrayMap arrayMap32 = MutableTagBundle.create().mTagMap;
        ordinal = captureType.ordinal();
        if (ordinal == 0) {
        }
        AutoValue_Config_Option autoValue_Config_Option22 = UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG;
        ArrayList arrayList122 = new ArrayList(hashSet22);
        OptionsBundle from22 = OptionsBundle.from(create32);
        ArrayList arrayList132 = new ArrayList(arrayList112);
        TagBundle tagBundle22 = TagBundle.EMPTY_TAGBUNDLE;
        ArrayMap arrayMap42 = new ArrayMap();
        while (r3.hasNext()) {
        }
        create.insertOption(autoValue_Config_Option22, new CaptureConfig(arrayList122, from22, i3, arrayList132, new TagBundle(arrayMap42)));
        create.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType != UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.INSTANCE : DefaultCaptureOptionsUnpacker.INSTANCE);
        create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, DefaultSessionOptionsUnpacker.INSTANCE);
        captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        DisplayInfoManager displayInfoManager2 = this.displayInfoManager;
        if (captureType == captureType2) {
        }
        AutoValue_Config_Option autoValue_Config_Option32 = ImageOutputConfig.OPTION_TARGET_ROTATION;
        MeteringRepeating.Builder builder2 = DisplayInfoManager.Companion;
        create.insertOption(autoValue_Config_Option32, Integer.valueOf(displayInfoManager2.getMaxSizeDisplay(true).getRotation()));
        return OptionsBundle.from(create);
    }
}
