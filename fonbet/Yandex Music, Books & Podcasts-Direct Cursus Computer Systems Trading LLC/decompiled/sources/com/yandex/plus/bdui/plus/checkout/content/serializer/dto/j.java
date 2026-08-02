package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
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
public final class j implements q {

    @NotNull
    public static final i Companion = new i();
    public static final arf[] c = {null, btf.a(bwf.b, new y5(21))};
    public final double a;
    public final List b;

    public /* synthetic */ j(double d, int i, List list) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, h.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Double.compare(this.a, jVar.a) == 0 && Intrinsics.d(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinearGradient(angle=");
        sb.append(this.a);
        sb.append(", colors=");
        return eta.h(sb, this.b, ')');
    }
}
