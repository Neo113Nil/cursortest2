package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xdv0 {
    public final String a;
    public final String b;

    public xdv0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdv0)) {
            return false;
        }
        xdv0 xdv0Var = (xdv0) obj;
        return jl40.l(this.a, xdv0Var.a) && this.b.equals(xdv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SummaryBubble(imageTag=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }
}
