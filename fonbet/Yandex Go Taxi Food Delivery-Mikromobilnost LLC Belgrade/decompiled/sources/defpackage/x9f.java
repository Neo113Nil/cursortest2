package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x9f {
    public final Text a;
    public final Text b;
    public final String c;
    public final TooltipPosition d;
    public final Text e;
    public final String f;
    public final rbv g;
    public final List h;
    public final rr51 i;
    public final boolean j;

    public x9f(Text text, Text text2, String str, TooltipPosition tooltipPosition, Text text3, String str2, rbv rbvVar, List list, rr51 rr51Var, boolean z) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = tooltipPosition;
        this.e = text3;
        this.f = str2;
        this.g = rbvVar;
        this.h = list;
        this.i = rr51Var;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9f)) {
            return false;
        }
        x9f x9fVar = (x9f) obj;
        return jl40.l(this.a, x9fVar.a) && jl40.l(this.b, x9fVar.b) && jl40.l(this.c, x9fVar.c) && this.d == x9fVar.d && jl40.l(this.e, x9fVar.e) && jl40.l(this.f, x9fVar.f) && jl40.l(this.g, x9fVar.g) && jl40.l(this.h, x9fVar.h) && jl40.l(this.i, x9fVar.i) && this.j == x9fVar.j;
    }

    public final int hashCode() {
        Text text = this.a;
        int hashCode = (text == null ? 0 : text.hashCode()) * 31;
        Text text2 = this.b;
        int hashCode2 = (hashCode + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Text text3 = this.e;
        int hashCode4 = (hashCode3 + (text3 == null ? 0 : text3.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        rbv rbvVar = this.g;
        int c = unr0.c((hashCode5 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, this.h);
        rr51 rr51Var = this.i;
        return Boolean.hashCode(this.j) + ((c + (rr51Var != null ? rr51Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("CreditDepositAmountCheckEntity(amountDescription=", this.a, ", tooltip=", this.b, ", tooltipAmount=");
        p.append(this.c);
        p.append(", tooltipPosition=");
        p.append(this.d);
        p.append(", tooltipActionText=");
        p.append(this.e);
        p.append(", tooltipAction=");
        p.append(this.f);
        p.append(", tooltipActionImage=");
        p.append(this.g);
        p.append(", suggests=");
        p.append(this.h);
        p.append(", divkitData=");
        p.append(this.i);
        p.append(", isPaymentAllowed=");
        p.append(this.j);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
