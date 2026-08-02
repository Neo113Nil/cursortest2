package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u531 {
    public final String a;
    public final String b;

    public u531(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u531)) {
            return false;
        }
        u531 u531Var = (u531) obj;
        return jl40.l(this.a, u531Var.a) && this.b.equals(u531Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("VehicleInfo(number=", this.a, ", mark=", this.b, Extension.C_BRAKE);
    }
}
