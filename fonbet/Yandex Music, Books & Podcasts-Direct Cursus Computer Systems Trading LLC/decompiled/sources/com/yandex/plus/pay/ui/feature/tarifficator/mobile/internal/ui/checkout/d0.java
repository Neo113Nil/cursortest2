package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xdr;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h0 l;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a m;
    public final /* synthetic */ com.yandex.plus.pay.internal.feature.offers.r n;
    public final /* synthetic */ PlusPayCompositeOfferDetails o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, com.yandex.plus.pay.internal.feature.offers.r rVar, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, Continuation continuation) {
        super(2, continuation);
        this.l = h0Var;
        this.m = aVar;
        this.n = rVar;
        this.o = plusPayCompositeOfferDetails;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        d0 d0Var = new d0(this.l, this.m, this.n, this.o, continuation);
        d0Var.k = obj;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11.a() == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0044, code lost:
    
        if (r11 == r4) goto L33;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h0 h0Var = this.l;
        xdr xdrVar = h0Var.D;
        xdr xdrVar2 = h0Var.A;
        mm6 mm6Var = (mm6) this.k;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar = this.m;
        if (i == 0) {
            qgg.h0(obj);
            Boolean bool = Boolean.TRUE;
            xdrVar2.getClass();
            xdrVar2.m(null, bool);
            com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d dVar = h0Var.m;
            PlusPayCompositeOffers.Offer offer = aVar.b.a;
            this.k = mm6Var;
            this.j = 1;
            obj = dVar.a(offer, this.n, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Boolean bool2 = Boolean.FALSE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                return Unit.a;
            }
            qgg.h0(obj);
        }
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) obj;
        if (plusPayCompositeOfferDetails != null) {
            xdr xdrVar3 = h0Var.C;
            String str = (String) xdrVar3.getValue();
            if (str == null) {
                List list = aVar.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j) it.next()).c;
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
                str = (String) CollectionsKt.Z(arrayList);
                if (str == null && (str = h0Var.k.g) == null) {
                    str = plusPayCompositeOfferDetails.getMainPaymentMethod();
                }
            }
            xdrVar3.l(str);
            xdrVar.getClass();
            xdrVar.m(null, plusPayCompositeOfferDetails);
        } else {
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = this.o;
            if (plusPayCompositeOfferDetails2 == null) {
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar = h0Var.t;
                this.k = null;
                this.j = 2;
            } else {
                xdrVar.getClass();
                xdrVar.m(null, plusPayCompositeOfferDetails2);
            }
        }
        Boolean bool22 = Boolean.FALSE;
        xdrVar2.getClass();
        xdrVar2.m(null, bool22);
        return Unit.a;
    }
}
