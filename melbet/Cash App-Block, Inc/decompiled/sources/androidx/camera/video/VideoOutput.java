package androidx.camera.video;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes3.dex */
public interface VideoOutput {
    default EncoderProfilesResolver getEncoderProfilesResolver(int i, CameraInfo cameraInfo) {
        return EncoderProfilesResolver.EMPTY;
    }

    default VideoCapabilities getMediaCapabilities(int i, CameraInfo cameraInfo) {
        return VideoCapabilities.EMPTY;
    }

    default Observable getMediaSpec() {
        return ConstantObservable.NULL_OBSERVABLE;
    }

    default Observable getStreamInfo() {
        return AutoValue_StreamInfo.ALWAYS_ACTIVE_OBSERVABLE;
    }

    default boolean isQualitySelectorDefault() {
        return true;
    }

    default Observable isSourceStreamRequired() {
        return new ConstantObservable(Boolean.FALSE);
    }

    default void onSourceStateChanged(int i) {
    }

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    default void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z) {
        onSurfaceRequested(surfaceRequest);
    }
}
