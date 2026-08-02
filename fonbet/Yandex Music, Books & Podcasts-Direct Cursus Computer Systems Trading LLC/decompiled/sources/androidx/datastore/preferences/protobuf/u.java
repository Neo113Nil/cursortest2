package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.s;
import defpackage.jj4;
import defpackage.wzh;
import defpackage.xq0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class u {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public interface a<E> extends List<E>, RandomAccess {
        a b(int i);

        boolean p();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h.a(bArr, 0).e(0);
        } catch (v e) {
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

    public static s c(Object obj, Object obj2) {
        s sVar = (s) ((wzh) obj);
        s.a aVar = (s.a) sVar.d(s.c.e);
        aVar.d();
        s.a.e(aVar.b, sVar);
        wzh wzhVar = (wzh) obj2;
        if (!aVar.a.getClass().isInstance(wzhVar)) {
            xq0.x("mergeFrom(MessageLite) can only merge messages of the same type.");
            return null;
        }
        aVar.d();
        s.a.e(aVar.b, (s) ((androidx.datastore.preferences.protobuf.a) wzhVar));
        return aVar.c();
    }
}
