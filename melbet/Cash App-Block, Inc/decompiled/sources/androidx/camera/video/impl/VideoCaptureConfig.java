package androidx.camera.video.impl;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.room.TransactorKt;

/* loaded from: classes3.dex */
public final class VideoCaptureConfig implements UseCaseConfig, ImageOutputConfig, ThreadConfig {
    public final OptionsBundle mConfig;
    public static final AutoValue_Config_Option OPTION_VIDEO_OUTPUT = new AutoValue_Config_Option("camerax.video.VideoCapture.videoOutput", VideoOutput.class, null);
    public static final AutoValue_Config_Option OPTION_VIDEO_ENCODER_INFO_FINDER = new AutoValue_Config_Option("camerax.video.VideoCapture.videoEncoderInfoFinder", VideoEncoderInfoImpl$$ExternalSyntheticLambda0.class, null);
    public static final AutoValue_Config_Option OPTION_FORCE_ENABLE_SURFACE_PROCESSING = new AutoValue_Config_Option("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);

    public VideoCaptureConfig(OptionsBundle optionsBundle) {
        TransactorKt.checkArgument(optionsBundle.mOptions.containsKey(OPTION_VIDEO_OUTPUT));
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 34;
    }
}
