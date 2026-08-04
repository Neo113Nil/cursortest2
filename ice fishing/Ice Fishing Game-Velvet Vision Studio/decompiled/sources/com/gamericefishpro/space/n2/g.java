package com.gamericefishpro.space.n2;

import com.gamericefishpro.space.q0.u0;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final int a;
    public final u0 b;
    public float c;

    public g(int i, u0 u0Var) {
        this.a = i;
        this.b = u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, com.gamericefishpro.space.vh.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.i = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objInvoke = fVar.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objInvoke);
            Float f2 = new Float(f);
            fVar.i = 1;
            objInvoke = this.b.invoke(f2, fVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objInvoke);
        }
        this.c += ((Number) objInvoke).floatValue();
        return Unit.a;
    }
}
