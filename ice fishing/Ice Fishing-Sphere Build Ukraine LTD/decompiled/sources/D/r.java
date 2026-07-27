package D;

import t0.C0252g;

/* loaded from: classes.dex */
public final class r extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f258j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m0 m0Var, v0.d dVar) {
        super(2, dVar);
        this.f258j = m0Var;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) l((m0) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        r rVar = new r(this.f258j, dVar);
        rVar.f257i = obj;
        return rVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        o.g.z(obj);
        m0 m0Var = (m0) this.f257i;
        return Boolean.valueOf((m0Var instanceof C0003d) && m0Var.f242a <= this.f258j.f242a);
    }
}
