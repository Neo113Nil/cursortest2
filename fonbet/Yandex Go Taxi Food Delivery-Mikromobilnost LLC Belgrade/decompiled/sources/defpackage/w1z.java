package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class w1z implements y1z, ap5 {
    public final String a;
    public final zo5 b;
    public final long c;
    public final int d;

    public w1z(String str, zo5 zo5Var, long j, int i) {
        this.a = str;
        this.b = zo5Var;
        this.c = j;
        this.d = i;
    }

    public static w1z e(w1z w1zVar, zo5 zo5Var, int i) {
        String str = w1zVar.a;
        if ((i & 2) != 0) {
            zo5Var = w1zVar.b;
        }
        return new w1z(str, zo5Var, w1zVar.c, (i & 8) != 0 ? w1zVar.d : 0);
    }

    @Override // defpackage.ap5
    public final zo5 a() {
        return this.b;
    }

    @Override // defpackage.y1z
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ap5
    public final long c() {
        return this.c;
    }

    @Override // defpackage.ap5
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1z)) {
            return false;
        }
        w1z w1zVar = (w1z) obj;
        return jl40.l(this.a, w1zVar.a) && jl40.l(this.b, w1zVar.b) && this.c == w1zVar.c && this.d == w1zVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(bidId=");
        sb.append(this.a);
        sb.append(", bidInfo=");
        sb.append(this.b);
        sb.append(", bidCreatedTime=");
        vfc.y(sb, this.c, ", cancelTtlSeconds=", this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
