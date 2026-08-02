package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class oo {
    public final String a;
    public final a0 b;

    public oo(String str, a0 a0Var) {
        this.a = str;
        this.b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        return this.a.equals(ooVar.a) && this.b.equals(ooVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundTv(__typename=" + this.a + ", backgroundTv=" + this.b + ')';
    }
}
