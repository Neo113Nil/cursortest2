package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class vaw0 extends waw0 {
    public final zzs a;
    public final Set b;
    public final Set c;
    public final boolean d;
    public final String e;

    public vaw0(zzs zzsVar, Set set, Set set2, boolean z, String str) {
        this.a = zzsVar;
        this.b = set;
        this.c = set2;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vaw0)) {
            return false;
        }
        vaw0 vaw0Var = (vaw0) obj;
        return jl40.l(this.a, vaw0Var.a) && jl40.l(this.b, vaw0Var.b) && jl40.l(this.c, vaw0Var.c) && this.d == vaw0Var.d && jl40.l(this.e, vaw0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(g8e.e(this.c, g8e.e(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resolved(geoPoint=");
        sb.append(this.a);
        sb.append(", geoRequestIds=");
        sb.append(this.b);
        sb.append(", geoResponseIds=");
        sb.append(this.c);
        sb.append(", isChangedByUser=");
        sb.append(this.d);
        sb.append(", zoneName=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
