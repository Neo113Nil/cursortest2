package defpackage;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.api.data.PageImageHeaderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v1a0 {
    public final PageImageHeaderEntity a;
    public final lo10 b;
    public final Money c;
    public final String d;
    public final rr51 e;
    public final bcp0 f;
    public final boolean g;
    public final String h;

    public v1a0(PageImageHeaderEntity pageImageHeaderEntity, lo10 lo10Var, Money money, String str, rr51 rr51Var, bcp0 bcp0Var, boolean z, String str2) {
        this.a = pageImageHeaderEntity;
        this.b = lo10Var;
        this.c = money;
        this.d = str;
        this.e = rr51Var;
        this.f = bcp0Var;
        this.g = z;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1a0)) {
            return false;
        }
        v1a0 v1a0Var = (v1a0) obj;
        return jl40.l(this.a, v1a0Var.a) && jl40.l(this.b, v1a0Var.b) && jl40.l(this.c, v1a0Var.c) && jl40.l(this.d, v1a0Var.d) && jl40.l(this.e, v1a0Var.e) && this.f.equals(v1a0Var.f) && this.g == v1a0Var.g && jl40.l(this.h, v1a0Var.h);
    }

    public final int hashCode() {
        int c = tse0.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int e = unr0.e((this.f.hashCode() + ((this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g);
        String str2 = this.h;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentInfoEntity(header=");
        sb.append(this.a);
        sb.append(", merchant=");
        sb.append(this.b);
        sb.append(", amount=");
        sb.append(this.c);
        sb.append(", purpose=");
        sb.append(this.d);
        sb.append(", agreementsData=");
        sb.append(this.e);
        sb.append(", buttons=");
        sb.append(this.f);
        sb.append(", isAmountEditable=");
        return n.m(", paymentServiceId=", this.h, Extension.C_BRAKE, sb, this.g);
    }
}
