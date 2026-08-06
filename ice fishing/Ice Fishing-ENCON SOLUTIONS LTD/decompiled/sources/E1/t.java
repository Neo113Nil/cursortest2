package E1;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class t extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f344e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D1.e f346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(D1.e eVar, l1.d dVar) {
        super(2, dVar);
        this.f346g = eVar;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        t tVar = new t(this.f346g, dVar);
        tVar.f345f = obj;
        return tVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f344e;
        if (i2 == 0) {
            R1.l.F(obj);
            Object obj2 = this.f345f;
            this.f344e = 1;
            if (this.f346g.a(obj2, this) == enumC0985a) {
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
        return ((t) b(obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
