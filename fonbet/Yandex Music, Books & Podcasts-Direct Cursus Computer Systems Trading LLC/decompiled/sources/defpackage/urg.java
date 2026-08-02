package defpackage;

import java.security.PublicKey;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class urg {
    public final PublicKey a;
    public final Long b;
    public final byte[] c;

    public urg(PublicKey publicKey, Long l) {
        publicKey.getClass();
        this.a = publicKey;
        this.b = l;
        byte[] encoded = publicKey.getEncoded();
        int length = publicKey.getEncoded().length;
        pn3 pn3Var = pn3.d;
        this.c = ovn.L(length, encoded).c("SHA-256").t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urg)) {
            return false;
        }
        urg urgVar = (urg) obj;
        return Intrinsics.d(this.a, urgVar.a) && Intrinsics.d(this.b, urgVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogServer(key=");
        sb.append(this.a);
        sb.append(", validUntil=");
        return tlm.k(sb, this.b, ')');
    }
}
