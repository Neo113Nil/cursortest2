package com.yandex.passport.data.network.token;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;

    public t(com.yandex.passport.data.models.g gVar, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && this.b.equals(tVar.b) && Intrinsics.d(this.c, tVar.c) && Intrinsics.d(this.d, tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", socialTaskId=");
        sb.append(this.b);
        sb.append(", decryptedId=");
        sb.append(this.c);
        sb.append(", decryptedSecret=");
        return dfi.i(sb, this.d, ')');
    }
}
