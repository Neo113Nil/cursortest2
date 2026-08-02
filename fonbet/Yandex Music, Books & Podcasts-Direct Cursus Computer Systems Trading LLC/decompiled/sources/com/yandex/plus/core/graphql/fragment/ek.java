package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class ek {
    public final String a;
    public final xn b;

    public ek(String str, xn xnVar) {
        this.a = str;
        this.b = xnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        return this.a.equals(ekVar.a) && this.b.equals(ekVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StrictAction(__typename=" + this.a + ", strictPlaqueAction=" + this.b + ')';
    }
}
