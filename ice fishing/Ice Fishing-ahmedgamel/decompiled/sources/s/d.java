package s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f40411a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f40412b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f40413c = new Object[0];

    public static int a(int i, int i6, int[] iArr) {
        int i9 = i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i6) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i6) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static int b(long[] jArr, int i, long j6) {
        int i6 = i - 1;
        int i9 = 0;
        while (i9 <= i6) {
            int i10 = (i9 + i6) >>> 1;
            long j9 = jArr[i10];
            if (j9 < j6) {
                i9 = i10 + 1;
            } else {
                if (j9 <= j6) {
                    return i10;
                }
                i6 = i10 - 1;
            }
        }
        return ~i9;
    }
}
