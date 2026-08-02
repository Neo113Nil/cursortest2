package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class rgn0 {
    public final List a;
    public final ArrayList b;

    public rgn0(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgn0)) {
            return false;
        }
        rgn0 rgn0Var = (rgn0) obj;
        return jl40.l(this.a, rgn0Var.a) && this.b.equals(rgn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionsHolder(topActions=" + this.a + ", remainingActions=" + this.b + Extension.C_BRAKE;
    }
}
