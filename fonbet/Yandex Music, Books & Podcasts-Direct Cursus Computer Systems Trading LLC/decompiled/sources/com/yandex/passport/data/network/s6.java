package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s6 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final boolean c;
    public final String d;

    public s6(com.yandex.passport.data.models.g gVar, String str, String str2, boolean z) {
        str2.getClass();
        this.a = gVar;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return this.a.equals(s6Var.a) && Intrinsics.d(this.b, s6Var.b) && this.c == s6Var.c && Intrinsics.d(this.d, s6Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        String str = this.b;
        return this.d.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", deviceName=");
        sb.append(this.b);
        sb.append(", clientBound=");
        sb.append(this.c);
        sb.append(", clientId=");
        return dfi.i(sb, this.d, ')');
    }
}
