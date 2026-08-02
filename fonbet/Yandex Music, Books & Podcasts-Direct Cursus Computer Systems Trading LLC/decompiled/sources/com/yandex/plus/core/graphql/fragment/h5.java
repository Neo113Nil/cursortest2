package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h5 {
    public final e5 a;

    public h5(e5 e5Var) {
        this.a = e5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5) && Intrinsics.d(this.a, ((h5) obj).a);
    }

    public final int hashCode() {
        e5 e5Var = this.a;
        if (e5Var == null) {
            return 0;
        }
        return e5Var.hashCode();
    }

    public final String toString() {
        return "OnAction(backgroundColors=" + this.a + ')';
    }
}
