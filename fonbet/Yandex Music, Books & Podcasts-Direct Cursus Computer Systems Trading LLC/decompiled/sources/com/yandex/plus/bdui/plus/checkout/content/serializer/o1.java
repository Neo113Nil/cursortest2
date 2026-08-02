package com.yandex.plus.bdui.plus.checkout.content.serializer;

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
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();
    public static final arf[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{null, btf.a(bwfVar, new q0(2)), btf.a(bwfVar, new q0(3))};
    }

    public /* synthetic */ o1(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, m1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.d(this.a, o1Var.a) && Intrinsics.d(this.b, o1Var.b) && Intrinsics.d(this.c, o1Var.c);
    }

    public final int hashCode() {
        int d2 = k5r.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return d2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentButtonGroupDto(title=");
        sb.append(this.a);
        sb.append(", paymentButtons=");
        sb.append(this.b);
        sb.append(", paymentPromoBadges=");
        return eta.h(sb, this.c, ')');
    }
}
