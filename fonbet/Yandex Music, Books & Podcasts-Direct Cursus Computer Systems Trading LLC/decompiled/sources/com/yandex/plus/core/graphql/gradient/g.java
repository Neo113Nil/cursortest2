package com.yandex.plus.core.graphql.gradient;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class g extends k {

    @NotNull
    public static final f Companion = new f();
    public static final arf[] d = {btf.a(bwf.b, new s(5)), null};
    public final List b;
    public final double c;

    public /* synthetic */ g(double d2, int i, List list) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, e.a.getDescriptor());
            throw null;
        }
        this.b = list;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.b, gVar.b) && Double.compare(this.c, gVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinearGradientResponse(colors=");
        sb.append(this.b);
        sb.append(", angle=");
        return k5r.n(sb, this.c, ')');
    }
}
