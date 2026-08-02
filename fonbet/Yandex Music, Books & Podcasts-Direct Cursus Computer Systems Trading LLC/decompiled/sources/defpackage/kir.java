package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kir extends hdg {
    public final String d;
    public final double e;

    public kir(String str, double d) {
        this.d = str;
        this.e = d;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kir)) {
            return false;
        }
        kir kirVar = (kir) obj;
        return Intrinsics.d(this.d, kirVar.d) && Double.compare(this.e, kirVar.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleStoredValue(name=");
        sb.append(this.d);
        sb.append(", value=");
        return k5r.n(sb, this.e, ')');
    }
}
