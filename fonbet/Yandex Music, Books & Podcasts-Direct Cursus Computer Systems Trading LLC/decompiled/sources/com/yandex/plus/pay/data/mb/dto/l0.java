package com.yandex.plus.pay.data.mb.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l0 implements w0 {

    @NotNull
    public static final k0 Companion = new k0();
    public final z0 a;
    public final String b;
    public final int c;

    public /* synthetic */ l0(int i, z0 z0Var, String str, int i2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, j0.a.getDescriptor());
            throw null;
        }
        this.a = z0Var;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.a, l0Var.a) && Intrinsics.d(this.b, l0Var.b) && this.c == l0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Intro(price=");
        sb.append(this.a);
        sb.append(", period=");
        sb.append(this.b);
        sb.append(", repeatCount=");
        return vz1.r(sb, this.c, ')');
    }
}
