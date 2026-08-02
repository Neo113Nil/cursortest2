package com.yandex.plus.pay.data.mb.dto;

import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o0 implements w0 {

    @NotNull
    public static final n0 Companion = new n0();
    public final z0 a;
    public final long b;

    public /* synthetic */ o0(int i, z0 z0Var, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m0.a.getDescriptor());
            throw null;
        }
        this.a = z0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.a, o0Var.a) && this.b == o0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntroUntil(price=");
        sb.append(this.a);
        sb.append(", until=");
        return eta.g(sb, this.b, ')');
    }
}
