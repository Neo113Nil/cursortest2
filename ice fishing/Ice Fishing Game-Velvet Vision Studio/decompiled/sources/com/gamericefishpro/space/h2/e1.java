package com.gamericefishpro.space.h2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ float A;
    public final /* synthetic */ f1 d;
    public final /* synthetic */ com.gamericefishpro.space.h1.l e;
    public final /* synthetic */ b1 i;
    public final /* synthetic */ long v;
    public final /* synthetic */ o w;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, com.gamericefishpro.space.h1.l lVar, b1 b1Var, long j, o oVar, int i, boolean z, float f) {
        super(0);
        this.d = f1Var;
        this.e = lVar;
        this.i = b1Var;
        this.v = j;
        this.w = oVar;
        this.y = i;
        this.z = z;
        this.A = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.d.Y0(k.d(this.e, this.i.b()), this.i, this.v, this.w, this.y, this.z, this.A, false);
        return Unit.a;
    }
}
