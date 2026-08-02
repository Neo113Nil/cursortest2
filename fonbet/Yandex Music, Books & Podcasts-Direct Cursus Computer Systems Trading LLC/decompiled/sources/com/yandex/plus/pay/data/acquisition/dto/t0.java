package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.dfi;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public final String a;
    public final String b;

    public /* synthetic */ t0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.a, t0Var.a) && Intrinsics.d(this.b, t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(text=");
        sb.append(this.a);
        sb.append(", uri=");
        return dfi.i(sb, this.b, ')');
    }
}
