package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class i30 {
    public static final Charset GWasM1elztuh;
    public static final byte[] Yi7zF1RB1;

    static {
        Charset.forName("US-ASCII");
        GWasM1elztuh = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        Yi7zF1RB1 = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new kb(bArr, 0, 0, false).JFJ3QoxA(0);
        } catch (w30 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void GWasM1elztuh(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int Yi7zF1RB1(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
