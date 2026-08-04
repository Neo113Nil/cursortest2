package com.gamericefishpro.space.i1;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.ei.l implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ b d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i) {
        super(4);
        this.d = bVar;
        this.e = i;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        b bVar = this.d;
        com.gamericefishpro.space.vb.c cVar = bVar.d;
        ((AutofillManager) cVar.e).notifyViewEntered(bVar.i, this.e, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return Unit.a;
    }
}
