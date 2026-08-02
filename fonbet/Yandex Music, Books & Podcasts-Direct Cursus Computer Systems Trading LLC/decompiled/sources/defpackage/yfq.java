package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class yfq {
    public final r0u a;
    public final erg b;
    public final long c;
    public final m38 d;
    public final byte[] e;

    public yfq(r0u r0uVar, erg ergVar, long j, m38 m38Var, byte[] bArr) {
        this.a = r0uVar;
        this.b = ergVar;
        this.c = j;
        this.d = m38Var;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yfq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        yfq yfqVar = (yfq) obj;
        return this.a == yfqVar.a && this.b.equals(yfqVar.b) && this.c == yfqVar.c && this.d.equals(yfqVar.d) && Arrays.equals(this.e, yfqVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + tlm.c(this.c, (Arrays.hashCode(this.b.a) + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "SignedCertificateTimestamp(sctVersion=" + this.a + ", id=" + this.b + ", timestamp=" + this.c + ", signature=" + this.d + ", extensions=" + Arrays.toString(this.e) + ')';
    }
}
