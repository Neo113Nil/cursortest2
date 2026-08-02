package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q8 {

    @NotNull
    public static final p8 Companion = new p8();
    public final n8 a;
    public final k8 b;

    public /* synthetic */ q8(int i, n8 n8Var, k8 k8Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, o8.a.getDescriptor());
            throw null;
        }
        this.a = n8Var;
        this.b = k8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return Intrinsics.d(this.a, q8Var.a) && Intrinsics.d(this.b, q8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
