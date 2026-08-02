package defpackage;

import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class z8d0 {
    public static final y8d0 Companion = new y8d0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(19)), null};
    public final BigDecimal a;
    public final String b;

    public /* synthetic */ z8d0(int i, BigDecimal bigDecimal, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, x8d0.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8d0)) {
            return false;
        }
        z8d0 z8d0Var = (z8d0) obj;
        return jl40.l(this.a, z8d0Var.a) && jl40.l(this.b, z8d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayAcquisitionPriceDto(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return b64.p(sb, this.b, ')');
    }
}
