package s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f40380a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f40381b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f40382c = new Object[0];

    public static int a(int i, int i4, int[] iArr) {
        int i9 = i - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i4) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i4) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static int b(long[] jArr, int i, long j9) {
        int i4 = i - 1;
        int i9 = 0;
        while (i9 <= i4) {
            int i10 = (i9 + i4) >>> 1;
            long j10 = jArr[i10];
            if (j10 < j9) {
                i9 = i10 + 1;
            } else {
                if (j10 <= j9) {
                    return i10;
                }
                i4 = i10 - 1;
            }
        }
        return ~i9;
    }
}
