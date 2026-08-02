package S0;

import D.x;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2922b;

    public j(String workSpecId, int i) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2921a = workSpecId;
        this.f2922b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(this.f2921a, jVar.f2921a) && this.f2922b == jVar.f2922b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2922b) + (this.f2921a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f2921a);
        sb.append(", generation=");
        return x.n(sb, this.f2922b, ')');
    }
}
