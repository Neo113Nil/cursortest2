package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Landroidx/camera/core/impl/Quirk;", "com/squareup/cash/money/booklet/HeaderSectionKt", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements Quirk {
    public static final SurfaceCombination FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION;
    public static final SurfaceCombination LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION;
    public static final Set SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS;
    public static final Set SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS;

    static {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.VGA;
        StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType2, configSize2, streamUseCase2));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize3, streamUseCase2));
        FULL_LEVEL_YUV_PRIV_YUV_CONFIGURATION = surfaceCombination;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
        arrayList.add(Transition.AnonymousClass1.create(configType, configSize2, streamUseCase2));
        arrayList.add(Transition.AnonymousClass1.create(configType, configSize3, streamUseCase2));
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        CameraState$Type$EnumUnboxingLocalUtility.m(surfaceCombination2, Transition.AnonymousClass1.create(configType2, configSize2, streamUseCase2), configType2, configSize, streamUseCase2);
        surfaceCombination2.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize3, streamUseCase2));
        LEVEL_3_LEVEL_PRIV_PRIV_YUV_SUBSET_CONFIGURATION = surfaceCombination2;
        SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_GOOGLE_MODELS = ArraysKt___ArraysKt.toSet(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        SUPPORT_EXTRA_LEVEL_3_CONFIGURATIONS_SAMSUNG_MODELS = ArraysKt___ArraysKt.toSet(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
