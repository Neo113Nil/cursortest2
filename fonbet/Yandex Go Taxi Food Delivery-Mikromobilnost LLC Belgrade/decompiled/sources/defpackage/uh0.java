package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uh0 {
    public final String a;
    public final String b;

    public uh0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh0)) {
            return false;
        }
        uh0 uh0Var = (uh0) obj;
        return jl40.l(this.a, uh0Var.a) && jl40.l(this.b, uh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PrerequisiteScreenUiState(loadingText=", this.a, ", errorText=", this.b, Extension.C_BRAKE);
    }
}
