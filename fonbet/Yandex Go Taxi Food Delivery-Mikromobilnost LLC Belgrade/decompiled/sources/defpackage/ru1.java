package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ru1 {
    public final String a;
    public final String b;

    public ru1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru1)) {
            return false;
        }
        ru1 ru1Var = (ru1) obj;
        return jl40.l(this.a, ru1Var.a) && jl40.l(this.b, ru1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Redirect(tariffClass=", this.a, ", optionSelectionKey=", this.b, Extension.C_BRAKE);
    }
}
