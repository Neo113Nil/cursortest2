package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qz3 {
    public final String a;
    public final Text b;
    public final Text c;
    public final rbv d;
    public final Text e;
    public final uda0 f;
    public final pz3 g;
    public final nz3 h;
    public final vou0 i;
    public final mz3 j;
    public final lz3 k;
    public final String l;
    public final h5a0 m;
    public final List n;

    public qz3(String str, Text text, Text text2, rbv rbvVar, Text text3, uda0 uda0Var, pz3 pz3Var, nz3 nz3Var, vou0 vou0Var, mz3 mz3Var, lz3 lz3Var, String str2, h5a0 h5a0Var, List list) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = rbvVar;
        this.e = text3;
        this.f = uda0Var;
        this.g = pz3Var;
        this.h = nz3Var;
        this.i = vou0Var;
        this.j = mz3Var;
        this.k = lz3Var;
        this.l = str2;
        this.m = h5a0Var;
        this.n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz3)) {
            return false;
        }
        qz3 qz3Var = (qz3) obj;
        return jl40.l(this.a, qz3Var.a) && jl40.l(this.b, qz3Var.b) && jl40.l(this.c, qz3Var.c) && jl40.l(this.d, qz3Var.d) && jl40.l(this.e, qz3Var.e) && this.f.equals(qz3Var.f) && jl40.l(this.g, qz3Var.g) && jl40.l(this.h, qz3Var.h) && jl40.l(this.i, qz3Var.i) && this.j.equals(qz3Var.j) && jl40.l(this.k, qz3Var.k) && jl40.l(this.l, qz3Var.l) && jl40.l(this.m, qz3Var.m) && this.n.equals(qz3Var.n);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        rbv rbvVar = this.d;
        int hashCode2 = (this.f.hashCode() + n.c(this.e, (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31)) * 31;
        pz3 pz3Var = this.g;
        int hashCode3 = (hashCode2 + (pz3Var == null ? 0 : pz3Var.hashCode())) * 31;
        nz3 nz3Var = this.h;
        int hashCode4 = (hashCode3 + (nz3Var == null ? 0 : nz3Var.hashCode())) * 31;
        vou0 vou0Var = this.i;
        int hashCode5 = (this.j.hashCode() + ((hashCode4 + (vou0Var == null ? 0 : vou0Var.hashCode())) * 31)) * 31;
        lz3 lz3Var = this.k;
        int hashCode6 = (hashCode5 + (lz3Var == null ? 0 : lz3Var.hashCode())) * 31;
        String str = this.l;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        h5a0 h5a0Var = this.m;
        return this.n.hashCode() + ((hashCode7 + (h5a0Var != null ? h5a0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AutoTopupSetupEntity(agreementId=" + this.a + ", screenTitle=" + this.b + ", screenSubtitle=" + this.c + ", screenIcon=" + this.d + ", saveButtonText=" + this.e + ", paymentMethods=" + this.f + ", savingsNoticeEntity=" + this.g + ", bindingPaymentData=" + this.h + ", confirmationPaymentInstructionData=" + this.i + ", autoTopupData=" + this.j + ", autoFundData=" + this.k + ", autoTopupId=" + this.l + ", selectedPaymentMethod=" + this.m + ", fullScreens=" + this.n + Extension.C_BRAKE;
    }
}
