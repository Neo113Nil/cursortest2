package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class wm21 {
    public final List a;
    public final List b;
    public final List c;

    public wm21(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm21)) {
            return false;
        }
        wm21 wm21Var = (wm21) obj;
        return jl40.l(this.a, wm21Var.a) && jl40.l(this.b, wm21Var.b) && jl40.l(this.c, wm21Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return ly3.s(qv10.v("FingerprintMotionSnapshot(acceleration=", this.a, ", rotationRate=", this.b, ", attitude="), this.c, Extension.C_BRAKE);
    }
}
