package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e8 {

    @NotNull
    public static final d8 Companion = new d8();
    public final b8 a;
    public final y7 b;

    public /* synthetic */ e8(int i, b8 b8Var, y7 y7Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, c8.a.getDescriptor());
            throw null;
        }
        this.a = b8Var;
        this.b = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return Intrinsics.d(this.a, e8Var.a) && Intrinsics.d(this.b, e8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
