package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t9m0 {
    public final Date a;
    public final MoneyEntity b;
    public final SavingsActionStatus c;
    public final Throwable d;

    public t9m0(Date date, MoneyEntity moneyEntity, SavingsActionStatus savingsActionStatus, Throwable th) {
        this.a = date;
        this.b = moneyEntity;
        this.c = savingsActionStatus;
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9m0)) {
            return false;
        }
        t9m0 t9m0Var = (t9m0) obj;
        return jl40.l(this.a, t9m0Var.a) && jl40.l(this.b, t9m0Var.b) && this.c == t9m0Var.c && jl40.l(this.d, t9m0Var.d);
    }

    public final int hashCode() {
        Date date = this.a;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        MoneyEntity moneyEntity = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31)) * 31;
        Throwable th = this.d;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ChangeGoal(date=" + this.a + ", amount=" + this.b + ", status=" + this.c + ", error=" + this.d + Extension.C_BRAKE;
    }
}
