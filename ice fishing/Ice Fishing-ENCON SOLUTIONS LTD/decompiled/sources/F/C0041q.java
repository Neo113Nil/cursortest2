package F;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041q extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f543e;

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0041q c0041q = new C0041q(2, dVar);
        c0041q.f543e = obj;
        return c0041q;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        return Boolean.valueOf(!(((k0) this.f543e) instanceof b0));
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0041q) b((k0) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
