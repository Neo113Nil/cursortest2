package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t5 {

    @NotNull
    public static final s5 Companion = new s5();
    public final q5 a;
    public final n5 b;

    public /* synthetic */ t5(int i, q5 q5Var, n5 n5Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r5.a.getDescriptor());
            throw null;
        }
        this.a = q5Var;
        this.b = n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return Intrinsics.d(this.a, t5Var.a) && Intrinsics.d(this.b, t5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
