package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class q7 {

    @NotNull
    public static final p7 Companion = new p7();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;

    public /* synthetic */ q7(int i, String str, String str2, String str3, String str4, String str5, long j, String str6) {
        if (95 != (i & 95)) {
            u7g.V(i, 95, o7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if ((i & 32) == 0) {
            this.f = 2147483647L;
        } else {
            this.f = j;
        }
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return Intrinsics.d(this.a, q7Var.a) && Intrinsics.d(this.b, q7Var.b) && Intrinsics.d(this.c, q7Var.c) && Intrinsics.d(this.d, q7Var.d) && Intrinsics.d(this.e, q7Var.e) && this.f == q7Var.f && Intrinsics.d(this.g, q7Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + tlm.c(this.f, k5r.c(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(status=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", csrfToken=");
        sb.append(this.d);
        sb.append(", userCode=");
        sb.append(this.e);
        sb.append(", expiresIn=");
        sb.append(this.f);
        sb.append(", verificationUrl=");
        return dfi.i(sb, this.g, ')');
    }
}
