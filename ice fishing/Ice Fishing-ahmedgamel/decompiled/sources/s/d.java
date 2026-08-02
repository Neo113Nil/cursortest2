package s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f40247a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f40248b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f40249c = new Object[0];

    public static int a(int i, int i4, int[] iArr) {
        int i6 = i - 1;
        int i9 = 0;
        while (i9 <= i6) {
            int i10 = (i9 + i6) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i4) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i4) {
                    return i10;
                }
                i6 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static int b(long[] jArr, int i, long j6) {
        int i4 = i - 1;
        int i6 = 0;
        while (i6 <= i4) {
            int i9 = (i6 + i4) >>> 1;
            long j9 = jArr[i9];
            if (j9 < j6) {
                i6 = i9 + 1;
            } else {
                if (j9 <= j6) {
                    return i9;
                }
                i4 = i9 - 1;
            }
        }
        return ~i6;
    }
}
