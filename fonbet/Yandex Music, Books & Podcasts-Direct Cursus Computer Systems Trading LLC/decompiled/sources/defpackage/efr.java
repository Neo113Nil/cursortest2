package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class efr implements hfr {
    public final ad6 a;
    public final Set b;

    public efr(ad6 ad6Var, Set set) {
        this.a = ad6Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efr)) {
            return false;
        }
        efr efrVar = (efr) obj;
        return this.a.equals(efrVar.a) && this.b.equals(efrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppNotInstalledAndHasNoOption(option=" + this.a + ", packageNames=" + this.b + ")";
    }
}
