package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class StreamUseCaseUtil {
    public static final AutoValue_Config_Option STREAM_USE_CASE_STREAM_SPEC_OPTION;
    public static final MapBuilder STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
    public static final MapBuilder STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        STREAM_USE_CASE_STREAM_SPEC_OPTION = new AutoValue_Config_Option("camera2.streamSpec.streamUseCase", cls, null);
        MapBuilder mapBuilder = new MapBuilder();
        int i = Build.VERSION.SDK_INT;
        UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
        UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (i >= 33) {
            UseCaseConfigFactory.CaptureType captureType4 = UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            UseCaseConfigFactory.CaptureType captureType5 = UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS;
            mapBuilder.put(4L, ArraysKt___ArraysKt.toSet(new UseCaseConfigFactory.CaptureType[]{captureType3, captureType4, captureType5}));
            mapBuilder.put(1L, ArraysKt___ArraysKt.toSet(new UseCaseConfigFactory.CaptureType[]{captureType3, captureType4, captureType5}));
            mapBuilder.put(2L, SetsKt__SetsJVMKt.setOf(captureType2));
            mapBuilder.put(3L, SetsKt__SetsJVMKt.setOf(captureType));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = mapBuilder.build();
        MapBuilder mapBuilder2 = new MapBuilder();
        if (i >= 33) {
            mapBuilder2.put(4L, ArraysKt___ArraysKt.toSet(new UseCaseConfigFactory.CaptureType[]{captureType3, captureType2, captureType}));
            mapBuilder2.put(3L, ArraysKt___ArraysKt.toSet(new UseCaseConfigFactory.CaptureType[]{captureType3, captureType}));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = mapBuilder2.build();
    }

    public static boolean areStreamUseCasesAvailableForSurfaceConfigs(CameraMetadata cameraMetadata, List list) {
        cameraMetadata.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((SurfaceConfig) it.next()).streamUseCase.value))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static Camera2ImplConfig getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(Config config, Long l) {
        AutoValue_Config_Option autoValue_Config_Option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (config.containsOption(autoValue_Config_Option) && Intrinsics.areEqual(config.retrieveOption(autoValue_Config_Option), l)) {
            return null;
        }
        MutableOptionsBundle from = MutableOptionsBundle.from(config);
        from.insertOption(autoValue_Config_Option, l);
        return new Camera2ImplConfig(from);
    }

    public static boolean isEligibleCaptureType(UseCaseConfigFactory.CaptureType captureType, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            Long valueOf = Long.valueOf(j);
            MapBuilder mapBuilder = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            if (!mapBuilder.containsKey(valueOf)) {
                return false;
            }
            Object obj = mapBuilder.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(captureType);
        }
        Long valueOf2 = Long.valueOf(j);
        MapBuilder mapBuilder2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!mapBuilder2.containsKey(valueOf2)) {
            return false;
        }
        Object obj2 = mapBuilder2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((UseCaseConfigFactory.CaptureType) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStreamUseCaseSupported(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        key.getClass();
        long[] jArr = (long[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean isZslUseCase(Config config, UseCaseConfigFactory.CaptureType captureType) {
        Object retrieveOption = config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE);
        retrieveOption.getClass();
        if (((Boolean) retrieveOption).booleanValue()) {
            return false;
        }
        AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (!config.containsOption(autoValue_Config_Option)) {
            return false;
        }
        Object retrieveOption2 = config.retrieveOption(autoValue_Config_Option);
        retrieveOption2.getClass();
        return captureType.ordinal() == 0 && ((Number) retrieveOption2).intValue() == 2;
    }

    public static boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(CameraMetadata cameraMetadata, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        cameraMetadata.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList2 = new ArrayList(linkedHashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((AutoValue_AttachedSurfaceInfo) it.next()).implementationOptions == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return false;
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = linkedHashMap.get((UseCaseConfig) it2.next());
                if (obj == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return false;
                }
                if (((AutoValue_StreamSpec) obj).implementationOptions == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return false;
                }
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            key.getClass();
            long[] jArr = (long[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo = (AutoValue_AttachedSurfaceInfo) it3.next();
                    Config config = autoValue_AttachedSurfaceInfo.implementationOptions;
                    config.getClass();
                    AutoValue_Config_Option autoValue_Config_Option = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
                    if (config.containsOption(autoValue_Config_Option)) {
                        Config config2 = autoValue_AttachedSurfaceInfo.implementationOptions;
                        config2.getClass();
                        Object retrieveOption = config2.retrieveOption(autoValue_Config_Option);
                        retrieveOption.getClass();
                        if (((Number) retrieveOption).longValue() != 0) {
                            z2 = false;
                            z = true;
                        }
                    }
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                    z2 = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    UseCaseConfig useCaseConfig = (UseCaseConfig) it4.next();
                    AutoValue_Config_Option autoValue_Config_Option2 = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
                    if (useCaseConfig.containsOption(autoValue_Config_Option2)) {
                        Object retrieveOption2 = useCaseConfig.retrieveOption(autoValue_Config_Option2);
                        retrieveOption2.getClass();
                        long longValue = ((Number) retrieveOption2).longValue();
                        if (longValue != 0) {
                            if (z2) {
                                a$$ExternalSyntheticBUOutline0.m$3("Either all use cases must have non-default stream use case assigned or none should have it");
                                return false;
                            }
                            linkedHashSet.add(Long.valueOf(longValue));
                            z = true;
                        } else if (z) {
                            a$$ExternalSyntheticBUOutline0.m$3("Either all use cases must have non-default stream use case assigned or none should have it");
                            return false;
                        }
                    } else if (z) {
                        a$$ExternalSyntheticBUOutline0.m$3("Either all use cases must have non-default stream use case assigned or none should have it");
                        return false;
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it5 = linkedHashSet.iterator();
                    while (it5.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                        }
                    }
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo2 = (AutoValue_AttachedSurfaceInfo) it6.next();
                        Config config3 = autoValue_AttachedSurfaceInfo2.implementationOptions;
                        config3.getClass();
                        Camera2ImplConfig updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(config3, (Long) config3.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                        if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                            SubtreeManager builder = AutoValue_StreamSpec.builder(autoValue_AttachedSurfaceInfo2.size);
                            builder.workflowSession = Integer.valueOf(autoValue_AttachedSurfaceInfo2.sessionType);
                            Range range = autoValue_AttachedSurfaceInfo2.targetFrameRate;
                            if (range == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("Null expectedFrameRateRange");
                                return false;
                            }
                            builder.interceptor = range;
                            DynamicRange dynamicRange = autoValue_AttachedSurfaceInfo2.dynamicRange;
                            if (dynamicRange == null) {
                                a$$ExternalSyntheticBUOutline0.m$2("Null dynamicRange");
                                return false;
                            }
                            builder.emitActionToParent = dynamicRange;
                            builder.idCounter = updatedImplementationOptionsWithUseCaseStreamSpecOption;
                            linkedHashMap2.put(autoValue_AttachedSurfaceInfo2, builder.build());
                        }
                    }
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        UseCaseConfig useCaseConfig2 = (UseCaseConfig) it7.next();
                        AutoValue_StreamSpec autoValue_StreamSpec = (AutoValue_StreamSpec) linkedHashMap.get(useCaseConfig2);
                        autoValue_StreamSpec.getClass();
                        Config config4 = autoValue_StreamSpec.implementationOptions;
                        config4.getClass();
                        Camera2ImplConfig updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(config4, (Long) config4.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                        if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                            SubtreeManager builder2 = autoValue_StreamSpec.toBuilder();
                            builder2.idCounter = updatedImplementationOptionsWithUseCaseStreamSpecOption2;
                            linkedHashMap.put(useCaseConfig2, builder2.build());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
