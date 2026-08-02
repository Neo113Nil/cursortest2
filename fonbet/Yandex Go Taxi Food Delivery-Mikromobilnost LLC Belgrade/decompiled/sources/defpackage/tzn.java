package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tzn {
    public final byte[] a;
    public final byte[] b;

    public tzn(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final byte[] a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzn)) {
            return false;
        }
        tzn tznVar = (tzn) obj;
        return this.a.equals(tznVar.a) && this.b.equals(tznVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("EncryptedData(ciphertext=", Arrays.toString(this.a), ", initializationVector=", Arrays.toString(this.b), Extension.C_BRAKE);
    }
}
