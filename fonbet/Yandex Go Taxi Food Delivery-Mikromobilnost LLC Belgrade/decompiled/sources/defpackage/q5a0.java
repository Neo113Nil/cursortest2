package defpackage;

import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q5a0 {
    public final String a;
    public final String b;
    public final String c;
    public final PaymentMethodTypeDto d;

    public q5a0(String str, String str2, String str3, PaymentMethodTypeDto paymentMethodTypeDto) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = paymentMethodTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5a0)) {
            return false;
        }
        q5a0 q5a0Var = (q5a0) obj;
        return jl40.l(this.a, q5a0Var.a) && jl40.l(this.b, q5a0Var.b) && jl40.l(this.c, q5a0Var.c) && this.d == q5a0Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PaymentMethodInfoParams(yandexAccountAgreementId=", this.a, ", savingsAccountAgreementId=", this.b, ", me2meBankId=");
        v.append(this.c);
        v.append(", paymentType=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
