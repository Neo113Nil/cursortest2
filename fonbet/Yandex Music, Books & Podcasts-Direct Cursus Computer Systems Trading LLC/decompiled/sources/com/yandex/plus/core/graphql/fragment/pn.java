package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class pn {
    public final String a;
    public final com.yandex.plus.core.graphql.type.r b;

    public pn(String str, com.yandex.plus.core.graphql.type.r rVar) {
        this.a = str;
        this.b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn)) {
            return false;
        }
        pn pnVar = (pn) obj;
        return this.a.equals(pnVar.a) && this.b == pnVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoogleOfferReplaceParams(purchaseToken=" + this.a + ", strategy=" + this.b + ')';
    }
}
