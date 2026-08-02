package defpackage;

import com.yandex.plus.core.graphql.type.GOOGLE_OFFER_REPLACE_STRATEGY;

/* loaded from: classes2.dex */
public final class vju0 {
    public final String a;
    public final GOOGLE_OFFER_REPLACE_STRATEGY b;

    public vju0(String str, GOOGLE_OFFER_REPLACE_STRATEGY google_offer_replace_strategy) {
        this.a = str;
        this.b = google_offer_replace_strategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vju0)) {
            return false;
        }
        vju0 vju0Var = (vju0) obj;
        return this.a.equals(vju0Var.a) && this.b == vju0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GoogleOfferReplaceParams(purchaseToken=" + this.a + ", strategy=" + this.b + ')';
    }
}
