package a1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: a1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100p implements InterfaceC0094j {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2037a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final C0100p f2038b = new C0100p();

    public static String a(ByteBuffer byteBuffer) {
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
        return new String(bArr, i2, remaining, f2037a);
    }

    public static ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f2037a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // a1.InterfaceC0094j
    public final /* bridge */ /* synthetic */ Object decodeMessage(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }

    @Override // a1.InterfaceC0094j
    public final /* bridge */ /* synthetic */ ByteBuffer encodeMessage(Object obj) {
        return b((String) obj);
    }
}
