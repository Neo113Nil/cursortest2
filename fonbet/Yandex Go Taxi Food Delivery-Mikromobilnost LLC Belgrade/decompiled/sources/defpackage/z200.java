package defpackage;

import com.yandex.plus.core.graphql.type.VOLUNTARY_AGREEMENT_TEXT_LOGIC;
import com.yandex.plus.core.graphql.type.VOLUNTARY_MAILING_AGREEMENT_STATUS;

/* loaded from: classes2.dex */
public final class z200 {
    public final VOLUNTARY_MAILING_AGREEMENT_STATUS a;
    public final VOLUNTARY_AGREEMENT_TEXT_LOGIC b;
    public final d300 c;

    public z200(VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status, VOLUNTARY_AGREEMENT_TEXT_LOGIC voluntary_agreement_text_logic, d300 d300Var) {
        this.a = voluntary_mailing_agreement_status;
        this.b = voluntary_agreement_text_logic;
        this.c = d300Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z200)) {
            return false;
        }
        z200 z200Var = (z200) obj;
        return this.a == z200Var.a && this.b == z200Var.b && this.c.equals(z200Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Agreement(agreementDefaultStatus=" + this.a + ", logic=" + this.b + ", text=" + this.c + ')';
    }
}
