package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public final a0 a;
    public final u b;

    public /* synthetic */ d0(int i, a0 a0Var, u uVar) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, b0.a.getDescriptor());
            throw null;
        }
        this.a = a0Var;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && Intrinsics.d(this.b, d0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
