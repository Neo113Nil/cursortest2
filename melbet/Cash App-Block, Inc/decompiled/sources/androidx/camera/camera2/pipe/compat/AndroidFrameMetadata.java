package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidFrameMetadata implements Metadata, UnsafeWrapper {
    public final String camera;
    public final CaptureResult captureResult;
    public final EmptyMap extraMetadata;

    public AndroidFrameMetadata(CaptureResult captureResult, String str) {
        captureResult.getClass();
        str.getClass();
        this.captureResult = captureResult;
        this.camera = str;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.extraMetadata = emptyMap;
    }

    public final Object get(CaptureResult.Key key) {
        key.getClass();
        this.extraMetadata.getClass();
        return this.captureResult.get(key);
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) CameraId.m46toStringimpl(this.camera)) + ", frameNumber: " + this.captureResult.getFrameNumber() + ')';
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(CaptureResult.class));
        CaptureResult captureResult = this.captureResult;
        if (equals) {
            captureResult.getClass();
            return captureResult;
        }
        if (!kClass.equals(reflectionFactory.getOrCreateKotlinClass(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }
}
