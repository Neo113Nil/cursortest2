package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ugn0 {
    public final String a;
    public final String b;

    public ugn0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugn0)) {
            return false;
        }
        ugn0 ugn0Var = (ugn0) obj;
        return jl40.l(this.a, ugn0Var.a) && jl40.l(this.b, ugn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Item(id=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
