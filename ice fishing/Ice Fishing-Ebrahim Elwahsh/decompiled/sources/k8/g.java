package k8;

import M7.j;
import com.google.android.gms.internal.ads.C3288h1;
import e8.m;
import e8.o;
import e8.s;
import e8.t;
import e8.v;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import q2.C4903n;
import t0.AbstractC5051n;
import u8.p;
import u8.r;
import u8.w;
import u8.x;

/* loaded from: classes2.dex */
public final class g implements j8.f {

    /* renamed from: f, reason: collision with root package name */
    public static final m f38846f;

    /* renamed from: a, reason: collision with root package name */
    public final s f38847a;

    /* renamed from: b, reason: collision with root package name */
    public final j8.e f38848b;

    /* renamed from: c, reason: collision with root package name */
    public final Y2.e f38849c;

    /* renamed from: d, reason: collision with root package name */
    public int f38850d;

    /* renamed from: e, reason: collision with root package name */
    public final C3288h1 f38851e;

    static {
        m mVar = m.f37427u;
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        h.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (strArr[i4] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i4] = j.h0(inputNamesAndValues[i4]).toString();
        }
        int N8 = com.bumptech.glide.g.N(0, strArr.length - 1, 2);
        if (N8 >= 0) {
            while (true) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                K3.b.p(str);
                K3.b.q(str2, str);
                if (i == N8) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f38846f = new m(strArr);
    }

    public g(s sVar, j8.e eVar, Y2.e socket) {
        h.e(socket, "socket");
        this.f38847a = sVar;
        this.f38848b = eVar;
        this.f38849c = socket;
        this.f38851e = new C3288h1((r) socket.f3964v);
    }

    @Override // j8.f
    public final void a() {
        ((p) this.f38849c.f3965w).flush();
    }

    @Override // j8.f
    public final boolean b() {
        return this.f38850d == 6;
    }

    @Override // j8.f
    public final v c(boolean z8) {
        C3288h1 c3288h1 = this.f38851e;
        int i = this.f38850d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f38850d).toString());
        }
        try {
            String C7 = ((r) c3288h1.f31134v).C(c3288h1.f31133u);
            c3288h1.f31133u -= C7.length();
            F.d l9 = p8.g.l(C7);
            int i4 = l9.f908b;
            v vVar = new v();
            vVar.f37509b = (t) l9.f909c;
            vVar.f37510c = i4;
            vVar.f37511d = (String) l9.f910d;
            vVar.f37513f = c3288h1.j().d();
            if (z8 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f38850d = 3;
                return vVar;
            }
            if (102 > i4 || i4 >= 200) {
                this.f38850d = 4;
                return vVar;
            }
            this.f38850d = 3;
            return vVar;
        } catch (EOFException e6) {
            throw new IOException(AbstractC5051n.f("unexpected end of stream on ", this.f38848b.g().f37540a.f37351h.f()), e6);
        }
    }

    @Override // j8.f
    public final void cancel() {
        this.f38848b.cancel();
    }

    @Override // j8.f
    public final void d() {
        ((p) this.f38849c.f3965w).flush();
    }

    @Override // j8.f
    public final w e() {
        return this.f38849c;
    }

    @Override // j8.f
    public final j8.e f() {
        return this.f38848b;
    }

    @Override // j8.f
    public final x g(e8.w wVar) {
        boolean a9 = j8.g.a(wVar);
        C4903n c4903n = wVar.f37530n;
        if (!a9) {
            return k((o) c4903n.f40101u, 0L);
        }
        String a10 = wVar.f37535y.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if ("chunked".equalsIgnoreCase(a10)) {
            o oVar = (o) c4903n.f40101u;
            if (this.f38850d == 4) {
                this.f38850d = 5;
                return new c(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f38850d).toString());
        }
        long f6 = f8.d.f(wVar);
        if (f6 != -1) {
            return k((o) c4903n.f40101u, f6);
        }
        o url = (o) c4903n.f40101u;
        if (this.f38850d != 4) {
            throw new IllegalStateException(("state: " + this.f38850d).toString());
        }
        this.f38850d = 5;
        this.f38848b.e();
        h.e(url, "url");
        return new f(this, url);
    }

    @Override // j8.f
    public final void h(C4903n c4903n) {
        Proxy.Type type = this.f38848b.g().f37541b.type();
        h.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c4903n.f40102v);
        sb.append(' ');
        o oVar = (o) c4903n.f40101u;
        if (h.a(oVar.f37437a, "https") || type != Proxy.Type.HTTP) {
            String b9 = oVar.b();
            String d2 = oVar.d();
            if (d2 != null) {
                b9 = b9 + '?' + d2;
            }
            sb.append(b9);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        l((m) c4903n.f40103w, sb.toString());
    }

    @Override // j8.f
    public final u8.v i(C4903n c4903n, long j9) {
        if ("chunked".equalsIgnoreCase(((m) c4903n.f40103w).a("Transfer-Encoding"))) {
            if (this.f38850d == 1) {
                this.f38850d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f38850d).toString());
        }
        if (j9 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f38850d == 1) {
            this.f38850d = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f38850d).toString());
    }

    @Override // j8.f
    public final long j(e8.w wVar) {
        if (!j8.g.a(wVar)) {
            return 0L;
        }
        String a9 = wVar.f37535y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        if ("chunked".equalsIgnoreCase(a9)) {
            return -1L;
        }
        return f8.d.f(wVar);
    }

    public final d k(o oVar, long j9) {
        if (this.f38850d == 4) {
            this.f38850d = 5;
            return new d(this, oVar, j9);
        }
        throw new IllegalStateException(("state: " + this.f38850d).toString());
    }

    public final void l(m headers, String requestLine) {
        h.e(headers, "headers");
        h.e(requestLine, "requestLine");
        if (this.f38850d != 0) {
            throw new IllegalStateException(("state: " + this.f38850d).toString());
        }
        Y2.e eVar = this.f38849c;
        p pVar = (p) eVar.f3965w;
        pVar.u(requestLine);
        pVar.u("\r\n");
        int size = headers.size();
        int i = 0;
        while (true) {
            p pVar2 = (p) eVar.f3965w;
            if (i >= size) {
                pVar2.u("\r\n");
                this.f38850d = 1;
                return;
            } else {
                pVar2.u(headers.c(i));
                pVar2.u(": ");
                pVar2.u(headers.e(i));
                pVar2.u("\r\n");
                i++;
            }
        }
    }
}
