package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t170 {
    public final Integer a;
    public final MoneyEntity b;
    public final boolean c;

    public t170(Integer num, MoneyEntity moneyEntity, boolean z) {
        this.a = num;
        this.b = moneyEntity;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t170)) {
            return false;
        }
        t170 t170Var = (t170) obj;
        return jl40.l(this.a, t170Var.a) && jl40.l(this.b, t170Var.b) && this.c == t170Var.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MoneyEntity moneyEntity = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (moneyEntity != null ? moneyEntity.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OncePerMonth(day=");
        sb.append(this.a);
        sb.append(", money=");
        sb.append(this.b);
        sb.append(", isLastDay=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
