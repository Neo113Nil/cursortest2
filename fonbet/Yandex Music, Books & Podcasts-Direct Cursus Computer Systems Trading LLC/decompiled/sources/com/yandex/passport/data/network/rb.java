package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rb implements com.yandex.passport.data.network.core.u {
    public final com.yandex.passport.common.account.a a;
    public final com.yandex.passport.data.models.g b;
    public final long c;
    public final String d;
    public final String e;

    public rb(long j, com.yandex.passport.common.account.a aVar, com.yandex.passport.data.models.g gVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = aVar;
        this.b = gVar;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    @Override // com.yandex.passport.data.network.core.u
    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return Intrinsics.d(this.a, rbVar.a) && this.b.equals(rbVar.b) && this.c == rbVar.c && Intrinsics.d(this.d, rbVar.d) && Intrinsics.d(this.e, rbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(tlm.c(this.c, f1d.a(this.b.a, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(masterToken=");
        sb.append(this.a);
        sb.append(", environment=");
        sb.append(this.b);
        sb.append(", locationId=");
        sb.append(this.c);
        sb.append(", service=");
        sb.append(this.d);
        sb.append(", brand=");
        return dfi.i(sb, this.e, ')');
    }
}
