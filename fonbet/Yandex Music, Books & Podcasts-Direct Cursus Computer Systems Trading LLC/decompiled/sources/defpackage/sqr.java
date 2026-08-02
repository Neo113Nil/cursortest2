package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sqr {
    public final BigDecimal a;
    public final String b;

    public sqr(BigDecimal bigDecimal, String str) {
        bigDecimal.getClass();
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqr)) {
            return false;
        }
        sqr sqrVar = (sqr) obj;
        return Intrinsics.d(this.a, sqrVar.a) && this.b.equals(sqrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SumToTopUp(amount=" + this.a + ", formatted=" + this.b + ")";
    }
}
