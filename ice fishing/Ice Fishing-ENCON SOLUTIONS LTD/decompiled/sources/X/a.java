package X;

import A1.InterfaceC0020v;
import D1.d;
import D1.o;
import P0.q;
import R1.l;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;
import t1.p;

/* loaded from: classes.dex */
public final class a extends AbstractC0995f implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f1915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f1917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, q qVar, l1.d dVar2) {
        super(2, dVar2);
        this.f1916f = dVar;
        this.f1917g = qVar;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new a(this.f1916f, this.f1917g, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f1915e;
        if (i2 == 0) {
            l.F(obj);
            o oVar = new o(2, this.f1917g);
            this.f1915e = 1;
            if (this.f1916f.r(oVar, this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.F(obj);
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
