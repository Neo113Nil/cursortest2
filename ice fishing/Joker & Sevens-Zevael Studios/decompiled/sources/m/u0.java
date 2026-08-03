package m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4478a;

    /* renamed from: b, reason: collision with root package name */
    public int f4479b;

    /* renamed from: c, reason: collision with root package name */
    public int f4480c;

    /* renamed from: d, reason: collision with root package name */
    public int f4481d;

    /* renamed from: e, reason: collision with root package name */
    public int f4482e;

    /* renamed from: f, reason: collision with root package name */
    public int f4483f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4484g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4485h;

    public final void a(int i10, int i11) {
        this.f4480c = i10;
        this.f4481d = i11;
        this.f4485h = true;
        if (this.f4484g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f4478a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f4479b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f4478a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f4479b = i11;
        }
    }
}
