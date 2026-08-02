package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s24 {
    public final SettingStatus a;
    public final AutoTopupType b;
    public final MoneyEntity c;
    public final MoneyEntity d;

    public s24(SettingStatus settingStatus, AutoTopupType autoTopupType, MoneyEntity moneyEntity, MoneyEntity moneyEntity2) {
        this.a = settingStatus;
        this.b = autoTopupType;
        this.c = moneyEntity;
        this.d = moneyEntity2;
    }

    public static s24 a(s24 s24Var, SettingStatus settingStatus) {
        AutoTopupType autoTopupType = s24Var.b;
        MoneyEntity moneyEntity = s24Var.c;
        MoneyEntity moneyEntity2 = s24Var.d;
        s24Var.getClass();
        return new s24(settingStatus, autoTopupType, moneyEntity, moneyEntity2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s24)) {
            return false;
        }
        s24 s24Var = (s24) obj;
        return this.a == s24Var.a && this.b == s24Var.b && jl40.l(this.c, s24Var.c) && jl40.l(this.d, s24Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        AutoTopupType autoTopupType = this.b;
        return this.d.hashCode() + ly3.d(this.c, (hashCode + (autoTopupType == null ? 0 : autoTopupType.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "AutoTopup(status=" + this.a + ", focusType=" + this.b + ", amount=" + this.c + ", threshold=" + this.d + Extension.C_BRAKE;
    }
}
