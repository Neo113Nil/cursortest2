package F;

import A1.AbstractC0022x;
import A1.C0011l;
import A1.InterfaceC0020v;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicInteger;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class K extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f393e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0995f f396h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(P p2, t1.p pVar, l1.d dVar) {
        super(2, dVar);
        this.f395g = p2;
        this.f396h = (AbstractC0995f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        K k2 = new K(this.f395g, this.f396h, dVar);
        k2.f394f = obj;
        return k2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f393e;
        if (i2 == 0) {
            R1.l.F(obj);
            InterfaceC0020v interfaceC0020v = (InterfaceC0020v) this.f394f;
            C0011l c0011l = new C0011l(true);
            c0011l.G(null);
            P p2 = this.f395g;
            c0 c0Var = new c0(this.f396h, c0011l, p2.f419h.l(), interfaceC0020v.h());
            C0038n c0038n = p2.f423l;
            Object g2 = ((C1.c) c0038n.f534c).g(c0Var);
            if (g2 instanceof C1.h) {
                C1.h hVar = g2 instanceof C1.h ? (C1.h) g2 : null;
                Throwable th = hVar != null ? hVar.f184a : null;
                if (th == null) {
                    throw new C1.m("Channel was closed normally");
                }
                throw th;
            }
            if (g2 instanceof C1.i) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C.j) c0038n.f535d).f124b).getAndIncrement() == 0) {
                AbstractC0022x.g((InterfaceC0020v) c0038n.f532a, new f0(c0038n, null));
            }
            this.f393e = 1;
            obj = c0011l.T(this);
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
        return ((K) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
