package F;

import h1.C0239i;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class r extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k0 k0Var, l1.d dVar) {
        super(2, dVar);
        this.f545f = k0Var;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        r rVar = new r(this.f545f, dVar);
        rVar.f544e = obj;
        return rVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        k0 k0Var = (k0) this.f544e;
        return Boolean.valueOf((k0Var instanceof C0028d) && k0Var.f516a <= this.f545f.f516a);
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) b((k0) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
