package N6;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m extends o {

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f2081w = new ThreadLocal();

    /* renamed from: u, reason: collision with root package name */
    public final d f2082u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f2083v;

    public m(OutputStream outputStream) {
        ThreadLocal threadLocal = d.f2050f;
        d dVar = (d) threadLocal.get();
        if (dVar == null) {
            dVar = new d(outputStream);
            threadLocal.set(dVar);
        } else {
            dVar.f2054d = outputStream;
            dVar.f2053c = 0;
        }
        this.f2082u = dVar;
        ThreadLocal threadLocal2 = f2081w;
        Map map = (Map) threadLocal2.get();
        if (map == null) {
            map = new HashMap();
            threadLocal2.set(map);
        }
        this.f2083v = map;
    }

    @Override // N6.o
    public final void D(b bVar, a aVar) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        int i4 = aVar.f2039a;
        if (i4 >= 0) {
            dVar.h(i4);
        } else {
            dVar.i(i4);
        }
    }

    @Override // N6.o
    public final void E(b bVar, int i) {
        int i4 = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i4);
        dVar.d(4);
        int i6 = dVar.f2053c;
        int i9 = i6 + 1;
        dVar.f2053c = i9;
        byte b9 = (byte) (i & com.anythink.basead.exoplayer.k.p.f9259b);
        byte[] bArr = dVar.f2051a;
        bArr[i6] = b9;
        int i10 = i6 + 2;
        dVar.f2053c = i10;
        bArr[i9] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        int i11 = i6 + 3;
        dVar.f2053c = i11;
        bArr[i10] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        dVar.f2053c = i6 + 4;
        bArr[i11] = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f9259b);
    }

    @Override // N6.o
    public final void F(b bVar, long j6) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        dVar.g(j6);
    }

    @Override // N6.o
    public final void G(b bVar, long j6) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        dVar.i(j6);
    }

    @Override // N6.o
    public final void H(String str, byte[] bArr) {
        d dVar = this.f2082u;
        dVar.getClass();
        dVar.f(bArr.length, bArr);
    }

    @Override // N6.o
    public final void I(b bVar, String str) {
        w(bVar, (byte[]) this.f2083v.computeIfAbsent(str, new K6.b(5)));
    }

    @Override // N6.o
    public final void J(b bVar, String str, j jVar) {
        Map map = this.f2083v;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = jVar.f2072j.a();
            k6.f.a(str, 16, bArr);
            map.put(str, bArr);
        }
        w(bVar, bArr);
    }

    @Override // N6.o
    public final void K(b bVar, int i) {
        int i4 = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i4);
        dVar.h(i);
    }

    @Override // N6.o
    public final void W(b bVar, int i) {
        K(bVar, i);
    }

    @Override // N6.o
    public final void X(b bVar, String str, int i, j jVar) {
        char charAt;
        int i4 = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i4);
        dVar.h(i);
        i iVar = t.f2097a;
        if (jVar.f2065b && w.f2104d && str.length() == i && v.b(str, w.f2102b) == 0) {
            byte[] bArr = (byte[]) v.d(str, w.f2101a);
            dVar.f(bArr.length, bArr);
            return;
        }
        int length = str.length();
        int i6 = 0;
        while (i6 < length && (charAt = str.charAt(i6)) < 128) {
            dVar.e((byte) charAt);
            i6++;
        }
        if (i6 == length) {
            return;
        }
        while (i6 < length) {
            char charAt2 = str.charAt(i6);
            if (charAt2 < 128) {
                dVar.e((byte) charAt2);
            } else if (charAt2 < 2048) {
                dVar.e((byte) ((charAt2 >>> 6) | 960));
                dVar.e((byte) ((charAt2 & '?') | 128));
            } else if (Character.isSurrogate(charAt2)) {
                int codePointAt = Character.codePointAt(str, i6);
                if (codePointAt != charAt2) {
                    dVar.e((byte) ((codePointAt >>> 18) | 240));
                    dVar.e((byte) (((codePointAt >>> 12) & 63) | 128));
                    dVar.e((byte) (((codePointAt >>> 6) & 63) | 128));
                    dVar.e((byte) ((codePointAt & 63) | 128));
                    i6++;
                } else {
                    dVar.e(com.anythink.core.common.s.a.c.f17105c);
                }
            } else {
                dVar.e((byte) ((charAt2 >>> '\f') | 480));
                dVar.e((byte) (((charAt2 >>> 6) & 63) | 128));
                dVar.e((byte) ((charAt2 & '?') | 128));
            }
            i6++;
        }
    }

    @Override // N6.o
    public final void Y(b bVar, byte[] bArr) {
        w(bVar, bArr);
    }

    @Override // N6.o
    public final void Z(b bVar, String str) {
        w(bVar, (byte[]) this.f2083v.computeIfAbsent(str, new K6.b(4)));
    }

    @Override // N6.o
    public final void a0(b bVar, String str, j jVar) {
        Map map = this.f2083v;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = jVar.i.a();
            k6.f.a(str, 32, bArr);
            map.put(str, bArr);
        }
        w(bVar, bArr);
    }

    @Override // N6.o
    public final void b0(b bVar, int i) {
        int i4 = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i4);
        dVar.h(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            d dVar = this.f2082u;
            if (dVar.f2053c > 0) {
                dVar.c();
            }
            this.f2083v.clear();
        } catch (IOException e9) {
            throw new IOException(e9);
        }
    }

    @Override // N6.o
    public final void j(b bVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(bVar, (f) it.next());
        }
    }

    @Override // N6.o
    public final void k(b bVar, f[] fVarArr) {
        for (f fVar : fVarArr) {
            a(bVar, fVar);
        }
    }

    @Override // N6.o
    public final void l(b bVar, List list, q qVar, j jVar) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            K(bVar, jVar.e());
            qVar.c(this, obj, jVar);
        }
    }

    @Override // N6.o
    public final void q(b bVar, boolean z6) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        dVar.e(z6 ? (byte) 1 : (byte) 0);
    }

    @Override // N6.o
    public final void w(b bVar, byte[] bArr) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        int length = bArr.length;
        dVar.h(length);
        dVar.f(length, bArr);
    }

    @Override // N6.o
    public final void x(b bVar, double d9) {
        int i = bVar.f2042b;
        d dVar = this.f2082u;
        dVar.h(i);
        dVar.g(Double.doubleToRawLongBits(d9));
    }

    @Override // N6.o
    public final void B() {
    }

    @Override // N6.o
    public final void C() {
    }

    @Override // N6.o
    public final void z() {
    }

    @Override // N6.o
    public final void V(b bVar) {
    }
}
