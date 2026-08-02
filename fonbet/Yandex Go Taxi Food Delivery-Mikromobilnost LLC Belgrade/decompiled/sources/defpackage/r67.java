package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class r67 {
    public final byte[] a;
    public final int b;

    public r67(byte[] bArr) {
        this.a = bArr;
        this.b = Arrays.hashCode(bArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r67)) {
            return false;
        }
        return Arrays.equals(this.a, ((r67) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return oyr.p("ByteArrayWrapper(data=", Arrays.toString(this.a), Extension.C_BRAKE);
    }
}
