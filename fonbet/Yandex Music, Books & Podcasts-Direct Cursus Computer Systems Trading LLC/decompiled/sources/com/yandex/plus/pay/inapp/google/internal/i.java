package com.yandex.plus.pay.inapp.google.internal;

import defpackage.k5r;
import defpackage.uz2;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {
    public final uz2 a;
    public final ArrayList b;

    public i(uz2 uz2Var, ArrayList arrayList) {
        uz2Var.getClass();
        this.a = uz2Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.a, iVar.a) && this.b.equals(iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsResult(billingResult=");
        sb.append(this.a);
        sb.append(", productDetailsList=");
        return k5r.o(sb, this.b, ')');
    }
}
