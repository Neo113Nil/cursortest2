package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vvs0 implements fws0 {
    public final f5v a;
    public final String b;
    public final String c;

    public vvs0(f5v f5vVar, String str, String str2) {
        this.a = f5vVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvs0)) {
            return false;
        }
        vvs0 vvs0Var = (vvs0) obj;
        return this.a.equals(vvs0Var.a) && jl40.l(this.b, vvs0Var.b) && jl40.l(this.c, vvs0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailIconSpot(iconSpot=");
        sb.append(this.a);
        sb.append(", metricaLabel=");
        sb.append(this.b);
        sb.append(", presentationId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
