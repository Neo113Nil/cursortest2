package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.vhp;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t5 {

    @NotNull
    public static final s5 Companion = new s5();
    public static final arf[] c;
    public final Set a;
    public final Set b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new k5(1)), btf.a(bwfVar, new k5(2))};
    }

    public /* synthetic */ t5(int i, Set set, Set set2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = set;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = set2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return Intrinsics.d(this.a, t5Var.a) && Intrinsics.d(this.b, t5Var.b);
    }

    public final int hashCode() {
        Set set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set set2 = this.b;
        return hashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterRuleDTO(includeParameters=");
        sb.append(this.a);
        sb.append(", excludeParameters=");
        return vz1.v(sb, this.b, ')');
    }
}
