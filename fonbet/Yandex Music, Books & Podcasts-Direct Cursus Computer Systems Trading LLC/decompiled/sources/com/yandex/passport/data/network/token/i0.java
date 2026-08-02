package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;

    public i0(com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a.equals(i0Var.a) && Intrinsics.d(this.b, i0Var.b) && Intrinsics.d(this.c, i0Var.c) && Intrinsics.d(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", decryptedId=");
        sb.append(this.c);
        sb.append(", decryptedSecret=");
        return dfi.i(sb, this.d, ')');
    }
}
