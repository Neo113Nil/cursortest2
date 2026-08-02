package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uzn {
    public final String a;
    public final byte[] b;

    public uzn(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzn)) {
            return false;
        }
        uzn uznVar = (uzn) obj;
        return this.a.equals(uznVar.a) && this.b.equals(uznVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EncryptedData(iv=", this.a, ", data=", Arrays.toString(this.b), Extension.C_BRAKE);
    }
}
