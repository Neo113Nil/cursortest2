package D;

import K0.AbstractC0046w;
import K0.C0036l;
import K0.InterfaceC0045v;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class L extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f104j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f105k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f106l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.f f107m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(S s2, D0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f106l = s2;
        this.f107m = (x0.f) pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((L) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        L l2 = new L(this.f106l, this.f107m, dVar);
        l2.f105k = obj;
        return l2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f104j;
        if (i2 == 0) {
            o.g.C(obj);
            InterfaceC0045v interfaceC0045v = (InterfaceC0045v) this.f105k;
            C0036l c0036l = new C0036l(true);
            c0036l.H(null);
            S s2 = this.f106l;
            e0 e0Var = new e0(this.f107m, c0036l, s2.f132m.x(), interfaceC0045v.o());
            C0013n c0013n = s2.f136q;
            Object n2 = ((M0.b) c0013n.f244c).n(e0Var);
            if (n2 instanceof M0.g) {
                M0.g gVar = n2 instanceof M0.g ? (M0.g) n2 : null;
                Throwable th = gVar != null ? gVar.f732a : null;
                if (th == null) {
                    throw new M0.l("Channel was closed normally");
                }
                throw th;
            }
            if (n2 instanceof M0.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((A.j) c0013n.f245d).f30g).getAndIncrement() == 0) {
                AbstractC0046w.g((InterfaceC0045v) c0013n.f242a, new h0(c0013n, null));
            }
            this.f104j = 1;
            obj = c0036l.U(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return obj;
    }
}
