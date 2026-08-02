package com.yandex.plus.pay.ui.core.debug.internal.domain.info;

import android.os.Build;
import defpackage.eta;
import defpackage.k5r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final com.yandex.plus.core.config.a g;
    public final List h;

    public a(String str, String str2, String str3, String str4, String str5, boolean z, com.yandex.plus.core.config.a aVar, List list) {
        Build.VERSION.RELEASE.getClass();
        str5.getClass();
        aVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = aVar;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b) || !this.c.equals(aVar.c)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return Intrinsics.d(str, str) && this.d.equals(aVar.d) && Intrinsics.d(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && Intrinsics.d(this.h, aVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + k5r.e(k5r.c((((this.d.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.VERSION.RELEASE)) * 31) + 1986582804) * 31, 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugInfo(puid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", deviceModel=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", appVersion=");
        sb.append(this.d);
        sb.append(", sdkVersion=110.0.0, serviceName=");
        sb.append(this.e);
        sb.append(", isBdui=");
        sb.append(this.f);
        sb.append(", environment=");
        sb.append(this.g);
        sb.append(", activeFlags=");
        return eta.h(sb, this.h, ')');
    }
}
