package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class tdt {
    public final ges a;
    public final long b;
    public final float c;

    public tdt(ges gesVar, long j, float f) {
        gesVar.getClass();
        this.a = gesVar;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdt)) {
            return false;
        }
        tdt tdtVar = (tdt) obj;
        return Intrinsics.d(this.a, tdtVar.a) && kes.a(this.b, tdtVar.b) && Float.compare(this.c, tdtVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Typography(textStyle=");
        sb.append(this.a);
        sb.append(", fontSize=");
        sb.append((Object) kes.d(this.b));
        sb.append(", labelSizeMultiplier=");
        return ouj.p(sb, this.c, ')');
    }
}
