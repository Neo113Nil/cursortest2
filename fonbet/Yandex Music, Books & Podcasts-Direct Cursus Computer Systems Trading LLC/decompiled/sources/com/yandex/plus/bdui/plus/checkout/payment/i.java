package com.yandex.plus.bdui.plus.checkout.payment;

import defpackage.ouj;

/* loaded from: classes4.dex */
public final class i implements k {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.a.equals(((i) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "Error(code=", this.a);
    }
}
