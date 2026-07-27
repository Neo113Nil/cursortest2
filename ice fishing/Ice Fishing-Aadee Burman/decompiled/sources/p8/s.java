package p8;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import q2.C4896n;

/* loaded from: classes2.dex */
public final class s implements n8.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f39899g = j8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", com.anythink.core.common.n.b.a.e.c.f15125c, com.anythink.core.common.n.b.a.e.c.f15126d, com.anythink.core.common.n.b.a.e.c.f15127e, com.anythink.core.common.n.b.a.e.c.f15128f});

    /* renamed from: h, reason: collision with root package name */
    public static final List f39900h = j8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final m8.r f39901a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.h f39902b;

    /* renamed from: c, reason: collision with root package name */
    public final r f39903c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f39904d;

    /* renamed from: e, reason: collision with root package name */
    public final i8.s f39905e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f39906f;

    public s(i8.r client, m8.r rVar, n8.h hVar, r http2Connection) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(http2Connection, "http2Connection");
        this.f39901a = rVar;
        this.f39902b = hVar;
        this.f39903c = http2Connection;
        i8.s sVar = i8.s.f38228z;
        this.f39905e = client.f38211r.contains(sVar) ? sVar : i8.s.f38227y;
    }

    @Override // n8.f
    public final void a() {
        z zVar = this.f39904d;
        kotlin.jvm.internal.h.b(zVar);
        zVar.f39929B.close();
    }

    @Override // n8.f
    public final boolean b() {
        boolean z3;
        z zVar = this.f39904d;
        if (zVar == null) {
            return false;
        }
        synchronized (zVar) {
            x xVar = zVar.f39928A;
            if (xVar.f39922u) {
                if (xVar.f39924w.j()) {
                    z3 = true;
                }
            }
            z3 = false;
        }
        return z3;
    }

    @Override // n8.f
    public final long c(i8.v vVar) {
        if (n8.g.a(vVar)) {
            return j8.d.f(vVar);
        }
        return 0L;
    }

    @Override // n8.f
    public final void cancel() {
        this.f39906f = true;
        z zVar = this.f39904d;
        if (zVar != null) {
            zVar.g(EnumC4856b.f39813A);
        }
    }

    @Override // n8.f
    public final y8.x d(i8.v vVar) {
        z zVar = this.f39904d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39928A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // n8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i8.u e(boolean z3) {
        int i;
        i8.l lVar;
        boolean z6;
        z zVar = this.f39904d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            while (true) {
                i = 0;
                if (!zVar.f39939y.isEmpty() || zVar.h() != null) {
                    break;
                }
                if (!z3) {
                    zVar.f39935u.getClass();
                    w wVar = zVar.f39929B;
                    if (!wVar.f39919v && !wVar.f39917n) {
                        z6 = false;
                    }
                    z6 = true;
                }
                i = 1;
                if (i != 0) {
                    zVar.f39930C.h();
                }
                try {
                    zVar.l();
                    if (i != 0) {
                        zVar.f39930C.l();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        zVar.f39930C.l();
                    }
                    throw th;
                }
            }
            if (zVar.f39939y.isEmpty()) {
                IOException iOException = zVar.f39933F;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC4856b h9 = zVar.h();
                kotlin.jvm.internal.h.b(h9);
                throw new E(h9);
            }
            Object removeFirst = zVar.f39939y.removeFirst();
            kotlin.jvm.internal.h.d(removeFirst, "removeFirst(...)");
            lVar = (i8.l) removeFirst;
        }
        i8.s protocol = this.f39905e;
        kotlin.jvm.internal.h.e(protocol, "protocol");
        G1.e eVar = new G1.e(3);
        int size = lVar.size();
        F.d dVar = null;
        while (i < size) {
            String c9 = lVar.c(i);
            String e9 = lVar.e(i);
            if (c9.equals(com.anythink.core.common.n.b.a.e.c.f15124b)) {
                dVar = com.bumptech.glide.d.h("HTTP/1.1 ".concat(e9));
            } else if (!f39900h.contains(c9)) {
                com.bumptech.glide.f.f(eVar, c9, e9);
            }
            i++;
        }
        if (dVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i8.u uVar = new i8.u();
        uVar.f38231b = protocol;
        uVar.f38232c = dVar.f854b;
        uVar.f38233d = (String) dVar.f856d;
        uVar.f38235f = eVar.b().d();
        if (z3 && uVar.f38232c == 100) {
            return null;
        }
        return uVar;
    }

    @Override // n8.f
    public final void f() {
        this.f39903c.flush();
    }

    @Override // n8.f
    public final y8.w g() {
        z zVar = this.f39904d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar;
    }

    @Override // n8.f
    public final n8.e h() {
        return this.f39901a;
    }

    @Override // n8.f
    public final void i(C4896n c4896n) {
        int i;
        z zVar;
        if (this.f39904d != null) {
            return;
        }
        boolean z3 = true;
        boolean z6 = ((i8.t) c4896n.f40192x) != null;
        i8.l lVar = (i8.l) c4896n.f40191w;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new C4858d(C4858d.f39825f, (String) c4896n.f40190v));
        y8.h hVar = C4858d.f39826g;
        i8.n url = (i8.n) c4896n.f40189u;
        kotlin.jvm.internal.h.e(url, "url");
        String b9 = url.b();
        String d2 = url.d();
        if (d2 != null) {
            b9 = b9 + '?' + d2;
        }
        arrayList.add(new C4858d(hVar, b9));
        String a9 = ((i8.l) c4896n.f40191w).a("Host");
        if (a9 != null) {
            arrayList.add(new C4858d(C4858d.i, a9));
        }
        arrayList.add(new C4858d(C4858d.f39827h, url.f38159a));
        int size = lVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            String c9 = lVar.c(i6);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c9.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            if (!f39899g.contains(lowerCase) || (lowerCase.equals("te") && lVar.e(i6).equals("trailers"))) {
                arrayList.add(new C4858d(lowerCase, lVar.e(i6)));
            }
        }
        r rVar = this.f39903c;
        rVar.getClass();
        boolean z9 = !z6;
        synchronized (rVar.f39889P) {
            synchronized (rVar) {
                try {
                    if (rVar.f39896x > 1073741823) {
                        rVar.p(EnumC4856b.f39820z);
                    }
                    if (rVar.f39897y) {
                        throw new C4855a();
                    }
                    i = rVar.f39896x;
                    rVar.f39896x = i + 2;
                    zVar = new z(i, rVar, z9, false, null);
                    if (z6 && rVar.f39886M < rVar.f39887N && zVar.f39937w < zVar.f39938x) {
                        z3 = false;
                    }
                    if (zVar.j()) {
                        rVar.f39893u.put(Integer.valueOf(i), zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f39889P.k(z9, i, arrayList);
        }
        if (z3) {
            rVar.f39889P.flush();
        }
        this.f39904d = zVar;
        if (this.f39906f) {
            z zVar2 = this.f39904d;
            kotlin.jvm.internal.h.b(zVar2);
            zVar2.g(EnumC4856b.f39813A);
            throw new IOException("Canceled");
        }
        z zVar3 = this.f39904d;
        kotlin.jvm.internal.h.b(zVar3);
        y yVar = zVar3.f39930C;
        long j6 = this.f39902b.f39523g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j6);
        z zVar4 = this.f39904d;
        kotlin.jvm.internal.h.b(zVar4);
        zVar4.f39931D.g(this.f39902b.f39524h);
    }

    @Override // n8.f
    public final y8.v j(C4896n c4896n, long j6) {
        z zVar = this.f39904d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39929B;
    }
}
