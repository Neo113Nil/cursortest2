package Z;

import a0.InterfaceC0084a;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1922c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f1923d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1924e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1925f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1926g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1927h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1928a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1929b;

    static {
        int i2 = 0;
        f1922c = new b("NONE", i2);
        f1923d = new b("FULL", i2);
        int i3 = 1;
        f1924e = new b("FLAT", i3);
        f1925f = new b("HALF_OPENED", i3);
        int i4 = 2;
        f1926g = new b("FOLD", i4);
        f1927h = new b("HINGE", i4);
    }

    public /* synthetic */ b(String str, int i2) {
        this.f1928a = i2;
        this.f1929b = str;
    }

    public String toString() {
        switch (this.f1928a) {
            case 0:
                return (String) this.f1929b;
            case 1:
                return (String) this.f1929b;
            case 2:
                return (String) this.f1929b;
            default:
                return super.toString();
        }
    }

    public b(InterfaceC0084a interfaceC0084a) {
        this.f1928a = 3;
        int i2 = m.f1951b;
        this.f1929b = interfaceC0084a;
    }
}
