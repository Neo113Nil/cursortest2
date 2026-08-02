package com.yandex.plus.core.graphql;

import com.connectsdk.device.ConnectableDevice;
import defpackage.dfi;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i1 implements s6n {
    public final String a;

    public i1(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.x0 x0Var = com.yandex.plus.core.graphql.adapter.x0.a;
        tj tjVar = uj.a;
        return new qhj(x0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "884425ea69abec63029c188aedcbb3c8d103c280c7a2d7d4b680377a4c15fe18";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query Invoice($id: ID!) { externalInvoice(id: $id) { __typename ...invoice } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        uj.a.a(r7fVar, fx6Var, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.a, ((i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.nuj
    public final String name() {
        return "Invoice";
    }

    public final String toString() {
        return dfi.i(new StringBuilder("InvoiceQuery(id="), this.a, ')');
    }
}
