package S0;

import D.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2898c;

    public g(String workSpecId, int i, int i4) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2896a = workSpecId;
        this.f2897b = i;
        this.f2898c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.h.a(this.f2896a, gVar.f2896a) && this.f2897b == gVar.f2897b && this.f2898c == gVar.f2898c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2898c) + ((Integer.hashCode(this.f2897b) + (this.f2896a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f2896a);
        sb.append(", generation=");
        sb.append(this.f2897b);
        sb.append(", systemId=");
        return y.m(sb, this.f2898c, ')');
    }
}
