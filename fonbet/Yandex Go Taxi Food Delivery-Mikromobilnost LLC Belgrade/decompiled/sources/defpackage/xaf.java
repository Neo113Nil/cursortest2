package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xaf {
    public final String a;
    public final String b;
    public final CreditDepositTransactionStatusEntity$Status c;
    public final Text.Constant d;
    public final Text e;
    public final String f;
    public final Text g;
    public final String h;
    public final Text i;
    public final String j;
    public final String k;

    public xaf(String str, String str2, CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status, Text.Constant constant, Text.Constant constant2, String str3, Text.Constant constant3, String str4, Text.Constant constant4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = creditDepositTransactionStatusEntity$Status;
        this.d = constant;
        this.e = constant2;
        this.f = str3;
        this.g = constant3;
        this.h = str4;
        this.i = constant4;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaf)) {
            return false;
        }
        xaf xafVar = (xaf) obj;
        return jl40.l(this.a, xafVar.a) && jl40.l(this.b, xafVar.b) && this.c == xafVar.c && this.d.equals(xafVar.d) && jl40.l(this.e, xafVar.e) && jl40.l(this.f, xafVar.f) && jl40.l(this.g, xafVar.g) && jl40.l(this.h, xafVar.h) && jl40.l(this.i, xafVar.i) && jl40.l(this.j, xafVar.j) && jl40.l(this.k, xafVar.k);
    }

    public final int hashCode() {
        int d = xvz.d(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        Text text = this.e;
        int hashCode = (d + (text == null ? 0 : text.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Text text2 = this.g;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Text text3 = this.i;
        int hashCode5 = (hashCode4 + (text3 == null ? 0 : text3.hashCode())) * 31;
        String str3 = this.j;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CreditDepositTransactionStatusEntity(transactionId=", this.a, ", agreementId=", this.b, ", status=");
        v.append(this.c);
        v.append(", title=");
        v.append(this.d);
        v.append(", description=");
        v.append(this.e);
        v.append(", url3ds=");
        v.append(this.f);
        v.append(", buttonText=");
        v.append(this.g);
        v.append(", buttonAction=");
        v.append(this.h);
        v.append(", secondaryButtonText=");
        v.append(this.i);
        v.append(", secondaryButtonAction=");
        v.append(this.j);
        v.append(", closeAction=");
        return oyr.t(v, this.k, Extension.C_BRAKE);
    }
}
