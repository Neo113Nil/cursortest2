package com.gamericefishpro.space.a7;

import android.content.Context;
import com.gamericefishpro.space.e1.k;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.f5.p0;
import com.gamericefishpro.space.g5.q;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.t0.n;
import com.gamericefishpro.space.t0.r;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Function2 {
    public static final a d = new a();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rVar.E()) {
            rVar.V();
        } else {
            Context context = (Context) rVar.j(j0.b);
            Object[] objArrCopyOf = Arrays.copyOf(new p0[0], 0);
            com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.d0.b(6), new com.gamericefishpro.space.aj.a(context, 1));
            boolean zH = rVar.h(context);
            Object objP = rVar.P();
            if (zH || objP == n.a) {
                objP = new q(context, 0);
                rVar.k0(objP);
            }
            d5.c((d0) k.c(objArrCopyOf, cVar, (Function0) objP, rVar, 0, 4), rVar, 0);
        }
        return Unit.a;
    }
}
