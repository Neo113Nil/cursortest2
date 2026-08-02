package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class zsu0 implements rs10 {
    public static final Charset a = Charset.forName("UTF8");
    public static final zsu0 b = new zsu0();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // defpackage.rs10
    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    @Override // defpackage.rs10
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
