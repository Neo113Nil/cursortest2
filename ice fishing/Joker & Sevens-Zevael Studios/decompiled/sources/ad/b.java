package ad;

import dd.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yc.a0;
import yc.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements b2 {

    /* renamed from: g, reason: collision with root package name */
    public Object f284g = g.f319p;

    /* renamed from: h, reason: collision with root package name */
    public yc.g f285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f286i;

    public b(e eVar) {
        this.f286i = eVar;
    }

    @Override // yc.b2
    public final void a(dd.u uVar, int i10) {
        yc.g gVar = this.f285h;
        if (gVar != null) {
            gVar.a(uVar, i10);
        }
    }

    public final Object b(hc.c cVar) {
        m mVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f298m;
        e eVar = this.f286i;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar);
        while (!eVar.w()) {
            long andIncrement = e.f294i.getAndIncrement(eVar);
            long j3 = g.f305b;
            long j6 = andIncrement / j3;
            int i10 = (int) (andIncrement % j3);
            if (mVar2.f1884c != j6) {
                mVar = eVar.m(j6, mVar2);
                if (mVar == null) {
                    continue;
                }
            } else {
                mVar = mVar2;
            }
            Object G = eVar.G(mVar, i10, andIncrement, null);
            w wVar = g.f316m;
            if (G == wVar) {
                throw new IllegalStateException("unreachable");
            }
            w wVar2 = g.f318o;
            if (G != wVar2) {
                if (G != g.f317n) {
                    mVar.a();
                    this.f284g = G;
                    return Boolean.TRUE;
                }
                e eVar2 = this.f286i;
                yc.g l10 = a0.l(bc.a0.w(cVar));
                try {
                    this.f285h = l10;
                    Object G2 = eVar2.G(mVar, i10, andIncrement, this);
                    if (G2 == wVar) {
                        a(mVar, i10);
                    } else {
                        if (G2 == wVar2) {
                            if (andIncrement < eVar2.r()) {
                                mVar.a();
                            }
                            m mVar3 = (m) e.f298m.get(eVar2);
                            while (true) {
                                if (eVar2.w()) {
                                    yc.g gVar = this.f285h;
                                    pc.j.b(gVar);
                                    this.f285h = null;
                                    this.f284g = g.f315l;
                                    Throwable n7 = eVar.n();
                                    if (n7 == null) {
                                        gVar.resumeWith(Boolean.FALSE);
                                    } else {
                                        gVar.resumeWith(v6.a.s(n7));
                                    }
                                } else {
                                    long andIncrement2 = e.f294i.getAndIncrement(eVar2);
                                    long j10 = g.f305b;
                                    long j11 = andIncrement2 / j10;
                                    int i11 = (int) (andIncrement2 % j10);
                                    if (mVar3.f1884c != j11) {
                                        m m10 = eVar2.m(j11, mVar3);
                                        if (m10 != null) {
                                            mVar3 = m10;
                                        }
                                    }
                                    Object G3 = eVar2.G(mVar3, i11, andIncrement2, this);
                                    if (G3 == g.f316m) {
                                        a(mVar3, i11);
                                        break;
                                    }
                                    if (G3 == g.f318o) {
                                        if (andIncrement2 < eVar2.r()) {
                                            mVar3.a();
                                        }
                                    } else {
                                        if (G3 == g.f317n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar3.a();
                                        this.f284g = G3;
                                        this.f285h = null;
                                    }
                                }
                            }
                        } else {
                            mVar.a();
                            this.f284g = G2;
                            this.f285h = null;
                        }
                        l10.A(Boolean.TRUE, null);
                    }
                    return l10.p();
                } catch (Throwable th) {
                    l10.z();
                    throw th;
                }
            }
            if (andIncrement < eVar.r()) {
                mVar.a();
            }
            mVar2 = mVar;
        }
        this.f284g = g.f315l;
        Throwable n10 = eVar.n();
        if (n10 == null) {
            return Boolean.FALSE;
        }
        int i12 = dd.v.f1885a;
        throw n10;
    }

    public final Object c() {
        Object obj = this.f284g;
        w wVar = g.f319p;
        if (obj == wVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f284g = wVar;
        if (obj != g.f315l) {
            return obj;
        }
        Throwable o7 = this.f286i.o();
        int i10 = dd.v.f1885a;
        throw o7;
    }
}
