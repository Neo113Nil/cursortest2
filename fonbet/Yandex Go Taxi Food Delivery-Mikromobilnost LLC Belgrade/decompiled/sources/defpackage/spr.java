package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class spr {
    public final r901 a;
    public final e68 b;
    public final q1l0 c;

    public spr(r901 r901Var, e68 e68Var, q1l0 q1l0Var) {
        this.a = r901Var;
        this.b = e68Var;
        this.c = q1l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spr)) {
            return false;
        }
        spr sprVar = (spr) obj;
        return jl40.l(this.a, sprVar.a) && jl40.l(this.b, sprVar.b) && jl40.l(this.c, sprVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FloatingTopContentUiState(trafficState=" + this.a + ", carParksState=" + this.b + ", routeControlsUiState=" + this.c + Extension.C_BRAKE;
    }
}
