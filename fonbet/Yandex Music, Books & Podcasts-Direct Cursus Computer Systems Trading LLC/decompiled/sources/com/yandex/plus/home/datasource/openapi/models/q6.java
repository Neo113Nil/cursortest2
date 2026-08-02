package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q6 implements p {

    @NotNull
    public static final p6 Companion = new p6();
    public static final arf[] d = {null, btf.a(bwf.b, new k0(28)), null};
    public final String a;
    public final List b;
    public final h3 c;

    public /* synthetic */ q6(int i, String str, List list, h3 h3Var) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, o6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = h3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return Intrinsics.d(this.a, q6Var.a) && Intrinsics.d(this.b, q6Var.b) && Intrinsics.d(this.c, q6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkRadialGradientModel(type=" + this.a + ", colors=" + this.b + ", centralPoint=" + this.c + ')';
    }
}
