package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s8x0 {
    public final String a;
    public final String b;

    public s8x0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8x0)) {
            return false;
        }
        s8x0 s8x0Var = (s8x0) obj;
        return jl40.l(this.a, s8x0Var.a) && jl40.l(this.b, s8x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Copy(sourceField=", this.a, ", targetField=", this.b, Extension.C_BRAKE);
    }
}
