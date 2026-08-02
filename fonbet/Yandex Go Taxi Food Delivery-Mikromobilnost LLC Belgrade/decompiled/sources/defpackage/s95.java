package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class s95 extends v95 {
    public final String a;
    public final ArrayList b;

    public s95(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s95)) {
            return false;
        }
        s95 s95Var = (s95) obj;
        return jl40.l(this.a, s95Var.a) && this.b.equals(s95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("SelectionFilterOption(id=", this.a, ", options=", Extension.C_BRAKE, this.b);
    }
}
