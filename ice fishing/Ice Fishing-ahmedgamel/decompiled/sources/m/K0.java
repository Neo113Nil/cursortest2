package m;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    public int f39092a;

    /* renamed from: b, reason: collision with root package name */
    public int f39093b;

    /* renamed from: c, reason: collision with root package name */
    public int f39094c;

    /* renamed from: d, reason: collision with root package name */
    public int f39095d;

    /* renamed from: e, reason: collision with root package name */
    public int f39096e;

    /* renamed from: f, reason: collision with root package name */
    public int f39097f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39098g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39099h;

    public final void a(int i, int i4) {
        this.f39094c = i;
        this.f39095d = i4;
        this.f39099h = true;
        if (this.f39098g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f39092a = i4;
            }
            if (i != Integer.MIN_VALUE) {
                this.f39093b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f39092a = i;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f39093b = i4;
        }
    }
}
