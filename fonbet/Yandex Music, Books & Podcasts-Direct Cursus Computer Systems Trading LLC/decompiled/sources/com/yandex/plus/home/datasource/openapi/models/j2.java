package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class j2 {

    @NotNull
    public static final i2 Companion = new i2();
    public static final arf[] e;
    public final List a;
    public final List b;
    public final String c;
    public final String d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{btf.a(bwfVar, new k0(9)), btf.a(bwfVar, new k0(10)), null, null};
    }

    public /* synthetic */ j2(int i, String str, String str2, List list, List list2) {
        if (15 != (i & 15)) {
            u7g.V(i, 15, h2.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.d(this.a, j2Var.a) && Intrinsics.d(this.b, j2Var.b) && Intrinsics.d(this.c, j2Var.c) && Intrinsics.d(this.d, j2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkExperimentsModel(experiments=");
        sb.append(this.a);
        sb.append(", triggeredExperiments=");
        sb.append(this.b);
        sb.append(", testIds=");
        sb.append(this.c);
        sb.append(", triggeredTestIds=");
        return dfi.i(sb, this.d, ')');
    }
}
