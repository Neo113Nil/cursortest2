package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();
    public final long a;
    public final String b;

    public /* synthetic */ h0(String str, int i, long j) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, f0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && Intrinsics.d(this.b, h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bdui(configId=");
        sb.append(this.a);
        sb.append(", divDataJson=");
        return dfi.i(sb, this.b, ')');
    }
}
