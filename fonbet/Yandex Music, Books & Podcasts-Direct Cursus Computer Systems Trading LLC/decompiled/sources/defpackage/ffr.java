package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class ffr implements hfr {
    public final ad6 a;
    public final Set b;

    public ffr(ad6 ad6Var, Set set) {
        this.a = ad6Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffr)) {
            return false;
        }
        ffr ffrVar = (ffr) obj;
        return this.a.equals(ffrVar.a) && this.b.equals(ffrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AppNotInstalledAndHasOption(option=" + this.a + ", packageNames=" + this.b + ")";
    }
}
