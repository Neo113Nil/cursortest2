package com.yandex.plus.core.graphql;

import defpackage.jtj;

/* loaded from: classes4.dex */
public final class n2 implements jtj {
    public final p2 a;

    public n2(p2 p2Var) {
        this.a = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && this.a.equals(((n2) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(invoice=" + this.a + ')';
    }
}
