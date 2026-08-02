package com.yandex.plus.pay.graphql.offers;

import defpackage.dfi;
import defpackage.k5r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Set e;
    public final String f;

    public f(String str, String str2, String str3, String str4, Set set, String str5) {
        dfi.s(str3, str4, str5);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = set;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && Intrinsics.d(this.c, fVar.c) && Intrinsics.d(this.d, fVar.d) && Intrinsics.d(this.e, fVar.e) && Intrinsics.d(this.f, fVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int c = k5r.c(k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 29791, this.d);
        Set set = this.e;
        return this.f.hashCode() + ((c + (set != null ? set.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersCacheKey(puid=");
        sb.append(this.a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", target=");
        sb.append(this.d);
        sb.append(", tariffId=null, optionsIds=null, features=");
        sb.append(this.e);
        sb.append(", transitionLanguage=");
        return dfi.i(sb, this.f, ')');
    }
}
