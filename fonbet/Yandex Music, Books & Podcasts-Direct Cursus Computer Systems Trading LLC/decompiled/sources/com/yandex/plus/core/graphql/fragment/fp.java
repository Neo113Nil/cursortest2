package com.yandex.plus.core.graphql.fragment;

/* loaded from: classes4.dex */
public final class fp {
    public final com.yandex.plus.core.graphql.type.u a;

    public fp(com.yandex.plus.core.graphql.type.u uVar) {
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp) && this.a == ((fp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnColumnCrossWidgetGroupProperties(horizontalContentAlignment=" + this.a + ')';
    }
}
