package N1;

import L1.C0000a;
import L1.C0003d;
import L1.C0008i;
import L1.d0;
import Q1.o;
import Q1.t;
import Q1.u;
import androidx.window.layout.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f711a = d.f733p;

    /* renamed from: b, reason: collision with root package name */
    public C0003d f712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f713c;

    public a(k kVar) {
        this.f713c = kVar;
    }

    @Override // L1.d0
    public final void a(h hVar, int i) {
        C0003d c0003d = this.f712b;
        if (c0003d != null) {
            c0003d.a(hVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00c3, code lost:
    
        if (r1 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y yVar) {
        h hVar;
        C0003d c0003d;
        C0003d c0003d2;
        h hVar2;
        int i;
        o oVar;
        Boolean bool;
        int i2;
        h hVar3;
        int i3 = 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f718h;
        k kVar = this.f713c;
        h hVar4 = (h) atomicReferenceFieldUpdater.get(kVar);
        while (!kVar.l(b.f714c.get(kVar), true)) {
            long andIncrement = b.f715d.getAndIncrement(kVar);
            long j = d.f722b;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (hVar4.f970c != j2) {
                h h2 = kVar.h(j2, hVar4);
                if (h2 == null) {
                    continue;
                } else {
                    hVar = h2;
                }
            } else {
                hVar = hVar4;
            }
            Object t2 = kVar.t(hVar, i4, andIncrement, null);
            if (t2 == d.f730m) {
                throw new IllegalStateException("unreachable");
            }
            if (t2 != d.f732o) {
                if (t2 != d.f731n) {
                    hVar.a();
                    this.f711a = t2;
                    return Boolean.TRUE;
                }
                v1.d p2 = h0.f.p(yVar);
                if (p2 instanceof Q1.g) {
                    Q1.g gVar = (Q1.g) p2;
                    loop2: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Q1.g.f944h;
                        Object obj = atomicReferenceFieldUpdater2.get(gVar);
                        u uVar = Q1.a.f936d;
                        if (obj == null) {
                            atomicReferenceFieldUpdater2.set(gVar, uVar);
                            c0003d = null;
                            break;
                        }
                        if (obj instanceof C0003d) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(gVar, obj, uVar)) {
                                hVar2 = hVar;
                                i = i4;
                                if (atomicReferenceFieldUpdater2.get(gVar) != obj) {
                                    break;
                                }
                                hVar = hVar2;
                                i4 = i;
                            }
                            c0003d = (C0003d) obj;
                            break loop2;
                        }
                        hVar2 = hVar;
                        i = i4;
                        if (obj != uVar && !(obj instanceof Throwable)) {
                            throw new IllegalStateException(("Inconsistent state " + obj).toString());
                        }
                        hVar = hVar2;
                        i4 = i;
                    }
                    if (c0003d != null) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C0003d.f556g;
                        Object obj2 = atomicReferenceFieldUpdater3.get(c0003d);
                        if (!(obj2 instanceof C0008i) || ((C0008i) obj2).f563d == null) {
                            C0003d.f555f.set(c0003d, 536870911);
                            atomicReferenceFieldUpdater3.set(c0003d, C0000a.f551a);
                            c0003d2 = c0003d;
                        } else {
                            c0003d.o();
                            c0003d2 = null;
                        }
                    }
                    c0003d2 = new C0003d(p2, 2);
                } else {
                    c0003d2 = new C0003d(p2, 1);
                }
                C0003d c0003d3 = c0003d2;
                try {
                    v1.i iVar = c0003d3.e;
                    this.f712b = c0003d3;
                    h hVar5 = hVar;
                    int i5 = i4;
                    Object t3 = kVar.t(hVar, i4, andIncrement, this);
                    if (t3 == d.f730m) {
                        a(hVar5, i5);
                    } else {
                        u uVar2 = d.f732o;
                        C1.l lVar = kVar.f720b;
                        if (t3 == uVar2) {
                            if (andIncrement < kVar.j()) {
                                hVar5.a();
                            }
                            h hVar6 = (h) b.f718h.get(kVar);
                            while (true) {
                                if (kVar.l(b.f714c.get(kVar), true)) {
                                    C0003d c0003d4 = this.f712b;
                                    D1.i.b(c0003d4);
                                    this.f712b = null;
                                    this.f711a = d.f729l;
                                    Throwable th = (Throwable) b.j.get(kVar);
                                    if (th == null) {
                                        c0003d4.b(Boolean.FALSE);
                                    } else {
                                        c0003d4.b(new t1.e(th));
                                    }
                                } else {
                                    long andIncrement2 = b.f715d.getAndIncrement(kVar);
                                    long j3 = d.f722b;
                                    long j4 = andIncrement2 / j3;
                                    int i6 = (int) (andIncrement2 % j3);
                                    if (hVar6.f970c != j4) {
                                        h h3 = kVar.h(j4, hVar6);
                                        if (h3 != null) {
                                            hVar3 = h3;
                                        }
                                    } else {
                                        hVar3 = hVar6;
                                    }
                                    Object t4 = kVar.t(hVar3, i6, andIncrement2, this);
                                    if (t4 == d.f730m) {
                                        a(hVar3, i6);
                                        break;
                                    }
                                    if (t4 == d.f732o) {
                                        if (andIncrement2 < kVar.j()) {
                                            hVar3.a();
                                        }
                                        hVar6 = hVar3;
                                    } else {
                                        if (t4 == d.f731n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hVar3.a();
                                        this.f711a = t4;
                                        this.f712b = null;
                                        oVar = lVar != null ? new o(lVar, t4, iVar, i3) : null;
                                        bool = Boolean.TRUE;
                                        i2 = c0003d3.f585c;
                                    }
                                }
                            }
                        } else {
                            hVar5.a();
                            this.f711a = t3;
                            this.f712b = null;
                            oVar = lVar != null ? new o(lVar, t3, iVar, i3) : null;
                            bool = Boolean.TRUE;
                            i2 = c0003d3.f585c;
                        }
                        c0003d3.x(bool, i2, oVar);
                    }
                    return c0003d3.q();
                } catch (Throwable th2) {
                    c0003d3.w();
                    throw th2;
                }
            }
            if (andIncrement < kVar.j()) {
                hVar.a();
            }
            hVar4 = hVar;
        }
        this.f711a = d.f729l;
        Throwable th3 = (Throwable) b.j.get(kVar);
        if (th3 == null) {
            return Boolean.FALSE;
        }
        int i7 = t.f971a;
        throw th3;
    }
}
