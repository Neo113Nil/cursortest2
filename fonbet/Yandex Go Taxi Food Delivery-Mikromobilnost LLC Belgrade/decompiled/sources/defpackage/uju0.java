package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class uju0 {
    public final yf70 a;
    public final ArrayList b;

    public uju0(yf70 yf70Var, ArrayList arrayList) {
        this.a = yf70Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uju0)) {
            return false;
        }
        uju0 uju0Var = (uju0) obj;
        return this.a.equals(uju0Var.a) && this.b.equals(uju0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreOffersDataV2Input(inAppPurchases=");
        sb.append(this.a);
        sb.append(", storeOffers=");
        return smw0.m(sb, this.b, ')');
    }
}
