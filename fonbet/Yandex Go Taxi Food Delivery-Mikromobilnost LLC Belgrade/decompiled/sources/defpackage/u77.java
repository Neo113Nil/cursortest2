package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class u77 {
    public final byte[] a;

    public u77(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static u77 a(byte[] bArr) {
        if (bArr != null) {
            return new u77(bArr, bArr.length);
        }
        ny61.t("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u77) {
            return Arrays.equals(((u77) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + s8o.j(this.a) + Extension.C_BRAKE;
    }
}
