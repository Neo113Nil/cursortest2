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
public final class y7 {

    @NotNull
    public static final x7 Companion = new x7();
    public static final arf[] c;
    public final List a;
    public final List b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new k5(12)), btf.a(bwfVar, new k5(13))};
    }

    public y7(int i, List list, List list2) {
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
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        return Intrinsics.d(this.a, y7Var.a) && Intrinsics.d(this.b, y7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(yaApps=");
        sb.append(this.a);
        sb.append(", ssoApps=");
        return eta.h(sb, this.b, ')');
    }
}
