package m2;

/* loaded from: classes.dex */
public final class h {
    public static final h i = new h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final h f39374j = new h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final h f39375k = new h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final h f39376l = new h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final h f39377m = new h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final h f39378n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f39379o;

    /* renamed from: a, reason: collision with root package name */
    public final int f39380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39381b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39382c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39383d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39384e;

    /* renamed from: f, reason: collision with root package name */
    public int f39385f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39386g;

    /* renamed from: h, reason: collision with root package name */
    public int f39387h;

    static {
        new h(160, 600, "160x600_as");
        new h(-1, -2, "smart_banner");
        f39378n = new h(-3, -4, "fluid");
        f39379o = new h(0, 0, "invalid");
        new h(50, 50, "50x50_mb");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i4, int i6) {
        this(i4, i6, com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(r1).length() + String.valueOf(r0).length() + 1 + 3), r0, "x", r1, "_as"));
        String valueOf = i4 == -1 ? "FULL" : String.valueOf(i4);
        String valueOf2 = i6 == -2 ? "AUTO" : String.valueOf(i6);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f39380a == hVar.f39380a && this.f39381b == hVar.f39381b && this.f39382c.equals(hVar.f39382c);
    }

    public final int hashCode() {
        return this.f39382c.hashCode();
    }

    public final String toString() {
        return this.f39382c;
    }

    public h(int i4, int i6, String str) {
        if (i4 < 0 && i4 != -1 && i4 != -3) {
            throw new IllegalArgumentException(D.x.k(i4, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i4).length() + 26)));
        }
        if (i6 < 0 && i6 != -2 && i6 != -4) {
            throw new IllegalArgumentException(D.x.k(i6, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i6).length() + 27)));
        }
        this.f39380a = i4;
        this.f39381b = i6;
        this.f39382c = str;
    }
}
