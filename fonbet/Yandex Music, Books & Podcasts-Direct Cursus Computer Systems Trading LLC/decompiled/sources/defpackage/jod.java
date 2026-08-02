package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class jod {
    public final Number a;
    public final long b;

    public jod(Number number, long j) {
        number.getClass();
        this.a = number;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jod)) {
            return false;
        }
        jod jodVar = (jod) obj;
        return Intrinsics.d(this.a, jodVar.a) && this.b == jodVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphData(value=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return eta.g(sb, this.b, ')');
    }
}
