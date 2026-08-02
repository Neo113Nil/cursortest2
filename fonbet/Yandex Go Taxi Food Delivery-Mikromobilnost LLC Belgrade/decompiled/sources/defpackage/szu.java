package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class szu implements h0v {
    public final mct0 a;
    public final gx0 b;

    public szu(mct0 mct0Var, gx0 gx0Var) {
        this.a = mct0Var;
        this.b = gx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szu)) {
            return false;
        }
        szu szuVar = (szu) obj;
        return jl40.l(this.a, szuVar.a) && jl40.l(this.b, szuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressesUiState(state=" + this.a + ", iconState=" + this.b + Extension.C_BRAKE;
    }
}
