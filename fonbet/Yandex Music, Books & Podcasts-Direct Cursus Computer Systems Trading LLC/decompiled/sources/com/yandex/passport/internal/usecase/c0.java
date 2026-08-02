package com.yandex.passport.internal.usecase;

import defpackage.e5b;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 {
    public final com.yandex.passport.internal.ui.a a;
    public final Locale b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Map f;
    public final com.yandex.passport.common.core.c g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(com.yandex.passport.common.core.f fVar, Locale locale, String str, String str2, Map map, com.yandex.passport.common.core.c cVar, int i) {
        this(new b0(fVar), locale, str, r4, r5, r6, r7);
        String str3 = (i & 8) != 0 ? null : str2;
        boolean z = (i & 16) == 0;
        if ((i & 32) != 0) {
            map = e5b.a;
            map.getClass();
        }
        Map map2 = map;
        com.yandex.passport.common.core.c cVar2 = (i & 64) != 0 ? com.yandex.passport.common.core.c.a : cVar;
        fVar.getClass();
        str.getClass();
        map2.getClass();
        cVar2.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.a, c0Var.a) && Intrinsics.d(this.b, c0Var.b) && Intrinsics.d(this.c, c0Var.c) && Intrinsics.d(this.d, c0Var.d) && this.e == c0Var.e && Intrinsics.d(this.f, c0Var.f) && this.g == c0Var.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Locale locale = this.b;
        int c = k5r.c((hashCode + (locale == null ? 0 : locale.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return this.g.hashCode() + f1d.b(this.f, k5r.e((c + (str != null ? str.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(accountSpec=");
        sb.append(this.a);
        sb.append(", locale=");
        sb.append(this.b);
        sb.append(", returnUrl=");
        com.appsflyer.internal.k.y(sb, this.c, ", tld=");
        sb.append(this.d);
        sb.append(", isForceRequiredHost=");
        sb.append(this.e);
        sb.append(", analyticsMap=");
        sb.append(this.f);
        sb.append(", frontendUrlType=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    public c0(com.yandex.passport.internal.ui.a aVar, Locale locale, String str, String str2, boolean z, Map map, com.yandex.passport.common.core.c cVar) {
        str.getClass();
        map.getClass();
        cVar.getClass();
        this.a = aVar;
        this.b = locale;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = map;
        this.g = cVar;
    }
}
