package D;

import K0.AbstractC0046w;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020v extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public C0003d f266j;

    /* renamed from: k, reason: collision with root package name */
    public int f267k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f268l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f269m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020v(S s2, v0.d dVar) {
        super(2, dVar);
        this.f269m = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0020v) l((N0.e) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0020v c0020v = new C0020v(this.f269m, dVar);
        c0020v.f268l = obj;
        return c0020v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        N0.e eVar;
        m0 m0Var;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f267k;
        t0.g gVar = t0.g.f2989a;
        S s2 = this.f269m;
        if (i2 == 0) {
            o.g.C(obj);
            N0.e eVar2 = (N0.e) this.f268l;
            this.f268l = eVar2;
            this.f267k = 1;
            Object n2 = AbstractC0046w.n(s2.f127h.o(), new J(s2, null), this);
            if (n2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        o.g.C(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = this.f266j;
                eVar = (N0.e) this.f268l;
                o.g.C(obj);
                N0.i iVar = new N0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (N0.q) s2.f132m.f30g), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (v0.d) null));
                this.f268l = null;
                this.f266j = null;
                this.f267k = 3;
                if (!(eVar instanceof N0.t)) {
                    throw ((N0.t) eVar).f809f;
                }
                Object n3 = iVar.n(eVar, this);
                if (n3 != aVar) {
                    n3 = gVar;
                }
                return n3 == aVar ? aVar : gVar;
            }
            N0.e eVar3 = (N0.e) this.f268l;
            o.g.C(obj);
            eVar = eVar3;
        }
        m0Var = (m0) obj;
        if (m0Var instanceof C0003d) {
            Object obj2 = ((C0003d) m0Var).f174b;
            this.f268l = eVar;
            this.f266j = (C0003d) m0Var;
            this.f267k = 2;
            if (eVar.b(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (m0Var instanceof n0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (m0Var instanceof f0) {
                throw ((f0) m0Var).f188b;
            }
            if (m0Var instanceof d0) {
                return gVar;
            }
        }
        N0.i iVar2 = new N0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (N0.q) s2.f132m.f30g), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (v0.d) null));
        this.f268l = null;
        this.f266j = null;
        this.f267k = 3;
        if (!(eVar instanceof N0.t)) {
        }
    }
}
