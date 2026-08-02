package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f7 implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final String d;

    public f7(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str) {
        aVar.getClass();
        str.getClass();
        this.a = gVar;
        this.b = j;
        this.c = aVar;
        this.d = str;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return this.a.equals(f7Var.a) && this.b == f7Var.b && Intrinsics.d(this.c, f7Var.c) && Intrinsics.d(this.d, f7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", trackId=");
        return dfi.i(sb, this.d, ')');
    }
}
