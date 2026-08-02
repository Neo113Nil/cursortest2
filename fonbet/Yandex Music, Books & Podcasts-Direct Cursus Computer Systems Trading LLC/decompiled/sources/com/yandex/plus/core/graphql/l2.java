package com.yandex.plus.core.graphql;

import defpackage.jtj;

/* loaded from: classes4.dex */
public final class l2 implements jtj {
    public final com.yandex.plus.core.graphql.type.d0 a;

    public l2(com.yandex.plus.core.graphql.type.d0 d0Var) {
        this.a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && this.a == ((l2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(plaqueSeen=" + this.a + ')';
    }
}
