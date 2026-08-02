package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class t6u {
    public static final s6u Companion = new s6u();
    public final long a;

    public /* synthetic */ t6u(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
        } else {
            qje.Z(i, 1, r6u.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6u) && this.a == ((t6u) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "HangupConfirmationConfig(showConfirmationDelaySec=", Extension.C_BRAKE);
    }

    public t6u(long j) {
        this.a = j;
    }
}
