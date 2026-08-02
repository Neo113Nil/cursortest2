package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qc30 implements rc30 {
    public final String a;
    public final long b;

    public qc30(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc30)) {
            return false;
        }
        qc30 qc30Var = (qc30) obj;
        return this.a.equals(qc30Var.a) && this.b == qc30Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("LastTrip(time=", this.a, ", timeValue=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
