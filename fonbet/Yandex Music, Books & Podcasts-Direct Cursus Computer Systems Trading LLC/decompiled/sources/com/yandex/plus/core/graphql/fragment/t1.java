package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class t1 {
    public final String a;
    public final no b;

    public t1(String str, no noVar) {
        this.a = str;
        this.b = noVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a.equals(t1Var.a) && this.b.equals(t1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffOffer(__typename=" + this.a + ", tariffOffer=" + this.b + ')';
    }
}
