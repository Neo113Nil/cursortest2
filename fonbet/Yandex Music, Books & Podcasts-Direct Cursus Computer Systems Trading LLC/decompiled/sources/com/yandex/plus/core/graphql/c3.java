package com.yandex.plus.core.graphql;

import defpackage.q6n;

/* loaded from: classes4.dex */
public final class c3 implements q6n {
    public final d3 a;

    public c3(d3 d3Var) {
        this.a = d3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3) && this.a.equals(((c3) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(userSyncStatus=" + this.a + ')';
    }
}
