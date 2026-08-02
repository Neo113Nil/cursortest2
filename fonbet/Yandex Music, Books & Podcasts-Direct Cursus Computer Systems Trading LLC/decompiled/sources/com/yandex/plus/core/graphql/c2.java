package com.yandex.plus.core.graphql;

import defpackage.q6n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 implements q6n {
    public final d2 a;

    public c2(d2 d2Var) {
        this.a = d2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && Intrinsics.d(this.a, ((c2) obj).a);
    }

    public final int hashCode() {
        d2 d2Var = this.a;
        if (d2Var == null) {
            return 0;
        }
        return d2Var.hashCode();
    }

    public final String toString() {
        return "Data(plaque=" + this.a + ')';
    }
}
