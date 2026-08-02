package com.yandex.passport.internal.ui.bouncer.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements k0 {
    public final w0 a;

    public t(w0 w0Var) {
        w0Var.getClass();
        this.a = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessEvent(event=" + this.a + ')';
    }
}
