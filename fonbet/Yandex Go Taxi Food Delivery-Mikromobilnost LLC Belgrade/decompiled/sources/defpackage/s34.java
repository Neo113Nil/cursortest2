package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s34 extends if5 {
    public final ArrayList a;

    public s34(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.if5
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof if5) {
            return this.a.equals(((if5) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b64.n("}", new StringBuilder("BatchedLogRequest{logRequests="), this.a);
    }
}
