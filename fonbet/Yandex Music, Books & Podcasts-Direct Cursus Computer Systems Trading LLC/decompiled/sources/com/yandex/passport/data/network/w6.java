package com.yandex.passport.data.network;

import defpackage.f1d;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class w6 {

    @NotNull
    public static final v6 Companion = new v6();
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public /* synthetic */ w6(int i, String str, String str2, String str3, int i2, int i3) {
        if (11 != (i & 11)) {
            u7g.V(i, 11, u6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = i2;
        if ((i & 16) == 0) {
            this.e = Integer.MAX_VALUE;
        } else {
            this.e = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.d(this.a, w6Var.a) && Intrinsics.d(this.b, w6Var.b) && Intrinsics.d(this.c, w6Var.c) && this.d == w6Var.d && this.e == w6Var.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.e) + f1d.a(this.d, (c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(deviceCode=");
        sb.append(this.a);
        sb.append(", userCode=");
        sb.append(this.b);
        sb.append(", verificationUrl=");
        sb.append(this.c);
        sb.append(", interval=");
        sb.append(this.d);
        sb.append(", expiresIn=");
        return vz1.r(sb, this.e, ')');
    }
}
