package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uiy {
    public final ArrayList a;
    public final ArrayList b;
    public final long c;
    public final long d;

    public uiy(ArrayList arrayList, ArrayList arrayList2, long j, long j2) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiy)) {
            return false;
        }
        uiy uiyVar = (uiy) obj;
        return this.a.equals(uiyVar.a) && this.b.equals(uiyVar.b) && wu60.c(this.c, uiyVar.c) && wu60.c(this.d, uiyVar.d);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + qv10.c(qv10.c(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String h = wu60.h(this.c);
        String h2 = wu60.h(this.d);
        String c = kpb1.c(0);
        StringBuilder sb = new StringBuilder("LinearGradientConfig(colors=");
        sb.append(this.a);
        sb.append(", colorStops=");
        sb.append(this.b);
        sb.append(", from=");
        g8e.D(sb, h, ", to=", h2, ", tileMode=");
        return oyr.t(sb, c, Extension.C_BRAKE);
    }
}
