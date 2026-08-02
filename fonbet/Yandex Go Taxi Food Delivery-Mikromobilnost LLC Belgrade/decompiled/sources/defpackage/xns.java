package defpackage;

import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xns {
    public final ResultStatus a;
    public final rr51 b;

    public xns(ResultStatus resultStatus, rr51 rr51Var) {
        this.a = resultStatus;
        this.b = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xns)) {
            return false;
        }
        xns xnsVar = (xns) obj;
        return this.a == xnsVar.a && jl40.l(this.b, xnsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rr51 rr51Var = this.b;
        return hashCode + (rr51Var == null ? 0 : rr51Var.hashCode());
    }

    public final String toString() {
        return "FundDocsNoticeEntity(status=" + this.a + ", divkit=" + this.b + Extension.C_BRAKE;
    }
}
