package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class tqw {
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
            new d(bArr, 0, 0, false).h(0);
        } catch (InvalidProtocolBufferException e) {
            yci0.r(e);
        }
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
