package defpackage;

import com.yandex.go.yb.api.domain.model.YbDepositType;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zv51 {
    public final String a;
    public final BigDecimal b;
    public final YbDepositType c;

    public zv51(String str, BigDecimal bigDecimal, YbDepositType ybDepositType) {
        this.a = str;
        this.b = bigDecimal;
        this.c = ybDepositType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv51)) {
            return false;
        }
        zv51 zv51Var = (zv51) obj;
        return jl40.l(this.a, zv51Var.a) && jl40.l(this.b, zv51Var.b) && this.c == zv51Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DepositAmount(currencyCode=" + this.a + ", amount=" + this.b + ", depositType=" + this.c + Extension.C_BRAKE;
    }

    public /* synthetic */ zv51(String str, BigDecimal bigDecimal) {
        this(str, bigDecimal, YbDepositType.EXACT_AMOUNT);
    }
}
