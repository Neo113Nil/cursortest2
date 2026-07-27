package S7;

/* loaded from: classes2.dex */
public final class e0 extends c0 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f2952A;

    /* renamed from: x, reason: collision with root package name */
    public final h0 f2953x;

    /* renamed from: y, reason: collision with root package name */
    public final f0 f2954y;

    /* renamed from: z, reason: collision with root package name */
    public final C0393k f2955z;

    public e0(h0 h0Var, f0 f0Var, C0393k c0393k, Object obj) {
        this.f2953x = h0Var;
        this.f2954y = f0Var;
        this.f2955z = c0393k;
        this.f2952A = obj;
    }

    @Override // S7.c0
    public final void i(Throwable th) {
        H G7;
        C0393k c0393k = this.f2955z;
        h0 h0Var = this.f2953x;
        h0Var.getClass();
        C0393k M8 = h0.M(c0393k);
        f0 f0Var = this.f2954y;
        Object obj = this.f2952A;
        if (M8 != null) {
            do {
                G7 = M8.f2975x.G((r5 & 1) == 0, (r5 & 2) != 0, new e0(h0Var, f0Var, M8, obj));
                if (G7 != l0.f2976n) {
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
        return u7.v.f41350a;
    }
}
