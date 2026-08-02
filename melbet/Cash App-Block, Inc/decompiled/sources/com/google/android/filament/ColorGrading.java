package com.google.android.filament;

/* loaded from: classes6.dex */
public class ColorGrading {
    public long mNativeObject;

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderContrast(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSaturation(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapper(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVibrance(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);
}
