package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class lo {
    public final String a;
    public final ea b;

    public lo(String str, ea eaVar) {
        this.a = str;
        this.b = eaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return this.a.equals(loVar.a) && this.b.equals(loVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plan(__typename=" + this.a + ", offerPlan=" + this.b + ')';
    }
}
