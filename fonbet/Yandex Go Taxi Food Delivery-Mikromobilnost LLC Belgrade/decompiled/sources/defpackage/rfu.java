package defpackage;

import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.domesticroots.bouncycastle.util.encoders.EncoderException;

/* loaded from: classes4.dex */
public class rfu {
    public static final zfu a = new zfu();

    public static byte[] a(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            zfu zfuVar = a;
            zfuVar.getClass();
            if (i >= 0) {
                byte[] bArr2 = new byte[72];
                int i2 = 0;
                while (i > 0) {
                    int min = Math.min(36, i);
                    int i3 = i2 + min;
                    int i4 = 0;
                    while (i2 < i3) {
                        int i5 = i2 + 1;
                        byte b = bArr[i2];
                        int i6 = i4 + 1;
                        byte[] bArr3 = zfuVar.a;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & PKIBody._CCP];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return a(bArr.length, bArr);
    }
}
