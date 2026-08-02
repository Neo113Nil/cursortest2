package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class t54 extends c3f.e.d.f {
    public final List a;

    public t54(List list) {
        this.a = list;
    }

    @Override // c3f.e.d.f
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c3f.e.d.f) {
            return this.a.equals(((c3f.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ly3.s(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
