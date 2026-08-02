package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u1 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u1(com.yandex.passport.data.models.g gVar, long j, String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.a.equals(u1Var.a) && this.b == u1Var.b && Intrinsics.d(this.c, u1Var.c) && Intrinsics.d(this.d, u1Var.d) && Intrinsics.d(this.e, u1Var.e) && this.f.equals(u1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + k5r.c(k5r.c(k5r.c(tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", userCode=");
        sb.append(this.d);
        sb.append(", clientId=");
        sb.append(this.e);
        sb.append(", language=");
        return dfi.i(sb, this.f, ')');
    }
}
