package m0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: m0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218p implements InterfaceC0212j {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2775a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final C0218p f2776b = new C0218p();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i2;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, f2775a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f2775a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // m0.InterfaceC0212j
    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    @Override // m0.InterfaceC0212j
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
