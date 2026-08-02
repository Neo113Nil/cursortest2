package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraComponentImpl;
import androidx.camera.video.Recorder;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

/* loaded from: classes3.dex */
public final class DaggerCameraPipeComponent$CameraGraphComponentImpl {
    public final Recorder.AnonymousClass4 cameraGraphConfigModule;
    public final Provider cameraGraphImplProvider;
    public final Provider cameraGraphParametersImplProvider;
    public final Provider cameraGraphRequestListenersImplProvider;
    public final Provider controller3AProvider;
    public final Provider frameCaptureQueueProvider;
    public final Provider graphSessionLockProvider;
    public final Provider graphState3AProvider;
    public final Provider listener3AProvider;
    public final Provider provideCameraBackendProvider;
    public final Provider provideCameraGraphCoroutineScopeProvider;
    public final Provider provideCameraMetadataProvider;
    public final Provider provideFrameDistributorProvider;
    public final Provider provideRequestListenersProvider;
    public final Provider provideSurfaceGraphProvider;
    public final Provider provideSystemClockOffsetsProvider;
    public final DelegateFactory graphProcessorImplProvider = new DelegateFactory();
    public final DelegateFactory streamGraphImplProvider = new DelegateFactory();
    public final DelegateFactory provideCameraControllerProvider = new DelegateFactory();

    public DaggerCameraPipeComponent$CameraGraphComponentImpl(DaggerCameraPipeComponent$CameraPipeComponentImpl daggerCameraPipeComponent$CameraPipeComponentImpl, Recorder.AnonymousClass4 anonymousClass4) {
        this.cameraGraphConfigModule = anonymousClass4;
        int i = 2;
        this.provideCameraBackendProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, i, i));
        this.provideCameraMetadataProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 1, i));
        this.listener3AProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 4, i));
        this.provideSurfaceGraphProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 9, i));
        DelegateFactory.setDelegate(this.provideCameraControllerProvider, DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 8, i)));
        DelegateFactory.setDelegate(this.streamGraphImplProvider, DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 7, i)));
        this.frameCaptureQueueProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 10, i));
        this.provideSystemClockOffsetsProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 11, i));
        this.provideFrameDistributorProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 6, i));
        this.provideRequestListenersProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 5, i));
        DelegateFactory.setDelegate(this.graphProcessorImplProvider, DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 3, i)));
        this.graphSessionLockProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 13, i));
        this.provideCameraGraphCoroutineScopeProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 14, i));
        this.cameraGraphParametersImplProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 12, i));
        this.cameraGraphRequestListenersImplProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 15, i));
        this.graphState3AProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 17, i));
        this.controller3AProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 16, i));
        this.cameraGraphImplProvider = DoubleCheck.provider(new DaggerCameraAppComponent$CameraComponentImpl.SwitchingProvider(daggerCameraPipeComponent$CameraPipeComponentImpl, this, 0, i));
    }
}
