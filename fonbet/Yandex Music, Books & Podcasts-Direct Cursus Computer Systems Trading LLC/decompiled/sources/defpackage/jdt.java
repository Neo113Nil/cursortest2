package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jdt {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final xdh b;
    public volatile int c = 0;

    public jdt(xdh xdhVar, int i) {
        this.b = xdhVar;
        this.a = i;
    }

    public final int a(int i) {
        z2i b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b.d;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final z2i b() {
        ThreadLocal threadLocal = d;
        z2i z2iVar = (z2i) threadLocal.get();
        if (z2iVar == null) {
            z2iVar = new z2i();
            threadLocal.set(z2iVar);
        }
        a3i a3iVar = (a3i) this.b.a;
        int a = a3iVar.a(6);
        if (a != 0) {
            int i = a + a3iVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) a3iVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) a3iVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) a3iVar.d;
            z2iVar.d = byteBuffer;
            if (byteBuffer != null) {
                z2iVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                z2iVar.b = i4;
                z2iVar.c = ((ByteBuffer) z2iVar.d).getShort(i4);
                return z2iVar;
            }
            z2iVar.a = 0;
            z2iVar.b = 0;
            z2iVar.c = 0;
        }
        return z2iVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        z2i b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? ((ByteBuffer) b.d).getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        z2i b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(StringUtil.SPACE);
        }
        return sb.toString();
    }
}
