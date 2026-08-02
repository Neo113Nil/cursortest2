package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class n4 {

    @NotNull
    public static final m4 Companion = new m4();
    public final String a;
    public final String b;
    public final int c;

    public /* synthetic */ n4(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, l4.a.getDescriptor());
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
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return Intrinsics.d(this.a, n4Var.a) && Intrinsics.d(this.b, n4Var.b) && this.c == n4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", codeValue=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.c, ')');
    }
}
