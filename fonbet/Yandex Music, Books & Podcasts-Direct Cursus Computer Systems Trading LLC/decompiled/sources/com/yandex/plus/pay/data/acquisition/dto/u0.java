package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u0 {

    @NotNull
    public static final q0 Companion = new q0();
    public final String a;
    public final t0 b;

    public /* synthetic */ u0(int i, String str, t0 t0Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, p0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.a, u0Var.a) && Intrinsics.d(this.b, u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Argument(key=" + this.a + ", data=" + this.b + ')';
    }
}
