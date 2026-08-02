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
public final class j4 implements p {

    @NotNull
    public static final i4 Companion = new i4();
    public static final arf[] e = {null, btf.a(bwf.b, new k0(20)), null, null};
    public final String a;
    public final List b;
    public final h3 c;
    public final h3 d;

    public /* synthetic */ j4(int i, String str, List list, h3 h3Var, h3 h3Var2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, h4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = h3Var;
        this.d = h3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return Intrinsics.d(this.a, j4Var.a) && Intrinsics.d(this.b, j4Var.b) && Intrinsics.d(this.c, j4Var.c) && Intrinsics.d(this.d, j4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "NetworkLinearGradientModel(type=" + this.a + ", colors=" + this.b + ", startPoint=" + this.c + ", endPoint=" + this.d + ')';
    }
}
