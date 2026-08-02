package defpackage;

import com.google.crypto.tink.shaded.protobuf.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class tse {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw aye.e();
        } catch (aye e) {
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

    public static c c(Object obj, Object obj2) {
        c cVar = (c) ((d8) obj);
        f3d f3dVar = (f3d) cVar.f(5);
        f3dVar.d();
        f3d.e(f3dVar.b, cVar);
        d8 d8Var = (d8) obj2;
        if (!f3dVar.a.getClass().isInstance(d8Var)) {
            xq0.x("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        f3dVar.d();
        f3d.e(f3dVar.b, (c) d8Var);
        return f3dVar.c();
    }
}
