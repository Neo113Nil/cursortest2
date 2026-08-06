package E1;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class g extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f324e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f325f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, l1.d dVar) {
        super(2, dVar);
        this.f326g = hVar;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        g gVar = new g(this.f326g, dVar);
        gVar.f325f = obj;
        return gVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f324e;
        C0239i c0239i = C0239i.f3393a;
        if (i2 == 0) {
            R1.l.F(obj);
            D1.e eVar = (D1.e) this.f325f;
            this.f324e = 1;
            Object r2 = this.f326g.f327d.r(eVar, this);
            if (r2 != enumC0985a) {
                r2 = c0239i;
            }
            if (r2 == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return c0239i;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) b((D1.e) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
