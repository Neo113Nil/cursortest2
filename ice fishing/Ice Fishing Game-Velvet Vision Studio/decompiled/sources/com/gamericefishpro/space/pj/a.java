package com.gamericefishpro.space.pj;

import com.gamericefishpro.space.b1.d;
import com.gamericefishpro.space.ei.g;
import com.gamericefishpro.space.g1.b;
import com.gamericefishpro.space.mj.c;
import com.gamericefishpro.space.ni.f;
import com.gamericefishpro.space.ni.h;
import com.gamericefishpro.space.ni.i;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u6.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final com.gamericefishpro.space.mj.a a;
    public final String b;
    public final boolean c;
    public final c d;
    public final d e;
    public final ArrayList f;
    public ThreadLocal g;

    public a(com.gamericefishpro.space.mj.a scopeQualifier, String id, c cVar, d _koin, int i) {
        boolean z = (i & 4) == 0;
        cVar = (i & 8) != 0 ? null : cVar;
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.a = scopeQualifier;
        this.b = id;
        this.c = z;
        this.d = cVar;
        this.e = _koin;
        this.f = new ArrayList();
        new LinkedHashSet();
    }

    public final Object a(g clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return b(clazz, null);
    }

    public final Object b(g gVar, com.gamericefishpro.space.lj.a aVar) {
        d dVar = this.e;
        b bVar = (b) dVar.d;
        com.gamericefishpro.space.ij.a aVar2 = com.gamericefishpro.space.ij.a.d;
        if (((com.gamericefishpro.space.ij.a) bVar.d).compareTo(aVar2) > 0) {
            return d(gVar, aVar);
        }
        String strI = this.c ? "" : y0.i(new StringBuilder(" - scope:'"), this.b, '\'');
        ((b) dVar.d).j(aVar2, "|- '" + com.gamericefishpro.space.qj.a.a(gVar) + "'" + strI + "...");
        h.a.getClass();
        f.a.getClass();
        i iVar = new i(d(gVar, aVar), com.gamericefishpro.space.ni.g.a(f.a()), null);
        b bVar2 = (b) dVar.d;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(com.gamericefishpro.space.qj.a.a(gVar));
        sb.append("' in ");
        com.gamericefishpro.space.ni.a aVar3 = com.gamericefishpro.space.ni.b.d;
        sb.append(com.gamericefishpro.space.ni.b.e(iVar.b, com.gamericefishpro.space.ni.d.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        bVar2.j(aVar2, sb.toString());
        return iVar.a;
    }

    public final Object c(d instanceContext) throws com.gamericefishpro.space.gj.a {
        l lVar = (l) this.e.e;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(this, "scope");
        Intrinsics.checkNotNullParameter(instanceContext, "instanceContext");
        Object objO = lVar.o(this, instanceContext, true);
        if (objO != null) {
            return objO;
        }
        String msg = "No definition found for type '" + com.gamericefishpro.space.qj.a.a((g) instanceContext.i) + "'. Check your Modules configuration and add missing type and/or qualifier!";
        Intrinsics.checkNotNullParameter(msg, "msg");
        throw new com.gamericefishpro.space.gj.a(msg);
    }

    public final Object d(g gVar, com.gamericefishpro.space.lj.a aVar) {
        r rVar;
        d dVar = this.e;
        d dVar2 = new d((b) dVar.d, this, gVar, aVar);
        if (aVar == null) {
            return c(dVar2);
        }
        b bVar = (b) dVar.d;
        com.gamericefishpro.space.ij.a aVar2 = com.gamericefishpro.space.ij.a.d;
        if (((com.gamericefishpro.space.ij.a) bVar.d).compareTo(aVar2) <= 0) {
            bVar.j(aVar2, "| >> parameters " + aVar);
        }
        ThreadLocal threadLocal = this.g;
        if (threadLocal == null || (rVar = (r) threadLocal.get()) == null) {
            rVar = new r();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.g = threadLocal2;
            threadLocal2.set(rVar);
        }
        rVar.addFirst(aVar);
        try {
            return c(dVar2);
        } finally {
            ((b) dVar.d).i("| << parameters");
            if (!rVar.isEmpty()) {
                rVar.removeFirst();
            }
            if (rVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.g;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.g = null;
            }
        }
    }

    public final String toString() {
        return y0.j(new StringBuilder("['"), this.b, "']");
    }
}
