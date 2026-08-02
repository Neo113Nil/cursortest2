package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.eta;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class g4 {

    @NotNull
    public static final f4 Companion = new f4();
    public static final arf[] e;
    public final long a;
    public final String b;
    public final w1 c;
    public final List d;

    static {
        bwf bwfVar = bwf.b;
        e = new arf[]{null, null, btf.a(bwfVar, new c1(17)), btf.a(bwfVar, new c1(18))};
    }

    public g4(int i, long j, String str, w1 w1Var, List list) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, e4.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = w1.b;
        } else {
            this.c = w1Var;
        }
        if ((i & 8) == 0) {
            this.d = c5b.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.a == g4Var.a && Intrinsics.d(this.b, g4Var.b) && this.c == g4Var.c && Intrinsics.d(this.d, g4Var.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatusDto(uid=");
        sb.append(this.a);
        sb.append(", login=");
        sb.append(this.b);
        sb.append(", familyRole=");
        sb.append(this.c);
        sb.append(", features=");
        return eta.h(sb, this.d, ')');
    }
}
