package com.yandex.plus.core.graphql.fragment;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class ka {
    public final com.yandex.plus.core.graphql.type.k a;
    public final BigDecimal b;

    public ka(com.yandex.plus.core.graphql.type.k kVar, BigDecimal bigDecimal) {
        this.a = kVar;
        this.b = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return this.a == kaVar.a && this.b.equals(kaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OfferPrice(currency=" + this.a + ", amount=" + this.b + ')';
    }
}
