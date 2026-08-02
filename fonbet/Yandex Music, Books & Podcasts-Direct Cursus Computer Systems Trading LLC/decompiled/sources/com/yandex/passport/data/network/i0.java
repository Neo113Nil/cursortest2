package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ i0(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, g0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a == i0Var.a && this.b == i0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(isFaceRecognized=");
        sb.append(this.a);
        sb.append(", isFlowSuccessful=");
        return dfi.j(sb, this.b, ')');
    }
}
