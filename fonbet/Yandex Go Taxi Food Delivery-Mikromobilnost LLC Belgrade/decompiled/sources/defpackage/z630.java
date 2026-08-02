package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z630 {
    public final Integer a;
    public final MoneyEntity b;

    public z630(Integer num, MoneyEntity moneyEntity) {
        this.a = num;
        this.b = moneyEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z630)) {
            return false;
        }
        z630 z630Var = (z630) obj;
        return jl40.l(this.a, z630Var.a) && jl40.l(this.b, z630Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MoneyEntity moneyEntity = this.b;
        return hashCode + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public final String toString() {
        return "MonthDayToMoney(day=" + this.a + ", money=" + this.b + Extension.C_BRAKE;
    }
}
