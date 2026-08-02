package androidx.camera.core.impl;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.internal.ThreadConfig;

/* loaded from: classes3.dex */
public final class ImageAnalysisConfig implements UseCaseConfig, ImageOutputConfig, ThreadConfig {
    public final OptionsBundle mConfig;
    public static final AutoValue_Config_Option OPTION_BACKPRESSURE_STRATEGY = new AutoValue_Config_Option("camerax.core.imageAnalysis.backpressureStrategy", ImageAnalysis.BackpressureStrategy.class, null);
    public static final AutoValue_Config_Option OPTION_IMAGE_QUEUE_DEPTH = new AutoValue_Config_Option("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final AutoValue_Config_Option OPTION_IMAGE_READER_PROXY_PROVIDER = new AutoValue_Config_Option("camerax.core.imageAnalysis.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);
    public static final AutoValue_Config_Option OPTION_OUTPUT_IMAGE_FORMAT = new AutoValue_Config_Option("camerax.core.imageAnalysis.outputImageFormat", ImageAnalysis.OutputImageFormat.class, null);
    public static final AutoValue_Config_Option OPTION_ONE_PIXEL_SHIFT_ENABLED = new AutoValue_Config_Option("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final AutoValue_Config_Option OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = new AutoValue_Config_Option("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    public ImageAnalysisConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return 35;
    }
}
