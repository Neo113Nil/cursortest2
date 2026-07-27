package k2;

/* loaded from: classes.dex */
public final class h {
    public static final h i = new h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final h f38585j = new h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final h f38586k = new h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final h f38587l = new h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final h f38588m = new h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final h f38589n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f38590o;

    /* renamed from: a, reason: collision with root package name */
    public final int f38591a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38593c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38594d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38595e;

    /* renamed from: f, reason: collision with root package name */
    public int f38596f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38597g;

    /* renamed from: h, reason: collision with root package name */
    public int f38598h;

    static {
        new h(160, 600, "160x600_as");
        new h(-1, -2, "smart_banner");
        f38589n = new h(-3, -4, "fluid");
        f38590o = new h(0, 0, "invalid");
        new h(50, 50, "50x50_mb");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(int i6, int i9) {
        this(i6, i9, com.anythink.basead.exoplayer.f.f.o(new StringBuilder(String.valueOf(r1).length() + String.valueOf(r0).length() + 1 + 3), r0, "x", r1, "_as"));
        String valueOf = i6 == -1 ? "FULL" : String.valueOf(i6);
        String valueOf2 = i9 == -2 ? "AUTO" : String.valueOf(i9);
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
        return this.f38591a == hVar.f38591a && this.f38592b == hVar.f38592b && this.f38593c.equals(hVar.f38593c);
    }

    public final int hashCode() {
        return this.f38593c.hashCode();
    }

    public final String toString() {
        return this.f38593c;
    }

    public h(int i6, int i9, String str) {
        if (i6 < 0 && i6 != -1 && i6 != -3) {
            throw new IllegalArgumentException(D.y.m(i6, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i6).length() + 26)));
        }
        if (i9 < 0 && i9 != -2 && i9 != -4) {
            throw new IllegalArgumentException(D.y.m(i9, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i9).length() + 27)));
        }
        this.f38591a = i6;
        this.f38592b = i9;
        this.f38593c = str;
    }
}
