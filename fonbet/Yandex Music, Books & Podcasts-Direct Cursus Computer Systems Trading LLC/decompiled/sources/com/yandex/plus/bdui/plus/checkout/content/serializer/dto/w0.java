package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w0 implements j1 {

    @NotNull
    public static final s0 Companion = new s0();
    public final String a;
    public final String b;
    public final v0 c;

    public /* synthetic */ w0(int i, String str, String str2, v0 v0Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, r0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.a, w0Var.a) && Intrinsics.d(this.b, w0Var.b) && Intrinsics.d(this.c, w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Link(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
