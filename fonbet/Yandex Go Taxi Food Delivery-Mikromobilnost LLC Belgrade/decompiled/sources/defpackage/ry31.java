package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ry31 extends sy31 {
    public final hfb0 a;
    public final viv b;
    public final String c;

    public ry31(hfb0 hfb0Var, viv vivVar, String str) {
        this.a = hfb0Var;
        this.b = vivVar;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final hfb0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry31)) {
            return false;
        }
        ry31 ry31Var = (ry31) obj;
        return this.a.equals(ry31Var.a) && jl40.l(this.b, ry31Var.b) && jl40.l(this.c, ry31Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        viv vivVar = this.b;
        int hashCode2 = (hashCode + (vivVar == null ? 0 : vivVar.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(phoneNumber=");
        sb.append(this.a);
        sb.append(", inAppCallInfo=");
        sb.append(this.b);
        sb.append(", extension=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
