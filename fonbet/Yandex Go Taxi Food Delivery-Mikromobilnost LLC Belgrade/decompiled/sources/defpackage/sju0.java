package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class sju0 {
    public final String a;
    public final ArrayList b;

    public sju0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sju0)) {
            return false;
        }
        sju0 sju0Var = (sju0) obj;
        return jl40.l(this.a, sju0Var.a) && this.b.equals(sju0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreOfferArguments(offerId=");
        sb.append(this.a);
        sb.append(", plans=");
        return smw0.m(sb, this.b, ')');
    }
}
