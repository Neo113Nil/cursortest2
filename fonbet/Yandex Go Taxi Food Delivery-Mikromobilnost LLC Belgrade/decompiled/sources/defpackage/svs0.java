package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class svs0 implements fws0 {
    public final yye a;
    public final String b;

    public svs0(yye yyeVar, String str) {
        this.a = yyeVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svs0)) {
            return false;
        }
        svs0 svs0Var = (svs0) obj;
        return this.a.equals(svs0Var.a) && jl40.l(this.b, svs0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrailCounter(action=" + this.a + ", presentationId=" + this.b + Extension.C_BRAKE;
    }
}
