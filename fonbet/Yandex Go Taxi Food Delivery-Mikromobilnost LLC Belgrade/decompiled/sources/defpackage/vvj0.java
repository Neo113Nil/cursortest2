package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vvj0 {
    public final String a;
    public final String b;

    public vvj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvj0)) {
            return false;
        }
        vvj0 vvj0Var = (vvj0) obj;
        return jl40.l(this.a, vvj0Var.a) && this.b.equals(vvj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ResponseCacheKey(mapper=", this.a, ", response=", this.b, Extension.C_BRAKE);
    }
}
