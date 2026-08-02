package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qel0 {
    public final long a;
    public final boolean b;

    public qel0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qel0)) {
            return false;
        }
        qel0 qel0Var = (qel0) obj;
        return this.a == qel0Var.a && this.b == qel0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TeleportResult(adjustedTimestamp=" + this.a + ", isTeleported=" + this.b + Extension.C_BRAKE;
    }
}
