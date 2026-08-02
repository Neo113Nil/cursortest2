package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q0 implements j1 {

    @NotNull
    public static final m0 Companion = new m0();
    public final String a;
    public final String b;
    public final p0 c;

    public /* synthetic */ q0(int i, String str, String str2, p0 p0Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, l0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.a, q0Var.a) && Intrinsics.d(this.b, q0Var.b) && Intrinsics.d(this.c, q0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "IconComponent(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
