package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class utt0 {
    public final String a;
    public final String b;

    public utt0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utt0)) {
            return false;
        }
        utt0 utt0Var = (utt0) obj;
        return jl40.l(this.a, utt0Var.a) && jl40.l(this.b, utt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("HeaderData(title=", this.a, ", clickActionDeeplink=", this.b, Extension.C_BRAKE);
    }
}
