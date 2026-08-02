package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;

    public g(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, long j, String str4, String str5) {
        str4.getClass();
        str5.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b) && this.c.equals(gVar.c) && Intrinsics.d(this.d, gVar.d) && this.e == gVar.e && Intrinsics.d(this.f, gVar.f) && Intrinsics.d(this.g, gVar.g);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.g.hashCode() + k5r.c(tlm.c(this.e, (c + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", cookieHost=");
        sb.append(this.b);
        sb.append(", cookies=");
        sb.append(this.c);
        sb.append(", trackId=");
        sb.append(this.d);
        sb.append(", locationId=");
        sb.append(this.e);
        sb.append(", clientId=");
        sb.append(this.f);
        sb.append(", clientSecret=");
        return dfi.i(sb, this.g, ')');
    }
}
