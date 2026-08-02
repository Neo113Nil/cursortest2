package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.eta;
import defpackage.f1d;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.passport.data.models.g d;
    public final long e;

    public k0(String str, String str2, String str3, com.yandex.passport.data.models.g gVar, long j) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gVar;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.a, k0Var.a) && Intrinsics.d(this.b, k0Var.b) && Intrinsics.d(this.c, k0Var.c) && this.d.equals(k0Var.d) && this.e == k0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + f1d.a(this.d.a, k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(parentMasterTokenValue=");
        sb.append(this.a);
        sb.append(", childMasterTokenValue=");
        sb.append(this.b);
        sb.append(", masterClientId=");
        sb.append(this.c);
        sb.append(", environment=");
        sb.append(this.d);
        sb.append(", locationId=");
        return eta.g(sb, this.e, ')');
    }
}
