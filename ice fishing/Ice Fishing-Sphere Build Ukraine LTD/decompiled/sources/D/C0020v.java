package D;

import L0.AbstractC0064w;
import t0.C0252g;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020v extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public C0003d f267i;

    /* renamed from: j, reason: collision with root package name */
    public int f268j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f269k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f270l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020v(S s2, v0.d dVar) {
        super(2, dVar);
        this.f270l = s2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0020v) l((O0.e) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0020v c0020v = new C0020v(this.f270l, dVar);
        c0020v.f269k = obj;
        return c0020v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        O0.e eVar;
        m0 m0Var;
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f268j;
        C0252g c0252g = C0252g.f2994a;
        S s2 = this.f270l;
        if (i2 == 0) {
            o.g.z(obj);
            O0.e eVar2 = (O0.e) this.f269k;
            this.f269k = eVar2;
            this.f268j = 1;
            Object n2 = AbstractC0064w.n(s2.f127g.o(), new J(s2, null), this);
            if (n2 == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        o.g.z(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = this.f267i;
                eVar = (O0.e) this.f269k;
                o.g.z(obj);
                O0.i iVar = new O0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (O0.q) s2.f132l.f30f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (v0.d) null));
                this.f269k = null;
                this.f267i = null;
                this.f268j = 3;
                if (!(eVar instanceof O0.t)) {
                    throw ((O0.t) eVar).f817e;
                }
                Object c2 = iVar.c(eVar, this);
                if (c2 != aVar) {
                    c2 = c0252g;
                }
                return c2 == aVar ? aVar : c0252g;
            }
            O0.e eVar3 = (O0.e) this.f269k;
            o.g.z(obj);
            eVar = eVar3;
        }
        m0Var = (m0) obj;
        if (m0Var instanceof C0003d) {
            Object obj2 = ((C0003d) m0Var).f174b;
            this.f269k = eVar;
            this.f267i = (C0003d) m0Var;
            this.f268j = 2;
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
                return c0252g;
            }
        }
        O0.i iVar2 = new O0.i(new A.j(2, new L.Q(2, new L.Q(3, new L.Q(1, new C0015p(s2, null), (O0.q) s2.f132l.f30f), new C0016q(2, null)), new r(m0Var, null))), new C0017s(s2, (v0.d) null));
        this.f269k = null;
        this.f267i = null;
        this.f268j = 3;
        if (!(eVar instanceof O0.t)) {
        }
    }
}
