package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wki0 implements zki0 {
    public final String a;
    public final String b;

    public wki0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wki0)) {
            return false;
        }
        wki0 wki0Var = (wki0) obj;
        return jl40.l(this.a, wki0Var.a) && jl40.l(this.b, wki0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("Redirect(tariffClass=", this.a, ", requirement=", this.b, Extension.C_BRAKE);
    }
}
