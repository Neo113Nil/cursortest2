package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends aur implements Function2 {
    public int j;
    public final /* synthetic */ h0 k;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j l;
    public final /* synthetic */ String m;
    public final /* synthetic */ PlusPayCompositeOfferDetails n;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar, String str, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, Continuation continuation) {
        super(2, continuation);
        this.k = h0Var;
        this.l = jVar;
        this.m = str;
        this.n = plusPayCompositeOfferDetails;
        this.o = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = this.l;
        h0 h0Var = this.k;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            obj = h0.G(h0Var, jVar, this.m, this.n, this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        String str = (String) obj;
        if (str != null) {
            h0.H(h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(this.o, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.a(jVar, null, null, str, null, null, null, 123), null, 29));
        }
        return Unit.a;
    }
}
