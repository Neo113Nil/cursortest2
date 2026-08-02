package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wuk0 {
    public final au2 a;
    public final String b;

    public wuk0(au2 au2Var, String str) {
        this.a = au2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wuk0) {
            wuk0 wuk0Var = (wuk0) obj;
            if (this.a != wuk0Var.a) {
                return false;
            }
            cuk0 cuk0Var = cuk0.a;
            if (cuk0Var.equals(cuk0Var) && jl40.l(this.b, wuk0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.a.hashCode() * 31) + 1603124983) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoadsToolbarButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", uiAction=");
        sb.append(cuk0.a);
        sb.append(", contentDescription=");
        return oyr.t(sb, this.b, Extension.C_BRAKE);
    }
}
