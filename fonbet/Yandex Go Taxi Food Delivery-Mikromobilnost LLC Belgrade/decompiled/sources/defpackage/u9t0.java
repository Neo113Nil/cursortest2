package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u9t0 implements x9t0 {
    public final String a;
    public final String b;

    public u9t0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9t0)) {
            return false;
        }
        u9t0 u9t0Var = (u9t0) obj;
        return jl40.l(this.a, u9t0Var.a) && jl40.l(this.b, u9t0Var.b);
    }

    @Override // defpackage.x9t0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Tag(uri=", this.a, ", name=", this.b, Extension.C_BRAKE);
    }
}
