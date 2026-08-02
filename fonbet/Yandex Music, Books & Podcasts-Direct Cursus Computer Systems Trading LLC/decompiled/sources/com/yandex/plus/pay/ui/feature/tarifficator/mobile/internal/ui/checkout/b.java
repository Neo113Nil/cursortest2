package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.cg6;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public PlusPayCompositeOfferDetails j;
    public Function2 k;
    public List l;
    public List m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ h p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.b(null, null, this);
    }
}
