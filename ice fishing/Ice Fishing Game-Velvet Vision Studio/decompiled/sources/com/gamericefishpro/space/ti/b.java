package com.gamericefishpro.space.ti;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public d[] d;
    public int e;
    public int i;
    public y v;

    public final d c() {
        d dVarE;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArrF = this.d;
                if (dVarArrF == null) {
                    dVarArrF = f();
                    this.d = dVarArrF;
                } else if (this.e >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.d = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i = this.i;
                do {
                    dVarE = dVarArrF[i];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i] = dVarE;
                    }
                    i++;
                    if (i >= dVarArrF.length) {
                        i = 0;
                    }
                } while (!dVarE.a(this));
                this.i = i;
                this.e++;
                yVar = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.w(1);
        }
        return dVarE;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        y yVar;
        int i;
        com.gamericefishpro.space.th.a[] aVarArrB;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                yVar = this.v;
                if (i2 == 0) {
                    this.i = 0;
                }
                Intrinsics.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                aVarArrB = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (com.gamericefishpro.space.th.a aVar : aVarArrB) {
            if (aVar != null) {
                com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                aVar.resumeWith(Unit.a);
            }
        }
        if (yVar != null) {
            yVar.w(-1);
        }
    }

    public final y h() {
        y yVar;
        synchronized (this) {
            yVar = this.v;
            if (yVar == null) {
                int i = this.e;
                yVar = new y(1, Integer.MAX_VALUE, com.gamericefishpro.space.ri.a.e);
                yVar.q(Integer.valueOf(i));
                this.v = yVar;
            }
        }
        return yVar;
    }
}
