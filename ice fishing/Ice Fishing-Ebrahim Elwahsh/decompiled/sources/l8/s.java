package l8;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q2.C4903n;

/* loaded from: classes2.dex */
public final class s implements j8.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f39182g = f8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", com.anythink.core.common.n.b.a.e.c.f15283c, com.anythink.core.common.n.b.a.e.c.f15284d, com.anythink.core.common.n.b.a.e.c.f15285e, com.anythink.core.common.n.b.a.e.c.f15286f});

    /* renamed from: h, reason: collision with root package name */
    public static final List f39183h = f8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final i8.r f39184a;

    /* renamed from: b, reason: collision with root package name */
    public final j8.h f39185b;

    /* renamed from: c, reason: collision with root package name */
    public final r f39186c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f39187d;

    /* renamed from: e, reason: collision with root package name */
    public final e8.t f39188e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f39189f;

    public s(e8.s client, i8.r rVar, j8.h hVar, r http2Connection) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(http2Connection, "http2Connection");
        this.f39184a = rVar;
        this.f39185b = hVar;
        this.f39186c = http2Connection;
        e8.t tVar = e8.t.f37506z;
        this.f39188e = client.f37489r.contains(tVar) ? tVar : e8.t.f37505y;
    }

    @Override // j8.f
    public final void a() {
        z zVar = this.f39187d;
        kotlin.jvm.internal.h.b(zVar);
        zVar.f39212B.close();
    }

    @Override // j8.f
    public final boolean b() {
        boolean z8;
        z zVar = this.f39187d;
        if (zVar == null) {
            return false;
        }
        synchronized (zVar) {
            x xVar = zVar.f39211A;
            if (xVar.f39205u) {
                if (xVar.f39207w.j()) {
                    z8 = true;
                }
            }
            z8 = false;
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // j8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e8.v c(boolean z8) {
        int i;
        e8.m mVar;
        boolean z9;
        z zVar = this.f39187d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            while (true) {
                i = 0;
                if (!zVar.f39222y.isEmpty() || zVar.g() != null) {
                    break;
                }
                if (!z8) {
                    zVar.f39218u.getClass();
                    w wVar = zVar.f39212B;
                    if (!wVar.f39202v && !wVar.f39200n) {
                        z9 = false;
                    }
                    z9 = true;
                }
                i = 1;
                if (i != 0) {
                    zVar.f39213C.h();
                }
                try {
                    zVar.l();
                    if (i != 0) {
                        zVar.f39213C.l();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        zVar.f39213C.l();
                    }
                    throw th;
                }
            }
            if (zVar.f39222y.isEmpty()) {
                IOException iOException = zVar.f39216F;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC4710b g9 = zVar.g();
                kotlin.jvm.internal.h.b(g9);
                throw new E(g9);
            }
            Object removeFirst = zVar.f39222y.removeFirst();
            kotlin.jvm.internal.h.d(removeFirst, "removeFirst(...)");
            mVar = (e8.m) removeFirst;
        }
        e8.t protocol = this.f39188e;
        kotlin.jvm.internal.h.e(protocol, "protocol");
        I1.b bVar = new I1.b(4);
        int size = mVar.size();
        F.d dVar = null;
        while (i < size) {
            String c4 = mVar.c(i);
            String e6 = mVar.e(i);
            if (c4.equals(com.anythink.core.common.n.b.a.e.c.f15282b)) {
                dVar = p8.g.l("HTTP/1.1 ".concat(e6));
            } else if (!f39183h.contains(c4)) {
                K3.b.b(bVar, c4, e6);
            }
            i++;
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        e8.v vVar = new e8.v();
        vVar.f37509b = protocol;
        vVar.f37510c = dVar.f908b;
        vVar.f37511d = (String) dVar.f910d;
        vVar.f37513f = bVar.f().d();
        if (z8 && vVar.f37510c == 100) {
            return null;
        }
        return vVar;
    }

    @Override // j8.f
    public final void cancel() {
        this.f39189f = true;
        z zVar = this.f39187d;
        if (zVar != null) {
            zVar.f(EnumC4710b.f39096A);
        }
    }

    @Override // j8.f
    public final void d() {
        this.f39186c.flush();
    }

    @Override // j8.f
    public final u8.w e() {
        z zVar = this.f39187d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar;
    }

    @Override // j8.f
    public final j8.e f() {
        return this.f39184a;
    }

    @Override // j8.f
    public final u8.x g(e8.w wVar) {
        z zVar = this.f39187d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39211A;
    }

    @Override // j8.f
    public final void h(C4903n c4903n) {
        int i;
        z zVar;
        if (this.f39187d != null) {
            return;
        }
        boolean z8 = true;
        boolean z9 = ((e8.u) c4903n.f40104x) != null;
        e8.m mVar = (e8.m) c4903n.f40103w;
        ArrayList arrayList = new ArrayList(mVar.size() + 4);
        arrayList.add(new C4712d(C4712d.f39108f, (String) c4903n.f40102v));
        u8.h hVar = C4712d.f39109g;
        e8.o url = (e8.o) c4903n.f40101u;
        kotlin.jvm.internal.h.e(url, "url");
        String b9 = url.b();
        String d2 = url.d();
        if (d2 != null) {
            b9 = b9 + '?' + d2;
        }
        arrayList.add(new C4712d(hVar, b9));
        String a9 = ((e8.m) c4903n.f40103w).a("Host");
        if (a9 != null) {
            arrayList.add(new C4712d(C4712d.i, a9));
        }
        arrayList.add(new C4712d(C4712d.f39110h, url.f37437a));
        int size = mVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String c4 = mVar.c(i4);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c4.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            if (!f39182g.contains(lowerCase) || (lowerCase.equals("te") && mVar.e(i4).equals("trailers"))) {
                arrayList.add(new C4712d(lowerCase, mVar.e(i4)));
            }
        }
        r rVar = this.f39186c;
        rVar.getClass();
        boolean z10 = !z9;
        synchronized (rVar.f39172P) {
            synchronized (rVar) {
                try {
                    if (rVar.f39179x > 1073741823) {
                        rVar.i(EnumC4710b.f39103z);
                    }
                    if (rVar.f39180y) {
                        throw new C4709a();
                    }
                    i = rVar.f39179x;
                    rVar.f39179x = i + 2;
                    zVar = new z(i, rVar, z10, false, null);
                    if (z9 && rVar.f39169M < rVar.f39170N && zVar.f39220w < zVar.f39221x) {
                        z8 = false;
                    }
                    if (zVar.i()) {
                        rVar.f39176u.put(Integer.valueOf(i), zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f39172P.j(z10, i, arrayList);
        }
        if (z8) {
            rVar.f39172P.flush();
        }
        this.f39187d = zVar;
        if (this.f39189f) {
            z zVar2 = this.f39187d;
            kotlin.jvm.internal.h.b(zVar2);
            zVar2.f(EnumC4710b.f39096A);
            throw new IOException("Canceled");
        }
        z zVar3 = this.f39187d;
        kotlin.jvm.internal.h.b(zVar3);
        y yVar = zVar3.f39213C;
        long j9 = this.f39185b.f38600g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j9);
        z zVar4 = this.f39187d;
        kotlin.jvm.internal.h.b(zVar4);
        zVar4.f39214D.g(this.f39185b.f38601h);
    }

    @Override // j8.f
    public final u8.v i(C4903n c4903n, long j9) {
        z zVar = this.f39187d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39212B;
    }

    @Override // j8.f
    public final long j(e8.w wVar) {
        if (j8.g.a(wVar)) {
            return f8.d.f(wVar);
        }
        return 0L;
    }
}
