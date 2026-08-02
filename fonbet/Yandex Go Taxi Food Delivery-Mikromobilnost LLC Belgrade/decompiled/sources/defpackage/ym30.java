package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ym30 implements bn30 {
    public final String a;
    public final String b;
    public final String c;
    public final zzs d;
    public final pj40 e;

    public ym30(String str, String str2, String str3, zzs zzsVar, pj40 pj40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzsVar;
        this.e = pj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym30)) {
            return false;
        }
        ym30 ym30Var = (ym30) obj;
        return jl40.l(this.a, ym30Var.a) && jl40.l(this.b, ym30Var.b) && jl40.l(this.c, ym30Var.c) && jl40.l(this.d, ym30Var.d) && jl40.l(this.e, ym30Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        zzs zzsVar = this.d;
        return this.e.hashCode() + ((b + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RouteModal(stopId=", this.a, ", lineId=", this.b, ", threadId=");
        v.append(this.c);
        v.append(", stopPoint=");
        v.append(this.d);
        v.append(", utmParams=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
