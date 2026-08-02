package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class e4 {

    @NotNull
    public static final d4 Companion = new d4();
    public final v3 a;
    public final s3 b;

    public /* synthetic */ e4(int i, v3 v3Var, s3 s3Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, c4.a.getDescriptor());
            throw null;
        }
        this.a = v3Var;
        this.b = s3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return Intrinsics.d(this.a, e4Var.a) && Intrinsics.d(this.b, e4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PayloadDto(data=" + this.a + ", actions=" + this.b + ')';
    }
}
