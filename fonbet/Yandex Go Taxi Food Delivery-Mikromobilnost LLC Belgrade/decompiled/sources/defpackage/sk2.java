package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sk2 {
    public final String a;
    public final String b;

    public sk2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk2)) {
            return false;
        }
        sk2 sk2Var = (sk2) obj;
        return jl40.l(this.a, sk2Var.a) && jl40.l(this.b, sk2Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return unr0.p("AnnotationSettings(text=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
