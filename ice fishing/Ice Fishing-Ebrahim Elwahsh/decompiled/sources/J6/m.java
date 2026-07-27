package J6;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m extends o {

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f1440w = new ThreadLocal();

    /* renamed from: u, reason: collision with root package name */
    public final d f1441u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f1442v;

    public m(OutputStream outputStream) {
        ThreadLocal threadLocal = d.f1409f;
        d dVar = (d) threadLocal.get();
        if (dVar == null) {
            dVar = new d(outputStream);
            threadLocal.set(dVar);
        } else {
            dVar.f1413d = outputStream;
            dVar.f1412c = 0;
        }
        this.f1441u = dVar;
        ThreadLocal threadLocal2 = f1440w;
        Map map = (Map) threadLocal2.get();
        if (map == null) {
            map = new HashMap();
            threadLocal2.set(map);
        }
        this.f1442v = map;
    }

    @Override // J6.o
    public final void D(b bVar, a aVar) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        int i4 = aVar.f1398a;
        if (i4 >= 0) {
            dVar.h(i4);
        } else {
            dVar.i(i4);
        }
    }

    @Override // J6.o
    public final void E(b bVar, int i) {
        int i4 = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i4);
        dVar.d(4);
        int i9 = dVar.f1412c;
        int i10 = i9 + 1;
        dVar.f1412c = i10;
        byte b9 = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        byte[] bArr = dVar.f1410a;
        bArr[i9] = b9;
        int i11 = i9 + 2;
        dVar.f1412c = i11;
        bArr[i10] = (byte) ((i >> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        int i12 = i9 + 3;
        dVar.f1412c = i12;
        bArr[i11] = (byte) ((i >> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        dVar.f1412c = i9 + 4;
        bArr[i12] = (byte) ((i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
    }

    @Override // J6.o
    public final void F(b bVar, long j9) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        dVar.g(j9);
    }

    @Override // J6.o
    public final void G(b bVar, long j9) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        dVar.i(j9);
    }

    @Override // J6.o
    public final void H(String str, byte[] bArr) {
        d dVar = this.f1441u;
        dVar.getClass();
        dVar.f(bArr.length, bArr);
    }

    @Override // J6.o
    public final void I(b bVar, String str) {
        w(bVar, (byte[]) this.f1442v.computeIfAbsent(str, new G6.b(5)));
    }

    @Override // J6.o
    public final void J(b bVar, String str, j jVar) {
        Map map = this.f1442v;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = jVar.f1431j.a();
            g6.f.a(str, 16, bArr);
            map.put(str, bArr);
        }
        w(bVar, bArr);
    }

    @Override // J6.o
    public final void K(b bVar, int i) {
        int i4 = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i4);
        dVar.h(i);
    }

    @Override // J6.o
    public final void W(b bVar, int i) {
        K(bVar, i);
    }

    @Override // J6.o
    public final void X(b bVar, String str, int i, j jVar) {
        char charAt;
        int i4 = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i4);
        dVar.h(i);
        i iVar = t.f1456a;
        if (jVar.f1424b && w.f1463d && str.length() == i && v.b(str, w.f1461b) == 0) {
            byte[] bArr = (byte[]) v.d(str, w.f1460a);
            dVar.f(bArr.length, bArr);
            return;
        }
        int length = str.length();
        int i9 = 0;
        while (i9 < length && (charAt = str.charAt(i9)) < 128) {
            dVar.e((byte) charAt);
            i9++;
        }
        if (i9 == length) {
            return;
        }
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (charAt2 < 128) {
                dVar.e((byte) charAt2);
            } else if (charAt2 < 2048) {
                dVar.e((byte) ((charAt2 >>> 6) | 960));
                dVar.e((byte) ((charAt2 & '?') | 128));
            } else if (Character.isSurrogate(charAt2)) {
                int codePointAt = Character.codePointAt(str, i9);
                if (codePointAt != charAt2) {
                    dVar.e((byte) ((codePointAt >>> 18) | 240));
                    dVar.e((byte) (((codePointAt >>> 12) & 63) | 128));
                    dVar.e((byte) (((codePointAt >>> 6) & 63) | 128));
                    dVar.e((byte) ((codePointAt & 63) | 128));
                    i9++;
                } else {
                    dVar.e(com.anythink.core.common.s.a.c.f16476c);
                }
            } else {
                dVar.e((byte) ((charAt2 >>> '\f') | 480));
                dVar.e((byte) (((charAt2 >>> 6) & 63) | 128));
                dVar.e((byte) ((charAt2 & '?') | 128));
            }
            i9++;
        }
    }

    @Override // J6.o
    public final void Y(b bVar, byte[] bArr) {
        w(bVar, bArr);
    }

    @Override // J6.o
    public final void Z(b bVar, String str) {
        w(bVar, (byte[]) this.f1442v.computeIfAbsent(str, new G6.b(4)));
    }

    @Override // J6.o
    public final void a0(b bVar, String str, j jVar) {
        Map map = this.f1442v;
        byte[] bArr = (byte[]) map.get(str);
        if (bArr == null) {
            bArr = jVar.i.a();
            g6.f.a(str, 32, bArr);
            map.put(str, bArr);
        }
        w(bVar, bArr);
    }

    @Override // J6.o
    public final void b0(b bVar, int i) {
        int i4 = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i4);
        dVar.h(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            d dVar = this.f1441u;
            if (dVar.f1412c > 0) {
                dVar.c();
            }
            this.f1442v.clear();
        } catch (IOException e6) {
            throw new IOException(e6);
        }
    }

    @Override // J6.o
    public final void i(b bVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(bVar, (f) it.next());
        }
    }

    @Override // J6.o
    public final void j(b bVar, f[] fVarArr) {
        for (f fVar : fVarArr) {
            a(bVar, fVar);
        }
    }

    @Override // J6.o
    public final void k(b bVar, List list, q qVar, j jVar) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            K(bVar, jVar.e());
            qVar.b(this, obj, jVar);
        }
    }

    @Override // J6.o
    public final void q(b bVar, boolean z8) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        dVar.e(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // J6.o
    public final void w(b bVar, byte[] bArr) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        int length = bArr.length;
        dVar.h(length);
        dVar.f(length, bArr);
    }

    @Override // J6.o
    public final void x(b bVar, double d2) {
        int i = bVar.f1401b;
        d dVar = this.f1441u;
        dVar.h(i);
        dVar.g(Double.doubleToRawLongBits(d2));
    }

    @Override // J6.o
    public final void B() {
    }

    @Override // J6.o
    public final void C() {
    }

    @Override // J6.o
    public final void z() {
    }

    @Override // J6.o
    public final void V(b bVar) {
    }
}
