package D;

import L0.AbstractC0064w;
import L0.C0054l;
import L0.InterfaceC0063v;
import java.util.concurrent.atomic.AtomicInteger;
import t0.C0252g;

/* loaded from: classes.dex */
public final class L extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f104i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f105j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f106k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.f f107l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(S s2, D0.p pVar, v0.d dVar) {
        super(2, dVar);
        this.f106k = s2;
        this.f107l = (x0.f) pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((L) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        L l2 = new L(this.f106k, this.f107l, dVar);
        l2.f105j = obj;
        return l2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f104i;
        if (i2 == 0) {
            o.g.z(obj);
            InterfaceC0063v interfaceC0063v = (InterfaceC0063v) this.f105j;
            C0054l c0054l = new C0054l(true);
            c0054l.H(null);
            S s2 = this.f106k;
            e0 e0Var = new e0(this.f107l, c0054l, s2.f132l.x(), interfaceC0063v.o());
            C0013n c0013n = s2.f136p;
            Object n2 = ((N0.b) c0013n.f245c).n(e0Var);
            if (n2 instanceof N0.g) {
                N0.g gVar = n2 instanceof N0.g ? (N0.g) n2 : null;
                Throwable th = gVar != null ? gVar.f740a : null;
                if (th == null) {
                    throw new N0.l("Channel was closed normally");
                }
                throw th;
            }
            if (n2 instanceof N0.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((A.j) c0013n.f246d).f30f).getAndIncrement() == 0) {
                AbstractC0064w.g((InterfaceC0063v) c0013n.f243a, new h0(c0013n, null));
            }
            this.f104i = 1;
            obj = c0054l.U(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
