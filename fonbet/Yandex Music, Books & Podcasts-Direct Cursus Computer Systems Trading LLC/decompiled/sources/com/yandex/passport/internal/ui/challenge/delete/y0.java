package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 implements b1 {
    public final com.yandex.passport.common.core.f a;
    public final boolean b;

    public y0(com.yandex.passport.common.core.f fVar, boolean z) {
        fVar.getClass();
        this.a = fVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.a, y0Var.a) && this.b == y0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Relogin(uid=");
        sb.append(this.a);
        sb.append(", isPhonish=");
        return dfi.j(sb, this.b, ')');
    }
}
