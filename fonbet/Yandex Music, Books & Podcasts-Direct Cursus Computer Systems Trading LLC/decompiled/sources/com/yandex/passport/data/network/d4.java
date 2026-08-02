package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d4 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public d4(com.yandex.passport.data.models.g gVar, long j, com.yandex.passport.common.account.a aVar, String str, String str2, String str3, String str4) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = gVar;
        this.b = j;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return this.a.equals(d4Var.a) && this.b == d4Var.b && Intrinsics.d(this.c, d4Var.c) && Intrinsics.d(this.d, d4Var.d) && Intrinsics.d(this.e, d4Var.e) && Intrinsics.d(this.f, d4Var.f) && Intrinsics.d(this.g, d4Var.g);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c((this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", clientId=");
        sb.append(this.d);
        sb.append(", clientSecret=");
        sb.append(this.e);
        sb.append(", applicationPackageName=");
        sb.append(this.f);
        sb.append(", applicationVersion=");
        return dfi.i(sb, this.g, ')');
    }
}
