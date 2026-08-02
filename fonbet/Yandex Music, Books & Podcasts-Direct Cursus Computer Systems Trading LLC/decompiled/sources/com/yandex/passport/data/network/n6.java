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
public final class n6 {

    @NotNull
    public static final m6 Companion = new m6();
    public static final arf[] c = {null, btf.a(bwf.b, new k5(10))};
    public final String a;
    public final List b;

    public /* synthetic */ n6(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, l6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return Intrinsics.d(this.a, n6Var.a) && Intrinsics.d(this.b, n6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", cookies=");
        return eta.h(sb, this.b, ')');
    }
}
