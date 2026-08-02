package com.yandex.passport.sloth;

import defpackage.eta;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class d implements b1 {
    public final String a;
    public final String b;
    public final long c;

    public d(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothAuthSdkResult(accessToken=");
        sb.append(this.a);
        sb.append(", tokenType=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return eta.g(sb, this.c, ')');
    }
}
