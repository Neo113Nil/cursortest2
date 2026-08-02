package defpackage;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesTarget;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rjq0 implements sjq0 {
    public final String a;
    public final RequisitesTarget b;
    public final String c;
    public final String d;
    public final qjq0 e;
    public final String f;
    public final String g;
    public final eh01 h;
    public final DivDataDto i;

    public rjq0(String str, RequisitesTarget requisitesTarget, String str2, String str3, qjq0 qjq0Var, String str4, String str5, eh01 eh01Var, DivDataDto divDataDto) {
        this.a = str;
        this.b = requisitesTarget;
        this.c = str2;
        this.d = str3;
        this.e = qjq0Var;
        this.f = str4;
        this.g = str5;
        this.h = eh01Var;
        this.i = divDataDto;
    }

    @Override // defpackage.wjq0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.wjq0
    public final eh01 b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjq0)) {
            return false;
        }
        rjq0 rjq0Var = (rjq0) obj;
        return jl40.l(this.a, rjq0Var.a) && jl40.l(this.b, rjq0Var.b) && jl40.l(this.c, rjq0Var.c) && jl40.l(this.d, rjq0Var.d) && this.e.equals(rjq0Var.e) && jl40.l(this.f, rjq0Var.f) && jl40.l(this.g, rjq0Var.g) && jl40.l(this.h, rjq0Var.h) && jl40.l(this.i, rjq0Var.i);
    }

    @Override // defpackage.sjq0
    public final String getAccountNumber() {
        return this.a;
    }

    @Override // defpackage.sjq0
    public final RequisitesTarget getTarget() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RequisitesTarget requisitesTarget = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.b(unr0.b((hashCode + (requisitesTarget == null ? 0 : requisitesTarget.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode3 = (this.h.hashCode() + unr0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g)) * 31;
        DivDataDto divDataDto = this.i;
        return hashCode3 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequisitesPersonTransfer(accountNumber=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", firstName=");
        g8e.D(sb, this.c, ", lastName=", this.d, ", middleName=");
        sb.append(this.e);
        sb.append(", paymentPurpose=");
        sb.append(this.f);
        sb.append(", bic=");
        sb.append(this.g);
        sb.append(", fromCircleButton=");
        sb.append(this.h);
        sb.append(", divkitWidget=");
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
