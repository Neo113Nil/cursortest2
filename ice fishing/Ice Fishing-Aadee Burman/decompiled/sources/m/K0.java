package m;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f39024a;

    /* renamed from: b, reason: collision with root package name */
    public int f39025b;

    /* renamed from: c, reason: collision with root package name */
    public int f39026c;

    /* renamed from: d, reason: collision with root package name */
    public int f39027d;

    /* renamed from: e, reason: collision with root package name */
    public int f39028e;

    /* renamed from: f, reason: collision with root package name */
    public int f39029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39030g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39031h;

    public final void a(int i, int i6) {
        this.f39026c = i;
        this.f39027d = i6;
        this.f39031h = true;
        if (this.f39030g) {
            if (i6 != Integer.MIN_VALUE) {
                this.f39024a = i6;
            }
            if (i != Integer.MIN_VALUE) {
                this.f39025b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f39024a = i;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f39025b = i6;
        }
    }
}
