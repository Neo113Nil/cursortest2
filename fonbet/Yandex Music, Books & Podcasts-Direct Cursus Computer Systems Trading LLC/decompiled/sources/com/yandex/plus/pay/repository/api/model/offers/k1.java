package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.k5r;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 {
    public final String a;
    public final ArrayList b;

    public k1(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.a, k1Var.a) && this.b.equals(k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreOfferArguments(offerId=");
        sb.append(this.a);
        sb.append(", plans=");
        return k5r.o(sb, this.b, ')');
    }
}
