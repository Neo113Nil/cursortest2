package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class c1 implements j1 {

    @NotNull
    public static final y0 Companion = new y0();
    public final String a;
    public final String b;
    public final b1 c;

    public /* synthetic */ c1(int i, String str, String str2, b1 b1Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, x0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.d(this.a, c1Var.a) && Intrinsics.d(this.b, c1Var.b) && Intrinsics.d(this.c, c1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Strike(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
