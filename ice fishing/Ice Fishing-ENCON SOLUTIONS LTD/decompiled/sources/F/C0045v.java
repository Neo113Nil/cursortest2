package F;

import A1.AbstractC0022x;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: F.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045v extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public C0028d f554e;

    /* renamed from: f, reason: collision with root package name */
    public int f555f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f557h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045v(P p2, l1.d dVar) {
        super(2, dVar);
        this.f557h = p2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0045v c0045v = new C0045v(this.f557h, dVar);
        c0045v.f556g = obj;
        return c0045v;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        D1.e eVar;
        k0 k0Var;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f555f;
        C0239i c0239i = C0239i.f3393a;
        P p2 = this.f557h;
        if (i2 == 0) {
            R1.l.F(obj);
            D1.e eVar2 = (D1.e) this.f556g;
            this.f556g = eVar2;
            this.f555f = 1;
            Object n2 = AbstractC0022x.n(p2.f414c.h(), new I(p2, null), this);
            if (n2 == enumC0985a) {
                return enumC0985a;
            }
            eVar = eVar2;
            obj = n2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        R1.l.F(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = this.f554e;
                eVar = (D1.e) this.f556g;
                R1.l.F(obj);
                D1.i iVar = new D1.i(new C.j(3, new x0.e(2, new x0.e(3, new x0.e(1, new C0040p(p2, null), (D1.r) p2.f419h.f124b), new C0041q(2, null)), new r(k0Var, null))), new C0042s(p2, (l1.d) null));
                this.f556g = null;
                this.f554e = null;
                this.f555f = 3;
                if (!(eVar instanceof D1.u)) {
                    throw ((D1.u) eVar).f304a;
                }
                Object r2 = iVar.r(eVar, this);
                if (r2 != enumC0985a) {
                    r2 = c0239i;
                }
                return r2 == enumC0985a ? enumC0985a : c0239i;
            }
            D1.e eVar3 = (D1.e) this.f556g;
            R1.l.F(obj);
            eVar = eVar3;
        }
        k0Var = (k0) obj;
        if (k0Var instanceof C0028d) {
            Object obj2 = ((C0028d) k0Var).f466b;
            this.f556g = eVar;
            this.f554e = (C0028d) k0Var;
            this.f555f = 2;
            if (eVar.a(obj2, this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (k0Var instanceof l0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (k0Var instanceof d0) {
                throw ((d0) k0Var).f468b;
            }
            if (k0Var instanceof b0) {
                return c0239i;
            }
        }
        D1.i iVar2 = new D1.i(new C.j(3, new x0.e(2, new x0.e(3, new x0.e(1, new C0040p(p2, null), (D1.r) p2.f419h.f124b), new C0041q(2, null)), new r(k0Var, null))), new C0042s(p2, (l1.d) null));
        this.f556g = null;
        this.f554e = null;
        this.f555f = 3;
        if (!(eVar instanceof D1.u)) {
        }
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0045v) b((D1.e) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
