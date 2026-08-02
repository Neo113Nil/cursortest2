package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xau extends n351 {
    public final v4v c;
    public final CharSequence d;
    public final bcu e;
    public final jvs0 f;
    public final jvs0 g;
    public final d9u h;
    public final String i;

    public xau(v4v v4vVar, CharSequence charSequence, bcu bcuVar, jvs0 jvs0Var, jvs0 jvs0Var2, d9u d9uVar, String str) {
        super("header", false, 14);
        this.c = v4vVar;
        this.d = charSequence;
        this.e = bcuVar;
        this.f = jvs0Var;
        this.g = jvs0Var2;
        this.h = d9uVar;
        this.i = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xau)) {
            return false;
        }
        xau xauVar = (xau) obj;
        return jl40.l(this.c, xauVar.c) && jl40.l(this.d, xauVar.d) && jl40.l(this.e, xauVar.e) && jl40.l(this.f, xauVar.f) && jl40.l(this.g, xauVar.g) && this.h.equals(xauVar.h) && jl40.l(this.i, xauVar.i);
    }

    public final int hashCode() {
        v4v v4vVar = this.c;
        int b = smw0.b((v4vVar == null ? 0 : v4vVar.hashCode()) * 31, 31, this.d);
        bcu bcuVar = this.e;
        int hashCode = (b + (bcuVar == null ? 0 : bcuVar.hashCode())) * 31;
        jvs0 jvs0Var = this.f;
        int hashCode2 = (hashCode + (jvs0Var == null ? 0 : jvs0Var.hashCode())) * 31;
        jvs0 jvs0Var2 = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (jvs0Var2 == null ? 0 : jvs0Var2.hashCode())) * 31)) * 961;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderModel(icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append((Object) this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", trail=");
        sb.append(this.f);
        sb.append(", trail2=");
        sb.append(this.g);
        sb.append(", widgetAction=");
        sb.append(this.h);
        sb.append(", onShownAnalyticsData=null, id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
