package com.yandex.plus.core.graphql.type;

import defpackage.k5r;
import defpackage.q7g;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class l0 {
    public final q7g a;
    public final ArrayList b;

    public l0(q7g q7gVar, ArrayList arrayList) {
        this.a = q7gVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a.equals(l0Var.a) && this.b.equals(l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreOffersDataV2Input(inAppPurchases=");
        sb.append(this.a);
        sb.append(", storeOffers=");
        return k5r.o(sb, this.b, ')');
    }
}
