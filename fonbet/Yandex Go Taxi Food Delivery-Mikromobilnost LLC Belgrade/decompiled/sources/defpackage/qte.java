package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qte implements ste {
    public final ovi0 a;
    public final String b;
    public final String c;
    public final List d;

    public qte(ovi0 ovi0Var, String str, String str2, List list) {
        this.a = ovi0Var;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // defpackage.ste
    public final ote a() {
        return jte.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qte)) {
            return false;
        }
        qte qteVar = (qte) obj;
        if (!jl40.l(this.a, qteVar.a) || !jl40.l(this.b, qteVar.b) || !jl40.l(this.c, qteVar.c) || !this.d.equals(qteVar.d)) {
            return false;
        }
        jte jteVar = jte.a;
        return jteVar.equals(jteVar);
    }

    public final int hashCode() {
        ovi0 ovi0Var = this.a;
        int hashCode = (ovi0Var == null ? 0 : ovi0Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return ((this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31) + 1804392403;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(imageTag=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        tse0.x(this.c, ", buttons=", ", closeClickAction=", sb, this.d);
        sb.append(jte.a);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
