package androidx.camera.core.impl;

import androidx.camera.core.CaptureBundles$CaptureBundleImpl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.internal.IoConfig;

/* loaded from: classes3.dex */
public final class ImageCaptureConfig implements UseCaseConfig, ImageOutputConfig, IoConfig {
    public static final AutoValue_Config_Option OPTION_BUFFER_FORMAT;
    public static final AutoValue_Config_Option OPTION_CAPTURE_BUNDLE;
    public static final AutoValue_Config_Option OPTION_FLASH_MODE;
    public static final AutoValue_Config_Option OPTION_FLASH_TYPE;
    public static final AutoValue_Config_Option OPTION_IMAGE_CAPTURE_MODE;
    public static final AutoValue_Config_Option OPTION_IMAGE_READER_PROXY_PROVIDER;
    public static final AutoValue_Config_Option OPTION_JPEG_COMPRESSION_QUALITY;
    public static final AutoValue_Config_Option OPTION_OUTPUT_FORMAT;
    public static final AutoValue_Config_Option OPTION_POSTVIEW_ENABLED;
    public static final AutoValue_Config_Option OPTION_SCREEN_FLASH;
    public static final AutoValue_Config_Option OPTION_USE_SOFTWARE_JPEG_ENCODER;
    public final OptionsBundle mConfig;

    static {
        Class cls = Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = new AutoValue_Config_Option("camerax.core.imageCapture.captureMode", cls, null);
        OPTION_FLASH_MODE = new AutoValue_Config_Option("camerax.core.imageCapture.flashMode", cls, null);
        OPTION_CAPTURE_BUNDLE = new AutoValue_Config_Option("camerax.core.imageCapture.captureBundle", CaptureBundles$CaptureBundleImpl.class, null);
        OPTION_BUFFER_FORMAT = new AutoValue_Config_Option("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        OPTION_OUTPUT_FORMAT = new AutoValue_Config_Option("camerax.core.imageCapture.outputFormat", Integer.class, null);
        OPTION_IMAGE_READER_PROXY_PROVIDER = new AutoValue_Config_Option("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class, null);
        OPTION_USE_SOFTWARE_JPEG_ENCODER = new AutoValue_Config_Option("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        OPTION_FLASH_TYPE = new AutoValue_Config_Option("camerax.core.imageCapture.flashType", cls, null);
        OPTION_JPEG_COMPRESSION_QUALITY = new AutoValue_Config_Option("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        OPTION_SCREEN_FLASH = new AutoValue_Config_Option("camerax.core.imageCapture.screenFlash", ImageCapture.ScreenFlash.class, null);
        OPTION_POSTVIEW_ENABLED = new AutoValue_Config_Option("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public ImageCaptureConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((Integer) retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }
}
