package com.yandex.plus.pay.adapter.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements o {
    public final d0 a;

    public m(d0 d0Var) {
        d0Var.getClass();
        this.a = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ')';
    }
}
