package com.gamericefishpro.space.h0;

import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.t2;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements com.gamericefishpro.space.e1.f, com.gamericefishpro.space.e1.c {
    public final com.gamericefishpro.space.e1.g d;
    public final com.gamericefishpro.space.e1.c e;
    public final com.gamericefishpro.space.t.i0 i;

    public v0(com.gamericefishpro.space.e1.f fVar, Map map, com.gamericefishpro.space.e1.c cVar) {
        com.gamericefishpro.space.a7.c cVar2 = new com.gamericefishpro.space.a7.c(11, fVar);
        t2 t2Var = com.gamericefishpro.space.e1.h.a;
        this.d = new com.gamericefishpro.space.e1.g(map, cVar2);
        this.e = cVar;
        com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.t.q0.a;
        this.i = new com.gamericefishpro.space.t.i0();
    }

    @Override // com.gamericefishpro.space.e1.c
    public final void a(Object obj, com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        int i2;
        rVar.b0(-858296452);
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
        if (rVar.S(i2 & 1, (i2 & 147) != 146)) {
            this.e.a(obj, hVar, rVar, i2 & 126);
            boolean zH = rVar.h(this) | rVar.h(obj);
            Object objP = rVar.P();
            if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.d0.q0(15, this, obj);
                rVar.k0(objP);
            }
            com.gamericefishpro.space.t0.i.d(obj, (Function1) objP, rVar);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(this, obj, hVar, i, 4);
        }
    }

    @Override // com.gamericefishpro.space.e1.c
    public final void b(Object obj) {
        this.e.b(obj);
    }

    @Override // com.gamericefishpro.space.e1.f
    public final boolean c(Object obj) {
        return this.d.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // com.gamericefishpro.space.e1.f
    public final Map d() {
        com.gamericefishpro.space.t.i0 i0Var = this.i;
        Object[] objArr = i0Var.b;
        long[] jArr = i0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.e.b(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.d.d();
    }

    @Override // com.gamericefishpro.space.e1.f
    public final Object e(String str) {
        return this.d.e(str);
    }

    @Override // com.gamericefishpro.space.e1.f
    public final com.gamericefishpro.space.e1.e f(String str, Function0 function0) {
        return this.d.f(str, function0);
    }
}
