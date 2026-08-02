package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class v77 {
    public final byte[] a;

    public v77(byte[] bArr) {
        this.a = bArr;
        int length = bArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v77)) {
            return false;
        }
        return Arrays.equals(this.a, ((v77) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a.length, "Bytes(size=", Extension.C_BRAKE);
    }
}
