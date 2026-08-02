package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mb2 extends zv2 {
    public final ArrayList a;

    public mb2(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zv2)) {
            return false;
        }
        return this.a.equals(((mb2) ((zv2) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vz1.t(new StringBuilder("BatchedLogRequest{logRequests="), this.a, "}");
    }
}
