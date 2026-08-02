package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class m6 {

    @NotNull
    public static final l6 Companion = new l6();
    public final j6 a;
    public final b6 b;

    public /* synthetic */ m6(int i, j6 j6Var, b6 b6Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, k6.a.getDescriptor());
            throw null;
        }
        this.a = j6Var;
        this.b = b6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return Intrinsics.d(this.a, m6Var.a) && Intrinsics.d(this.b, m6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
