package androidx.camera.core;

import android.os.Handler;
import androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda1;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.internal.TargetConfig;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class CameraXConfig implements TargetConfig {
    public final OptionsBundle mConfig;
    public static final AutoValue_Config_Option OPTION_CAMERA_FACTORY_PROVIDER = new AutoValue_Config_Option("camerax.core.appConfig.cameraFactoryProvider", CameraFactoryProvider.class, null);
    public static final AutoValue_Config_Option OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = new AutoValue_Config_Option("camerax.core.appConfig.deviceSurfaceManagerProvider", Camera2Config$Companion$$ExternalSyntheticLambda0.class, null);
    public static final AutoValue_Config_Option OPTION_USECASE_CONFIG_FACTORY_PROVIDER = new AutoValue_Config_Option("camerax.core.appConfig.useCaseConfigFactoryProvider", Camera2Config$Companion$$ExternalSyntheticLambda1.class, null);
    public static final AutoValue_Config_Option OPTION_CAMERA_EXECUTOR = new AutoValue_Config_Option("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final AutoValue_Config_Option OPTION_SCHEDULER_HANDLER = new AutoValue_Config_Option("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final AutoValue_Config_Option OPTION_MIN_LOGGING_LEVEL = new AutoValue_Config_Option("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final AutoValue_Config_Option OPTION_AVAILABLE_CAMERAS_LIMITER = new AutoValue_Config_Option("camerax.core.appConfig.availableCamerasLimiter", CameraSelector.class, null);
    public static final AutoValue_Config_Option OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING = new AutoValue_Config_Option("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final AutoValue_Config_Option OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY = new AutoValue_Config_Option("camerax.core.appConfig.cameraProviderInitRetryPolicy", RetryPolicy.class, null);
    public static final AutoValue_Config_Option OPTION_QUIRK_SETTINGS = new AutoValue_Config_Option("camerax.core.appConfig.quirksSettings", QuirkSettings.class, null);
    public static final AutoValue_Config_Option OPTION_REPEATING_STREAM_FORCED = new AutoValue_Config_Option("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);

    public interface Provider {
        CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public final CameraSelector getAvailableCamerasLimiter() {
        return (CameraSelector) this.mConfig.retrieveOption(OPTION_AVAILABLE_CAMERAS_LIMITER, null);
    }

    public final CameraFactoryProvider getCameraFactoryProvider() {
        return (CameraFactoryProvider) this.mConfig.retrieveOption(OPTION_CAMERA_FACTORY_PROVIDER, null);
    }

    public final long getCameraOpenRetryMaxTimeoutInMillisWhileResuming() {
        return ((Long) this.mConfig.retrieveOption(OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING, -1L)).longValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }

    public final Camera2Config$Companion$$ExternalSyntheticLambda0 getDeviceSurfaceManagerProvider() {
        return (Camera2Config$Companion$$ExternalSyntheticLambda0) this.mConfig.retrieveOption(OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, null);
    }

    public final Camera2Config$Companion$$ExternalSyntheticLambda1 getUseCaseConfigFactoryProvider() {
        return (Camera2Config$Companion$$ExternalSyntheticLambda1) this.mConfig.retrieveOption(OPTION_USECASE_CONFIG_FACTORY_PROVIDER, null);
    }
}
