package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r8e0 {
    public kae0 a;
    public final sz40 b;

    public r8e0(kae0 kae0Var) {
        sz40 sz40Var = new sz40(Boolean.FALSE);
        this.a = kae0Var;
        this.b = sz40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8e0)) {
            return false;
        }
        r8e0 r8e0Var = (r8e0) obj;
        return jl40.l(this.a, r8e0Var.a) && jl40.l(this.b, r8e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PopupEntry(model=" + this.a + ", visibility=" + this.b + Extension.C_BRAKE;
    }
}
