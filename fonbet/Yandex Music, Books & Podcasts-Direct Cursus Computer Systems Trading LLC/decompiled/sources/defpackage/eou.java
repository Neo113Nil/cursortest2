package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eou {
    public final String a;
    public final s9p b;
    public final String c;
    public final String d;
    public final np e;
    public final dou f;

    public eou(String str, s9p s9pVar, String str2, String str3, np npVar) {
        this.a = str;
        this.b = s9pVar;
        this.c = str2;
        this.d = str3;
        this.e = npVar;
        this.f = new dou(str, s9pVar, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eou)) {
            return false;
        }
        eou eouVar = (eou) obj;
        return this.a.equals(eouVar.a) && this.b.equals(eouVar.b) && this.c.equals(eouVar.c) && this.d.equals(eouVar.d) && Intrinsics.d(this.e, eouVar.e);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d);
        np npVar = this.e;
        return c + (npVar == null ? 0 : npVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaveDomainItemWithAgent(stationId=");
        sb.append(this.a);
        sb.append(", seeds=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", header=", this.d, ", agent=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
