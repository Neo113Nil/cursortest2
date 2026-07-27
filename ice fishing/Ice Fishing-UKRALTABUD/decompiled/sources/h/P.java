package h;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public int f2126a;

    /* renamed from: b, reason: collision with root package name */
    public int f2127b;

    /* renamed from: c, reason: collision with root package name */
    public int f2128c;

    /* renamed from: d, reason: collision with root package name */
    public int f2129d;

    /* renamed from: e, reason: collision with root package name */
    public int f2130e;

    /* renamed from: f, reason: collision with root package name */
    public int f2131f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2133h;

    public final void a(int i2, int i3) {
        this.f2128c = i2;
        this.f2129d = i3;
        this.f2133h = true;
        if (this.f2132g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2126a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f2127b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2126a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f2127b = i3;
        }
    }
}
