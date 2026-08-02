package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import defpackage.cg6;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public PlusPayPresale j;
    public PlusPayCompositeOffers.Offer k;
    public Iterator l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ c o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
