package h;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public int f3193a;

    /* renamed from: b, reason: collision with root package name */
    public int f3194b;

    /* renamed from: c, reason: collision with root package name */
    public int f3195c;

    /* renamed from: d, reason: collision with root package name */
    public int f3196d;

    /* renamed from: e, reason: collision with root package name */
    public int f3197e;

    /* renamed from: f, reason: collision with root package name */
    public int f3198f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3199g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3200h;

    public final void a(int i2, int i3) {
        this.f3195c = i2;
        this.f3196d = i3;
        this.f3200h = true;
        if (this.f3199g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f3193a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f3194b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3193a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3194b = i3;
        }
    }
}
