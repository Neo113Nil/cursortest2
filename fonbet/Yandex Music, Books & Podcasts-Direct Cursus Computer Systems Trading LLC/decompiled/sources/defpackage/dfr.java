package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class dfr implements hfr {
    public final Set a;

    public dfr(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfr) && this.a.equals(((dfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AppNotInstalled(packageNames=" + this.a + ")";
    }
}
