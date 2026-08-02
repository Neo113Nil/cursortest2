package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rez0 {
    public final long a;

    public /* synthetic */ rez0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rez0) {
            return this.a == ((rez0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "Timestamp(rawValue=", Extension.C_BRAKE);
    }
}
