package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k4k {
    public final boolean a;
    public final rzf b;
    public final boolean c;

    public k4k(boolean z, rzf rzfVar, boolean z2) {
        this.a = z;
        this.b = rzfVar;
        this.c = z2;
    }

    public static k4k a(k4k k4kVar, rzf rzfVar, int i) {
        boolean z = k4kVar.a;
        boolean z2 = (i & 4) != 0 ? k4kVar.c : false;
        k4kVar.getClass();
        return new k4k(z, rzfVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4k)) {
            return false;
        }
        k4k k4kVar = (k4k) obj;
        return this.a == k4kVar.a && Intrinsics.d(this.b, k4kVar.b) && this.c == k4kVar.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        rzf rzfVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (rzfVar == null ? 0 : rzfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingScreenState(content=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", error=");
        return ouj.r(sb, this.c, ")");
    }
}
