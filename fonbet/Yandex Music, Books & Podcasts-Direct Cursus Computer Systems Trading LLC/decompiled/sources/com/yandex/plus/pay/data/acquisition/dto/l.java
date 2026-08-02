package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final arf[] c = {null, btf.a(bwf.b, new f(4))};
    public final String a;
    public final Set b;

    public /* synthetic */ l(String str, int i, Set set) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, j.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.a, lVar.a) && Intrinsics.d(this.b, lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetAndFeatures(target=");
        sb.append(this.a);
        sb.append(", features=");
        return vz1.v(sb, this.b, ')');
    }

    public l(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }
}
