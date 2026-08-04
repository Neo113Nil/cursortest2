package com.gamericefishpro.space.q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ com.gamericefishpro.space.b1.h i;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ com.gamericefishpro.space.r0.b y;
    public final /* synthetic */ Function2 z;

    public b0(int i, Function2 function2, com.gamericefishpro.space.b1.h hVar, Function2 function3, Function2 function4, com.gamericefishpro.space.r0.b bVar, Function2 function5) {
        this.d = i;
        this.e = function2;
        this.i = hVar;
        this.v = function3;
        this.w = function4;
        this.y = bVar;
        this.z = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            e0.b(this.d, this.e, this.i, this.v, this.w, this.y, this.z, rVar, 0);
        } else {
            rVar.V();
        }
        return Unit.a;
    }
}
