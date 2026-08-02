package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {
    public final String a;
    public final String b;
    public final String c;

    public t(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.a, tVar.a) && this.b.equals(tVar.b) && Intrinsics.d(this.c, tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppPurchase(token=");
        sb.append(this.a);
        sb.append(", orderId=");
        sb.append(this.b);
        sb.append(", productId=");
        return dfi.i(sb, this.c, ')');
    }
}
