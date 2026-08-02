package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class d0 implements j1 {

    @NotNull
    public static final z Companion = new z();
    public final String a;
    public final String b;
    public final c0 c;

    public /* synthetic */ d0(int i, String str, String str2, c0 c0Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.a, d0Var.a) && Intrinsics.d(this.b, d0Var.b) && Intrinsics.d(this.c, d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ColorComponent(key=" + this.a + ", altText=" + this.b + ", data=" + this.c + ')';
    }
}
