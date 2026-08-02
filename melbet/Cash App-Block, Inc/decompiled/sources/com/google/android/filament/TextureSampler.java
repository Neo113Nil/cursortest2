package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public class TextureSampler {
    public long mSampler;

    public TextureSampler() {
        this.mSampler = 0L;
        this.mSampler = nCreateSampler(5, 1, 1, 1, 1);
    }

    private static native long nCreateSampler(int i, int i2, int i3, int i4, int i5);

    private static native long nSetAnisotropy(long j, float f);

    private static native long nSetMagFilter(long j, int i);

    private static native long nSetMinFilter(long j, int i);

    public final void setAnisotropy() {
        this.mSampler = nSetAnisotropy(this.mSampler, 4.0f);
    }

    public final void setMagFilter() {
        this.mSampler = nSetMagFilter(this.mSampler, CameraSelector$$ExternalSyntheticOutline0.ordinal(1));
    }

    public final void setMinFilter() {
        this.mSampler = nSetMinFilter(this.mSampler, CameraSelector$$ExternalSyntheticOutline0.ordinal(1));
    }
}
