package ru.CryptoPro.ssl;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;
import javax.net.ssl.SSLException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public abstract class cl_47 {
    public static final /* synthetic */ int a = 0;

    static {
        Arrays.fill(new byte[48], (byte) 54);
        Arrays.fill(new byte[48], (byte) 92);
        Arrays.fill(new byte[40], (byte) 54);
        Arrays.fill(new byte[40], (byte) 92);
    }

    public static String a(String str, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(":  { ");
        if (bArr == null) {
            stringBuffer.append("null");
        } else {
            for (int i = 0; i < bArr.length; i++) {
                if (i != 0) {
                    stringBuffer.append(Extension.FIX_SPACE);
                }
                stringBuffer.append(bArr[i] & 255);
            }
        }
        stringBuffer.append(" }\n");
        return stringBuffer.toString();
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length <= 1 || byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public abstract int a();

    public abstract void a(cl_62 cl_62Var);

    public abstract int c();

    public final void c(cl_62 cl_62Var) {
        int c = c();
        if (c < 16777216) {
            cl_62Var.write(a());
            cl_62Var.k(c);
            a(cl_62Var);
        } else {
            throw new SSLException("Handshake message too big, type = " + a() + ", len = " + c);
        }
    }

    public abstract String d();

    public void f() {
        if (SSLLogger.isFineEnabled()) {
            SSLLogger.fine(d());
        }
    }

    public static void a(PrintStream printStream, String str, byte[] bArr) {
        printStream.getClass();
        if (bArr == null) {
            return;
        }
        for (byte b : bArr) {
        }
    }
}
