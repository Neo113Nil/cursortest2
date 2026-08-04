package com.gamericefishpro.space.i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends com.gamericefishpro.space.ei.l implements Function2 {
    public static final y0 d = new y0(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            rVar.V();
        }
        return Unit.a;
    }
}
