package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class tzv0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public tzv0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzv0)) {
            return false;
        }
        tzv0 tzv0Var = (tzv0) obj;
        return this.a == tzv0Var.a && this.b == tzv0Var.b && this.c == tzv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("ErrorInfo(loadingHasTaxiButton=", ", failureHasTaxiButton=", ", retryHasTaxiButton=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
