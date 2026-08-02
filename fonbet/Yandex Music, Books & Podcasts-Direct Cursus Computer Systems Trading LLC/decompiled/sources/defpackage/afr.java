package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class afr implements hfr {
    public final Set a;

    public afr(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afr) && this.a.equals(((afr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppInstalled(packageNames=" + this.a + ")";
    }
}
