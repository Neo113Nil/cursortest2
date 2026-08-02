package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qw51 {
    public final int a;
    public final int b;

    public qw51(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw51)) {
            return false;
        }
        qw51 qw51Var = (qw51) obj;
        return this.a == qw51Var.a && this.b == qw51Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ProgressIndicatorState(progress=", ", progressBarUpperValue=", Extension.C_BRAKE);
    }
}
