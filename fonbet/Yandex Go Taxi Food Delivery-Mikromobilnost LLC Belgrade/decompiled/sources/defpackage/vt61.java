package defpackage;

import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vt61 {
    public final byte[] a;

    public vt61(byte[] bArr, int i) {
        this.a = Array.copy(bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vt61) {
            byte[] bArr = (byte[]) ((vt61) obj).a.clone();
            int length = bArr.length;
            byte[] bArr2 = this.a;
            if (length == bArr2.length) {
                for (int i = 0; i < bArr2.length; i++) {
                    if (bArr[i] == bArr2[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return i2;
            }
            i2 += bArr[i];
            i++;
        }
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer((length * 2) + 10);
        stringBuffer.append("{");
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i] & 255);
            if (i != length - 1) {
                stringBuffer.append(Extension.FIX_SPACE);
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public vt61() {
        this.a = new byte[0];
    }
}
