package com.yandex.plus.bdui.plus.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final a1 a;
    public final x0 b;

    public /* synthetic */ g1(int i, a1 a1Var, x0 x0Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e1.a.getDescriptor());
            throw null;
        }
        this.a = a1Var;
        this.b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.a, g1Var.a) && Intrinsics.d(this.b, g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
