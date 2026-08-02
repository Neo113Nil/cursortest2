package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lir extends hdg {
    public final String d;
    public final long e;

    public lir(String str, long j) {
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lir)) {
            return false;
        }
        lir lirVar = (lir) obj;
        return Intrinsics.d(this.d, lirVar.d) && this.e == lirVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerStoredValue(name=");
        sb.append(this.d);
        sb.append(", value=");
        return eta.g(sb, this.e, ')');
    }
}
