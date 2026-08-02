package defpackage;

import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yv3 {
    public final BigDecimal a;
    public final BigDecimal b;
    public final q5a0 c;
    public final AutoTopupType d;
    public final AutoTopupSwitchStatus e;
    public final lr3 f;

    public yv3(BigDecimal bigDecimal, BigDecimal bigDecimal2, q5a0 q5a0Var, AutoTopupType autoTopupType, AutoTopupSwitchStatus autoTopupSwitchStatus, lr3 lr3Var) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = q5a0Var;
        this.d = autoTopupType;
        this.e = autoTopupSwitchStatus;
        this.f = lr3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv3)) {
            return false;
        }
        yv3 yv3Var = (yv3) obj;
        return jl40.l(this.a, yv3Var.a) && jl40.l(this.b, yv3Var.b) && this.c.equals(yv3Var.c) && this.d == yv3Var.d && this.e == yv3Var.e && jl40.l(this.f, yv3Var.f);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.a;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31)) * 31;
        AutoTopupType autoTopupType = this.d;
        int hashCode3 = (hashCode2 + (autoTopupType == null ? 0 : autoTopupType.hashCode())) * 31;
        AutoTopupSwitchStatus autoTopupSwitchStatus = this.e;
        int hashCode4 = (hashCode3 + (autoTopupSwitchStatus == null ? 0 : autoTopupSwitchStatus.hashCode())) * 31;
        lr3 lr3Var = this.f;
        return hashCode4 + (lr3Var != null ? lr3Var.hashCode() : 0);
    }

    public final String toString() {
        return "AutoTopupHmacParams(amount=" + this.a + ", threshold=" + this.b + ", paymentMethodInfoParams=" + this.c + ", autoTopupType=" + this.d + ", autoTopupStatus=" + this.e + ", autoFundParams=" + this.f + Extension.C_BRAKE;
    }
}
