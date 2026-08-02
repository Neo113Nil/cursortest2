package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tq4 {
    public final String a;
    public final String b;

    public tq4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq4)) {
            return false;
        }
        tq4 tq4Var = (tq4) obj;
        return jl40.l(this.a, tq4Var.a) && jl40.l(this.b, tq4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Info(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
