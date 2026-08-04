package com.gamericefishpro.space.u2;

import com.gamericefishpro.space.n9.z;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.u1;
import com.gamericefishpro.space.r5.s0;
import com.gamericefishpro.space.tb.u;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {
    public final z a;
    public final a b;
    public final com.gamericefishpro.space.u6.e c;
    public final h d;
    public final u e;

    public e(z zVar, a aVar) {
        com.gamericefishpro.space.u6.e eVar = f.a;
        com.gamericefishpro.space.u6.e eVar2 = f.a;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.d;
        h hVar = new h();
        g gVar2 = h.a;
        com.gamericefishpro.space.qi.d dVar = com.gamericefishpro.space.y2.h.a;
        gVar2.getClass();
        CoroutineContext coroutineContextO = kotlin.coroutines.e.c(gVar2, dVar).o(gVar);
        com.gamericefishpro.space.pi.u key = com.gamericefishpro.space.pi.u.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        a0.b(coroutineContextO.o(new u1(null)));
        u uVar = new u(3);
        this.a = zVar;
        this.b = aVar;
        this.c = eVar;
        this.d = hVar;
        this.e = uVar;
        new com.gamericefishpro.space.a7.c(28, this);
    }

    public final q a(p pVar) {
        com.gamericefishpro.space.u6.e eVar = this.c;
        synchronized (((com.gamericefishpro.space.u4.b) eVar.b)) {
            q qVar = (q) ((s0) eVar.c).d(pVar);
            if (qVar != null) {
                if (qVar.e) {
                    return qVar;
                }
            }
            try {
                this.d.getClass();
                u uVar = this.e;
                uVar.getClass();
                b bVar = pVar.a;
                q qVar2 = (bVar == null || (bVar instanceof b)) ? new q(((o) uVar.e).b(pVar.b, pVar.c)) : null;
                if (qVar2 == null) {
                    throw new IllegalStateException("Could not load font");
                }
                synchronized (((com.gamericefishpro.space.u4.b) eVar.b)) {
                    try {
                        if (((s0) eVar.c).d(pVar) == null && qVar2.e) {
                            ((s0) eVar.c).g(pVar, qVar2);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return qVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final q b(b bVar, k kVar, int i, int i2) {
        a aVar = this.b;
        aVar.getClass();
        int i3 = aVar.d;
        k kVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? kVar : new k(com.gamericefishpro.space.ji.f.c(kVar.d + i3, 1, 1000));
        this.a.getClass();
        return a(new p(bVar, kVar2, i, i2, null));
    }
}
