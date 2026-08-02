package com.yandex.passport.data.network;

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
/* loaded from: classes4.dex */
public final class d3 {

    @NotNull
    public static final c3 Companion = new c3();
    public static final arf[] c;
    public final List a;
    public final List b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new com.yandex.passport.api.exception.l(22)), btf.a(bwfVar, new com.yandex.passport.api.exception.l(23))};
    }

    public /* synthetic */ d3(int i, List list, List list2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, b3.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return Intrinsics.d(this.a, d3Var.a) && Intrinsics.d(this.b, d3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(badgesSpecification=");
        sb.append(this.a);
        sb.append(", appsConfiguration=");
        return eta.h(sb, this.b, ')');
    }
}
