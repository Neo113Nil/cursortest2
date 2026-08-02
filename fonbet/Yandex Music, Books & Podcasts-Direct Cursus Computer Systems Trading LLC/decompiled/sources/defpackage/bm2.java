package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bm2 {
    public final BigDecimal a;
    public final String b;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        new bm2(bigDecimal, "");
    }

    public bm2(BigDecimal bigDecimal, String str) {
        bigDecimal.getClass();
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2)) {
            return false;
        }
        bm2 bm2Var = (bm2) obj;
        return Intrinsics.d(this.a, bm2Var.a) && this.b.equals(bm2Var.b);
    }

    public final int hashCode() {
        return k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "BankMoney(amount=" + this.a + ", currency=" + this.b + ", formattedAmount=)";
    }
}
