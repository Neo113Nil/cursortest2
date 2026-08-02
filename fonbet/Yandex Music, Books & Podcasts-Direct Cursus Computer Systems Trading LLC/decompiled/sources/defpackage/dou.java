package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dou {
    public final String a;
    public final s9p b;
    public final String c;
    public final String d;

    public dou(String str, s9p s9pVar, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = s9pVar;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dou)) {
            return false;
        }
        dou douVar = (dou) obj;
        return Intrinsics.d(this.a, douVar.a) && this.b.equals(douVar.b) && Intrinsics.d(this.c, douVar.c) && Intrinsics.d(this.d, douVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaveDomainItem(stationId=");
        sb.append(this.a);
        sb.append(", seeds=");
        sb.append(this.b);
        sb.append(", title=");
        return ouj.q(sb, this.c, ", header=", this.d, ")");
    }
}
