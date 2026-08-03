package w;

import m0.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b1 implements x.t0 {

    /* renamed from: i, reason: collision with root package name */
    public static final v0.j f7381i = new v0.j(z0.f7536g, k.f7449k);

    /* renamed from: a, reason: collision with root package name */
    public final i1 f7382a;

    /* renamed from: e, reason: collision with root package name */
    public float f7386e;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f7383b = new i1(0);

    /* renamed from: c, reason: collision with root package name */
    public final y.i f7384c = new y.i();

    /* renamed from: d, reason: collision with root package name */
    public final i1 f7385d = new i1(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final d8.m f7387f = new d8.m(new a0.a0(29, this));

    /* renamed from: g, reason: collision with root package name */
    public final m0.i0 f7388g = m0.z.n(new a1(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final m0.i0 f7389h = m0.z.n(new a1(this, 0));

    public b1(int i10) {
        this.f7382a = new i1(i10);
    }

    @Override // x.t0
    public final boolean a() {
        return ((Boolean) this.f7389h.getValue()).booleanValue();
    }

    @Override // x.t0
    public final boolean b() {
        return this.f7387f.b();
    }

    @Override // x.t0
    public final boolean c() {
        return ((Boolean) this.f7388g.getValue()).booleanValue();
    }

    @Override // x.t0
    public final float d(float f10) {
        return this.f7387f.d(f10);
    }

    @Override // x.t0
    public final Object e(p0 p0Var, oc.e eVar, hc.c cVar) {
        Object e10 = this.f7387f.e(p0Var, eVar, cVar);
        return e10 == gc.a.f2559g ? e10 : ac.o.f277a;
    }
}
