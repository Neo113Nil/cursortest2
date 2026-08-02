package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tmv0 {
    public final List a;
    public final boolean b;

    public tmv0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmv0)) {
            return false;
        }
        tmv0 tmv0Var = (tmv0) obj;
        return this.a.equals(tmv0Var.a) && this.b == tmv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "SummaryPromotionsInfo(promotions=", ", isLoadingData=", Extension.C_BRAKE, this.b);
    }
}
