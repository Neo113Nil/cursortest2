package com.gamericefishpro.space.e7;

import android.content.Context;
import com.gamericefishpro.space.pi.a0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, com.gamericefishpro.space.vh.c cVar) throws Throwable {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.i = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objF = cVar2.d;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar2.i;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objF);
            d dVar = new d(context, null);
            cVar2.i = 1;
            objF = a0.F(10000L, dVar, cVar2);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objF);
        }
        String str = (String) objF;
        return str == null ? "organic" : str;
    }
}
