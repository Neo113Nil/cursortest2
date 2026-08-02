package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.xe;

/* loaded from: classes4.dex */
public final class d2 {
    public final String a;
    public final xe b;

    public d2(String str, xe xeVar) {
        this.a = str;
        this.b = xeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.a.equals(d2Var.a) && this.b.equals(d2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plaque(__typename=" + this.a + ", plaqueDefinitions=" + this.b + ')';
    }
}
