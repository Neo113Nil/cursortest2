package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class cl {
    public final String a;
    public final xn b;

    public cl(String str, xn xnVar) {
        this.a = str;
        this.b = xnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl)) {
            return false;
        }
        cl clVar = (cl) obj;
        return this.a.equals(clVar.a) && this.b.equals(clVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StrictAction(__typename=" + this.a + ", strictPlaqueAction=" + this.b + ')';
    }
}
