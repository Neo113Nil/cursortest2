package S0;

import D.x;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2913b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2914c;

    public g(String workSpecId, int i, int i4) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2912a = workSpecId;
        this.f2913b = i;
        this.f2914c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.h.a(this.f2912a, gVar.f2912a) && this.f2913b == gVar.f2913b && this.f2914c == gVar.f2914c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2914c) + ((Integer.hashCode(this.f2913b) + (this.f2912a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f2912a);
        sb.append(", generation=");
        sb.append(this.f2913b);
        sb.append(", systemId=");
        return x.n(sb, this.f2914c, ')');
    }
}
