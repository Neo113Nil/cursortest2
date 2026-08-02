package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes9.dex */
public abstract class r1 extends a3 implements p3, t1 {
    public static final q1 b = new q1(0, r1.class);
    public static final char[] c = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public r1(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                ny61.t("'contents' cannot be null");
                throw null;
            }
            if (bArr.length < 1) {
                ny61.g("'contents' cannot be empty");
                throw null;
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    ny61.g("zero length data with non-zero pad bits");
                    throw null;
                }
                if (i > 7) {
                    ny61.g("pad bits cannot be greater than 7 or less than 0");
                    throw null;
                }
            }
        }
        this.a = bArr;
    }

    public static r1 p(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            ny61.g("truncated BIT STRING detected");
            return null;
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                ny61.g("invalid pad bits detected");
                return null;
            }
            byte b2 = bArr[length - 1];
            if (b2 != ((byte) ((255 << i) & b2))) {
                return new ovf(bArr);
            }
        }
        return new lpf(bArr, false);
    }

    @Override // defpackage.llv
    public final a3 a() {
        return this;
    }

    @Override // defpackage.t1
    public final InputStream b() {
        byte[] bArr = this.a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.t1
    public final int e() {
        return this.a[0] & 255;
    }

    @Override // defpackage.p3
    public final String f() {
        try {
            byte[] g = g();
            StringBuffer stringBuffer = new StringBuffer((g.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != g.length; i++) {
                byte b2 = g[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & PKIBody._CCP]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException(x4e.d(e, new StringBuilder("Internal error encoding BitString: ")), e);
        }
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (!(a3Var instanceof r1)) {
            return false;
        }
        byte[] bArr = ((r1) a3Var).a;
        byte[] bArr2 = this.a;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b2 = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b2;
    }

    @Override // defpackage.a3
    public a3 n() {
        return new lpf(this.a, false);
    }

    @Override // defpackage.a3
    public a3 o() {
        return new ovf(this.a);
    }

    public final String toString() {
        return f();
    }

    public r1(byte[] bArr, int i) {
        if (bArr != null) {
            if (bArr.length == 0 && i != 0) {
                ny61.g("zero length data with non-zero pad bits");
                throw null;
            }
            if (i <= 7 && i >= 0) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length + 1];
                System.arraycopy(bArr, 0, bArr2, 1, length);
                bArr2[0] = (byte) i;
                this.a = bArr2;
                return;
            }
            ny61.g("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        ny61.t("'data' cannot be null");
        throw null;
    }
}
