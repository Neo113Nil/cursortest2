package com.yandex.passport.sloth.command.data;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public static final arf[] c = {null, btf.a(bwf.b, new k0(1))};
    public final String a;
    public final Map b;

    public /* synthetic */ t0(String str, int i, Map map) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.a, t0Var.a) && Intrinsics.d(this.b, t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMetricsData(identifier=");
        sb.append(this.a);
        sb.append(", params=");
        return k5r.p(sb, this.b, ')');
    }
}
