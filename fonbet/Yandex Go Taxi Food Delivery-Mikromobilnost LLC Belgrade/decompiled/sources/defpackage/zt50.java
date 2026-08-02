package defpackage;

import com.airbnb.lottie.network.FileExtension;

/* loaded from: classes.dex */
public abstract /* synthetic */ class zt50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileExtension.values().length];
        a = iArr;
        try {
            iArr[FileExtension.ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[FileExtension.GZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
