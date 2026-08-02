package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vig {
    public final String a;
    public final String b;

    public vig(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vig)) {
            return false;
        }
        vig vigVar = (vig) obj;
        return jl40.l(this.a, vigVar.a) && jl40.l(this.b, vigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("DashboardV3Params(productId=", this.a, ", balance=", this.b, Extension.C_BRAKE);
    }
}
