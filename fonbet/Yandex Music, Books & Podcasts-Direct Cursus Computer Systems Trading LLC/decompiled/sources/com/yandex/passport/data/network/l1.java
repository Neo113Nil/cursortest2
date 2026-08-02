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
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();
    public static final arf[] c = {null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(16))};
    public final String a;
    public final List b;

    public /* synthetic */ l1(String str, List list, int i) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, j1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.d(this.a, l1Var.a) && Intrinsics.d(this.b, l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", countries=");
        return eta.h(sb, this.b, ')');
    }
}
