package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vzu implements g0v {
    public final int a;
    public final List b;

    public vzu(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzu)) {
            return false;
        }
        vzu vzuVar = (vzu) obj;
        return this.a == vzuVar.a && jl40.l(this.b, vzuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OfferTableState(rowSize=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
