package V;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1248d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f1249a;

    /* renamed from: b, reason: collision with root package name */
    public final B.k f1250b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f1251c = 0;

    public w(B.k kVar, int i) {
        this.f1250b = kVar;
        this.f1249a = i;
    }

    public final int a(int i) {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.f839d;
        int i2 = a2 + c2.f836a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        W.a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f836a;
        return ((ByteBuffer) c2.f839d).getInt(((ByteBuffer) c2.f839d).getInt(i) + i);
    }

    public final W.a c() {
        ThreadLocal threadLocal = f1248d;
        W.a aVar = (W.a) threadLocal.get();
        if (aVar == null) {
            aVar = new W.a();
            threadLocal.set(aVar);
        }
        W.b bVar = (W.b) this.f1250b.f28a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i = a2 + bVar.f836a;
            int i2 = (this.f1249a * 4) + ((ByteBuffer) bVar.f839d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) bVar.f839d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f839d;
            aVar.f839d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f836a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                aVar.f837b = i4;
                aVar.f838c = ((ByteBuffer) aVar.f839d).getShort(i4);
            } else {
                aVar.f836a = 0;
                aVar.f837b = 0;
                aVar.f838c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        W.a c2 = c();
        int a2 = c2.a(4);
        sb.append(Integer.toHexString(a2 != 0 ? ((ByteBuffer) c2.f839d).getInt(a2 + c2.f836a) : 0));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
