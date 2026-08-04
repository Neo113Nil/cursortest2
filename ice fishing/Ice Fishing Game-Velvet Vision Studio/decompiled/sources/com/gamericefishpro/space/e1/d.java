package com.gamericefishpro.space.e1;

import com.gamericefishpro.space.d0.p;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.p0;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.t2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {
    public static final com.gamericefishpro.space.u6.c w = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.d0.b(1), new p(18));
    public final Map d;
    public final h0 e;
    public f i;
    public final com.gamericefishpro.space.a7.c v;

    public d(Map map) {
        this.d = map;
        long[] jArr = p0.a;
        this.e = new h0();
        this.v = new com.gamericefishpro.space.a7.c(2, this);
    }

    @Override // com.gamericefishpro.space.e1.c
    public final void a(Object obj, com.gamericefishpro.space.b1.h hVar, r rVar, int i) {
        int i2;
        rVar.b0(533563200);
        if ((i & 6) == 0) {
            i2 = (rVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar.h(this) ? 256 : 128;
        }
        int i3 = 1;
        if (rVar.S(i2 & 1, (i2 & 147) != 146)) {
            rVar.c0(obj);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = n.a;
            if (objP == fVar) {
                com.gamericefishpro.space.a7.c cVar = this.v;
                if (!((Boolean) cVar.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.d.get(obj);
                t2 t2Var = h.a;
                i iVar = new i(new g(map, cVar));
                rVar.k0(iVar);
                objP = iVar;
            }
            i iVar2 = (i) objP;
            com.gamericefishpro.space.t0.i.b(new com.gamericefishpro.space.n.p[]{h.a.a(iVar2), com.gamericefishpro.space.a6.a.a.a(iVar2)}, hVar, rVar, (i2 & 112) | 8);
            Unit unit = Unit.a;
            boolean zH = rVar.h(this) | rVar.h(obj) | rVar.h(iVar2);
            Object objP2 = rVar.P();
            if (zH || objP2 == fVar) {
                objP2 = new com.gamericefishpro.space.a5.b(this, obj, iVar2, i3);
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.t0.i.d(unit, (Function1) objP2, rVar);
            if (rVar.y && rVar.G.i == rVar.z) {
                rVar.z = -1;
                rVar.y = false;
            }
            rVar.p(false);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(this, obj, hVar, i, 2);
        }
    }

    @Override // com.gamericefishpro.space.e1.c
    public final void b(Object obj) {
        if (this.e.k(obj) == null) {
            this.d.remove(obj);
        }
    }
}
