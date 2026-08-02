package com.yandex.passport.internal.ui.challenge.delete;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 implements b1 {
    public final com.yandex.passport.api.j0 a;

    public z0(com.yandex.passport.api.j0 j0Var) {
        j0Var.getClass();
        this.a = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.a, ((z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(result=" + this.a + ')';
    }
}
