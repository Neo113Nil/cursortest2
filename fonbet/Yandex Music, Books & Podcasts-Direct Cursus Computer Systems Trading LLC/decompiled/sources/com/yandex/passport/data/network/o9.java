package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.eta;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o9 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public o9(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4) {
        eta.r(str, str2, str3, str4);
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9)) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.a.equals(o9Var.a) && Intrinsics.d(this.b, o9Var.b) && Intrinsics.d(this.c, o9Var.c) && Intrinsics.d(this.d, o9Var.d) && Intrinsics.d(this.e, o9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", masterToken=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        return dfi.i(sb, this.e, ')');
    }
}
