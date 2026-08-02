package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class y5 {

    @NotNull
    public static final w5 Companion = new w5();
    public static final arf[] c = {null, btf.a(bwf.b, new k0(26))};
    public final x a;
    public final x5 b;

    public /* synthetic */ y5(int i, x xVar, x5 x5Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, v5.a.getDescriptor());
            throw null;
        }
        this.a = xVar;
        this.b = x5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return Intrinsics.d(this.a, y5Var.a) && this.b == y5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkPlusStateModel(balance=" + this.a + ", plusSubscriptionStatus=" + this.b + ')';
    }
}
