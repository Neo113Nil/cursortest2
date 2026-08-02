package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class h6 {

    @NotNull
    public static final g6 Companion = new g6();
    public static final arf[] c = {null, btf.a(bwf.b, new k0(27))};
    public final int a;
    public final List b;

    public /* synthetic */ h6(int i, int i2, List list) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, f6.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return this.a == h6Var.a && Intrinsics.d(this.b, h6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPredicatesTreeModel(rootPredicateIndex=");
        sb.append(this.a);
        sb.append(", predicates=");
        return eta.h(sb, this.b, ')');
    }
}
