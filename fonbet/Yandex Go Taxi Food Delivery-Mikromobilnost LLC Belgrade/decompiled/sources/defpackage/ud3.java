package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ud3 implements wd3 {
    public final String a;
    public final String b;

    public ud3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud3)) {
            return false;
        }
        ud3 ud3Var = (ud3) obj;
        return jl40.l(this.a, ud3Var.a) && jl40.l(this.b, ud3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Loaded(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
