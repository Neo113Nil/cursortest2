package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class uq8 extends ye0 {
    public final String b;
    public final String c;

    public uq8(String str, String str2) {
        super("care.error");
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq8)) {
            return false;
        }
        uq8 uq8Var = (uq8) obj;
        return jl40.l(this.b, uq8Var.b) && jl40.l(this.c, uq8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Error(errorCode=", this.b, ", errorMessage=", this.c, Extension.C_BRAKE);
    }
}
