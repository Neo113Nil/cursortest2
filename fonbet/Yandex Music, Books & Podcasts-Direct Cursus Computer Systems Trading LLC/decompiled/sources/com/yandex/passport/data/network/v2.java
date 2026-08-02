package com.yandex.passport.data.network;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v2 {

    @NotNull
    public static final u2 Companion = new u2();
    public static final arf[] d = {null, null, btf.a(bwf.b, new com.yandex.passport.api.exception.l(19))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ v2(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, t2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Intrinsics.d(this.a, v2Var.a) && Intrinsics.d(this.b, v2Var.b) && Intrinsics.d(this.c, v2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppConfigurations(package=");
        sb.append(this.a);
        sb.append(", platform=");
        sb.append(this.b);
        sb.append(", badges=");
        return eta.h(sb, this.c, ')');
    }
}
