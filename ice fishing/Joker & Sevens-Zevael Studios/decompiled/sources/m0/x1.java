package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public y f4806a;

    /* renamed from: b, reason: collision with root package name */
    public int f4807b;

    /* renamed from: c, reason: collision with root package name */
    public a f4808c;

    /* renamed from: d, reason: collision with root package name */
    public oc.e f4809d;

    /* renamed from: e, reason: collision with root package name */
    public int f4810e;

    /* renamed from: f, reason: collision with root package name */
    public s.z f4811f;

    /* renamed from: g, reason: collision with root package name */
    public s.g0 f4812g;

    public x1(y yVar) {
        this.f4806a = yVar;
    }

    public static boolean a(i0 i0Var, s.g0 g0Var) {
        pc.j.c(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        r2 r2Var = i0Var.f4611i;
        if (r2Var == null) {
            r2Var = z0.f4844l;
        }
        return !r2Var.a(i0Var.h().f4602f, g0Var.g(i0Var));
    }

    public final boolean b() {
        if (this.f4806a != null) {
            a aVar = this.f4808c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final t0 c(Object obj) {
        t0 r5;
        y yVar = this.f4806a;
        return (yVar == null || (r5 = yVar.r(this, obj)) == null) ? t0.f4763g : r5;
    }

    public final void d() {
        y yVar = this.f4806a;
        if (yVar != null) {
            yVar.f4827u = true;
            yVar.f4830x.n();
        }
        this.f4806a = null;
        this.f4811f = null;
        this.f4812g = null;
        this.f4809d = null;
    }

    public final void e(boolean z10) {
        int i10 = this.f4807b;
        this.f4807b = z10 ? i10 | 32 : i10 & (-33);
    }
}
