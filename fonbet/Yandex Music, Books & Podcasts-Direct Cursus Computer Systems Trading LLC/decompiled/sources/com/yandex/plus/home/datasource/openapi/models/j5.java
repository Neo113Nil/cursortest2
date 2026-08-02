package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();
    public static final arf[] f;
    public final g7 a;
    public final List b;
    public final g7 c;
    public final g7 d;
    public final List e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, btf.a(bwfVar, new k0(22)), null, null, btf.a(bwfVar, new k0(23))};
    }

    public /* synthetic */ j5(int i, g7 g7Var, List list, g7 g7Var2, g7 g7Var3, List list2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, h5.a.getDescriptor());
            throw null;
        }
        this.a = g7Var;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = g7Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = g7Var3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return Intrinsics.d(this.a, j5Var.a) && Intrinsics.d(this.b, j5Var.b) && Intrinsics.d(this.c, j5Var.c) && Intrinsics.d(this.d, j5Var.d) && Intrinsics.d(this.e, j5Var.e);
    }

    public final int hashCode() {
        int d = k5r.d(this.a.hashCode() * 31, 31, this.b);
        g7 g7Var = this.c;
        int hashCode = (d + (g7Var == null ? 0 : g7Var.hashCode())) * 31;
        g7 g7Var2 = this.d;
        int hashCode2 = (hashCode + (g7Var2 == null ? 0 : g7Var2.hashCode())) * 31;
        List list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPlaqueDefinitionsModel(defaultPlaque=");
        sb.append(this.a);
        sb.append(", widgets=");
        sb.append(this.b);
        sb.append(", prefetchPlaque=");
        sb.append(this.c);
        sb.append(", fallbackPlaque=");
        sb.append(this.d);
        sb.append(", conditionalPlaques=");
        return eta.h(sb, this.e, ')');
    }
}
