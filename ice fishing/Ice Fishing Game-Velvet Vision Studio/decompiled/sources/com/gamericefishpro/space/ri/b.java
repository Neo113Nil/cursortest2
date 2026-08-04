package com.gamericefishpro.space.ri;

import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.e2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e2 {
    public Object d = g.p;
    public com.gamericefishpro.space.pi.h e;
    public final /* synthetic */ e i;

    public b(e eVar) {
        this.i = eVar;
    }

    @Override // com.gamericefishpro.space.pi.e2
    public final void a(com.gamericefishpro.space.ui.q qVar, int i) {
        com.gamericefishpro.space.pi.h hVar = this.e;
        if (hVar != null) {
            hVar.a(qVar, i);
        }
    }

    public final Object b(com.gamericefishpro.space.vh.c frame) throws Throwable {
        m mVarP;
        Object obj = this.d;
        boolean z = true;
        if (obj == g.p || obj == g.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.z;
            e eVar = this.i;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (!eVar.w()) {
                long andIncrement = e.i.getAndIncrement(eVar);
                long j = g.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (mVar.c != j2) {
                    mVarP = eVar.p(j2, mVar);
                    if (mVarP == null) {
                        continue;
                    }
                } else {
                    mVarP = mVar;
                }
                Object objG = eVar.G(mVarP, i, andIncrement, null);
                com.gamericefishpro.space.d6.a aVar = g.m;
                if (objG == aVar) {
                    throw new IllegalStateException("unreachable");
                }
                com.gamericefishpro.space.d6.a aVar2 = g.o;
                if (objG == aVar2) {
                    if (andIncrement < eVar.t()) {
                        mVarP.a();
                    }
                    mVar = mVarP;
                } else {
                    if (objG == g.n) {
                        e eVar2 = this.i;
                        com.gamericefishpro.space.pi.h hVarO = a0.o(com.gamericefishpro.space.uh.f.b(frame));
                        try {
                            this.e = hVarO;
                            Object objG2 = eVar2.G(mVarP, i, andIncrement, this);
                            if (objG2 != aVar) {
                                if (objG2 == aVar2) {
                                    if (andIncrement < eVar2.t()) {
                                        mVarP.a();
                                    }
                                    m mVar2 = (m) e.z.get(eVar2);
                                    while (true) {
                                        if (eVar2.w()) {
                                            com.gamericefishpro.space.pi.h hVar = this.e;
                                            Intrinsics.b(hVar);
                                            this.e = null;
                                            this.d = g.l;
                                            Throwable thQ = eVar.q();
                                            if (thQ != null) {
                                                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                                                hVar.resumeWith(com.gamericefishpro.space.wa.b.q(thQ));
                                                break;
                                            }
                                            com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                                            hVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = e.i.getAndIncrement(eVar2);
                                        long j3 = g.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (mVar2.c != j4) {
                                            m mVarP2 = eVar2.p(j4, mVar2);
                                            if (mVarP2 != null) {
                                                mVar2 = mVarP2;
                                            }
                                        }
                                        Object objG3 = eVar2.G(mVar2, i2, andIncrement2, this);
                                        if (objG3 == g.m) {
                                            a(mVar2, i2);
                                            break;
                                        }
                                        if (objG3 == g.o) {
                                            if (andIncrement2 < eVar2.t()) {
                                                mVar2.a();
                                            }
                                        } else {
                                            if (objG3 == g.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            mVar2.a();
                                            this.d = objG3;
                                            this.e = null;
                                        }
                                    }
                                } else {
                                    mVarP.a();
                                    this.d = objG2;
                                    this.e = null;
                                }
                                hVarO.h(Boolean.TRUE, null);
                                break;
                            }
                            a(mVarP, i);
                            Object objR = hVarO.r();
                            if (objR == com.gamericefishpro.space.uh.a.d) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return objR;
                        } catch (Throwable th) {
                            hVarO.A();
                            throw th;
                        }
                    }
                    mVarP.a();
                    this.d = objG;
                }
            }
            this.d = g.l;
            Throwable thQ2 = eVar.q();
            if (thQ2 != null) {
                int i3 = com.gamericefishpro.space.ui.r.a;
                throw thQ2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.d;
        com.gamericefishpro.space.d6.a aVar = g.p;
        if (obj == aVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.d = aVar;
        if (obj != g.l) {
            return obj;
        }
        Throwable thR = this.i.r();
        int i = com.gamericefishpro.space.ui.r.a;
        throw thR;
    }
}
