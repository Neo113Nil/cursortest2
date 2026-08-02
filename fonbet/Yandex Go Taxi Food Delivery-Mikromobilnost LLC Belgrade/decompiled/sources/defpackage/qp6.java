package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qp6 {
    public final BudgetGetStatusEntity$Status a;
    public final q8u0 b;
    public final String c;

    public /* synthetic */ qp6(BudgetGetStatusEntity$Status budgetGetStatusEntity$Status, q8u0 q8u0Var, int i) {
        this(budgetGetStatusEntity$Status, (i & 2) != 0 ? null : q8u0Var, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp6)) {
            return false;
        }
        qp6 qp6Var = (qp6) obj;
        return this.a == qp6Var.a && jl40.l(this.b, qp6Var.b) && jl40.l(this.c, qp6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q8u0 q8u0Var = this.b;
        int hashCode2 = (hashCode + (q8u0Var == null ? 0 : q8u0Var.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BudgetGetStatusEntity(status=");
        sb.append(this.a);
        sb.append(", statusInfo=");
        sb.append(this.b);
        sb.append(", action=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public qp6(BudgetGetStatusEntity$Status budgetGetStatusEntity$Status, q8u0 q8u0Var, String str) {
        this.a = budgetGetStatusEntity$Status;
        this.b = q8u0Var;
        this.c = str;
    }
}
