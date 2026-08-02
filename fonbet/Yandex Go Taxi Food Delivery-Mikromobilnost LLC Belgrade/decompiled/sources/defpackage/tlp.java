package defpackage;

import java.util.Set;

/* loaded from: classes8.dex */
public final class tlp {
    public final Set a;

    public tlp(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlp) && jl40.l(this.a, ((tlp) obj).a);
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return qv10.s(new StringBuilder("FeatureFlagsExperiments(flags="), this.a, ')');
    }
}
