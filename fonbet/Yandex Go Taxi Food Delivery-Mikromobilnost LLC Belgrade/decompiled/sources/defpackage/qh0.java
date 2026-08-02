package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qh0 {
    public final String a;
    public final List b;
    public final oh0 c;
    public final vh0 d;
    public final AddPaymentHomeResponse.DisplayType e;

    public qh0(String str, List list, oh0 oh0Var, vh0 vh0Var, AddPaymentHomeResponse.DisplayType displayType) {
        this.a = str;
        this.b = list;
        this.c = oh0Var;
        this.d = vh0Var;
        this.e = displayType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh0)) {
            return false;
        }
        qh0 qh0Var = (qh0) obj;
        return jl40.l(this.a, qh0Var.a) && jl40.l(this.b, qh0Var.b) && jl40.l(this.c, qh0Var.c) && jl40.l(this.d, qh0Var.d) && this.e == qh0Var.e;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        oh0 oh0Var = this.c;
        int hashCode = (c + (oh0Var == null ? 0 : oh0Var.hashCode())) * 31;
        vh0 vh0Var = this.d;
        int hashCode2 = (hashCode + (vh0Var == null ? 0 : vh0Var.hashCode())) * 31;
        AddPaymentHomeResponse.DisplayType displayType = this.e;
        return hashCode2 + (displayType != null ? displayType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("InfoScreenUiState(webviewUrl=", this.a, ", buttons=", this.b, ", footer=");
        r.append(this.c);
        r.append(", toolbar=");
        r.append(this.d);
        r.append(", displayType=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
