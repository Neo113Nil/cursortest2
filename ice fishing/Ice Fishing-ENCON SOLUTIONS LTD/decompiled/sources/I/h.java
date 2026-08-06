package I;

import R1.l;
import h1.C0239i;
import i1.u;
import m1.EnumC0985a;
import n1.AbstractC0995f;
import t1.p;

/* loaded from: classes.dex */
public final class h extends AbstractC0995f implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f715e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0995f f717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, l1.d dVar) {
        super(2, dVar);
        this.f717g = (AbstractC0995f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        h hVar = new h(this.f717g, dVar);
        hVar.f716f = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f715e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f716f;
            l.F(obj);
            return bVar;
        }
        l.F(obj);
        b bVar2 = new b(u.N(((b) this.f716f).a()), false);
        this.f716f = bVar2;
        this.f715e = 1;
        return this.f717g.invoke(bVar2, this) == enumC0985a ? enumC0985a : bVar2;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) b((b) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
