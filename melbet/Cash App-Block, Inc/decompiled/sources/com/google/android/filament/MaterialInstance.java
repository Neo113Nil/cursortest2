package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public class MaterialInstance {
    public long mNativeObject;

    static {
        CameraSelector$$ExternalSyntheticOutline0.values(4);
    }

    private static native void nSetCullingMode(long j, long j2);

    private static native void nSetParameterBool(long j, String str, boolean z);

    private static native void nSetParameterFloat(long j, String str, float f);

    private static native void nSetParameterFloat2(long j, String str, float f, float f2);

    private static native void nSetParameterFloat3(long j, String str, float f, float f2, float f3);

    private static native void nSetParameterFloat4(long j, String str, float f, float f2, float f3, float f4);

    private static native void nSetParameterTexture(long j, String str, long j2, long j3);

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed MaterialInstance");
        return 0L;
    }

    public final void setCullingMode() {
        nSetCullingMode(getNativeObject(), CameraSelector$$ExternalSyntheticOutline0.ordinal(2));
    }

    public final void setParameter(String str, float f, float f2, float f3, float f4) {
        float[] fArr = {f, f2, f3, f4};
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(1);
        if (ordinal == 0) {
            Colors.toLinear(fArr);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                Colors.toLinear(fArr);
            }
            nSetParameterFloat4(getNativeObject(), str, fArr[0], fArr[1], fArr[2], fArr[3]);
        }
        float f5 = fArr[3];
        fArr[0] = fArr[0] * f5;
        fArr[1] = fArr[1] * f5;
        fArr[2] = fArr[2] * f5;
        nSetParameterFloat4(getNativeObject(), str, fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public final void setParameter(String str, float f, float f2, float f3) {
        float[] fArr = {f, f2, f3};
        Colors.toLinear(fArr);
        nSetParameterFloat3(getNativeObject(), str, fArr[0], fArr[1], fArr[2]);
    }

    public final void setParameter(boolean z) {
        nSetParameterBool(getNativeObject(), "isHolo", z);
    }

    public final void setParameter(String str, float f) {
        nSetParameterFloat(getNativeObject(), str, f);
    }

    public final void setParameter(String str, float f, float f2) {
        nSetParameterFloat2(getNativeObject(), str, f, f2);
    }

    public final void setParameter(float f, float f2, float f3, float f4) {
        nSetParameterFloat4(getNativeObject(), "iconRect", f, f2, f3, f4);
    }

    public final void setParameter(String str, Texture texture, TextureSampler textureSampler) {
        nSetParameterTexture(getNativeObject(), str, texture.getNativeObject(), textureSampler.mSampler);
    }
}
