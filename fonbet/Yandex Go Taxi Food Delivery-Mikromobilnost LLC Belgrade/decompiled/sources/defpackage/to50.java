package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel$Currency;
import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class to50 {
    public static final so50 Companion = new so50();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(12))};
    public final BigDecimal a;
    public final NetworkBalanceModel$Currency b;

    public /* synthetic */ to50(int i, BigDecimal bigDecimal, NetworkBalanceModel$Currency networkBalanceModel$Currency) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ro50.a.getDescriptor());
            throw null;
        }
        this.a = bigDecimal;
        this.b = networkBalanceModel$Currency;
    }

    public final BigDecimal a() {
        return this.a;
    }

    public final NetworkBalanceModel$Currency b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to50)) {
            return false;
        }
        to50 to50Var = (to50) obj;
        return jl40.l(this.a, to50Var.a) && this.b == to50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkBalanceModel(amount=" + this.a + ", currency=" + this.b + ')';
    }
}
