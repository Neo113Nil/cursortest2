package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class p2 {
    public final o2 a;

    public p2(o2 o2Var) {
        this.a = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && this.a.equals(((p2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Invoice(externalStart=" + this.a + ')';
    }
}
