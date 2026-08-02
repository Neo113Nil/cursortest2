package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class l1 {

    @NotNull
    public static final h1 Companion = new h1();
    public final String a;
    public final String b;
    public final k1 c;
    public final k1 d;
    public final boolean e;
    public final boolean f;
    public final g1 g;

    public /* synthetic */ l1(int i, String str, String str2, k1 k1Var, k1 k1Var2, boolean z, boolean z2, g1 g1Var) {
        if (127 != (i & 127)) {
            u7g.V(i, 127, d1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = k1Var;
        this.d = k1Var2;
        this.e = z;
        this.f = z2;
        this.g = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.d(this.a, l1Var.a) && Intrinsics.d(this.b, l1Var.b) && Intrinsics.d(this.c, l1Var.c) && Intrinsics.d(this.d, l1Var.d) && this.e == l1Var.e && this.f == l1Var.f && Intrinsics.d(this.g, l1Var.g);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e((this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f);
        g1 g1Var = this.g;
        return e + (g1Var == null ? 0 : g1Var.hashCode());
    }

    public final String toString() {
        return "PaymentButtonDto(id=" + this.a + ", title=" + this.b + ", lightTheme=" + this.c + ", darkTheme=" + this.d + ", isBound=" + this.e + ", hasArrowIcon=" + this.f + ", asset=" + this.g + ')';
    }
}
