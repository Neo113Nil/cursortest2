package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class k0 implements j1 {

    @NotNull
    public static final g0 Companion = new g0();
    public final String a;
    public final String b;
    public final j0 c;

    public /* synthetic */ k0(int i, String str, String str2, j0 j0Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, f0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.a, k0Var.a) && Intrinsics.d(this.b, k0Var.b) && Intrinsics.d(this.c, k0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "HighlightComponent(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
