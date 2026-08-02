package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final String d;
    public final String e;

    public p(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        this.a = gVar;
        this.b = j;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b == pVar.b && Intrinsics.d(this.c, pVar.c) && Intrinsics.d(this.d, pVar.d) && Intrinsics.d(this.e, pVar.e);
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", returnUrl=");
        com.appsflyer.internal.k.y(sb, this.d, ", yandexUidCookieValue=");
        return dfi.i(sb, this.e, ')');
    }
}
