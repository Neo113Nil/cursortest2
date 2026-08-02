package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final String c;

    public b2(com.yandex.passport.data.models.g gVar, long j, String str) {
        str.getClass();
        this.a = gVar;
        this.b = j;
        this.c = str;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return this.a.equals(b2Var.a) && this.b == b2Var.b && Intrinsics.d(this.c, b2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        return dfi.i(sb, this.c, ')');
    }
}
