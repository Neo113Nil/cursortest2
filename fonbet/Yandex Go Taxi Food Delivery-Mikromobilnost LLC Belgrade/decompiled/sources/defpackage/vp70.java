package defpackage;

import com.yandex.go.taxi.order.models.api.status.RequiredYangopayBalance;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vp70 implements fq70 {
    public final o2y0 a;
    public final RequiredYangopayBalance b;
    public final boolean c;

    public vp70(o2y0 o2y0Var, RequiredYangopayBalance requiredYangopayBalance, boolean z) {
        this.a = o2y0Var;
        this.b = requiredYangopayBalance;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vp70) {
            vp70 vp70Var = (vp70) obj;
            if (this.a == vp70Var.a && jl40.l(this.b, vp70Var.b) && this.c == vp70Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequiredYangopayBalance requiredYangopayBalance = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (requiredYangopayBalance == null ? 0 : requiredYangopayBalance.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenYangopayTopup(orderHolder=");
        sb.append(this.a);
        sb.append(", cardBalance=");
        sb.append(this.b);
        sb.append(", changePaymentSuggest=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
