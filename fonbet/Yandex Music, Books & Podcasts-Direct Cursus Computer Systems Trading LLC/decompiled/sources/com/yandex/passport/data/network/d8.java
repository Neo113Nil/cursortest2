package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d8 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;

    public d8(com.yandex.passport.data.models.g gVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return this.a.equals(d8Var.a) && Intrinsics.d(this.b, d8Var.b) && Intrinsics.d(this.c, d8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", crsfToken=");
        return dfi.i(sb, this.c, ')');
    }
}
