package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j4 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public j4(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4) {
        str3.getClass();
        str4.getClass();
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
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.a.equals(j4Var.a) && this.b.equals(j4Var.b) && this.c.equals(j4Var.c) && Intrinsics.d(this.d, j4Var.d) && Intrinsics.d(this.e, j4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", cookies=");
        sb.append(this.b);
        sb.append(", cookieHost=");
        sb.append(this.c);
        sb.append(", clientId=");
        sb.append(this.d);
        sb.append(", clientSecret=");
        return dfi.i(sb, this.e, ')');
    }
}
