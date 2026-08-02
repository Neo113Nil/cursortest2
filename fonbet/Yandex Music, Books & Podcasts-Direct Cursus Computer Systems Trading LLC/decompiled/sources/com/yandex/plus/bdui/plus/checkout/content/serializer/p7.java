package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class p7 {

    @NotNull
    public static final o7 Companion = new o7();
    public final m7 a;
    public final j7 b;

    public /* synthetic */ p7(int i, m7 m7Var, j7 j7Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, n7.a.getDescriptor());
            throw null;
        }
        this.a = m7Var;
        this.b = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return Intrinsics.d(this.a, p7Var.a) && Intrinsics.d(this.b, p7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
