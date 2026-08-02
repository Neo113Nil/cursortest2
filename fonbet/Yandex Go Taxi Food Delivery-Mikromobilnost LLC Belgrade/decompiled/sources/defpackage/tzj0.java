package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tzj0 {
    public final ResultStatus a;
    public final String b;
    public final vzj0 c;
    public final uzj0 d;

    public tzj0(ResultStatus resultStatus, String str, vzj0 vzj0Var, uzj0 uzj0Var) {
        this.a = resultStatus;
        this.b = str;
        this.c = vzj0Var;
        this.d = uzj0Var;
    }

    public static tzj0 a(tzj0 tzj0Var, ResultStatus resultStatus, String str, vzj0 vzj0Var, uzj0 uzj0Var, int i) {
        if ((i & 1) != 0) {
            resultStatus = tzj0Var.a;
        }
        if ((i & 2) != 0) {
            str = tzj0Var.b;
        }
        if ((i & 4) != 0) {
            vzj0Var = tzj0Var.c;
        }
        if ((i & 8) != 0) {
            uzj0Var = tzj0Var.d;
        }
        tzj0Var.getClass();
        return new tzj0(resultStatus, str, vzj0Var, uzj0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzj0)) {
            return false;
        }
        tzj0 tzj0Var = (tzj0) obj;
        return this.a == tzj0Var.a && jl40.l(this.b, tzj0Var.b) && jl40.l(this.c, tzj0Var.c) && jl40.l(this.d, tzj0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        vzj0 vzj0Var = this.c;
        int hashCode3 = (hashCode2 + (vzj0Var == null ? 0 : vzj0Var.hashCode())) * 31;
        uzj0 uzj0Var = this.d;
        return hashCode3 + (uzj0Var != null ? uzj0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ResultPaymentEntity(status=" + this.a + ", paymentId=" + this.b + ", successStatusData=" + this.c + ", failedStatusData=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ tzj0(ResultStatus resultStatus, String str, int i) {
        this(resultStatus, (i & 2) != 0 ? null : str, null, null);
    }
}
