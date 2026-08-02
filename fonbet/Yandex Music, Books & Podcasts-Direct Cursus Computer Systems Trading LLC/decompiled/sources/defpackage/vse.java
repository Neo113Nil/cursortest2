package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class vse {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new mr4(bArr, 0, 0, false).k(0);
        } catch (cye e) {
            xq0.t(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
