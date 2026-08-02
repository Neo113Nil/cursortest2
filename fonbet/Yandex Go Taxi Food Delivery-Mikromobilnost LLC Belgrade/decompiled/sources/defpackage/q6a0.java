package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class q6a0 implements pre {
    public final String a;
    public final hty0 b;
    public final FormattedText c;
    public final hqs0 d;
    public final fws0 e;
    public final List f;
    public final String g;

    public q6a0(String str, hty0 hty0Var, FormattedText formattedText, hqs0 hqs0Var, fws0 fws0Var, List list, String str2) {
        this.a = str;
        this.b = hty0Var;
        this.c = formattedText;
        this.d = hqs0Var;
        this.e = fws0Var;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a0)) {
            return false;
        }
        q6a0 q6a0Var = (q6a0) obj;
        return jl40.l(this.a, q6a0Var.a) && this.b.equals(q6a0Var.b) && jl40.l(this.c, q6a0Var.c) && jl40.l(this.d, q6a0Var.d) && jl40.l(this.e, q6a0Var.e) && jl40.l(this.f, q6a0Var.f) && jl40.l(this.g, q6a0Var.g);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "payment-method";
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        FormattedText formattedText = this.c;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        hqs0 hqs0Var = this.d;
        int hashCode3 = (hashCode2 + (hqs0Var == null ? 0 : hqs0Var.hashCode())) * 31;
        fws0 fws0Var = this.e;
        int c = unr0.c((hashCode3 + (fws0Var == null ? 0 : fws0Var.hashCode())) * 31, 31, this.f);
        String str = this.g;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodRemoteCoreWidget(id=");
        sb.append(this.a);
        sb.append(", titleStyle=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", additionalBody=");
        sb.append(this.d);
        sb.append(", trail=");
        sb.append(this.e);
        sb.append(", availablePaymentTypes=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
