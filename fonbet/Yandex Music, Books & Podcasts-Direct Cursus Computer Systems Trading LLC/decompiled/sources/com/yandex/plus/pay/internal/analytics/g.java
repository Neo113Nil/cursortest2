package com.yandex.plus.pay.internal.analytics;

import defpackage.dfi;
import defpackage.k5r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final String a;
    public final String b;
    public final boolean c;

    public g(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b) && this.c == gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalAnalyticsParams(clientSource=");
        sb.append(this.a);
        sb.append(", clientSubSource=");
        sb.append(this.b);
        sb.append(", isPlusHome=");
        return dfi.j(sb, this.c, ')');
    }
}
