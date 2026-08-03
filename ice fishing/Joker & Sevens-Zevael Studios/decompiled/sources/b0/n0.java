package b0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import m0.l1;
import m0.x1;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 implements v0.e, v0.c {

    /* renamed from: g, reason: collision with root package name */
    public final v0.f f860g;

    /* renamed from: h, reason: collision with root package name */
    public final l1 f861h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f862i;

    public n0(v0.e eVar, Map map) {
        j0 j0Var = new j0(eVar, 0);
        x2 x2Var = v0.g.f7043a;
        this.f860g = new v0.f(map, j0Var);
        this.f861h = m0.z.s(null);
        this.f862i = new LinkedHashSet();
    }

    @Override // v0.c
    public final void a(Object obj, oc.e eVar, m0.r rVar, int i10) {
        int i11;
        rVar.Z(-697180401);
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.h(this) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            v0.c cVar = (v0.c) this.f861h.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder");
            }
            cVar.a(obj, eVar, rVar, i11 & 126);
            boolean h10 = rVar.h(this) | rVar.h(obj);
            Object M = rVar.M();
            if (h10 || M == m0.l.f4646a) {
                M = new l0(0, this, obj);
                rVar.i0(M);
            }
            m0.z.d(obj, (oc.c) M, rVar);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m0(this, obj, eVar, i10, 0);
        }
    }

    @Override // v0.c
    public final void b(Object obj) {
        v0.c cVar = (v0.c) this.f861h.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder");
        }
        cVar.b(obj);
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return this.f860g.c(obj);
    }

    @Override // v0.e
    public final Map d() {
        v0.c cVar = (v0.c) this.f861h.getValue();
        if (cVar != null) {
            Iterator it = this.f862i.iterator();
            while (it.hasNext()) {
                cVar.b(it.next());
            }
        }
        return this.f860g.d();
    }

    @Override // v0.e
    public final Object e(String str) {
        return this.f860g.e(str);
    }

    @Override // v0.e
    public final a5.c f(String str, oc.a aVar) {
        return this.f860g.f(str, aVar);
    }
}
