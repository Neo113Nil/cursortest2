package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q5n extends n351 {
    public final v4v c;
    public final cyu0 d;
    public final cyu0 e;
    public final h8j f;
    public final String g;

    public q5n(ra90 ra90Var, cyu0 cyu0Var, cyu0 cyu0Var2, h8j h8jVar, String str) {
        super("dynamic-content-details-key", false, 14);
        this.c = ra90Var;
        this.d = cyu0Var;
        this.e = cyu0Var2;
        this.f = h8jVar;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5n)) {
            return false;
        }
        q5n q5nVar = (q5n) obj;
        return jl40.l(this.c, q5nVar.c) && this.d.equals(q5nVar.d) && jl40.l(this.e, q5nVar.e) && this.f.equals(q5nVar.f) && jl40.l(this.g, q5nVar.g);
    }

    public final int hashCode() {
        v4v v4vVar = this.c;
        int hashCode = (this.d.hashCode() + ((v4vVar == null ? 0 : v4vVar.hashCode()) * 31)) * 31;
        cyu0 cyu0Var = this.e;
        int hashCode2 = (this.f.hashCode() + ((hashCode + (cyu0Var == null ? 0 : cyu0Var.hashCode())) * 31)) * 31;
        String str = this.g;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicContentDetailsModel(leadIcon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", clickPayload=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
