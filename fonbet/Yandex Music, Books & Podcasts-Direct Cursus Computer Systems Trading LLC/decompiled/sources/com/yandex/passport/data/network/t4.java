package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class t4 {

    @NotNull
    public static final s4 Companion = new s4();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ t4(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, r4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return Intrinsics.d(this.a, t4Var.a) && Intrinsics.d(this.b, t4Var.b) && this.c == t4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.c, ')');
    }
}
