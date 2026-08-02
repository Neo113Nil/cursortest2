package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wp51 {
    public final vp51 a;
    public final vp51 b;

    public wp51(vp51 vp51Var, vp51 vp51Var2) {
        this.a = vp51Var;
        this.b = vp51Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp51)) {
            return false;
        }
        wp51 wp51Var = (wp51) obj;
        return jl40.l(this.a, wp51Var.a) && jl40.l(this.b, wp51Var.b);
    }

    public final int hashCode() {
        vp51 vp51Var = this.a;
        int hashCode = (vp51Var == null ? 0 : vp51Var.hashCode()) * 31;
        vp51 vp51Var2 = this.b;
        return hashCode + (vp51Var2 != null ? vp51Var2.hashCode() : 0);
    }

    public final String toString() {
        return "YbCardButtonsEntity(delete=" + this.a + ", reissue=" + this.b + Extension.C_BRAKE;
    }
}
