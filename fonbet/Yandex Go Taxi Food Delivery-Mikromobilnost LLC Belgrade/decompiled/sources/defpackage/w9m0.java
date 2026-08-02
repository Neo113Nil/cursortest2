package defpackage;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w9m0 {
    public final SavingsActionStatus a;
    public final Throwable b;

    public w9m0(SavingsActionStatus savingsActionStatus, Throwable th) {
        this.a = savingsActionStatus;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9m0)) {
            return false;
        }
        w9m0 w9m0Var = (w9m0) obj;
        return this.a == w9m0Var.a && jl40.l(this.b, w9m0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Close(status=" + this.a + ", error=" + this.b + Extension.C_BRAKE;
    }
}
