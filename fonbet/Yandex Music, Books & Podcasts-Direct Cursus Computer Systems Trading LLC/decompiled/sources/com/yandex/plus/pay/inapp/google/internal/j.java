package com.yandex.plus.pay.inapp.google.internal;

import defpackage.eta;
import defpackage.uz2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {
    public final uz2 a;
    public final List b;

    public j(uz2 uz2Var, List list) {
        uz2Var.getClass();
        list.getClass();
        this.a = uz2Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.a, jVar.a) && Intrinsics.d(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasesResult(billingResult=");
        sb.append(this.a);
        sb.append(", purchasesList=");
        return eta.h(sb, this.b, ')');
    }
}
