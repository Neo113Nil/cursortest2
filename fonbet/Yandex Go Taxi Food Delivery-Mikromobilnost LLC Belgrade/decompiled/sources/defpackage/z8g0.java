package defpackage;

import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z8g0 implements b9g0 {
    public final yj1 a;
    public final BigDecimal b;
    public final RetryTimeoutException.Network c;

    public z8g0(yj1 yj1Var, BigDecimal bigDecimal, RetryTimeoutException.Network network) {
        this.a = yj1Var;
        this.b = bigDecimal;
        this.c = network;
    }

    @Override // defpackage.b9g0
    public final String a() {
        return null;
    }

    @Override // defpackage.g9g0
    public final yj1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z8g0) {
            z8g0 z8g0Var = (z8g0) obj;
            return jl40.l(this.a, z8g0Var.a) && jl40.l(this.b, z8g0Var.b) && this.c == z8g0Var.c;
        }
        return false;
    }

    @Override // defpackage.g9g0
    public final BigDecimal getAmount() {
        return this.b;
    }

    public final int hashCode() {
        yj1 yj1Var = this.a;
        int hashCode = (yj1Var == null ? 0 : yj1Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.b;
        return this.c.hashCode() + ((hashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "NetworkError(agreement=" + this.a + ", amount=" + this.b + ", throwable=" + this.c + Extension.C_BRAKE;
    }
}
