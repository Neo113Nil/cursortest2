package defpackage;

import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xn01 implements qas0 {
    public final SelectedPartner a;
    public final PhoneInputSource b;

    public xn01(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
        this.a = selectedPartner;
        this.b = phoneInputSource;
    }

    public final PhoneInputSource a() {
        return this.b;
    }

    public final SelectedPartner b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn01)) {
            return false;
        }
        xn01 xn01Var = (xn01) obj;
        return jl40.l(this.a, xn01Var.a) && this.b == xn01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubmitConfirmed(partner=" + this.a + ", inputSource=" + this.b + Extension.C_BRAKE;
    }
}
