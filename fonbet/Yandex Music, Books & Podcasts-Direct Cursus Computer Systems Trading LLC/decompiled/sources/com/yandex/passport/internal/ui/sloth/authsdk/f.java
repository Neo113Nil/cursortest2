package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.eta;
import defpackage.k5r;

/* loaded from: classes4.dex */
public final class f implements g {
    public final String a;
    public final String b;
    public final long c;

    public f(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(accessToken=");
        sb.append(this.a);
        sb.append(", tokenType=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return eta.g(sb, this.c, ')');
    }
}
