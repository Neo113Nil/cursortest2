package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tvz implements vvz {
    public final ArrayList a;
    public final List b;

    public tvz(ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvz)) {
            return false;
        }
        tvz tvzVar = (tvz) obj;
        return this.a.equals(tvzVar.a) && jl40.l(this.b, tvzVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LinearGradient(colors=" + this.a + ", positions=" + this.b + Extension.C_BRAKE;
    }
}
