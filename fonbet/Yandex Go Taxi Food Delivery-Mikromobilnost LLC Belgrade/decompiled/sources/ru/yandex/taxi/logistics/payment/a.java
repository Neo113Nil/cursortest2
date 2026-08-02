package ru.yandex.taxi.logistics.payment;

import com.yandex.go.payments.composite.data.b;
import com.yandex.go.payments.paymentlist.data.c;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.nni;
import defpackage.nrd;
import defpackage.tpr;
import defpackage.uma0;
import defpackage.vng;
import defpackage.yoi;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes5.dex */
public final class a {
    public final ha2 a;

    public a(h3y h3yVar) {
        yoi yoiVar = (yoi) h3yVar.get();
        tpr b = yoiVar.d.b();
        nrd nrdVar = yoiVar.c.b;
        this.a = e.m(b, vng.l(e.t(new b(nrdVar.b, nrdVar)), new nni(2), vng.c), ((c) yoiVar.a).u, new n(((uma0) yoiVar.f).a.b(), new DeliverySelectedPaymentInteractor$selectedPaymentFlow$2(2, null)), new DeliverySelectedPaymentInteractor$selectedPaymentFlow$3(yoiVar, null));
    }
}
