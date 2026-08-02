package defpackage;

import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xeb0 implements cfb0 {
    public final SelectedPartner a;
    public final PhoneInputSource b;

    public xeb0(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
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
        if (!(obj instanceof xeb0)) {
            return false;
        }
        xeb0 xeb0Var = (xeb0) obj;
        return jl40.l(this.a, xeb0Var.a) && this.b == xeb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToNameReceiver(partner=" + this.a + ", inputSource=" + this.b + Extension.C_BRAKE;
    }
}
