package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.ly;

/* loaded from: classes7.dex */
public final class vw71 implements vz71 {
    public final gg81 a;
    public final ly b;

    public vw71(gg81 gg81Var, ly lyVar) {
        this.a = gg81Var;
        this.b = lyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw71)) {
            return false;
        }
        vw71 vw71Var = (vw71) obj;
        return jl40.l(this.a, vw71Var.a) && this.b == vw71Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(sdkConfiguration=" + this.a + ", configurationSource=" + this.b + Extension.C_BRAKE;
    }
}
