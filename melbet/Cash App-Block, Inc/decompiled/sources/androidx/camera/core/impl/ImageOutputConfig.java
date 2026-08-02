package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;

/* loaded from: classes3.dex */
public interface ImageOutputConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_APP_TARGET_ROTATION;
    public static final AutoValue_Config_Option OPTION_CUSTOM_ORDERED_RESOLUTIONS;
    public static final AutoValue_Config_Option OPTION_DEFAULT_RESOLUTION;
    public static final AutoValue_Config_Option OPTION_MAX_RESOLUTION;
    public static final AutoValue_Config_Option OPTION_MIRROR_MODE;
    public static final AutoValue_Config_Option OPTION_RESOLUTION_SELECTOR;
    public static final AutoValue_Config_Option OPTION_SUPPORTED_RESOLUTIONS;
    public static final AutoValue_Config_Option OPTION_TARGET_ASPECT_RATIO = new AutoValue_Config_Option("camerax.core.imageOutput.targetAspectRatio", AspectRatio.class, null);
    public static final AutoValue_Config_Option OPTION_TARGET_RESOLUTION;
    public static final AutoValue_Config_Option OPTION_TARGET_ROTATION;

    static {
        Class cls = Integer.TYPE;
        OPTION_TARGET_ROTATION = new AutoValue_Config_Option("camerax.core.imageOutput.targetRotation", cls, null);
        OPTION_APP_TARGET_ROTATION = new AutoValue_Config_Option("camerax.core.imageOutput.appTargetRotation", cls, null);
        OPTION_MIRROR_MODE = new AutoValue_Config_Option("camerax.core.imageOutput.mirrorMode", cls, null);
        OPTION_TARGET_RESOLUTION = new AutoValue_Config_Option("camerax.core.imageOutput.targetResolution", Size.class, null);
        OPTION_DEFAULT_RESOLUTION = new AutoValue_Config_Option("camerax.core.imageOutput.defaultResolution", Size.class, null);
        OPTION_MAX_RESOLUTION = new AutoValue_Config_Option("camerax.core.imageOutput.maxResolution", Size.class, null);
        OPTION_SUPPORTED_RESOLUTIONS = new AutoValue_Config_Option("camerax.core.imageOutput.supportedResolutions", List.class, null);
        OPTION_RESOLUTION_SELECTOR = new AutoValue_Config_Option("camerax.core.imageOutput.resolutionSelector", ResolutionSelector.class, null);
        OPTION_CUSTOM_ORDERED_RESOLUTIONS = new AutoValue_Config_Option("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void validateConfig(ImageOutputConfig imageOutputConfig) {
        boolean containsOption = imageOutputConfig.containsOption(OPTION_TARGET_ASPECT_RATIO);
        boolean z = ((Size) imageOutputConfig.retrieveOption(OPTION_TARGET_RESOLUTION, null)) != null;
        if (containsOption && z) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((ResolutionSelector) imageOutputConfig.retrieveOption(OPTION_RESOLUTION_SELECTOR, null)) != null) {
            if (containsOption || z) {
                a$$ExternalSyntheticBUOutline0.m$3("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int getTargetRotation(int i) {
        return ((Integer) retrieveOption(OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }
}
