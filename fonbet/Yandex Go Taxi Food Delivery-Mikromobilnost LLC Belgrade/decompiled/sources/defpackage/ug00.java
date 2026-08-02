package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ug00 {
    public static final ug00 c = new ug00(null, null);
    public final z91 a;
    public final nww0 b;

    public ug00(z91 z91Var, nww0 nww0Var) {
        this.a = z91Var;
        this.b = nww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug00)) {
            return false;
        }
        ug00 ug00Var = (ug00) obj;
        return jl40.l(this.a, ug00Var.a) && jl40.l(this.b, ug00Var.b);
    }

    public final int hashCode() {
        z91 z91Var = this.a;
        int hashCode = (z91Var == null ? 0 : z91Var.hashCode()) * 31;
        nww0 nww0Var = this.b;
        return hashCode + (nww0Var != null ? nww0Var.hashCode() : 0);
    }

    public final String toString() {
        return "MapContentUiState(addressesUiState=" + this.a + ", surgeWidgetUiState=" + this.b + Extension.C_BRAKE;
    }
}
