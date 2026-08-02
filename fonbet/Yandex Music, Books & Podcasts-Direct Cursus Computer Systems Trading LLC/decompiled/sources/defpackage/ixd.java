package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public abstract class ixd {
    public static final jtc a = new jtc(2);

    public static byte[] a(int i, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            jtc jtcVar = a;
            jtcVar.getClass();
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
                        byte[] bArr3 = (byte[]) jtcVar.a;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i2 = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i -= min;
                    i2 = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            q0 q0Var = new q0("exception encoding Hex string: " + e.getMessage(), 2);
            q0Var.b = e;
            throw q0Var;
        }
    }
}
