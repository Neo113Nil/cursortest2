package ru.CryptoPro.ssl;

import defpackage.oyr;
import java.security.SecureRandom;
import javax.net.ssl.SSLProtocolException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class cl_106 {
    public final byte[] a;

    public cl_106(boolean z, SecureRandom secureRandom) {
        if (z) {
            this.a = new cl_87(secureRandom).a;
        } else {
            this.a = new byte[0];
        }
    }

    public final void a() {
        byte[] bArr = this.a;
        if (bArr.length <= 32) {
            return;
        }
        throw new SSLProtocolException(oyr.m(bArr.length, " bytes)", new StringBuilder("Invalid session ID length (")));
    }

    public final byte[] b() {
        return (byte[]) this.a.clone();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cl_106)) {
            return false;
        }
        byte[] b = ((cl_106) obj).b();
        int length = b.length;
        byte[] bArr = this.a;
        if (length != bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (b[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
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

    public String toString() {
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

    public cl_106(byte[] bArr) {
        this.a = bArr;
    }
}
