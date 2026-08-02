package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ty21 {
    public final String a;
    public final String b;
    public final String c;
    public final h5a0 d;
    public final AutoTopupType e;
    public final AutoTopupSwitchStatus f;
    public final AutoTopupSwitchStatus g;
    public final String h;

    public ty21(String str, String str2, String str3, h5a0 h5a0Var, AutoTopupType autoTopupType, AutoTopupSwitchStatus autoTopupSwitchStatus, AutoTopupSwitchStatus autoTopupSwitchStatus2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = h5a0Var;
        this.e = autoTopupType;
        this.f = autoTopupSwitchStatus;
        this.g = autoTopupSwitchStatus2;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty21)) {
            return false;
        }
        ty21 ty21Var = (ty21) obj;
        return jl40.l(this.a, ty21Var.a) && jl40.l(this.b, ty21Var.b) && jl40.l(this.c, ty21Var.c) && jl40.l(this.d, ty21Var.d) && this.e == ty21Var.e && this.f == ty21Var.f && this.g == ty21Var.g && this.h.equals(ty21Var.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        h5a0 h5a0Var = this.d;
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((b + (h5a0Var == null ? 0 : h5a0Var.hashCode())) * 31)) * 31)) * 31;
        AutoTopupSwitchStatus autoTopupSwitchStatus = this.g;
        return this.h.hashCode() + ((hashCode + (autoTopupSwitchStatus != null ? autoTopupSwitchStatus.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ValidateAutoTopupInfo(agreementId=", this.a, ", amount=", this.b, ", threshold=");
        v.append(this.c);
        v.append(", paymentMethod=");
        v.append(this.d);
        v.append(", autoTopupType=");
        v.append(this.e);
        v.append(", autoTopupStatus=");
        v.append(this.f);
        v.append(", autoFundStatus=");
        v.append(this.g);
        v.append(", autoFundAmount=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
