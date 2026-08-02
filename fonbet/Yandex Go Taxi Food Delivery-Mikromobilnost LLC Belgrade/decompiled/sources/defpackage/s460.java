package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s460 {
    public final String a;
    public final String b;

    public s460(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s460)) {
            return false;
        }
        s460 s460Var = (s460) obj;
        return jl40.l(this.a, s460Var.a) && jl40.l(this.b, s460Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("NeuroTextInputHint(title=", this.a, ", textToPaste=", this.b, Extension.C_BRAKE);
    }
}
