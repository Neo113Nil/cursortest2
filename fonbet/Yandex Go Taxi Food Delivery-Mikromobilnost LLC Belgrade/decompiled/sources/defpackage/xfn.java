package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xfn {
    public final List a;
    public final List b;
    public final List c;

    public xfn(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfn)) {
            return false;
        }
        xfn xfnVar = (xfn) obj;
        return this.a.equals(xfnVar.a) && this.b.equals(xfnVar.b) && this.c.equals(xfnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(qv10.v("EatsOverlayUiState(couriers=", this.a, ", restaurants=", this.b, ", destinationPins="), this.c, Extension.C_BRAKE);
    }
}
