package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g5 {

    @NotNull
    public static final c5 Companion = new c5();
    public static final arf[] c;
    public final List a;
    public final List b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new com.yandex.passport.api.exception.l(27)), btf.a(bwfVar, new com.yandex.passport.api.exception.l(28))};
    }

    public g5(int i, List list, List list2) {
        this.a = (i & 1) == 0 ? c5b.a : list;
        if ((i & 2) == 0) {
            this.b = c5b.a;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return Intrinsics.d(this.a, g5Var.a) && Intrinsics.d(this.b, g5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Backend(appIds=");
        sb.append(this.a);
        sb.append(", locations=");
        return eta.h(sb, this.b, ')');
    }
}
