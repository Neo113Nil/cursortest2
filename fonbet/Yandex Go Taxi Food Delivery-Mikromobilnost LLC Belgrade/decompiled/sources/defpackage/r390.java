package defpackage;

import com.google.zxing.pdf417.encoder.Compaction;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class r390 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Compaction.values().length];
        a = iArr;
        try {
            iArr[Compaction.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Compaction.BYTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[Compaction.NUMERIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
