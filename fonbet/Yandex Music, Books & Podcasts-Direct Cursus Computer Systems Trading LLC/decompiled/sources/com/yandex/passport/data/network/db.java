package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.eta;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class db {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public db(String str, String str2, String str3, String str4, String str5) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return Intrinsics.d(this.a, dbVar.a) && Intrinsics.d(this.b, dbVar.b) && Intrinsics.d(this.c, dbVar.c) && Intrinsics.d(this.d, dbVar.d) && Intrinsics.d(this.e, dbVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricSession(redirectUri=");
        sb.append(this.a);
        sb.append(", esiaSessionId=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", esiaCookie=");
        sb.append(this.d);
        sb.append(", tibHost=");
        return dfi.i(sb, this.e, ')');
    }
}
