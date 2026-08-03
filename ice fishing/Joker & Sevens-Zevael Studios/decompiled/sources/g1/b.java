package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2421a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2422b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2423c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2424d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2425e = 0;

    static {
        long j3 = 3;
        long j6 = j3 << 32;
        f2421a = (0 & 4294967295L) | j6;
        f2422b = (1 & 4294967295L) | j6;
        f2423c = j6 | (2 & 4294967295L);
        f2424d = (j3 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j3, long j6) {
        return j3 == j6;
    }

    public static String b(long j3) {
        return a(j3, f2421a) ? "Rgb" : a(j3, f2422b) ? "Xyz" : a(j3, f2423c) ? "Lab" : a(j3, f2424d) ? "Cmyk" : "Unknown";
    }
}
