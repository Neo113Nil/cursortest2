package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ y3(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, w3.a.getDescriptor());
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
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return Intrinsics.d(this.a, y3Var.a) && Intrinsics.d(this.b, y3Var.b) && this.c == y3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(status=");
        sb.append(this.a);
        sb.append(", codeValue=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.c, ')');
    }
}
