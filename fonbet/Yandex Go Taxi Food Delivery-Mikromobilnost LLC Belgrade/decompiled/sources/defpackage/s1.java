package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public abstract class s1 extends b3 implements q3, u1 {
    public static final p1 b = new p1(1, s1.class);
    public static final char[] c = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public s1(byte[] bArr, int i) {
        if (bArr == null) {
            ny61.t("'data' cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            ny61.g("zero length data with non-zero pad bits");
            throw null;
        }
        if (i > 7 || i < 0) {
            ny61.g("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.a = bArr2;
    }

    public static s1 u(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b2 = bArr[length - 1];
                    if (b2 != ((byte) ((255 << i) & b2))) {
                        return new pvf(bArr);
                    }
                }
            }
            return new mpf(bArr);
        }
        str = "truncated BIT STRING detected";
        ny61.g(str);
        return null;
    }

    public static s1 y(Object obj) {
        String d;
        if (obj == null || (obj instanceof s1)) {
            return (s1) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof s1) {
                return (s1) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (s1) b.Eg((byte[]) obj);
            } catch (IOException e) {
                d = x4e.d(e, new StringBuilder("failed to construct BIT STRING from byte[]: "));
            }
        }
        d = qv10.n(obj, "illegal object in getInstance: ");
        ny61.g(d);
        return null;
    }

    @Override // defpackage.mlv
    public final b3 a() {
        return this;
    }

    @Override // defpackage.u1
    public final InputStream b() {
        byte[] bArr = this.a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // defpackage.u1
    public final int e() {
        return this.a[0] & 255;
    }

    @Override // defpackage.q3
    public final String f() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b2 = encoded[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & PKIBody._CCP]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException(x4e.d(e, new StringBuilder("Internal error encoding BitString: ")), e);
        }
    }

    @Override // defpackage.b3, defpackage.o2
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

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (!(b3Var instanceof s1)) {
            return false;
        }
        byte[] bArr = ((s1) b3Var).a;
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

    @Override // defpackage.b3
    public b3 s() {
        return new mpf(this.a);
    }

    @Override // defpackage.b3
    public b3 t() {
        return new pvf(this.a);
    }

    public String toString() {
        return f();
    }

    public final byte[] x() {
        byte[] bArr = this.a;
        if (bArr.length == 1) {
            return w2.c;
        }
        int i = bArr[0] & 255;
        byte[] d = rza1.d(bArr.length, bArr);
        int length = d.length - 1;
        d[length] = (byte) (((byte) (255 << i)) & d[length]);
        return d;
    }

    public final int z() {
        byte[] bArr = this.a;
        int min = Math.min(5, bArr.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < min; i2++) {
            i |= (255 & bArr[i2]) << ((i2 - 1) * 8);
        }
        if (1 > min || min >= 5) {
            return i;
        }
        return ((((byte) (bArr[min] & (255 << (bArr[0] & 255)))) & 255) << ((min - 1) * 8)) | i;
    }

    public s1(byte[] bArr) {
        this.a = bArr;
    }
}
