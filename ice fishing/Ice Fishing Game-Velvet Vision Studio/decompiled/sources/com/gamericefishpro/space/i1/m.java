package com.gamericefishpro.space.i1;

import android.view.ViewStructure;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.ei.l implements com.gamericefishpro.space.di.d {
    public final /* synthetic */ ViewStructure d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewStructure viewStructure) {
        super(4);
        this.d = viewStructure;
    }

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.d.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return Unit.a;
    }
}
