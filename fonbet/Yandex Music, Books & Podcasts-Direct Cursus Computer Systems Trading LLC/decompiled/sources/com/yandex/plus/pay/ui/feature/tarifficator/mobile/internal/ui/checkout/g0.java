package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.aur;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xdr;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g0 extends aur implements Function2 {
    public int j;
    public final /* synthetic */ h0 k;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, Continuation continuation) {
        super(2, continuation);
        this.k = h0Var;
        this.l = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new g0(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r11.a() == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r11 == r0) goto L29;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        h0 h0Var = this.k;
        if (i == 0) {
            qgg.h0(obj);
            xdr xdrVar = h0Var.B;
            w wVar = new w(null, false);
            xdrVar.getClass();
            xdrVar.m(null, wVar);
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar = h0Var.q;
            com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar = this.l;
            com.yandex.plus.bdui.templating.render.a aVar2 = new com.yandex.plus.bdui.templating.render.a(14, h0Var, aVar);
            com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a aVar3 = new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(24, h0Var);
            this.j = 1;
            obj = dVar.a(aVar, aVar2, aVar3, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    h0Var.r.e();
                    return Unit.a;
                }
                if (i == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h hVar = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.h) obj;
        h0Var.B.l(null);
        h0Var.J.b();
        if (!(hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.g)) {
            if (hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.f) {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar = h0Var.t;
                this.j = 3;
            } else if (!(hVar instanceof com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.e)) {
                b6e.s();
                return null;
            }
            return Unit.a;
        }
        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.checkout.a aVar4 = h0Var.u;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) h0Var.E.getValue();
        this.j = 2;
        Object a = aVar4.a.a(plusPayMailingAdsAgreement, this);
        if (a != nm6Var) {
            a = Unit.a;
        }
        return nm6Var;
    }
}
