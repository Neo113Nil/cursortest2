package androidx.camera.camera2.pipe;

import android.content.Context;
import androidx.camera.video.Recorder;
import dagger.android.DispatchingAndroidInjector;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CameraPipe$Config {
    public final Context appContext;
    public final DispatchingAndroidInjector cameraBackendConfig;
    public final CameraPipe$CameraInteropConfig cameraInteropConfig;
    public final Recorder.AnonymousClass4 cameraMetadataConfig;
    public final CameraPipe$Flags flags;
    public final CameraPipe$ThreadConfig threadConfig;

    public CameraPipe$Config(Context context, CameraPipe$ThreadConfig cameraPipe$ThreadConfig, CameraPipe$CameraInteropConfig cameraPipe$CameraInteropConfig) {
        Recorder.AnonymousClass4 anonymousClass4 = new Recorder.AnonymousClass4(5);
        DispatchingAndroidInjector dispatchingAndroidInjector = new DispatchingAndroidInjector();
        CameraPipe$Flags cameraPipe$Flags = new CameraPipe$Flags();
        context.getClass();
        this.appContext = context;
        this.threadConfig = cameraPipe$ThreadConfig;
        this.cameraMetadataConfig = anonymousClass4;
        this.cameraBackendConfig = dispatchingAndroidInjector;
        this.cameraInteropConfig = cameraPipe$CameraInteropConfig;
        this.flags = cameraPipe$Flags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPipe$Config)) {
            return false;
        }
        CameraPipe$Config cameraPipe$Config = (CameraPipe$Config) obj;
        return Intrinsics.areEqual(this.appContext, cameraPipe$Config.appContext) && Intrinsics.areEqual(this.threadConfig, cameraPipe$Config.threadConfig) && Intrinsics.areEqual(this.cameraMetadataConfig, cameraPipe$Config.cameraMetadataConfig) && Intrinsics.areEqual(this.cameraBackendConfig, cameraPipe$Config.cameraBackendConfig) && Intrinsics.areEqual(this.cameraInteropConfig, cameraPipe$Config.cameraInteropConfig) && Intrinsics.areEqual(this.flags, cameraPipe$Config.flags);
    }

    public final int hashCode() {
        int hashCode = (this.cameraInteropConfig.hashCode() + ((this.cameraBackendConfig.hashCode() + ((this.cameraMetadataConfig.hashCode() + ((this.threadConfig.hashCode() + (this.appContext.hashCode() * 31)) * 31)) * 31)) * 31)) * 961;
        this.flags.getClass();
        return (Boolean.hashCode(false) + hashCode) * 31;
    }

    public final String toString() {
        return "Config(appContext=" + this.appContext + ", threadConfig=" + this.threadConfig + ", cameraMetadataConfig=" + this.cameraMetadataConfig + ", cameraBackendConfig=" + this.cameraBackendConfig + ", cameraInteropConfig=" + this.cameraInteropConfig + ", imageSources=null, flags=" + this.flags + ", platformApiCompat=null)";
    }
}
