package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class qp20 {
    public static final pp20 Companion = new pp20();
    public final String a;
    public final long b;

    public /* synthetic */ qp20(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, op20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp20)) {
            return false;
        }
        qp20 qp20Var = (qp20) obj;
        return jl40.l(this.a, qp20Var.a) && this.b == qp20Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("MobNotificationCacheEntry(notificationId=", this.a, ", timestampSec=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public qp20(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
