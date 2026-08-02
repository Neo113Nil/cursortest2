package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class View {
    public ColorGrading mColorGrading;
    public long mNativeObject;
    public Viewport mViewport;

    public final class FogOptions {
        public float[] color;
        public boolean enabled;
        public float height;
        public float maximumOpacity;
    }

    public static class InternalOnPickCallback implements Runnable {
        float mDepth;
        float mFragCoordsX;
        float mFragCoordsY;
        float mFragCoordsZ;
        int mRenderable;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    static {
        CameraSelector$$ExternalSyntheticOutline0.values(2);
        CameraSelector$$ExternalSyntheticOutline0.values(2);
        CameraSelector$$ExternalSyntheticOutline0.values(2);
    }

    private static native void nSetCamera(long j, long j2);

    private static native void nSetColorGrading(long j, long j2);

    private static native void nSetFogOptions(long j, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, long j2, boolean z2);

    private static native void nSetScene(long j, long j2);

    private static native void nSetViewport(long j, int i, int i2, int i3, int i4);

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed View");
        return 0L;
    }

    public final void setCamera(Camera camera) {
        nSetCamera(getNativeObject(), camera.getNativeObject());
    }

    public final void setColorGrading(ColorGrading colorGrading) {
        long nativeObject = getNativeObject();
        long j = colorGrading.mNativeObject;
        if (j == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed ColorGrading");
        } else {
            nSetColorGrading(nativeObject, j);
            this.mColorGrading = colorGrading;
        }
    }

    public final void setFogOptions(FogOptions fogOptions) {
        if (fogOptions.color.length < 3) {
            JWK$$ExternalSyntheticBUOutline0.m("Array length must be at least 3");
            return;
        }
        long nativeObject = getNativeObject();
        float f = fogOptions.maximumOpacity;
        float f2 = fogOptions.height;
        float[] fArr = fogOptions.color;
        nSetFogOptions(nativeObject, RecyclerView.DECELERATION_RATE, f, f2, 1.0f, Float.POSITIVE_INFINITY, fArr[0], fArr[1], fArr[2], 0.1f, RecyclerView.DECELERATION_RATE, -1.0f, false, 0L, fogOptions.enabled);
    }

    public final void setScene(Scene scene) {
        nSetScene(getNativeObject(), scene.getNativeObject());
    }

    public final void setViewport(Viewport viewport) {
        this.mViewport = viewport;
        long nativeObject = getNativeObject();
        Viewport viewport2 = this.mViewport;
        viewport2.getClass();
        nSetViewport(nativeObject, 0, 0, viewport2.width, viewport2.height);
    }
}
