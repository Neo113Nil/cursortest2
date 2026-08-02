package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Size$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public abstract class GuaranteedConfigurationsUtil {
    public static final Lazy QUERYABLE_VIC_FCQ_COMBINATIONS$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(11));
    public static final Lazy QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate = LazyKt.lazy(new Size$$ExternalSyntheticLambda0(12));

    public static ArrayList createPrivJpegXCombinations(SurfaceConfig.ConfigSize configSize, SurfaceConfig.ConfigSize configSize2) {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        StreamUseCase streamUseCase = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        StreamUseCase streamUseCase2 = SurfaceConfig.DEFAULT_STREAM_USE_CASE;
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
        surfaceCombination.addSurfaceConfig(Transition.AnonymousClass1.create(SurfaceConfig.ConfigType.JPEG, configSize2, streamUseCase2));
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(Transition.AnonymousClass1.create(configType, configSize, streamUseCase2));
        surfaceCombination2.addSurfaceConfig(Transition.AnonymousClass1.create(SurfaceConfig.ConfigType.JPEG_R, configSize2, streamUseCase2));
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    public static ArrayList getQueryableFcqCombinations$camera_camera2(CameraMetadata cameraMetadata, VideoStabilization videoStabilization) {
        cameraMetadata.getClass();
        videoStabilization.getClass();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            key.getClass();
            Object obj = ((Camera2CameraMetadata) cameraMetadata).get(key);
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            int intValue = ((Number) obj).intValue();
            if (intValue >= 35 && videoStabilization != VideoStabilization.ON) {
                arrayList.addAll((List) QUERYABLE_VIC_FCQ_COMBINATIONS$delegate.getValue());
            }
            if (intValue >= 36 && videoStabilization != VideoStabilization.PREVIEW) {
                arrayList.addAll((List) QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
