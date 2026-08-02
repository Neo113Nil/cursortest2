package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yts {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public yts(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yts)) {
            return false;
        }
        yts ytsVar = (yts) obj;
        return jl40.l(this.a, ytsVar.a) && jl40.l(this.b, ytsVar.b) && this.c.equals(ytsVar.c) && this.d.equals(ytsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return vfc.p(b64.v("GasStationServiceWithFilters(id=", this.a, ", name=", this.b, ", shortList="), this.c, ", fullList=", this.d, Extension.C_BRAKE);
    }
}
