package com.yandex.plus.pay.ui.webview.paymentwidget.domain;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class i implements j {
    public final String a;

    public i(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a.equals(((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("YbOpenCardSuccess(paymentMethodId="), this.a, ')');
    }
}
