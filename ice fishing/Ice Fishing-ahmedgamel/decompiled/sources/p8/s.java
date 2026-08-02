package p8;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import s2.C4945n;

/* loaded from: classes2.dex */
public final class s implements n8.f {

    /* renamed from: g, reason: collision with root package name */
    public static final List f39949g = j8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", com.anythink.core.common.n.b.a.e.c.f15912c, com.anythink.core.common.n.b.a.e.c.f15913d, com.anythink.core.common.n.b.a.e.c.f15914e, com.anythink.core.common.n.b.a.e.c.f15915f});

    /* renamed from: h, reason: collision with root package name */
    public static final List f39950h = j8.d.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final m8.q f39951a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.h f39952b;

    /* renamed from: c, reason: collision with root package name */
    public final r f39953c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f39954d;

    /* renamed from: e, reason: collision with root package name */
    public final i8.s f39955e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f39956f;

    public s(i8.r client, m8.q qVar, n8.h hVar, r http2Connection) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(http2Connection, "http2Connection");
        this.f39951a = qVar;
        this.f39952b = hVar;
        this.f39953c = http2Connection;
        i8.s sVar = i8.s.f38347z;
        this.f39955e = client.f38330r.contains(sVar) ? sVar : i8.s.f38346y;
    }

    @Override // n8.f
    public final void a(C4945n c4945n) {
        int i;
        z zVar;
        if (this.f39954d != null) {
            return;
        }
        boolean z6 = true;
        boolean z9 = ((i8.t) c4945n.f40494x) != null;
        i8.l lVar = (i8.l) c4945n.f40493w;
        ArrayList arrayList = new ArrayList(lVar.size() + 4);
        arrayList.add(new C4858d(C4858d.f39875f, (String) c4945n.f40492v));
        y8.h hVar = C4858d.f39876g;
        i8.n url = (i8.n) c4945n.f40491u;
        kotlin.jvm.internal.h.e(url, "url");
        String b9 = url.b();
        String d9 = url.d();
        if (d9 != null) {
            b9 = b9 + '?' + d9;
        }
        arrayList.add(new C4858d(hVar, b9));
        String a9 = ((i8.l) c4945n.f40493w).a("Host");
        if (a9 != null) {
            arrayList.add(new C4858d(C4858d.i, a9));
        }
        arrayList.add(new C4858d(C4858d.f39877h, url.f38278a));
        int size = lVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String c9 = lVar.c(i4);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c9.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            if (!f39949g.contains(lowerCase) || (lowerCase.equals("te") && lVar.e(i4).equals("trailers"))) {
                arrayList.add(new C4858d(lowerCase, lVar.e(i4)));
            }
        }
        r rVar = this.f39953c;
        rVar.getClass();
        boolean z10 = !z9;
        synchronized (rVar.f39939P) {
            synchronized (rVar) {
                try {
                    if (rVar.f39946x > 1073741823) {
                        rVar.p(EnumC4856b.f39870z);
                    }
                    if (rVar.f39947y) {
                        throw new C4855a();
                    }
                    i = rVar.f39946x;
                    rVar.f39946x = i + 2;
                    zVar = new z(i, rVar, z10, false, null);
                    if (z9 && rVar.f39936M < rVar.f39937N && zVar.f39987w < zVar.f39988x) {
                        z6 = false;
                    }
                    if (zVar.j()) {
                        rVar.f39943u.put(Integer.valueOf(i), zVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f39939P.k(z10, i, arrayList);
        }
        if (z6) {
            rVar.f39939P.flush();
        }
        this.f39954d = zVar;
        if (this.f39956f) {
            z zVar2 = this.f39954d;
            kotlin.jvm.internal.h.b(zVar2);
            zVar2.f(EnumC4856b.f39863A);
            throw new IOException("Canceled");
        }
        z zVar3 = this.f39954d;
        kotlin.jvm.internal.h.b(zVar3);
        y yVar = zVar3.f39980C;
        long j6 = this.f39952b.f39690g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j6);
        z zVar4 = this.f39954d;
        kotlin.jvm.internal.h.b(zVar4);
        zVar4.f39981D.g(this.f39952b.f39691h);
    }

    @Override // n8.f
    public final void b() {
        z zVar = this.f39954d;
        kotlin.jvm.internal.h.b(zVar);
        zVar.f39979B.close();
    }

    @Override // n8.f
    public final boolean c() {
        boolean z6;
        z zVar = this.f39954d;
        if (zVar == null) {
            return false;
        }
        synchronized (zVar) {
            x xVar = zVar.f39978A;
            if (xVar.f39972u) {
                if (xVar.f39974w.j()) {
                    z6 = true;
                }
            }
            z6 = false;
        }
        return z6;
    }

    @Override // n8.f
    public final void cancel() {
        this.f39956f = true;
        z zVar = this.f39954d;
        if (zVar != null) {
            zVar.f(EnumC4856b.f39863A);
        }
    }

    @Override // n8.f
    public final long d(i8.v vVar) {
        if (n8.g.a(vVar)) {
            return j8.d.f(vVar);
        }
        return 0L;
    }

    @Override // n8.f
    public final y8.x e(i8.v vVar) {
        z zVar = this.f39954d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39978A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r3 == false) goto L20;
     */
    @Override // n8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i8.u f(boolean z6) {
        int i;
        i8.l lVar;
        boolean z9;
        z zVar = this.f39954d;
        if (zVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (zVar) {
            while (true) {
                i = 0;
                if (!zVar.f39989y.isEmpty() || zVar.h() != null) {
                    break;
                }
                if (!z6) {
                    zVar.f39985u.getClass();
                    w wVar = zVar.f39979B;
                    if (!wVar.f39969v && !wVar.f39967n) {
                        z9 = false;
                    }
                    z9 = true;
                }
                i = 1;
                if (i != 0) {
                    zVar.f39980C.h();
                }
                try {
                    zVar.l();
                    if (i != 0) {
                        zVar.f39980C.l();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        zVar.f39980C.l();
                    }
                    throw th;
                }
            }
            if (zVar.f39989y.isEmpty()) {
                IOException iOException = zVar.f39983F;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC4856b h3 = zVar.h();
                kotlin.jvm.internal.h.b(h3);
                throw new E(h3);
            }
            Object removeFirst = zVar.f39989y.removeFirst();
            kotlin.jvm.internal.h.d(removeFirst, "removeFirst(...)");
            lVar = (i8.l) removeFirst;
        }
        i8.s protocol = this.f39955e;
        kotlin.jvm.internal.h.e(protocol, "protocol");
        I1.d dVar = new I1.d(3);
        int size = lVar.size();
        F.d dVar2 = null;
        while (i < size) {
            String c9 = lVar.c(i);
            String e9 = lVar.e(i);
            if (c9.equals(com.anythink.core.common.n.b.a.e.c.f15911b)) {
                dVar2 = Z2.d.o("HTTP/1.1 ".concat(e9));
            } else if (!f39950h.contains(c9)) {
                X2.a.b(dVar, c9, e9);
            }
            i++;
        }
        if (dVar2 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        i8.u uVar = new i8.u();
        uVar.f38350b = protocol;
        uVar.f38351c = dVar2.f917b;
        uVar.f38352d = (String) dVar2.f919d;
        uVar.f38354f = dVar.e().d();
        if (z6 && uVar.f38351c == 100) {
            return null;
        }
        return uVar;
    }

    @Override // n8.f
    public final y8.v g(C4945n c4945n, long j6) {
        z zVar = this.f39954d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar.f39979B;
    }

    @Override // n8.f
    public final void h() {
        this.f39953c.flush();
    }

    @Override // n8.f
    public final y8.w i() {
        z zVar = this.f39954d;
        kotlin.jvm.internal.h.b(zVar);
        return zVar;
    }

    @Override // n8.f
    public final n8.e j() {
        return this.f39951a;
    }
}
