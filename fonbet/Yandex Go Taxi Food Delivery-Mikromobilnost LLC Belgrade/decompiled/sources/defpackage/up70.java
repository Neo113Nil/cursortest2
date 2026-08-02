package defpackage;

import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class up70 implements fq70 {
    public final o2y0 a;
    public final RequiredCardBalance b;
    public final be9 c;

    public up70(o2y0 o2y0Var, RequiredCardBalance requiredCardBalance, be9 be9Var) {
        this.a = o2y0Var;
        this.b = requiredCardBalance;
        this.c = be9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof up70) {
            up70 up70Var = (up70) obj;
            if (this.a == up70Var.a && jl40.l(this.b, up70Var.b) && jl40.l(this.c, up70Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequiredCardBalance requiredCardBalance = this.b;
        int hashCode2 = (hashCode + (requiredCardBalance == null ? 0 : requiredCardBalance.hashCode())) * 31;
        be9 be9Var = this.c;
        return hashCode2 + (be9Var != null ? be9Var.hashCode() : 0);
    }

    public final String toString() {
        return "OpenYandexCardTopup(orderHolder=" + this.a + ", cardBalance=" + this.b + ", changePaymentSuggest=" + this.c + Extension.C_BRAKE;
    }
}
