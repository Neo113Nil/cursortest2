package androidx.emoji2.text;

import b0.C0511a;
import b0.C0512b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f4802d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f4803a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.i f4804b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4805c = 0;

    public u(S0.i iVar, int i) {
        this.f4804b = iVar;
        this.f4803a = i;
    }

    public final int a(int i) {
        C0511a b9 = b();
        int a9 = b9.a(16);
        if (a9 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b9.f2045w;
        int i6 = a9 + b9.f2042n;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i6) + i6 + 4);
    }

    public final C0511a b() {
        ThreadLocal threadLocal = f4802d;
        C0511a c0511a = (C0511a) threadLocal.get();
        if (c0511a == null) {
            c0511a = new C0511a();
            threadLocal.set(c0511a);
        }
        C0512b c0512b = (C0512b) this.f4804b.f2788u;
        int a9 = c0512b.a(6);
        if (a9 != 0) {
            int i = a9 + c0512b.f2042n;
            int i6 = (this.f4803a * 4) + ((ByteBuffer) c0512b.f2045w).getInt(i) + i + 4;
            int i9 = ((ByteBuffer) c0512b.f2045w).getInt(i6) + i6;
            ByteBuffer byteBuffer = (ByteBuffer) c0512b.f2045w;
            c0511a.f2045w = byteBuffer;
            if (byteBuffer != null) {
                c0511a.f2042n = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c0511a.f2043u = i10;
                c0511a.f2044v = ((ByteBuffer) c0511a.f2045w).getShort(i10);
                return c0511a;
            }
            c0511a.f2042n = 0;
            c0511a.f2043u = 0;
            c0511a.f2044v = 0;
        }
        return c0511a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0511a b9 = b();
        int a9 = b9.a(4);
        sb.append(Integer.toHexString(a9 != 0 ? ((ByteBuffer) b9.f2045w).getInt(a9 + b9.f2042n) : 0));
        sb.append(", codepoints:");
        C0511a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            int i6 = a10 + b10.f2042n;
            i = ((ByteBuffer) b10.f2045w).getInt(((ByteBuffer) b10.f2045w).getInt(i6) + i6);
        } else {
            i = 0;
        }
        for (int i9 = 0; i9 < i; i9++) {
            sb.append(Integer.toHexString(a(i9)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
