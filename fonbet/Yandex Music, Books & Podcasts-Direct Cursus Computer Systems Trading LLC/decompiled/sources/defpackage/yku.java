package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yku {
    public final s9p a;
    public final String b;
    public final String c;
    public final String d;
    public final xku e;

    public yku(s9p s9pVar, String str, String str2, String str3, xku xkuVar) {
        s9pVar.getClass();
        str.getClass();
        str2.getClass();
        this.a = s9pVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = xkuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yku)) {
            return false;
        }
        yku ykuVar = (yku) obj;
        return Intrinsics.d(this.a, ykuVar.a) && Intrinsics.d(this.b, ykuVar.b) && Intrinsics.d(this.c, ykuVar.c) && Intrinsics.d(this.d, ykuVar.d) && this.e == ykuVar.e;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Wave(seeds=");
        sb.append(this.a);
        sb.append(", idForFrom=");
        sb.append(this.b);
        sb.append(", name=");
        su4.v(sb, this.c, ", description=", this.d, ", type=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
