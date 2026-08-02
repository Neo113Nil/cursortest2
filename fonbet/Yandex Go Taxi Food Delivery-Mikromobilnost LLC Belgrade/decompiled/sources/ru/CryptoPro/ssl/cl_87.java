package ru.CryptoPro.ssl;

import java.security.SecureRandom;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
final class cl_87 {
    public final byte[] a;

    public cl_87(SecureRandom secureRandom) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = currentTimeMillis < 2147483647L ? (int) currentTimeMillis : Integer.MAX_VALUE;
        byte[] bArr = new byte[32];
        this.a = bArr;
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (i >> 24);
        bArr[1] = (byte) (i >> 16);
        bArr[2] = (byte) (i >> 8);
        bArr[3] = (byte) i;
    }

    public final String a() {
        StringBuffer stringBuffer = new StringBuffer("GMT: ");
        byte[] bArr = this.a;
        stringBuffer.append((bArr[0] << 24) + (bArr[1] << PKIBody._CKUANN) + (bArr[2] << 8) + bArr[3]);
        stringBuffer.append(" bytes = { ");
        for (int i = 4; i < 32; i++) {
            if (i != 4) {
                stringBuffer.append(Extension.FIX_SPACE);
            }
            stringBuffer.append(bArr[i] & 255);
        }
        stringBuffer.append(" }\n");
        return stringBuffer.toString();
    }

    public cl_87(cl_46 cl_46Var) {
        byte[] bArr = new byte[32];
        this.a = bArr;
        cl_46Var.read(bArr, 0, 32);
    }
}
