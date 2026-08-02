package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uk01 implements xk01 {
    public final Throwable a;
    public final Set b;

    public uk01(Set set, Throwable th) {
        this.a = th;
        this.b = set;
    }

    @Override // defpackage.xk01
    public final Set a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk01)) {
            return false;
        }
        uk01 uk01Var = (uk01) obj;
        return this.a.equals(uk01Var.a) && this.b.equals(uk01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(description=" + this.a + ", m2mSelectedActionCompletedBankIds=" + this.b + Extension.C_BRAKE;
    }
}
