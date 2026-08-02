package com.yandex.passport.data.network;

import defpackage.eta;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z6 {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final com.yandex.passport.common.account.a e;
    public final long f;

    public z6(com.yandex.passport.data.models.g gVar, long j, String str, String str2, com.yandex.passport.common.account.a aVar, long j2) {
        str.getClass();
        str2.getClass();
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = aVar;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return this.a.equals(z6Var.a) && this.b == z6Var.b && Intrinsics.d(this.c, z6Var.c) && Intrinsics.d(this.d, z6Var.d) && Intrinsics.d(this.e, z6Var.e) && this.f == z6Var.f;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31), 31, this.c), 31, this.d);
        com.yandex.passport.common.account.a aVar = this.e;
        return Long.hashCode(this.f) + ((c + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", clientId=");
        sb.append(this.c);
        sb.append(", clientSecret=");
        sb.append(this.d);
        sb.append(", masterToken=");
        sb.append(this.e);
        sb.append(", uid=");
        return eta.g(sb, this.f, ')');
    }
}
