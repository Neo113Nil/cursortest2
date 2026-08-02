package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public class LightManager {
    public long mNativeObject;

    static {
        CameraSelector$$ExternalSyntheticOutline0.values(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetInstance(long j, int i);

    private static native void nSetDirection(long j, int i, float f, float f2, float f3);

    private static native void nSetIntensity(long j, int i, float f);

    private static native void nSetPosition(long j, int i, float f, float f2, float f3);

    public final int getInstance(int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public final void setDirection(float f, float f2, float f3, int i) {
        nSetDirection(this.mNativeObject, i, f, f2, f3);
    }

    public final void setIntensity(float f, int i) {
        nSetIntensity(this.mNativeObject, i, f);
    }

    public final void setPosition(float f, float f2, float f3, int i) {
        nSetPosition(this.mNativeObject, i, f, f2, f3);
    }
}
