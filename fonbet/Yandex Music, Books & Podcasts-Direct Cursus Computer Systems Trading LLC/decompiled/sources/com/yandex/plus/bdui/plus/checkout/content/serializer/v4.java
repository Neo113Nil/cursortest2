package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v4 {

    @NotNull
    public static final u4 Companion = new u4();
    public final p4 a;
    public final m4 b;

    public /* synthetic */ v4(int i, p4 p4Var, m4 m4Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, t4.a.getDescriptor());
            throw null;
        }
        this.a = p4Var;
        this.b = m4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return Intrinsics.d(this.a, v4Var.a) && Intrinsics.d(this.b, v4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
