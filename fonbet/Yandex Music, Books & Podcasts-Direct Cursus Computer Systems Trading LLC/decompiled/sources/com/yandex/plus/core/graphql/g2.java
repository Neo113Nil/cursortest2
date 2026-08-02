package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.l6;

/* loaded from: classes4.dex */
public final class g2 {
    public final String a;
    public final l6 b;

    public g2(String str, l6 l6Var) {
        this.a = str;
        this.b = l6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.a.equals(g2Var.a) && this.b.equals(g2Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DarkConfiguration(__typename=" + this.a + ", darkPopupConfigurationFragment=" + this.b + ')';
    }
}
