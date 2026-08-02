package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public a(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && Intrinsics.d(this.e, aVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", masterClientId=");
        sb.append(this.b);
        sb.append(", masterClientSecret=");
        sb.append(this.c);
        sb.append(", codeValue=");
        sb.append(this.d);
        sb.append(", codeVerifier=");
        return dfi.i(sb, this.e, ')');
    }
}
