package defpackage;

import java.util.Map;

/* loaded from: classes11.dex */
public final class slp {
    public final Map a;

    public slp(Map map) {
        this.a = map;
    }

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slp) && this.a.equals(((slp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("FeatureFlagsConfiguration(values="), this.a, ')');
    }
}
