package k2;

/* renamed from: k2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4637h {
    public static final C4637h i = new C4637h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final C4637h f38705j = new C4637h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final C4637h f38706k = new C4637h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final C4637h f38707l = new C4637h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final C4637h f38708m = new C4637h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final C4637h f38709n;

    /* renamed from: o, reason: collision with root package name */
    public static final C4637h f38710o;

    /* renamed from: a, reason: collision with root package name */
    public final int f38711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38712b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38713c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38714d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38715e;

    /* renamed from: f, reason: collision with root package name */
    public int f38716f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38717g;

    /* renamed from: h, reason: collision with root package name */
    public int f38718h;

    static {
        new C4637h(160, 600, "160x600_as");
        new C4637h(-1, -2, "smart_banner");
        f38709n = new C4637h(-3, -4, "fluid");
        f38710o = new C4637h(0, 0, "invalid");
        new C4637h(50, 50, "50x50_mb");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4637h(int i4, int i9) {
        this(i4, i9, com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(r1).length() + String.valueOf(r0).length() + 1 + 3), r0, "x", r1, "_as"));
        String valueOf = i4 == -1 ? "FULL" : String.valueOf(i4);
        String valueOf2 = i9 == -2 ? "AUTO" : String.valueOf(i9);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4637h)) {
            return false;
        }
        C4637h c4637h = (C4637h) obj;
        return this.f38711a == c4637h.f38711a && this.f38712b == c4637h.f38712b && this.f38713c.equals(c4637h.f38713c);
    }

    public final int hashCode() {
        return this.f38713c.hashCode();
    }

    public final String toString() {
        return this.f38713c;
    }

    public C4637h(int i4, int i9, String str) {
        if (i4 < 0 && i4 != -1 && i4 != -3) {
            throw new IllegalArgumentException(D.y.j(i4, "Invalid width for AdSize: ", new StringBuilder(String.valueOf(i4).length() + 26)));
        }
        if (i9 < 0 && i9 != -2 && i9 != -4) {
            throw new IllegalArgumentException(D.y.j(i9, "Invalid height for AdSize: ", new StringBuilder(String.valueOf(i9).length() + 27)));
        }
        this.f38711a = i4;
        this.f38712b = i9;
        this.f38713c = str;
    }
}
