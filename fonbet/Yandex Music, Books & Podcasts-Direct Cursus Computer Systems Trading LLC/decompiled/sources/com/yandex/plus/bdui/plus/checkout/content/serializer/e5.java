package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e5 {

    @NotNull
    public static final d5 Companion = new d5();
    public final b5 a;
    public final y4 b;

    public /* synthetic */ e5(int i, b5 b5Var, y4 y4Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, c5.a.getDescriptor());
            throw null;
        }
        this.a = b5Var;
        this.b = y4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return Intrinsics.d(this.a, e5Var.a) && Intrinsics.d(this.b, e5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
