package com.google.android.filament;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public class Camera {
    public long mNativeObject;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Fov {
        public static final /* synthetic */ Fov[] $VALUES;
        public static final Fov HORIZONTAL;

        /* JADX INFO: Fake field, exist only in values array */
        Fov EF0;

        static {
            Fov fov = new Fov("VERTICAL", 0);
            Fov fov2 = new Fov("HORIZONTAL", 1);
            HORIZONTAL = fov2;
            $VALUES = new Fov[]{fov, fov2};
        }

        public static Fov valueOf(String str) {
            return (Fov) Enum.valueOf(Fov.class, str);
        }

        public static Fov[] values() {
            return (Fov[]) $VALUES.clone();
        }
    }

    private static native double nGetCullingFar(long j);

    private static native void nGetCullingProjectionMatrix(long j, double[] dArr);

    private static native double nGetNear(long j);

    private static native void nGetViewMatrix(long j, float[] fArr);

    private static native void nLookAt(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void nSetExposure(long j, float f, float f2, float f3);

    private static native void nSetProjectionFov(long j, double d, double d2, double d3, double d4, int i);

    public final float getCullingFar() {
        return (float) nGetCullingFar(getNativeObject());
    }

    public final void getCullingProjectionMatrix(double[] dArr) {
        if (dArr.length >= 16) {
            nGetCullingProjectionMatrix(getNativeObject(), dArr);
        } else {
            JWK$$ExternalSyntheticBUOutline0.m("Array length must be at least 16");
        }
    }

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Camera");
        return 0L;
    }

    public final float getNear() {
        return (float) nGetNear(getNativeObject());
    }

    public final void getViewMatrix(float[] fArr) {
        if (fArr.length >= 16) {
            nGetViewMatrix(getNativeObject(), fArr);
        } else {
            JWK$$ExternalSyntheticBUOutline0.m("Array length must be at least 16");
        }
    }

    public final void lookAt(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        nLookAt(getNativeObject(), d, d2, d3, d4, d5, d6, d7, d8, d9);
    }

    public final void setExposure() {
        nSetExposure(getNativeObject(), 16.0f, 0.008f, 100.0f);
    }

    public final void setProjection(double d, double d2, Fov fov) {
        nSetProjectionFov(getNativeObject(), d, d2, 0.1d, 20.0d, fov.ordinal());
    }
}
