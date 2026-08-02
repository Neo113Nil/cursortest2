package com.yandex.plus.core.graphql;

import defpackage.jtj;

/* loaded from: classes4.dex */
public final class j2 implements jtj {
    public final com.yandex.plus.core.graphql.type.b0 a;

    public j2(com.yandex.plus.core.graphql.type.b0 b0Var) {
        this.a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && this.a == ((j2) obj).a;
    }

    public final int hashCode() {
        com.yandex.plus.core.graphql.type.b0 b0Var = this.a;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public final String toString() {
        return "Data(plaqueClicked=" + this.a + ')';
    }
}
