package defpackage;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class qcd0 {
    public final BigDecimal a;
    public final String b;

    public qcd0(BigDecimal bigDecimal, String str) {
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcd0)) {
            return false;
        }
        qcd0 qcd0Var = (qcd0) obj;
        return this.a.equals(qcd0Var.a) && jl40.l(this.b, qcd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return b64.p(sb, this.b, ')');
    }
}
