package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tui0 {
    public final String a;
    public final String b;

    public tui0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tui0)) {
            return false;
        }
        tui0 tui0Var = (tui0) obj;
        return this.a.equals(tui0Var.a) && jl40.l(this.b, tui0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Key(flagKey=", this.a, ", rawJson=", this.b, Extension.C_BRAKE);
    }
}
