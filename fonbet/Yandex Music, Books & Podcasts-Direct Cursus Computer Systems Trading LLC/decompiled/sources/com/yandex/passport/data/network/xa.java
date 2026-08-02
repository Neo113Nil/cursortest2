package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class xa {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final boolean d;

    public xa(com.yandex.passport.data.models.g gVar, String str, String str2, boolean z) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return this.a.equals(xaVar.a) && this.b.equals(xaVar.b) && this.c.equals(xaVar.c) && this.d == xaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", code=");
        sb.append(this.c);
        sb.append(", authBySms=");
        return dfi.j(sb, this.d, ')');
    }
}
