package defpackage;

import com.yandex.go.navigator.repository.ReportStatus$Error$ErrorType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q3j0 implements v3j0 {
    public final ReportStatus$Error$ErrorType a;
    public final String b;

    public q3j0(ReportStatus$Error$ErrorType reportStatus$Error$ErrorType, String str) {
        this.a = reportStatus$Error$ErrorType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3j0)) {
            return false;
        }
        q3j0 q3j0Var = (q3j0) obj;
        return this.a == q3j0Var.a && jl40.l(this.b, q3j0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Error(type=" + this.a + ", msg=" + this.b + Extension.C_BRAKE;
    }
}
