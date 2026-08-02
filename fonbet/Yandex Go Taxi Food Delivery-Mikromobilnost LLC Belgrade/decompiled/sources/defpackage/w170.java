package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.DayOfWeek;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w170 {
    public final DayOfWeek a;
    public final MoneyEntity b;

    public w170(DayOfWeek dayOfWeek, MoneyEntity moneyEntity) {
        this.a = dayOfWeek;
        this.b = moneyEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w170)) {
            return false;
        }
        w170 w170Var = (w170) obj;
        return this.a == w170Var.a && jl40.l(this.b, w170Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OncePerWeekEntity(day=" + this.a + ", money=" + this.b + Extension.C_BRAKE;
    }
}
