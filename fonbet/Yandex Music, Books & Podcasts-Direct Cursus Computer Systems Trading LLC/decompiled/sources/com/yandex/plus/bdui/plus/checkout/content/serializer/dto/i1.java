package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class i1 implements j1 {

    @NotNull
    public static final e1 Companion = new e1();
    public final String a;
    public final String b;
    public final h1 c;

    public /* synthetic */ i1(int i, String str, String str2, h1 h1Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, d1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.d(this.a, i1Var.a) && Intrinsics.d(this.b, i1Var.b) && Intrinsics.d(this.c, i1Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Text(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
