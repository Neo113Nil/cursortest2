package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final /* synthetic */ class UseCaseCameraConfig$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UseCaseCameraConfig f$0;

    public /* synthetic */ UseCaseCameraConfig$$ExternalSyntheticLambda0(UseCaseCameraConfig useCaseCameraConfig, int i) {
        this.$r8$classId = i;
        this.f$0 = useCaseCameraConfig;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        UseCaseCameraConfig useCaseCameraConfig = this.f$0;
        switch (i) {
            case 0:
                return (CameraGraphImpl) useCaseCameraConfig.cameraGraphFactory.invoke(((CameraGraphConfigProvider.CameraGraphCreationResult) useCaseCameraConfig.lazyCreationResult.getValue()).config);
            default:
                return ((CameraGraphConfigProvider.CameraGraphCreationResult) useCaseCameraConfig.lazyCreationResult.getValue()).streamConfigMap;
        }
    }
}
