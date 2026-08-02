package defpackage;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x9m0 {
    public final boolean a;
    public final SavingsActionStatus b;
    public final Throwable c;

    public x9m0(boolean z, SavingsActionStatus savingsActionStatus, Throwable th) {
        this.a = z;
        this.b = savingsActionStatus;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9m0)) {
            return false;
        }
        x9m0 x9m0Var = (x9m0) obj;
        return this.a == x9m0Var.a && this.b == x9m0Var.b && jl40.l(this.c, x9m0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Throwable th = this.c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "Lock(locked=" + this.a + ", status=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
