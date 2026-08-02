package com.yandex.passport.internal.filter;

import com.yandex.passport.data.network.k5;
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
public final class u {

    @NotNull
    public static final t Companion = new t();
    public static final arf[] c;
    public final Set a;
    public final Set b;

    static {
        bwf bwfVar = bwf.b;
        c = new arf[]{btf.a(bwfVar, new k5(22)), btf.a(bwfVar, new k5(23))};
    }

    public /* synthetic */ u(int i, Set set, Set set2) {
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
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.a, uVar.a) && Intrinsics.d(this.b, uVar.b);
    }

    public final int hashCode() {
        Set set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set set2 = this.b;
        return hashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterRuleCacheV1(includeParameters=");
        sb.append(this.a);
        sb.append(", excludeParameters=");
        return vz1.v(sb, this.b, ')');
    }

    public u(Set set, Set set2, int i) {
        set = (i & 1) != 0 ? null : set;
        set2 = (i & 2) != 0 ? null : set2;
        this.a = set;
        this.b = set2;
    }
}
