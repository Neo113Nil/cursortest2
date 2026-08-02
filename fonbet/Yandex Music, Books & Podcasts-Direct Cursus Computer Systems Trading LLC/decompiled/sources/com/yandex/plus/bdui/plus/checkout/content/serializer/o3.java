package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class o3 {

    @NotNull
    public static final n3 Companion = new n3();
    public final l3 a;
    public final c3 b;

    public /* synthetic */ o3(int i, l3 l3Var, c3 c3Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, m3.a.getDescriptor());
            throw null;
        }
        this.a = l3Var;
        this.b = c3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.d(this.a, o3Var.a) && Intrinsics.d(this.b, o3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
