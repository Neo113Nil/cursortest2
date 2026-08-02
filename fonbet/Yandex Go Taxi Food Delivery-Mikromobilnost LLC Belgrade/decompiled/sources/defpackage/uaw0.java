package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class uaw0 extends waw0 {
    public final d2t a;
    public final q6r b;

    public uaw0(d2t d2tVar, q6r q6rVar) {
        this.a = d2tVar;
        this.b = q6rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaw0)) {
            return false;
        }
        uaw0 uaw0Var = (uaw0) obj;
        return jl40.l(this.a, uaw0Var.a) && this.b.equals(uaw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Raw(geoSuggestParams=" + this.a + ", finalSuggestParams=" + this.b + Extension.C_BRAKE;
    }
}
