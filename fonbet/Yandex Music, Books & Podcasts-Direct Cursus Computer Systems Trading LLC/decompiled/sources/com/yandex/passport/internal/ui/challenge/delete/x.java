package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.dfi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {
    public final com.yandex.passport.common.core.f a;
    public final boolean b;

    public x(com.yandex.passport.common.core.f fVar, boolean z) {
        fVar.getClass();
        this.a = fVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && this.b == xVar.b;
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
