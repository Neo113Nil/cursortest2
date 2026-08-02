package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zau extends s151 {
    public final pau a;
    public final ocu b;
    public final boolean c;
    public final Object d;
    public final String e;

    public zau(pau pauVar, ocu ocuVar, boolean z, Object obj, String str) {
        this.a = pauVar;
        this.b = ocuVar;
        this.c = z;
        this.d = obj;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zau)) {
            return false;
        }
        zau zauVar = (zau) obj;
        return jl40.l(this.a, zauVar.a) && jl40.l(this.b, zauVar.b) && this.c == zauVar.c && jl40.l(this.d, zauVar.d) && jl40.l(this.e, zauVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ocu ocuVar = this.b;
        int e = unr0.e((hashCode + (ocuVar == null ? 0 : ocuVar.hashCode())) * 31, 31, this.c);
        Object obj = this.d;
        int hashCode2 = (e + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderModel(lead=");
        sb.append(this.a);
        sb.append(", trail=");
        sb.append(this.b);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(this.c);
        sb.append(", meta=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
