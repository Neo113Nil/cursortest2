package S0;

import D.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2785c;

    public g(String workSpecId, int i, int i6) {
        kotlin.jvm.internal.h.e(workSpecId, "workSpecId");
        this.f2783a = workSpecId;
        this.f2784b = i;
        this.f2785c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.h.a(this.f2783a, gVar.f2783a) && this.f2784b == gVar.f2784b && this.f2785c == gVar.f2785c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2785c) + ((Integer.hashCode(this.f2784b) + (this.f2783a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f2783a);
        sb.append(", generation=");
        sb.append(this.f2784b);
        sb.append(", systemId=");
        return y.q(sb, this.f2785c, ')');
    }
}
