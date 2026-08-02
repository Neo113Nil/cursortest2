package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.f1d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y {
    public final g a;
    public final Throwable b;

    public y(g gVar, Throwable th) {
        this.a = gVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.a, yVar.a) && Intrinsics.d(this.b, yVar.b);
    }

    public final int hashCode() {
        g gVar = this.a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        Throwable th = this.b;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(result=");
        sb.append(this.a);
        sb.append(", error=");
        return f1d.k(sb, this.b, ')');
    }
}
