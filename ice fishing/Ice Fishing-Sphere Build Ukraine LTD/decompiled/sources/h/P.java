package h;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f2134a;

    /* renamed from: b, reason: collision with root package name */
    public int f2135b;

    /* renamed from: c, reason: collision with root package name */
    public int f2136c;

    /* renamed from: d, reason: collision with root package name */
    public int f2137d;

    /* renamed from: e, reason: collision with root package name */
    public int f2138e;

    /* renamed from: f, reason: collision with root package name */
    public int f2139f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2140g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2141h;

    public final void a(int i2, int i3) {
        this.f2136c = i2;
        this.f2137d = i3;
        this.f2141h = true;
        if (this.f2140g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2134a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2135b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2134a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2135b = i3;
        }
    }
}
