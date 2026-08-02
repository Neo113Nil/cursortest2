package defpackage;

import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mmt extends myo {
    public final String c;
    public final NoSuchAlgorithmException d;

    public mmt(String str, NoSuchAlgorithmException noSuchAlgorithmException) {
        str.getClass();
        this.c = str;
        this.d = noSuchAlgorithmException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmt)) {
            return false;
        }
        mmt mmtVar = (mmt) obj;
        return Intrinsics.d(this.c, mmtVar.c) && Intrinsics.d(this.d, mmtVar.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        NoSuchAlgorithmException noSuchAlgorithmException = this.d;
        return hashCode + (noSuchAlgorithmException == null ? 0 : noSuchAlgorithmException.hashCode());
    }

    public final String toString() {
        NoSuchAlgorithmException noSuchAlgorithmException = this.d;
        String str = this.c;
        if (noSuchAlgorithmException == null) {
            return f1d.g("Unsupported signature algorithm ", str);
        }
        StringBuilder u = ouj.u("Unsupported signature algorithm ", str, " with: ");
        u.append(vut.U(noSuchAlgorithmException));
        return u.toString();
    }
}
