package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class gp {
    public final com.yandex.plus.core.graphql.type.d1 a;

    public gp(com.yandex.plus.core.graphql.type.d1 d1Var) {
        this.a = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp) && this.a == ((gp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRowCrossWidgetGroupProperties(verticalContentAlignment=" + this.a + ')';
    }
}
