package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wps implements zps {
    public final Text.Constant a;
    public final Text.Constant b;
    public final h5a0 c;
    public final uda0 d;
    public final MoneyEntity e;
    public final uos f;
    public final rr51 g;
    public final Text.Constant h;
    public final String i;

    public wps(Text.Constant constant, Text.Constant constant2, h5a0 h5a0Var, uda0 uda0Var, MoneyEntity moneyEntity, uos uosVar, rr51 rr51Var, Text.Constant constant3, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = h5a0Var;
        this.d = uda0Var;
        this.e = moneyEntity;
        this.f = uosVar;
        this.g = rr51Var;
        this.h = constant3;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wps)) {
            return false;
        }
        wps wpsVar = (wps) obj;
        return this.a.equals(wpsVar.a) && this.b.equals(wpsVar.b) && jl40.l(this.c, wpsVar.c) && this.d.equals(wpsVar.d) && jl40.l(this.e, wpsVar.e) && this.f.equals(wpsVar.f) && this.g.equals(wpsVar.g) && this.h.equals(wpsVar.h) && jl40.l(this.i, wpsVar.i);
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        h5a0 h5a0Var = this.c;
        int hashCode = (this.d.hashCode() + ((d + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31)) * 31;
        MoneyEntity moneyEntity = this.e;
        return this.i.hashCode() + xvz.d(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (moneyEntity != null ? moneyEntity.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("OpenAndTopupScreen(title=", this.a, ", subtitle=", this.b, ", currentPaymentMethod=");
        u.append(this.c);
        u.append(", paymentMethodsList=");
        u.append(this.d);
        u.append(", money=");
        u.append(this.e);
        u.append(", limitsData=");
        u.append(this.f);
        u.append(", bottomDivkitWidget=");
        u.append(this.g);
        u.append(", saveButtonText=");
        u.append(this.h);
        u.append(", fundAgreementId=");
        return oyr.t(u, this.i, Extension.C_BRAKE);
    }
}
