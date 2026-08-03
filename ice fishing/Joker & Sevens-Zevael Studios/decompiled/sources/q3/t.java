package q3;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f5792d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f5793a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.n f5794b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f5795c = 0;

    public t(x4.n nVar, int i10) {
        this.f5794b = nVar;
        this.f5793a = i10;
    }

    public final int a(int i10) {
        r3.a b2 = b();
        int a6 = b2.a(16);
        if (a6 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b2.f1313j;
        int i11 = a6 + b2.f1310g;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final r3.a b() {
        ThreadLocal threadLocal = f5792d;
        r3.a aVar = (r3.a) threadLocal.get();
        if (aVar == null) {
            aVar = new r3.a();
            threadLocal.set(aVar);
        }
        r3.b bVar = (r3.b) this.f5794b.f8316a;
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i10 = a6 + bVar.f1310g;
            int i11 = (this.f5793a * 4) + ((ByteBuffer) bVar.f1313j).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f1313j).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f1313j;
            aVar.f1313j = byteBuffer;
            if (byteBuffer != null) {
                aVar.f1310g = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f1311h = i13;
                aVar.f1312i = ((ByteBuffer) aVar.f1313j).getShort(i13);
                return aVar;
            }
            aVar.f1310g = 0;
            aVar.f1311h = 0;
            aVar.f1312i = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        r3.a b2 = b();
        int a6 = b2.a(4);
        sb.append(Integer.toHexString(a6 != 0 ? ((ByteBuffer) b2.f1313j).getInt(a6 + b2.f1310g) : 0));
        sb.append(", codepoints:");
        r3.a b10 = b();
        int a8 = b10.a(16);
        if (a8 != 0) {
            int i11 = a8 + b10.f1310g;
            i10 = ((ByteBuffer) b10.f1313j).getInt(((ByteBuffer) b10.f1313j).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb.append(Integer.toHexString(a(i12)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
