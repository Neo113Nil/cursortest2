package androidx.camera.core.impl;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public interface CameraConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_USECASE_CONFIG_FACTORY = new AutoValue_Config_Option("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class, null);
    public static final AutoValue_Config_Option OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = new AutoValue_Config_Option("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final AutoValue_Config_Option OPTION_SESSION_PROCESSOR = new AutoValue_Config_Option("camerax.core.camera.SessionProcessor", SessionProcessor.class, null);
    public static final AutoValue_Config_Option OPTION_POSTVIEW_SUPPORTED = new AutoValue_Config_Option("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final AutoValue_Config_Option OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED = new AutoValue_Config_Option("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void getSessionProcessor() {
        if (retrieveOption(OPTION_SESSION_PROCESSOR, null) == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }
}
