package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class fo {
    public final String a;
    public final i1 b;

    public fo(String str, i1 i1Var) {
        this.a = str;
        this.b = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return this.a.equals(foVar.a) && this.b.equals(foVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextColor(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
