package f1;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: f1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155F extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f2889g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155F(I.d dVar, double d2, l1.d dVar2) {
        super(2, dVar2);
        this.f2888f = dVar;
        this.f2889g = d2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0155F c0155f = new C0155F(this.f2888f, this.f2889g, dVar);
        c0155f.f2887e = obj;
        return c0155f;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        ((I.b) this.f2887e).d(this.f2888f, new Double(this.f2889g));
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        C0155F c0155f = (C0155F) b((I.b) obj, (l1.d) obj2);
        C0239i c0239i = C0239i.f3393a;
        c0155f.g(c0239i);
        return c0239i;
    }
}
