package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class v7f0 {
    public final ns5 a;
    public final ArrayList b;

    public v7f0(ns5 ns5Var, ArrayList arrayList) {
        this.a = ns5Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7f0)) {
            return false;
        }
        v7f0 v7f0Var = (v7f0) obj;
        return jl40.l(this.a, v7f0Var.a) && this.b.equals(v7f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsResult(billingResult=");
        sb.append(this.a);
        sb.append(", productDetailsList=");
        return smw0.m(sb, this.b, ')');
    }
}
