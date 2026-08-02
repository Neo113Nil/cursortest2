package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class ep {
    public final com.yandex.plus.core.graphql.type.u a;
    public final com.yandex.plus.core.graphql.type.d1 b;

    public ep(com.yandex.plus.core.graphql.type.u uVar, com.yandex.plus.core.graphql.type.d1 d1Var) {
        this.a = uVar;
        this.b = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return this.a == epVar.a && this.b == epVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBoxCrossWidgetGroupProperties(horizontalContentAlignment=" + this.a + ", verticalContentAlignment=" + this.b + ')';
    }
}
