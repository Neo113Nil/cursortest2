package com.gamericefishpro.space.i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ a d;
    public final /* synthetic */ x1 e;
    public final /* synthetic */ com.gamericefishpro.space.bb.s i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a aVar, x1 x1Var, com.gamericefishpro.space.bb.s sVar) {
        super(0);
        this.d = aVar;
        this.e = x1Var;
        this.i = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        x1 x1Var = this.e;
        a aVar = this.d;
        aVar.removeOnAttachStateChangeListener(x1Var);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        com.gamericefishpro.space.bb.s listener = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.i4.a aVarD = com.gamericefishpro.space.wa.b.D(aVar);
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVarD.a.remove(listener);
        return Unit.a;
    }
}
