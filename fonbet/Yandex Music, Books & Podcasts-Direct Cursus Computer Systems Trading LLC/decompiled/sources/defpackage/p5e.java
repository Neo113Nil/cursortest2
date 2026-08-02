package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class p5e implements iob {
    public static final List g = cvt.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = cvt.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final okn a;
    public final ukn b;
    public final o5e c;
    public volatile x5e d;
    public final izm e;
    public volatile boolean f;

    public p5e(OkHttpClient okHttpClient, okn oknVar, ukn uknVar, o5e o5eVar) {
        okHttpClient.getClass();
        o5eVar.getClass();
        this.a = oknVar;
        this.b = uknVar;
        this.c = o5eVar;
        List list = okHttpClient.s;
        izm izmVar = izm.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(izmVar) ? izmVar : izm.HTTP_2;
    }

    @Override // defpackage.iob
    public final n3r a(l3o l3oVar) {
        x5e x5eVar = this.d;
        x5eVar.getClass();
        return x5eVar.i;
    }

    @Override // defpackage.iob
    public final void b() {
        x5e x5eVar = this.d;
        x5eVar.getClass();
        x5eVar.f().close();
    }

    @Override // defpackage.iob
    public final long c(l3o l3oVar) {
        if (u6e.a(l3oVar)) {
            return cvt.k(l3oVar);
        }
        return 0L;
    }

    @Override // defpackage.iob
    public final void cancel() {
        this.f = true;
        x5e x5eVar = this.d;
        if (x5eVar != null) {
            x5eVar.e(9);
        }
    }

    @Override // defpackage.iob
    public final okn d() {
        return this.a;
    }

    @Override // defpackage.iob
    public final void e(d0o d0oVar) {
        int i;
        x5e x5eVar;
        boolean z;
        d0oVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = d0oVar.d != null;
        zvd zvdVar = d0oVar.c;
        ArrayList arrayList = new ArrayList(zvdVar.size() + 4);
        arrayList.add(new wtd(wtd.f, d0oVar.b));
        pn3 pn3Var = wtd.g;
        u7e u7eVar = d0oVar.a;
        u7eVar.getClass();
        String b = u7eVar.b();
        String d = u7eVar.d();
        if (d != null) {
            b = hrg.l('?', b, d);
        }
        arrayList.add(new wtd(pn3Var, b));
        String a = d0oVar.c.a("Host");
        if (a != null) {
            arrayList.add(new wtd(wtd.i, a));
        }
        arrayList.add(new wtd(wtd.h, u7eVar.a));
        int size = zvdVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String g2 = zvdVar.g(i2);
            Locale locale = Locale.US;
            String s = ouj.s(locale, g2, locale);
            if (!g.contains(s) || (s.equals("te") && Intrinsics.d(zvdVar.q(i2), "trailers"))) {
                arrayList.add(new wtd(s, zvdVar.q(i2)));
            }
        }
        o5e o5eVar = this.c;
        o5eVar.getClass();
        boolean z3 = !z2;
        synchronized (o5eVar.w) {
            synchronized (o5eVar) {
                try {
                    if (o5eVar.e > 1073741823) {
                        o5eVar.o(8);
                    }
                    if (o5eVar.f) {
                        throw new i66();
                    }
                    i = o5eVar.e;
                    o5eVar.e = i + 2;
                    x5eVar = new x5e(i, o5eVar, z3, false, null);
                    z = !z2 || o5eVar.t >= o5eVar.u || x5eVar.e >= x5eVar.f;
                    if (x5eVar.h()) {
                        o5eVar.b.put(Integer.valueOf(i), x5eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            o5eVar.w.z(i, arrayList, z3);
        }
        if (z) {
            o5eVar.w.flush();
        }
        this.d = x5eVar;
        boolean z4 = this.f;
        x5e x5eVar2 = this.d;
        if (z4) {
            x5eVar2.getClass();
            x5eVar2.e(9);
            kac.f("Canceled");
            return;
        }
        x5eVar2.getClass();
        w5e w5eVar = x5eVar2.k;
        long j = this.b.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w5eVar.g(j, timeUnit);
        x5e x5eVar3 = this.d;
        x5eVar3.getClass();
        x5eVar3.l.g(this.b.e, timeUnit);
    }

    @Override // defpackage.iob
    public final jmq f(d0o d0oVar, long j) {
        d0oVar.getClass();
        x5e x5eVar = this.d;
        x5eVar.getClass();
        return x5eVar.f();
    }

    @Override // defpackage.iob
    public final k3o g(boolean z) {
        zvd zvdVar;
        x5e x5eVar = this.d;
        if (x5eVar == null) {
            kac.f("stream wasn't created");
            return null;
        }
        synchronized (x5eVar) {
            x5eVar.k.i();
            while (x5eVar.g.isEmpty() && x5eVar.m == 0) {
                try {
                    try {
                        x5eVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    x5eVar.k.l();
                    throw th;
                }
            }
            x5eVar.k.l();
            if (x5eVar.g.isEmpty()) {
                IOException iOException = x5eVar.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = x5eVar.m;
                if (i != 0) {
                    throw new sjr(i);
                }
                throw null;
            }
            Object removeFirst = x5eVar.g.removeFirst();
            removeFirst.getClass();
            zvdVar = (zvd) removeFirst;
        }
        izm izmVar = this.e;
        izmVar.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = zvdVar.size();
        w2r w2rVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            String g2 = zvdVar.g(i2);
            String q = zvdVar.q(i2);
            if (Intrinsics.d(g2, ":status")) {
                w2rVar = lsq.D("HTTP/1.1 " + q);
            } else if (!h.contains(g2)) {
                g2.getClass();
                q.getClass();
                arrayList.add(g2);
                arrayList.add(StringsKt.t0(q).toString());
            }
        }
        if (w2rVar == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        k3o k3oVar = new k3o();
        k3oVar.b = izmVar;
        k3oVar.c = w2rVar.b;
        k3oVar.d = (String) w2rVar.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        pv9 pv9Var = new pv9(9);
        z75.u((ArrayList) pv9Var.b, strArr);
        k3oVar.f = pv9Var;
        if (z && k3oVar.c == 100) {
            return null;
        }
        return k3oVar;
    }

    @Override // defpackage.iob
    public final void h() {
        this.c.w.flush();
    }
}
