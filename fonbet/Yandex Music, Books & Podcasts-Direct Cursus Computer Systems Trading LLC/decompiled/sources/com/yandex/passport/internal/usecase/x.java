package com.yandex.passport.internal.usecase;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {
    public final com.yandex.passport.common.account.a a;
    public final com.yandex.passport.common.core.b b;
    public final long c;
    public final String d;
    public final String e;

    public x(com.yandex.passport.common.account.a aVar, com.yandex.passport.common.core.b bVar, long j, String str, String str2) {
        aVar.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = bVar;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.a, xVar.a) && this.b == xVar.b && this.c == xVar.c && this.d.equals(xVar.d) && Intrinsics.d(this.e, xVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(tlm.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", eTag=");
        return dfi.i(sb, this.e, ')');
    }
}
