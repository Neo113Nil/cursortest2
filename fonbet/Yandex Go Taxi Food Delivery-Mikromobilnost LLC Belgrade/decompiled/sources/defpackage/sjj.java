package defpackage;

import java.util.Arrays;
import ru.domesticroots.certificatetransparency.internal.verifier.model.DigitallySigned$HashAlgorithm;
import ru.domesticroots.certificatetransparency.internal.verifier.model.DigitallySigned$SignatureAlgorithm;

/* loaded from: classes4.dex */
public final class sjj {
    public final DigitallySigned$HashAlgorithm a;
    public final DigitallySigned$SignatureAlgorithm b;
    public final byte[] c;

    public sjj(DigitallySigned$HashAlgorithm digitallySigned$HashAlgorithm, DigitallySigned$SignatureAlgorithm digitallySigned$SignatureAlgorithm, byte[] bArr) {
        this.a = digitallySigned$HashAlgorithm;
        this.b = digitallySigned$SignatureAlgorithm;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sjj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        sjj sjjVar = (sjj) obj;
        return this.a == sjjVar.a && this.b == sjjVar.b && Arrays.equals(this.c, sjjVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DigitallySigned(hashAlgorithm=" + this.a + ", signatureAlgorithm=" + this.b + ", signature=" + Arrays.toString(this.c) + ')';
    }
}
