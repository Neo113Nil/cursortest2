package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto;

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
public final class h6 implements r6 {

    @NotNull
    public static final e6 Companion = new e6();
    public static final arf[] c = {null, btf.a(bwf.b, new g4(7))};
    public final String a;
    public final Set b;

    public /* synthetic */ h6(String str, int i, Set set) {
        if (2 != (i & 2)) {
            u7g.V(i, 2, d6.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return Intrinsics.d(this.a, h6Var.a) && Intrinsics.d(this.b, h6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateTargetsState(trackId=");
        sb.append(this.a);
        sb.append(", targets=");
        return vz1.v(sb, this.b, ')');
    }
}
