package androidx.emoji2.text;

import b0.C0515a;
import b0.C0516b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f4770d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f4771a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.n f4772b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f4773c = 0;

    public u(S0.n nVar, int i) {
        this.f4772b = nVar;
        this.f4771a = i;
    }

    public final int a(int i) {
        C0515a b9 = b();
        int a9 = b9.a(16);
        if (a9 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) b9.f2133w;
        int i4 = a9 + b9.f2130n;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final C0515a b() {
        ThreadLocal threadLocal = f4770d;
        C0515a c0515a = (C0515a) threadLocal.get();
        if (c0515a == null) {
            c0515a = new C0515a();
            threadLocal.set(c0515a);
        }
        C0516b c0516b = (C0516b) this.f4772b.f2931u;
        int a9 = c0516b.a(6);
        if (a9 != 0) {
            int i = a9 + c0516b.f2130n;
            int i4 = (this.f4771a * 4) + ((ByteBuffer) c0516b.f2133w).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) c0516b.f2133w).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c0516b.f2133w;
            c0515a.f2133w = byteBuffer;
            if (byteBuffer != null) {
                c0515a.f2130n = i6;
                int i9 = i6 - byteBuffer.getInt(i6);
                c0515a.f2131u = i9;
                c0515a.f2132v = ((ByteBuffer) c0515a.f2133w).getShort(i9);
                return c0515a;
            }
            c0515a.f2130n = 0;
            c0515a.f2131u = 0;
            c0515a.f2132v = 0;
        }
        return c0515a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0515a b9 = b();
        int a9 = b9.a(4);
        sb.append(Integer.toHexString(a9 != 0 ? ((ByteBuffer) b9.f2133w).getInt(a9 + b9.f2130n) : 0));
        sb.append(", codepoints:");
        C0515a b10 = b();
        int a10 = b10.a(16);
        if (a10 != 0) {
            int i4 = a10 + b10.f2130n;
            i = ((ByteBuffer) b10.f2133w).getInt(((ByteBuffer) b10.f2133w).getInt(i4) + i4);
        } else {
            i = 0;
        }
        for (int i6 = 0; i6 < i; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
