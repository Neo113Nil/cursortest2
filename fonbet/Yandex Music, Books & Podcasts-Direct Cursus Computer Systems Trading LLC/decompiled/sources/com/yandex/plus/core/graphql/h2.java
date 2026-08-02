package com.yandex.plus.core.graphql;

import defpackage.q6n;

/* loaded from: classes4.dex */
public final class h2 implements q6n {
    public final f2 a;
    public final g2 b;

    public h2(f2 f2Var, g2 g2Var) {
        this.a = f2Var;
        this.b = g2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.a.equals(h2Var.a) && this.b.equals(h2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(configuration=" + this.a + ", darkConfiguration=" + this.b + ')';
    }
}
