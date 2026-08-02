package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class qqw {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        yv4.f(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
