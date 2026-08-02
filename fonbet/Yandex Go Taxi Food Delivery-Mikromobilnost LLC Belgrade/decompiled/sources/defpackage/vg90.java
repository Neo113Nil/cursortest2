package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vg90 {
    public final long a;
    public final long b;

    public vg90(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg90)) {
            return false;
        }
        vg90 vg90Var = (vg90) obj;
        return this.a == vg90Var.a && this.b == vg90Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "ParticipantsCountEntity(chatInternalId=", ", count="));
    }
}
