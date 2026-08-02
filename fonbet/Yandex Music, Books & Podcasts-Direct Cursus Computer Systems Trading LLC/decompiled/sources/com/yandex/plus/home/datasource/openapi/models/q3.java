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
public final class q3 implements d6 {

    @NotNull
    public static final p3 Companion = new p3();
    public static final arf[] d = {null, null, btf.a(bwf.b, new k0(16))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ q3(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, o3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.d(this.a, q3Var.a) && Intrinsics.d(this.b, q3Var.b) && Intrinsics.d(this.c, q3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkInSetPredicateModel(type=");
        sb.append(this.a);
        sb.append(", argName=");
        sb.append(this.b);
        sb.append(", argsSet=");
        return eta.h(sb, this.c, ')');
    }
}
