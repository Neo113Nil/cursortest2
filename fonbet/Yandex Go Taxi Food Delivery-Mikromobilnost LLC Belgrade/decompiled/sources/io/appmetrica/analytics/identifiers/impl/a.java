package io.appmetrica.analytics.identifiers.impl;

import defpackage.jl40;
import defpackage.oo31;

/* loaded from: classes9.dex */
public final class a {
    public final String a;
    public final String b;
    public final Boolean c;

    public a(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvIdInfo(provider=");
        sb.append(this.a);
        sb.append(", advId=");
        sb.append(this.b);
        sb.append(", limitedAdTracking=");
        return oo31.i(sb, this.c, ')');
    }
}
