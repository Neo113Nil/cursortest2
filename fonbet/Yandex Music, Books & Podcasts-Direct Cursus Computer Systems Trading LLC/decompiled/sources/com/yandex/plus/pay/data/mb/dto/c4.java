package com.yandex.plus.pay.data.mb.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class c4 {

    @NotNull
    public static final b4 Companion = new b4();
    public final String a;
    public final String b;
    public final z3 c;

    public /* synthetic */ c4(int i, String str, String str2, z3 z3Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, a4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Intrinsics.d(this.a, c4Var.a) && Intrinsics.d(this.b, c4Var.b) && Intrinsics.d(this.c, c4Var.c);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        z3 z3Var = this.c;
        return c + (z3Var == null ? 0 : z3Var.hashCode());
    }

    public final String toString() {
        return "WidgetUrl(light=" + this.a + ", dark=" + this.b + ", timeoutParams=" + this.c + ')';
    }
}
