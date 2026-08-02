package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class j6 {

    @NotNull
    public static final d6 Companion = new d6();
    public final String a;
    public final i6 b;

    public /* synthetic */ j6(int i, String str, i6 i6Var) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, c6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return Intrinsics.d(this.a, j6Var.a) && Intrinsics.d(this.b, j6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i6 i6Var = this.b;
        return hashCode + (i6Var == null ? 0 : i6Var.hashCode());
    }

    public final String toString() {
        return "DataDto(productId=" + this.a + ", replacementParams=" + this.b + ')';
    }
}
