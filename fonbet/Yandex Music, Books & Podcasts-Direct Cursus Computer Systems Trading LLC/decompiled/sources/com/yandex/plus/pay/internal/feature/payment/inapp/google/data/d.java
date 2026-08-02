package com.yandex.plus.pay.internal.feature.payment.inapp.google.data;

import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.r2;
import com.yandex.plus.pay.data.mb.dto.v2;
import com.yandex.plus.pay.inapp.api.f;
import com.yandex.plus.pay.internal.di.g;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import com.yandex.plus.pay.internal.model.mappers.l;
import defpackage.b6e;
import defpackage.bck;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tkr;
import defpackage.wsd;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d implements a {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.pay.diagnostic.impl.d b;
    public final x3f c;
    public final kotlinx.coroutines.a d;
    public final jyr e;

    public d(ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.pay.diagnostic.impl.d dVar, x3f x3fVar, kotlinx.coroutines.a aVar) {
        externalMediaBillingApi.getClass();
        dVar.getClass();
        x3fVar.getClass();
        aVar.getClass();
        this.a = externalMediaBillingApi;
        this.b = dVar;
        this.c = x3fVar;
        this.d = aVar;
        this.e = btf.b(new g(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, String str, String str2, String str3, String str4, Map map, cg6 cg6Var) {
        c cVar;
        int i;
        String str5;
        int ordinal;
        PlusPaySubmitResult.Status status;
        int i2;
        f fVar2 = fVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i3 = cVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.m = i3 - Integer.MIN_VALUE;
                Object obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    String str6 = fVar2.d;
                    String str7 = fVar2.c;
                    x3f x3fVar = this.c;
                    x3fVar.getClass();
                    tkr tkrVar = tkr.a;
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, new r2(str6, str, str7, str2, str3, str4, x3fVar.c(new wsd(tkrVar, tkrVar, 1), map)), objArr == true ? 1 : 0, 12);
                    cVar.j = fVar2;
                    cVar.m = 1;
                    obj = x97.V(this.d, dVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = cVar.j;
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.common.api.utils.b bVar = (com.yandex.plus.pay.common.api.utils.b) obj;
                l lVar = (l) this.e.getValue();
                Object obj2 = bVar.a;
                String str8 = bVar.b;
                v2 v2Var = (v2) obj2;
                lVar.getClass();
                v2Var.getClass();
                str5 = v2Var.a;
                if (str5 == null) {
                    str5 = "";
                }
                ordinal = v2Var.b.ordinal();
                if (ordinal != 0) {
                    status = PlusPaySubmitResult.Status.SUCCESS;
                } else if (ordinal == 1) {
                    status = PlusPaySubmitResult.Status.FAIL;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    status = PlusPaySubmitResult.Status.UNKNOWN;
                }
                PlusPaySubmitResult plusPaySubmitResult = new PlusPaySubmitResult(str5, status, v2Var.c);
                i2 = b.a[plusPaySubmitResult.getStatus().ordinal()];
                com.yandex.plus.pay.diagnostic.impl.d dVar2 = this.b;
                if (i2 != 1) {
                    if (StringsKt.U(plusPaySubmitResult.getInvoiceId())) {
                        String str9 = (String) CollectionsKt.firstOrNull(fVar2.b);
                        bck bckVar = dVar2.a;
                        if (str8 == null) {
                            str8 = "no_value";
                        }
                        if (str9 == null) {
                            str9 = "no_value";
                        }
                        LinkedHashMap m = dfi.m("requestId", str8, "additionalData", "no_value");
                        m.put("paymentOptionIdentifier", str9);
                        m.put("paymentMethodIdentifier", "no_value");
                        m.put("_meta", bck.c(new HashMap()));
                        bckVar.d("Error.Subscription.Mediabilling.Native.SubmitOrder.SuccessWithoutOrderId", m);
                    }
                    return plusPaySubmitResult;
                }
                if (i2 == 2) {
                    String invoiceId = plusPaySubmitResult.getInvoiceId();
                    String str10 = StringsKt.U(invoiceId) ? null : invoiceId;
                    bck bckVar2 = dVar2.a;
                    if (str8 == null) {
                        str8 = "no_value";
                    }
                    if (str10 == null) {
                        str10 = "no_value";
                    }
                    LinkedHashMap m2 = dfi.m("requestId", str8, "additionalData", "no_value");
                    m2.put("transactionIdentifier", "no_value");
                    m2.put("orderId", str10);
                    m2.put("_meta", bck.c(new HashMap()));
                    bckVar2.d("Error.Subscription.Mediabilling.InApp.SubmitReceipt.SubmitingFailed", m2);
                    return plusPaySubmitResult;
                }
                if (i2 != 3) {
                    b6e.s();
                    return null;
                }
                String str11 = (String) CollectionsKt.firstOrNull(fVar2.b);
                String lowerCase = plusPaySubmitResult.getStatus().name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                dVar2.getClass();
                bck bckVar3 = dVar2.a;
                if (str8 == null) {
                    str8 = "no_value";
                }
                if (str11 == null) {
                    str11 = "no_value";
                }
                LinkedHashMap m3 = dfi.m("requestId", str8, "additionalData", "no_value");
                m3.put("transactionIdentifier", "no_value");
                m3.put("productIdentifier", str11);
                m3.put("status", lowerCase);
                m3.put("_meta", bck.c(new HashMap()));
                bckVar3.d("Error.Subscription.Mediabilling.InApp.SubmitReceipt.UnexpectedStatus", m3);
                return plusPaySubmitResult;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        com.yandex.plus.pay.common.api.utils.b bVar2 = (com.yandex.plus.pay.common.api.utils.b) obj3;
        l lVar2 = (l) this.e.getValue();
        Object obj22 = bVar2.a;
        String str82 = bVar2.b;
        v2 v2Var2 = (v2) obj22;
        lVar2.getClass();
        v2Var2.getClass();
        str5 = v2Var2.a;
        if (str5 == null) {
        }
        ordinal = v2Var2.b.ordinal();
        if (ordinal != 0) {
        }
        PlusPaySubmitResult plusPaySubmitResult2 = new PlusPaySubmitResult(str5, status, v2Var2.c);
        i2 = b.a[plusPaySubmitResult2.getStatus().ordinal()];
        com.yandex.plus.pay.diagnostic.impl.d dVar22 = this.b;
        if (i2 != 1) {
        }
    }
}
