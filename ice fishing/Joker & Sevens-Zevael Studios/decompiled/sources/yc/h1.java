package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h1 extends f1 {

    /* renamed from: k, reason: collision with root package name */
    public final k1 f8854k;

    /* renamed from: l, reason: collision with root package name */
    public final i1 f8855l;

    /* renamed from: m, reason: collision with root package name */
    public final k f8856m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f8857n;

    public h1(k1 k1Var, i1 i1Var, k kVar, Object obj) {
        this.f8854k = k1Var;
        this.f8855l = i1Var;
        this.f8856m = kVar;
        this.f8857n = obj;
    }

    @Override // yc.z0
    public final void d(Throwable th) {
        k V = k1.V(this.f8856m);
        k1 k1Var = this.f8854k;
        i1 i1Var = this.f8855l;
        Object obj = this.f8857n;
        if (V != null) {
            while (a0.n(V.f8871k, false, new h1(k1Var, i1Var, V, obj), 1) == o1.f8887g) {
                V = k1.V(V);
                if (V == null) {
                }
            }
            return;
        }
        k1Var.x(k1Var.H(i1Var, obj));
    }
}
