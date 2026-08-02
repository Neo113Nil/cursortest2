package androidx.camera.core.impl;

/* loaded from: classes3.dex */
public abstract class CameraConfigs {
    public static final DefaultCameraConfig DEFAULT_CAMERA_CONFIG = new DefaultCameraConfig();

    public final class DefaultCameraConfig implements CameraConfig {
        public final AutoValue_Identifier mIdentifier = new AutoValue_Identifier(new Object());

        @Override // androidx.camera.core.impl.ReadableConfig
        public final Config getConfig() {
            return OptionsBundle.EMPTY_BUNDLE;
        }
    }
}
