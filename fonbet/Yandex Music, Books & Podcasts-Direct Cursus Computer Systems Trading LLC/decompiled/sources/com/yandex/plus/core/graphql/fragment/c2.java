package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class c2 {
    public final String a;
    public final ro b;

    public c2(String str, ro roVar) {
        this.a = str;
        this.b = roVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return this.a.equals(c2Var.a) && this.b.equals(c2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffOffer(__typename=" + this.a + ", tariffOfferDetails=" + this.b + ')';
    }
}
