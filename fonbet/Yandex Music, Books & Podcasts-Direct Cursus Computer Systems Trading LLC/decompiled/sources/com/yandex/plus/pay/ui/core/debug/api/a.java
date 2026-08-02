package com.yandex.plus.pay.ui.core.debug.api;

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
    public final boolean e;
    public final com.yandex.plus.core.config.a f;
    public final List g;

    public a(String str, String str2, String str3, String str4, boolean z, com.yandex.plus.core.config.a aVar, List list) {
        str4.getClass();
        aVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = aVar;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b) && this.c.equals(aVar.c) && Intrinsics.d(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && Intrinsics.d(this.g, aVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + k5r.e(k5r.c(k5r.c((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + 1986582804) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayDebugInfo(puid=");
        sb.append(this.a);
        sb.append(", deviceId=");
        sb.append(this.b);
        sb.append(", sdkVersion=110.0.0, appVersion=");
        sb.append(this.c);
        sb.append(", serviceName=");
        sb.append(this.d);
        sb.append(", isBdui=");
        sb.append(this.e);
        sb.append(", environment=");
        sb.append(this.f);
        sb.append(", activeFlags=");
        return eta.h(sb, this.g, ')');
    }
}
