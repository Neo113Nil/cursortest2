package com.yandex.plus.core.graphql;

import com.yandex.plus.core.graphql.fragment.j7;

/* loaded from: classes4.dex */
public final class y2 {
    public final String a;
    public final j7 b;

    public y2(String str, j7 j7Var) {
        this.a = str;
        this.b = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return this.a.equals(y2Var.a) && this.b.equals(y2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Invitation(__typename=" + this.a + ", familyInvitation=" + this.b + ')';
    }
}
