package com.yandex.passport.internal.ui.challenge.delete;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements r {
    public final v1 a;

    public q(v1 v1Var) {
        this.a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        v1 v1Var = this.a;
        if (v1Var == null) {
            return 0;
        }
        return v1Var.hashCode();
    }

    public final String toString() {
        return "SetResult(result=" + this.a + ')';
    }
}
