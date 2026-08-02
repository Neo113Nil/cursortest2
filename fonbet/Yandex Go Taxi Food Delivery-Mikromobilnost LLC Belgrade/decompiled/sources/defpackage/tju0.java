package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class tju0 {
    public final String a;
    public final ArrayList b;

    public tju0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tju0)) {
            return false;
        }
        tju0 tju0Var = (tju0) obj;
        return jl40.l(this.a, tju0Var.a) && this.b.equals(tju0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreOfferV2Input(offerName=");
        sb.append(this.a);
        sb.append(", purchasePlans=");
        return smw0.m(sb, this.b, ')');
    }
}
