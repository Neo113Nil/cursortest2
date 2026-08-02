package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w5r implements uni {
    public final x5r a;
    public final List b;

    public w5r(x5r x5rVar, List list) {
        this.a = x5rVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5r)) {
            return false;
        }
        w5r w5rVar = (w5r) obj;
        return this.a.equals(w5rVar.a) && this.b.equals(w5rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "FiltersArgs(data=" + this.a + ", selectedMeta=" + this.b + Extension.C_BRAKE;
    }
}
