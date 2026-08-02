package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public class RenderableManager {
    static {
        CameraSelector$$ExternalSyntheticOutline0.values(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);
}
