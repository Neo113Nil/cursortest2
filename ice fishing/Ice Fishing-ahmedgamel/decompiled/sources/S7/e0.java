package S7;

/* loaded from: classes2.dex */
public final class e0 extends c0 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f3035A;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f3036x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f3037y;

    /* renamed from: z, reason: collision with root package name */
    public final C0397k f3038z;

    public e0(h0 h0Var, f0 f0Var, C0397k c0397k, Object obj) {
        this.f3036x = h0Var;
        this.f3037y = f0Var;
        this.f3038z = c0397k;
        this.f3035A = obj;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        H G2;
        C0397k c0397k = this.f3038z;
        h0 h0Var = this.f3036x;
        h0Var.getClass();
        C0397k M8 = h0.M(c0397k);
        f0 f0Var = this.f3037y;
        Object obj = this.f3035A;
        if (M8 != null) {
            do {
                G2 = M8.f3058x.G((r5 & 1) == 0, (r5 & 2) != 0, new e0(h0Var, f0Var, M8, obj));
                if (G2 != l0.f3059n) {
                    return;
                } else {
                    M8 = h0.M(M8);
                }
            } while (M8 != null);
        }
        h0Var.h(h0Var.v(f0Var, obj));
    }

    @Override // I7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Throwable) obj);
        return u7.v.f41073a;
    }
}
