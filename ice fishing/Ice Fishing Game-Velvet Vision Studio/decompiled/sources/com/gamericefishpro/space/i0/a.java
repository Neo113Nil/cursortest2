package com.gamericefishpro.space.i0;

import com.gamericefishpro.space.ei.j;
import com.gamericefishpro.space.ei.k;
import com.gamericefishpro.space.h2.f1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends j implements Function0 {
    public final /* synthetic */ c B;
    public final /* synthetic */ f1 C;
    public final /* synthetic */ com.gamericefishpro.space.b2.b D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f1 f1Var, com.gamericefishpro.space.b2.b bVar) {
        super(0, k.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.B = cVar;
        this.C = f1Var;
        this.D = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return c.A0(this.B, this.C, this.D);
    }
}
