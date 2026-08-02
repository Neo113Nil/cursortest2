package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 {
    public final h0 a;
    public final Throwable b;

    public e0(h0 h0Var, Throwable th) {
        this.a = h0Var;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.a, e0Var.a) && Intrinsics.d(this.b, e0Var.b);
    }

    public final int hashCode() {
        h0 h0Var = this.a;
        int hashCode = (h0Var == null ? 0 : h0Var.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(bottomSheetParameters=");
        sb.append(this.a);
        sb.append(", error=");
        return f1d.k(sb, this.b, ')');
    }
}
