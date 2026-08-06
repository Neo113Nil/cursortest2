package F;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class M extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f398e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p2, l1.d dVar) {
        super(2, dVar);
        this.f400g = p2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        M m2 = new M(this.f400g, dVar);
        m2.f399f = obj;
        return m2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f398e;
        if (i2 == 0) {
            R1.l.F(obj);
            c0 c0Var = (c0) this.f399f;
            this.f398e = 1;
            if (P.b(this.f400g, c0Var, this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) b((c0) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
