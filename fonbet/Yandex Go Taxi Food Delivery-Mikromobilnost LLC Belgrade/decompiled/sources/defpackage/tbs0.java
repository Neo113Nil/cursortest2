package defpackage;

import java.util.Arrays;
import ru.domesticroots.certificatetransparency.internal.verifier.model.Version;

/* loaded from: classes4.dex */
public final class tbs0 {
    public final Version a;
    public final lez b;
    public final long c;
    public final sjj d;
    public final byte[] e;

    public tbs0(Version version, lez lezVar, long j, sjj sjjVar, byte[] bArr) {
        this.a = version;
        this.b = lezVar;
        this.c = j;
        this.d = sjjVar;
        this.e = bArr;
    }

    public final lez a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tbs0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tbs0 tbs0Var = (tbs0) obj;
        return this.a == tbs0Var.a && this.b.equals(tbs0Var.b) && this.c == tbs0Var.c && this.d.equals(tbs0Var.d) && Arrays.equals(this.e, tbs0Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + qv10.c((Arrays.hashCode(this.b.a) + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "SignedCertificateTimestamp(sctVersion=" + this.a + ", id=" + this.b + ", timestamp=" + this.c + ", signature=" + this.d + ", extensions=" + Arrays.toString(this.e) + ')';
    }
}
