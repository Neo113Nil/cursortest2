package com.yandex.passport.data.network;

import defpackage.dfi;
import defpackage.eta;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public e(com.yandex.passport.data.models.g gVar, String str, String str2, String str3, String str4, String str5) {
        eta.r(str, str2, str4, str5);
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && Intrinsics.d(this.b, eVar.b) && Intrinsics.d(this.c, eVar.c) && Intrinsics.d(this.d, eVar.d) && Intrinsics.d(this.e, eVar.e) && Intrinsics.d(this.f, eVar.f);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + k5r.c((c + (str == null ? 0 : str.hashCode())) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", password=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        sb.append(", captchaAnswer=null, clientId=");
        sb.append(this.e);
        sb.append(", passwordSource=");
        return dfi.i(sb, this.f, ')');
    }
}
