package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class ec {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;

    public ec(com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return this.a.equals(ecVar.a) && this.b.equals(ecVar.b) && this.c.equals(ecVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        return dfi.i(sb, this.c, ')');
    }
}
