package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class r7c extends s7c {
    public final int a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final ArrayList e;

    public r7c(int i, String str, ArrayList arrayList, List list, ArrayList arrayList2) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = list;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7c)) {
            return false;
        }
        r7c r7cVar = (r7c) obj;
        return this.a == r7cVar.a && jl40.l(this.b, r7cVar.b) && this.c.equals(r7cVar.c) && this.d.equals(r7cVar.d) && this.e.equals(r7cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(ly3.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "TypedCluster(count=", ", type=", this.b, ", childObjects=");
        v.append(this.c);
        v.append(", childPoints=");
        v.append(this.d);
        v.append(", childIds=");
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
