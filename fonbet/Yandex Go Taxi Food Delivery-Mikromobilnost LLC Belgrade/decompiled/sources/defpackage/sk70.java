package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sk70 {
    public final String a;
    public final String b;

    public sk70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk70)) {
            return false;
        }
        sk70 sk70Var = (sk70) obj;
        return jl40.l(this.a, sk70Var.a) && jl40.l(this.b, sk70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TitleAndTextUpdate(title=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
