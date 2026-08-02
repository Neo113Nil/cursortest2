package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u170 {
    public final Integer a;
    public final MoneyEntity b;
    public final boolean c;

    public u170(Integer num, MoneyEntity moneyEntity, boolean z) {
        this.a = num;
        this.b = moneyEntity;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u170)) {
            return false;
        }
        u170 u170Var = (u170) obj;
        return jl40.l(this.a, u170Var.a) && jl40.l(this.b, u170Var.b) && this.c == u170Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.c) + ly3.d(this.b, (num == null ? 0 : num.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OncePerMonthEntity(day=");
        sb.append(this.a);
        sb.append(", money=");
        sb.append(this.b);
        sb.append(", isLastDay=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
