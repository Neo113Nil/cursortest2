package m;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3860a;

    /* renamed from: b, reason: collision with root package name */
    public int f3861b;

    /* renamed from: c, reason: collision with root package name */
    public int f3862c;

    /* renamed from: d, reason: collision with root package name */
    public int f3863d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3864f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3865g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3866h;

    public final void a(int i, int i2) {
        this.f3862c = i;
        this.f3863d = i2;
        this.f3866h = true;
        if (this.f3865g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3860a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3861b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3860a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3861b = i2;
        }
    }
}
