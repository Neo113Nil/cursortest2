package com.yandex.plus.core.graphql.fragment;

import defpackage.f1d;

/* loaded from: classes4.dex */
public final class x9 {
    public final w9 a;
    public final Object b;

    public x9(w9 w9Var, Object obj) {
        this.a = w9Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return this.a.equals(x9Var.a) && this.b.equals(x9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferIntroUntilPlan(price=");
        sb.append(this.a);
        sb.append(", until=");
        return f1d.j(sb, this.b, ')');
    }
}
