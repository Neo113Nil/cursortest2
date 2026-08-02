package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class suo {
    public final String a;
    public final String b;
    public final double c;
    public final ArrayList d;

    public suo(String str, String str2, double d, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suo)) {
            return false;
        }
        suo suoVar = (suo) obj;
        return jl40.l(this.a, suoVar.a) && jl40.l(this.b, suoVar.b) && Double.compare(this.c, suoVar.c) == 0 && this.d.equals(suoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.a(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExplorerRegionItem(id=", this.a, ", title=", this.b, ", coverage=");
        v.append(this.c);
        v.append(", polygons=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
