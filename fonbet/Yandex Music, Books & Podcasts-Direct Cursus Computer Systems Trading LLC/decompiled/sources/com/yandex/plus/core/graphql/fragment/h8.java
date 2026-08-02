package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class h8 {
    public final String a;
    public final pp b;

    public h8(String str, pp ppVar) {
        this.a = str;
        this.b = ppVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.a.equals(h8Var.a) && this.b.equals(h8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Width(__typename=" + this.a + ", widgetGroupWidth=" + this.b + ')';
    }
}
