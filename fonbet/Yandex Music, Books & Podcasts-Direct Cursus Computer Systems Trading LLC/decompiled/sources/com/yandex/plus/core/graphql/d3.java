package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class d3 {
    public final com.yandex.plus.core.graphql.type.y0 a;

    public d3(com.yandex.plus.core.graphql.type.y0 y0Var) {
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3) && this.a == ((d3) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserSyncStatus(status=" + this.a + ')';
    }
}
