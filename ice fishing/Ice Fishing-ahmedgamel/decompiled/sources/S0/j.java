package S0;

import D.y;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2793b;

    public j(String workSpecId, int i) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2792a = workSpecId;
        this.f2793b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(this.f2792a, jVar.f2792a) && this.f2793b == jVar.f2793b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2793b) + (this.f2792a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f2792a);
        sb.append(", generation=");
        return y.q(sb, this.f2793b, ')');
    }
}
