package F;

import A1.InterfaceC0020v;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class J extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0995f f391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0028d f392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(t1.p pVar, C0028d c0028d, l1.d dVar) {
        super(2, dVar);
        this.f391f = (AbstractC0995f) pVar;
        this.f392g = c0028d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new J(this.f391f, this.f392g, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f390e;
        if (i2 == 0) {
            R1.l.F(obj);
            Object obj2 = this.f392g.f466b;
            this.f390e = 1;
            obj = this.f391f.invoke(obj2, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return obj;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
