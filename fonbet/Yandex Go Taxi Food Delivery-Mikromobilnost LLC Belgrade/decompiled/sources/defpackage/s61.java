package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class s61 {
    public final Map a;
    public final oo0 b;

    public s61(Map map, oo0 oo0Var) {
        this.a = map;
        this.b = oo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s61)) {
            return false;
        }
        s61 s61Var = (s61) obj;
        return this.a.equals(s61Var.a) && jl40.l(this.b, s61Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oo0 oo0Var = this.b;
        return hashCode + (oo0Var == null ? 0 : oo0Var.hashCode());
    }

    public final String toString() {
        return "PickupPointsPayload(userState=" + this.a + ", preselectAddress=" + this.b + Extension.C_BRAKE;
    }
}
