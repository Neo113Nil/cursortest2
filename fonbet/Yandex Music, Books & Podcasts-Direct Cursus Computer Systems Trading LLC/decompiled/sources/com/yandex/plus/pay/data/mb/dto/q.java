package com.yandex.plus.pay.data.mb.dto;

import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();
    public final z0 a;
    public final long b;

    public /* synthetic */ q(int i, z0 z0Var, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o.a.getDescriptor());
            throw null;
        }
        this.a = z0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && this.b == qVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Invoice(totalPrice=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return eta.g(sb, this.b, ')');
    }
}
