package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v9k0 {
    public final String a;
    public final String b;

    public v9k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9k0)) {
            return false;
        }
        v9k0 v9k0Var = (v9k0) obj;
        return jl40.l(this.a, v9k0Var.a) && jl40.l(this.b, v9k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Support(buttonText=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
