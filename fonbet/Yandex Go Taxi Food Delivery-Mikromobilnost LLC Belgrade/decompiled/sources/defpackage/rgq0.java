package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rgq0 {
    public static final BigDecimal e = new BigDecimal(52);
    public static final BigDecimal f = new BigDecimal(12);
    public static final rgq0 g = new rgq0(FrequencyType.ONCE_PER_WEEK, new v170(null, null), new t170(null, null, false), new dk11(null, null));
    public final FrequencyType a;
    public final v170 b;
    public final t170 c;
    public final dk11 d;

    public rgq0(FrequencyType frequencyType, v170 v170Var, t170 t170Var, dk11 dk11Var) {
        this.a = frequencyType;
        this.b = v170Var;
        this.c = t170Var;
        this.d = dk11Var;
    }

    public static rgq0 a(rgq0 rgq0Var, FrequencyType frequencyType, v170 v170Var, t170 t170Var, dk11 dk11Var, int i) {
        if ((i & 1) != 0) {
            frequencyType = rgq0Var.a;
        }
        if ((i & 2) != 0) {
            v170Var = rgq0Var.b;
        }
        if ((i & 4) != 0) {
            t170Var = rgq0Var.c;
        }
        if ((i & 8) != 0) {
            dk11Var = rgq0Var.d;
        }
        rgq0Var.getClass();
        return new rgq0(frequencyType, v170Var, t170Var, dk11Var);
    }

    public final BigDecimal b() {
        MoneyEntity moneyEntity;
        MoneyEntity moneyEntity2;
        int i = qgq0.a[this.a.ordinal()];
        if (i == 1) {
            MoneyEntity moneyEntity3 = this.b.b;
            if (moneyEntity3 != null) {
                return moneyEntity3.getAmount();
            }
        } else if (i == 2) {
            MoneyEntity moneyEntity4 = this.c.b;
            if (moneyEntity4 != null) {
                return moneyEntity4.getAmount();
            }
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            dk11 dk11Var = this.d;
            z630 z630Var = dk11Var.a;
            BigDecimal amount = (z630Var == null || (moneyEntity2 = z630Var.b) == null) ? null : moneyEntity2.getAmount();
            z630 z630Var2 = dk11Var.b;
            BigDecimal amount2 = (z630Var2 == null || (moneyEntity = z630Var2.b) == null) ? null : moneyEntity.getAmount();
            if (amount != null && amount2 != null) {
                return amount.add(amount2);
            }
        }
        return null;
    }

    public final BigDecimal c() {
        BigDecimal bigDecimal;
        BigDecimal b = b();
        if (b == null) {
            return null;
        }
        int i = qgq0.a[this.a.ordinal()];
        if (i == 1) {
            bigDecimal = e;
        } else {
            if (i != 2 && i != 3) {
                w511.b();
                return null;
            }
            bigDecimal = f;
        }
        return b.multiply(bigDecimal);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgq0)) {
            return false;
        }
        rgq0 rgq0Var = (rgq0) obj;
        return this.a == rgq0Var.a && this.b.equals(rgq0Var.b) && this.c.equals(rgq0Var.c) && this.d.equals(rgq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectedFrequencyOption(type=" + this.a + ", oncePerWeek=" + this.b + ", oncePerMonth=" + this.c + ", twicePerMonth=" + this.d + Extension.C_BRAKE;
    }
}
