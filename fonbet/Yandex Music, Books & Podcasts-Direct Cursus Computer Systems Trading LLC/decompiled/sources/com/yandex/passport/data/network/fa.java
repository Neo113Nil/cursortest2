package com.yandex.passport.data.network;

import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fa implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public fa(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, Long l) {
        str.getClass();
        str2.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.a.equals(faVar.a) && Intrinsics.d(this.b, faVar.b) && Intrinsics.d(this.c, faVar.c) && this.d.equals(faVar.d) && Intrinsics.d(this.e, faVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Long l = this.e;
        return c + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", clientSecret=");
        sb.append(this.c);
        sb.append(", masterTokenValue=");
        sb.append(this.d);
        sb.append(", locationId=");
        return tlm.k(sb, this.e, ')');
    }
}
