package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();
    public final t0 a;
    public final g0 b;

    public /* synthetic */ c1(int i, t0 t0Var, g0 g0Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, a1.a.getDescriptor());
            throw null;
        }
        this.a = t0Var;
        this.b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.a, c1Var.a) && Intrinsics.d(this.b, c1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
