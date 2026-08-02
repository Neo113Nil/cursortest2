package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kmg implements omg {
    public final img a;
    public final long b;
    public final String c;

    public kmg(long j, img imgVar, String str) {
        this.a = imgVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmg)) {
            return false;
        }
        kmg kmgVar = (kmg) obj;
        return this.a == kmgVar.a && this.b == kmgVar.b && Intrinsics.d(this.c, kmgVar.c);
    }

    public final int hashCode() {
        int c = tlm.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failed(error=");
        sb.append(this.a);
        sb.append(", timeDiff=");
        sb.append(this.b);
        return vz1.s(sb, ", message=", this.c, ")");
    }
}
