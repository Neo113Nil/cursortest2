package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v170 {
    public final DayOfWeek a;
    public final MoneyEntity b;

    public v170(DayOfWeek dayOfWeek, MoneyEntity moneyEntity) {
        this.a = dayOfWeek;
        this.b = moneyEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v170)) {
            return false;
        }
        v170 v170Var = (v170) obj;
        return this.a == v170Var.a && jl40.l(this.b, v170Var.b);
    }

    public final int hashCode() {
        DayOfWeek dayOfWeek = this.a;
        int hashCode = (dayOfWeek == null ? 0 : dayOfWeek.hashCode()) * 31;
        MoneyEntity moneyEntity = this.b;
        return hashCode + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        return "OncePerWeek(day=" + this.a + ", money=" + this.b + Extension.C_BRAKE;
    }
}
