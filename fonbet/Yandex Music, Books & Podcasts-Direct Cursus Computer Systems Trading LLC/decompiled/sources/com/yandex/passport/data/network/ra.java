package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ra {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public ra(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4, String str5, boolean z) {
        dfi.s(str, str3, str5);
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return this.a.equals(raVar.a) && Intrinsics.d(this.b, raVar.b) && Intrinsics.d(this.c, raVar.c) && Intrinsics.d(this.d, raVar.d) && Intrinsics.d(this.e, raVar.e) && Intrinsics.d(this.f, raVar.f) && this.g == raVar.g;
    }

    public final int hashCode() {
        int c = k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b);
        String str = this.c;
        int c2 = k5r.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        return Boolean.hashCode(this.g) + ((((this.f.hashCode() + ((c2 + (this.e != null ? r3.hashCode() : 0)) * 31)) * 31) - 1374620303) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.e);
        sb.append(", packageName=");
        sb.append(this.f);
        sb.append(", confirmMethod=by_sms, authBySms=");
        return dfi.j(sb, this.g, ')');
    }
}
