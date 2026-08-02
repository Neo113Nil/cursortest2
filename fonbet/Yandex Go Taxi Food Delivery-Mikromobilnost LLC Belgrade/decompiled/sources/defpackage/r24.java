package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r24 {
    public final SettingStatus a;
    public final MoneyEntity b;

    public r24(SettingStatus settingStatus, MoneyEntity moneyEntity) {
        this.a = settingStatus;
        this.b = moneyEntity;
    }

    public static r24 a(r24 r24Var, SettingStatus settingStatus, MoneyEntity moneyEntity, int i) {
        if ((i & 1) != 0) {
            settingStatus = r24Var.a;
        }
        if ((i & 2) != 0) {
            moneyEntity = r24Var.b;
        }
        r24Var.getClass();
        return new r24(settingStatus, moneyEntity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r24)) {
            return false;
        }
        r24 r24Var = (r24) obj;
        return this.a == r24Var.a && jl40.l(this.b, r24Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoFund(status=" + this.a + ", limit=" + this.b + Extension.C_BRAKE;
    }
}
