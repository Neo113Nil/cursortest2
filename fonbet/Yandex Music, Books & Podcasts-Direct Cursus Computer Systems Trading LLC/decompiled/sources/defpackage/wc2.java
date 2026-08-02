package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class wc2 extends jq6 {
    public final List a;

    public wc2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jq6)) {
            return false;
        }
        return this.a.equals(((wc2) ((jq6) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vz1.u(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
