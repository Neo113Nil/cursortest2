package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v611 implements h711 {
    public final u611 a;
    public final h911 b;
    public final String c;

    public v611(u611 u611Var, h911 h911Var, String str) {
        this.a = u611Var;
        this.b = h911Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v611)) {
            return false;
        }
        v611 v611Var = (v611) obj;
        return jl40.l(this.a, v611Var.a) && this.b.equals(v611Var.b) && this.c.equals(v611Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiFeedbackSection(taxiFeedback=");
        sb.append(this.a);
        sb.append(", transportType=");
        sb.append(this.b);
        sb.append(", id=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
