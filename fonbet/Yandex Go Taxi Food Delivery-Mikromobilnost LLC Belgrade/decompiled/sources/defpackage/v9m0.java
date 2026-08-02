package defpackage;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v9m0 {
    public final String a;
    public final SavingsActionStatus b;
    public final Throwable c;

    public v9m0(String str, SavingsActionStatus savingsActionStatus, Throwable th) {
        this.a = str;
        this.b = savingsActionStatus;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9m0)) {
            return false;
        }
        v9m0 v9m0Var = (v9m0) obj;
        return jl40.l(this.a, v9m0Var.a) && this.b == v9m0Var.b && jl40.l(this.c, v9m0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Throwable th = this.c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "ChangeTheme(newThemeId=" + this.a + ", status=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
