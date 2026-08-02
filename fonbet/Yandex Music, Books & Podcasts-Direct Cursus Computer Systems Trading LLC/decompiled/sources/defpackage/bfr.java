package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class bfr implements hfr {
    public final ad6 a;
    public final Set b;

    public bfr(ad6 ad6Var, Set set) {
        this.a = ad6Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfr)) {
            return false;
        }
        bfr bfrVar = (bfr) obj;
        return this.a.equals(bfrVar.a) && this.b.equals(bfrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppInstalledAndHasNoOption(option=" + this.a + ", packageNames=" + this.b + ")";
    }
}
