package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class b7 {

    @NotNull
    public static final a7 Companion = new a7();
    public final v6 a;
    public final s6 b;

    public /* synthetic */ b7(int i, v6 v6Var, s6 s6Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, z6.a.getDescriptor());
            throw null;
        }
        this.a = v6Var;
        this.b = s6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return Intrinsics.d(this.a, b7Var.a) && Intrinsics.d(this.b, b7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
