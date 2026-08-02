package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class u1z implements y1z, ap5 {
    public final String a;
    public final zo5 b;
    public final long c;
    public final int d;

    public u1z(String str, zo5 zo5Var, long j, int i) {
        this.a = str;
        this.b = zo5Var;
        this.c = j;
        this.d = i;
    }

    public static u1z e(u1z u1zVar, zo5 zo5Var, int i) {
        String str = u1zVar.a;
        if ((i & 2) != 0) {
            zo5Var = u1zVar.b;
        }
        return new u1z(str, zo5Var, u1zVar.c, (i & 8) != 0 ? u1zVar.d : 0);
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
        if (!(obj instanceof u1z)) {
            return false;
        }
        u1z u1zVar = (u1z) obj;
        return jl40.l(this.a, u1zVar.a) && jl40.l(this.b, u1zVar.b) && this.c == u1zVar.c && this.d == u1zVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Active(bidId=");
        sb.append(this.a);
        sb.append(", bidInfo=");
        sb.append(this.b);
        sb.append(", bidCreatedTime=");
        vfc.y(sb, this.c, ", cancelTtlSeconds=", this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
