package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ia implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.data.models.g a;
    public final long b;
    public final com.yandex.passport.common.account.a c;
    public final String d;
    public final String e;
    public final String f;

    public ia(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        aVar.getClass();
        str.getClass();
        this.a = gVar;
        this.b = j;
        this.c = aVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia)) {
            return false;
        }
        ia iaVar = (ia) obj;
        return this.a.equals(iaVar.a) && this.b == iaVar.b && Intrinsics.d(this.c, iaVar.c) && Intrinsics.d(this.d, iaVar.d) && Intrinsics.d(this.e, iaVar.e) && this.f.equals(iaVar.f);
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + tlm.c(this.b, Integer.hashCode(this.a.a) * 31, 31)) * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=");
        sb.append(this.b);
        sb.append(", masterToken=");
        sb.append(this.c);
        sb.append(", trackId=");
        sb.append(this.d);
        sb.append(", extra=");
        sb.append(this.e);
        sb.append(", extraTag=");
        return dfi.i(sb, this.f, ')');
    }
}
