package com.yandex.passport.data.network;

import defpackage.eta;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class h4 {

    @NotNull
    public static final g4 Companion = new g4();
    public final String a;
    public final Long b;
    public final String c;
    public final long d;

    public /* synthetic */ h4(int i, String str, Long l, String str2, long j) {
        if (13 != (i & 13)) {
            u7g.V(i, 13, f4.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return Intrinsics.d(this.a, h4Var.a) && Intrinsics.d(this.b, h4Var.b) && Intrinsics.d(this.c, h4Var.c) && this.d == h4Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Long.hashCode(this.d) + k5r.c((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(accessToken=");
        sb.append(this.a);
        sb.append(", expiresIn=");
        sb.append(this.b);
        sb.append(", tokenType=");
        sb.append(this.c);
        sb.append(", uid=");
        return eta.g(sb, this.d, ')');
    }
}
