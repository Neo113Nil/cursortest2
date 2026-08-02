package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wwz {
    public final String a;
    public final ArrayList b;

    public wwz(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwz)) {
            return false;
        }
        wwz wwzVar = (wwz) obj;
        return jl40.l(this.a, wwzVar.a) && this.b.equals(wwzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("LoyaltySelectorState(header=", this.a, ", loyaltyPrograms=", Extension.C_BRAKE, this.b);
    }
}
