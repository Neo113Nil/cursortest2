package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qgb0 {
    public final gv90 a;
    public final int b;
    public final ArrayList c;

    public qgb0(gv90 gv90Var, int i, ArrayList arrayList) {
        this.a = gv90Var;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgb0)) {
            return false;
        }
        qgb0 qgb0Var = (qgb0) obj;
        return jl40.l(this.a, qgb0Var.a) && this.b == qgb0Var.b && this.c.equals(qgb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoClickResult(payload=");
        sb.append(this.a);
        sb.append(", clickedItemIndex=");
        sb.append(this.b);
        sb.append(", allPhotos=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
