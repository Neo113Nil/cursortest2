package androidx.camera.camera2;

import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "Landroidx/camera/core/CameraXConfig$Provider;", "<init>", "()V", "Landroidx/camera/core/CameraXConfig;", "getCameraXConfig", "()Landroidx/camera/core/CameraXConfig;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Camera2Config$DefaultProvider implements CameraXConfig.Provider {
    @Override // androidx.camera.core.CameraXConfig.Provider
    public CameraXConfig getCameraXConfig() {
        CameraFactoryProvider cameraFactoryProvider = new CameraFactoryProvider();
        MutableOptionsBundle mutableOptionsBundle = (MutableOptionsBundle) new BiometricPrompt(9).mClientFragmentManager;
        mutableOptionsBundle.insertOption(CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER, cameraFactoryProvider);
        mutableOptionsBundle.insertOption(CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, new Camera2Config$Companion$$ExternalSyntheticLambda0());
        mutableOptionsBundle.insertOption(CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER, new Camera2Config$Companion$$ExternalSyntheticLambda1());
        mutableOptionsBundle.insertOption(CameraXConfig.OPTION_REPEATING_STREAM_FORCED, Boolean.TRUE);
        return new CameraXConfig(OptionsBundle.from(mutableOptionsBundle));
    }
}
