package com.gamericefishpro.space.p2;

import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.i0;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.i2.t;
import com.gamericefishpro.space.t.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final com.gamericefishpro.space.h0.e b;
    public final q0 c;
    public d d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ e h;

    public d(e eVar, int i, com.gamericefishpro.space.h0.e eVar2, q0 q0Var) {
        this.h = eVar;
        this.a = i;
        this.b = eVar2;
        this.c = q0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        c cVar;
        c cVar2;
        long j5 = this.h.f;
        com.gamericefishpro.space.h0.e eVar = this.b;
        f1 f1VarQ = k.q(eVar, 2);
        f0 f0VarS = k.s(eVar);
        boolean zI = f0VarS.I();
        a1 a1Var = f0VarS.Z;
        if (zI) {
            if (a1Var.d != f1VarQ) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = f1VarQ.i;
                f1 f1Var = a1Var.d;
                f1Var.getClass();
                long jD = com.gamericefishpro.space.a.a.D(f1Var.k(f1VarQ, jFloatToRawIntBits));
                cVar = new c(jD, (4294967295L & ((long) (((int) (jD & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jD >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, eVar);
            } else {
                cVar = new c(j, j2, j3, j4, j5, fArr, eVar);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.h;
        w wVar = eVar.a;
        int i = this.a;
        d dVar = (d) wVar.g(i);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.d;
                this.d = null;
                if (dVar2 == null) {
                    f0 f0VarS = k.s(this.b.d);
                    if (f0VarS.A) {
                        ((t) i0.a(f0VarS)).getRectManager().a.k(f0VarS.e, false);
                        return;
                    }
                    return;
                }
                int iD = wVar.d(i);
                Object[] objArr = wVar.c;
                Object obj = objArr[iD];
                wVar.b[iD] = i;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = wVar.d(i);
            Object[] objArr2 = wVar.c;
            Object obj2 = objArr2[iD2];
            wVar.b[iD2] = i;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.d = this.d;
                    this.d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.b;
        if (dVar4 == this) {
            eVar.b = dVar4.d;
            this.d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.d = dVar4.d;
                }
                this.d = null;
                return;
            }
            dVar5 = dVar4.d;
        }
    }
}
