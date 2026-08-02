package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r6k0 {
    public static final r6k0 c = new r6k0("—", "");
    public final String a;
    public final String b;

    public r6k0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6k0)) {
            return false;
        }
        r6k0 r6k0Var = (r6k0) obj;
        return jl40.l(this.a, r6k0Var.a) && jl40.l(this.b, r6k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("RidaPrice(title=", this.a, ", priceValue=", this.b, Extension.C_BRAKE);
    }
}
