package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class po {
    public final String a;
    public final qn b;

    public po(String str, qn qnVar) {
        this.a = str;
        this.b = qnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return this.a.equals(poVar.a) && this.b.equals(poVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StorePurchaseInfo(__typename=" + this.a + ", storePurchaseInfo=" + this.b + ')';
    }
}
