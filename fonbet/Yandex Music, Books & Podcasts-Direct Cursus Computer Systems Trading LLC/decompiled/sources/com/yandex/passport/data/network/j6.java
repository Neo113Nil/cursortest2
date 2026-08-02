package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j6 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;
    public final String d;

    public j6(com.yandex.passport.data.models.g gVar, long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = gVar;
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return this.a.equals(j6Var.a) && this.b == j6Var.b && Intrinsics.d(this.c, j6Var.c) && Intrinsics.d(this.d, j6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", host=");
        return dfi.i(sb, this.d, ')');
    }
}
