package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s9t0 implements x9t0 {
    public final String a;
    public final String b;

    public s9t0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9t0)) {
            return false;
        }
        s9t0 s9t0Var = (s9t0) obj;
        return jl40.l(this.a, s9t0Var.a) && jl40.l(this.b, s9t0Var.b);
    }

    @Override // defpackage.x9t0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Resource(uri=", this.a, ", name=", this.b, Extension.C_BRAKE);
    }
}
