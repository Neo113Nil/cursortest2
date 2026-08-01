package o8;

import Q7.j;
import com.google.android.gms.internal.ads.C3381j1;
import i8.l;
import i8.n;
import i8.r;
import i8.s;
import i8.u;
import i8.v;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import q2.C4896n;
import y8.p;
import y8.w;
import y8.x;

/* loaded from: classes2.dex */
public final class g implements n8.f {

    /* renamed from: f, reason: collision with root package name */
    public static final l f39670f;

    /* renamed from: a, reason: collision with root package name */
    public final r f39671a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.e f39672b;

    /* renamed from: c, reason: collision with root package name */
    public final j4.g f39673c;

    /* renamed from: d, reason: collision with root package name */
    public int f39674d;

    /* renamed from: e, reason: collision with root package name */
    public final C3381j1 f39675e;

    static {
        l lVar = l.f38149u;
        String[] inputNamesAndValues = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        h.e(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (strArr[i6] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i6] = j.q0(inputNamesAndValues[i6]).toString();
        }
        int p9 = t8.g.p(0, strArr.length - 1, 2);
        if (p9 >= 0) {
            while (true) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                com.bumptech.glide.f.h(str);
                com.bumptech.glide.f.i(str2, str);
                if (i == p9) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f39670f = new l(strArr);
    }

    public g(r rVar, n8.e eVar, j4.g socket) {
        h.e(socket, "socket");
        this.f39671a = rVar;
        this.f39672b = eVar;
        this.f39673c = socket;
        this.f39675e = new C3381j1((y8.r) socket.f38405v);
    }

    @Override // n8.f
    public final void a() {
        ((p) this.f39673c.f38406w).flush();
    }

    @Override // n8.f
    public final boolean b() {
        return this.f39674d == 6;
    }

    @Override // n8.f
    public final long c(v vVar) {
        if (!n8.g.a(vVar)) {
            return 0L;
        }
        String a9 = vVar.f38257y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        if ("chunked".equalsIgnoreCase(a9)) {
            return -1L;
        }
        return j8.d.f(vVar);
    }

    @Override // n8.f
    public final void cancel() {
        this.f39672b.cancel();
    }

    @Override // n8.f
    public final x d(v vVar) {
        boolean a9 = n8.g.a(vVar);
        C4896n c4896n = vVar.f38252n;
        if (!a9) {
            return k((n) c4896n.f40192u, 0L);
        }
        String a10 = vVar.f38257y.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if ("chunked".equalsIgnoreCase(a10)) {
            n nVar = (n) c4896n.f40192u;
            if (this.f39674d == 4) {
                this.f39674d = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f39674d).toString());
        }
        long f3 = j8.d.f(vVar);
        if (f3 != -1) {
            return k((n) c4896n.f40192u, f3);
        }
        n url = (n) c4896n.f40192u;
        if (this.f39674d != 4) {
            throw new IllegalStateException(("state: " + this.f39674d).toString());
        }
        this.f39674d = 5;
        this.f39672b.d();
        h.e(url, "url");
        return new f(this, url);
    }

    @Override // n8.f
    public final u e(boolean z3) {
        C3381j1 c3381j1 = this.f39675e;
        int i = this.f39674d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f39674d).toString());
        }
        try {
            String D8 = ((y8.r) c3381j1.f31157v).D(c3381j1.f31156u);
            c3381j1.f31156u -= D8.length();
            F.d h9 = com.bumptech.glide.d.h(D8);
            int i6 = h9.f854b;
            u uVar = new u();
            uVar.f38231b = (s) h9.f855c;
            uVar.f38232c = i6;
            uVar.f38233d = (String) h9.f856d;
            uVar.f38235f = c3381j1.h().d();
            if (z3 && i6 == 100) {
                return null;
            }
            if (i6 == 100) {
                this.f39674d = 3;
                return uVar;
            }
            if (102 > i6 || i6 >= 200) {
                this.f39674d = 4;
                return uVar;
            }
            this.f39674d = 3;
            return uVar;
        } catch (EOFException e9) {
            throw new IOException(u1.h.f("unexpected end of stream on ", this.f39672b.g().f38262a.f38074h.f()), e9);
        }
    }

    @Override // n8.f
    public final void f() {
        ((p) this.f39673c.f38406w).flush();
    }

    @Override // n8.f
    public final w g() {
        return this.f39673c;
    }

    @Override // n8.f
    public final n8.e h() {
        return this.f39672b;
    }

    @Override // n8.f
    public final void i(C4896n c4896n) {
        Proxy.Type type = this.f39672b.g().f38263b.type();
        h.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c4896n.f40193v);
        sb.append(' ');
        n nVar = (n) c4896n.f40192u;
        if (h.a(nVar.f38159a, "https") || type != Proxy.Type.HTTP) {
            String b9 = nVar.b();
            String d2 = nVar.d();
            if (d2 != null) {
                b9 = b9 + '?' + d2;
            }
            sb.append(b9);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        l((l) c4896n.f40194w, sb.toString());
    }

    @Override // n8.f
    public final y8.v j(C4896n c4896n, long j6) {
        if ("chunked".equalsIgnoreCase(((l) c4896n.f40194w).a("Transfer-Encoding"))) {
            if (this.f39674d == 1) {
                this.f39674d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f39674d).toString());
        }
        if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f39674d == 1) {
            this.f39674d = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f39674d).toString());
    }

    public final d k(n nVar, long j6) {
        if (this.f39674d == 4) {
            this.f39674d = 5;
            return new d(this, nVar, j6);
        }
        throw new IllegalStateException(("state: " + this.f39674d).toString());
    }

    public final void l(l headers, String requestLine) {
        h.e(headers, "headers");
        h.e(requestLine, "requestLine");
        if (this.f39674d != 0) {
            throw new IllegalStateException(("state: " + this.f39674d).toString());
        }
        j4.g gVar = this.f39673c;
        p pVar = (p) gVar.f38406w;
        pVar.u(requestLine);
        pVar.u("\r\n");
        int size = headers.size();
        int i = 0;
        while (true) {
            p pVar2 = (p) gVar.f38406w;
            if (i >= size) {
                pVar2.u("\r\n");
                this.f39674d = 1;
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
