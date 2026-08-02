package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bdj extends cdj {
    public final String a;
    public final long b;
    public final float c;

    public bdj(String str, long j, float f) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdj)) {
            return false;
        }
        bdj bdjVar = (bdj) obj;
        return Intrinsics.d(this.a, bdjVar.a) && this.b == bdjVar.b && Float.compare(this.c, bdjVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Started(text=", this.b, this.a, ", timeLeftMs=");
        q.append(", progress=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
