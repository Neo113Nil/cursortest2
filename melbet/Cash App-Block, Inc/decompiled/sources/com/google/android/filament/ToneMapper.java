package com.google.android.filament;

/* loaded from: classes6.dex */
public abstract class ToneMapper {
    public final long mNativeObject;

    public final class Linear extends ToneMapper {
    }

    public ToneMapper(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    private static native void nDestroyToneMapper(long j);

    public final void finalize() {
        long j = this.mNativeObject;
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(j);
        }
    }
}
