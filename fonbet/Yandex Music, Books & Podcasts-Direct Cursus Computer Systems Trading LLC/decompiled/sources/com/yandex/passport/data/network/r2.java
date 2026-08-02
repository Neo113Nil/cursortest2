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
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(18))};
    public final String a;
    public final List b;

    public /* synthetic */ r2(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, p2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return Intrinsics.d(this.a, r2Var.a) && Intrinsics.d(this.b, r2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", experiments=");
        return eta.h(sb, this.b, ')');
    }
}
