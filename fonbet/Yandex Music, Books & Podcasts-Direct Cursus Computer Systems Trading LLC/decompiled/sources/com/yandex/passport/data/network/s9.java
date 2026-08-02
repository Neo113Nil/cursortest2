package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s9 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public s9(com.yandex.passport.data.models.g gVar, long j, com.yandex.passport.common.account.a aVar, String str, String str2, boolean z, boolean z2) {
        aVar.getClass();
        str.getClass();
        this.a = gVar;
        this.b = j;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = z2;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return this.a.equals(s9Var.a) && this.b == s9Var.b && Intrinsics.d(this.c, s9Var.c) && Intrinsics.d(this.d, s9Var.d) && Intrinsics.d(this.e, s9Var.e) && this.f == s9Var.f && this.g == s9Var.g;
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + k5r.e((((c + (str == null ? 0 : str.hashCode())) * 31) + 1618715641) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", pushToken=");
        sb.append(this.d);
        sb.append(", pushPlatform=");
        sb.append(this.e);
        sb.append(", sdkVersion=7.54.1, pushesEnabledOnDevice=");
        sb.append(this.f);
        sb.append(", userIdLoggedIn=");
        return dfi.j(sb, this.g, ')');
    }
}
