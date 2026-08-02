package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nsv implements osv {
    public final String a;
    public final String b;
    public final jzb c;
    public final String d;

    public nsv(String str, String str2, jzb jzbVar, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jzbVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsv)) {
            return false;
        }
        nsv nsvVar = (nsv) obj;
        return Intrinsics.d(this.a, nsvVar.a) && Intrinsics.d(this.b, nsvVar.b) && this.c == nsvVar.c && Intrinsics.d(this.d, nsvVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        jzb jzbVar = this.c;
        int hashCode = (c + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31;
        String str = this.d;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Playing(trackId=", this.a, ", trackTitle=", this.b, ", explicitType=");
        m.append(this.c);
        m.append(", videoId=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
