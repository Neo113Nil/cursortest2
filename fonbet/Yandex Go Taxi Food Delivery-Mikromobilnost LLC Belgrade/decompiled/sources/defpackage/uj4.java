package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class uj4 {
    public static final uj4 c;
    public final List a;
    public final List b;

    static {
        EmptyList emptyList = EmptyList.a;
        c = new uj4(emptyList, emptyList);
    }

    public uj4(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj4)) {
            return false;
        }
        uj4 uj4Var = (uj4) obj;
        return this.a.equals(uj4Var.a) && this.b.equals(uj4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("BadgeConfig(badges=", this.a, ", addPaymentBadges=", this.b, Extension.C_BRAKE);
    }
}
