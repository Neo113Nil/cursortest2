package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tc70 implements uc70 {
    public final qc70 a;
    public final boolean b;

    public tc70(qc70 qc70Var, boolean z) {
        this.a = qc70Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc70)) {
            return false;
        }
        tc70 tc70Var = (tc70) obj;
        return jl40.l(this.a, tc70Var.a) && this.b == tc70Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProgressView(progressState=" + this.a + ", shouldAnimateProgress=" + this.b + Extension.C_BRAKE;
    }
}
