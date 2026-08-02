package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class v1z implements y1z, ap5 {
    public final String a;
    public final zo5 b;
    public final long c;
    public final int d;

    public v1z(String str, zo5 zo5Var, long j, int i) {
        this.a = str;
        this.b = zo5Var;
        this.c = j;
        this.d = i;
    }

    public static v1z e(v1z v1zVar, zo5 zo5Var, int i) {
        String str = v1zVar.a;
        if ((i & 2) != 0) {
            zo5Var = v1zVar.b;
        }
        return new v1z(str, zo5Var, v1zVar.c, (i & 8) != 0 ? v1zVar.d : 0);
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
        if (!(obj instanceof v1z)) {
            return false;
        }
        v1z v1zVar = (v1z) obj;
        return jl40.l(this.a, v1zVar.a) && jl40.l(this.b, v1zVar.b) && this.c == v1zVar.c && this.d == v1zVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Canceled(bidId=");
        sb.append(this.a);
        sb.append(", bidInfo=");
        sb.append(this.b);
        sb.append(", bidCreatedTime=");
        vfc.y(sb, this.c, ", cancelTtlSeconds=", this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
