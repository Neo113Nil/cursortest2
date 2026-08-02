package defpackage;

import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class wfy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UseCaseConfigFactory$CaptureType.values().length];
        a = iArr;
        try {
            iArr[UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[UseCaseConfigFactory$CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[UseCaseConfigFactory$CaptureType.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[UseCaseConfigFactory$CaptureType.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[UseCaseConfigFactory$CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
