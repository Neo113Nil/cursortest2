package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class cfr implements hfr {
    public final ad6 a;
    public final Set b;

    public cfr(ad6 ad6Var, Set set) {
        this.a = ad6Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfr)) {
            return false;
        }
        cfr cfrVar = (cfr) obj;
        return this.a.equals(cfrVar.a) && this.b.equals(cfrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppInstalledAndHasOption(option=" + this.a + ", packageNames=" + this.b + ")";
    }
}
