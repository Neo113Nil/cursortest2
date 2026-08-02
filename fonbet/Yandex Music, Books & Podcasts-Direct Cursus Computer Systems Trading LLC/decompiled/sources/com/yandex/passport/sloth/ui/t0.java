package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 {
    public final a1 a;

    public t0(a1 a1Var) {
        a1Var.getClass();
        this.a = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.a, ((t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlothUiData(interactor=" + this.a + ')';
    }
}
