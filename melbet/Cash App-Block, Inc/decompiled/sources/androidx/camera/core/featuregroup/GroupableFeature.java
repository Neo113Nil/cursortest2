package androidx.camera.core.featuregroup;

import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.featuregroup.impl.feature.DynamicRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.media3.extractor.text.CueEncoder;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes3.dex */
public abstract class GroupableFeature {
    public final Lazy featureType$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 10));

    static {
        new DynamicRangeFeature();
        new FpsRangeFeature();
        CueEncoder cueEncoder = VideoStabilization.Companion;
        new VideoStabilizationFeature();
        new ImageFormatFeature();
    }

    public abstract FeatureTypeInternal getFeatureTypeInternal();

    public boolean isSupportedIndividually(LegacySessionConfig legacySessionConfig, CameraInfoInternal cameraInfoInternal) {
        return true;
    }
}
