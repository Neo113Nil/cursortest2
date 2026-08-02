package com.google.android.filament;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class TransformManager {
    public long mNativeObject;

    private static native int nGetInstance(long j, int i);

    private static native void nGetTransform(long j, int i, float[] fArr);

    private static native void nSetTransform(long j, int i, float[] fArr);

    public final int getInstance(int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public final void getTransform(int i, float[] fArr) {
        if (fArr.length >= 16) {
            nGetTransform(this.mNativeObject, i, fArr);
        } else {
            JWK$$ExternalSyntheticBUOutline0.m("Array length must be at least 16");
        }
    }

    public final void setTransform(int i, float[] fArr) {
        if (fArr.length >= 16) {
            nSetTransform(this.mNativeObject, i, fArr);
        } else {
            JWK$$ExternalSyntheticBUOutline0.m("Array length must be at least 16");
        }
    }
}
