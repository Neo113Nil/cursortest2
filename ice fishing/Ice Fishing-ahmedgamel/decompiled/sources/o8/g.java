package o8;

import Q7.j;
import com.google.android.gms.internal.ads.C3404j1;
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
import s2.C4945n;
import w.AbstractC5128c;
import y8.p;
import y8.w;
import y8.x;

/* loaded from: classes2.dex */
public final class g implements n8.f {

    /* renamed from: f, reason: collision with root package name */
    public static final l f39778f;

    /* renamed from: a, reason: collision with root package name */
    public final r f39779a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.e f39780b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.g f39781c;

    /* renamed from: d, reason: collision with root package name */
    public int f39782d;

    /* renamed from: e, reason: collision with root package name */
    public final C3404j1 f39783e;

    static {
        l lVar = l.f38268u;
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
            strArr[i4] = j.G0(inputNamesAndValues[i4]).toString();
        }
        int e9 = d6.c.e(0, strArr.length - 1, 2);
        if (e9 >= 0) {
            while (true) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                X2.a.k(str);
                X2.a.l(str2, str);
                if (i == e9) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f39778f = new l(strArr);
    }

    public g(r rVar, n8.e eVar, l4.g socket) {
        h.e(socket, "socket");
        this.f39779a = rVar;
        this.f39780b = eVar;
        this.f39781c = socket;
        this.f39783e = new C3404j1((y8.r) socket.f38917v);
    }

    @Override // n8.f
    public final void a(C4945n c4945n) {
        Proxy.Type type = this.f39780b.g().f38382b.type();
        h.d(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) c4945n.f40492v);
        sb.append(' ');
        n nVar = (n) c4945n.f40491u;
        if (h.a(nVar.f38278a, "https") || type != Proxy.Type.HTTP) {
            String b9 = nVar.b();
            String d9 = nVar.d();
            if (d9 != null) {
                b9 = b9 + '?' + d9;
            }
            sb.append(b9);
        } else {
            sb.append(nVar);
        }
        sb.append(" HTTP/1.1");
        l((l) c4945n.f40493w, sb.toString());
    }

    @Override // n8.f
    public final void b() {
        ((p) this.f39781c.f38918w).flush();
    }

    @Override // n8.f
    public final boolean c() {
        return this.f39782d == 6;
    }

    @Override // n8.f
    public final void cancel() {
        this.f39780b.cancel();
    }

    @Override // n8.f
    public final long d(v vVar) {
        if (!n8.g.a(vVar)) {
            return 0L;
        }
        String a9 = vVar.f38376y.a("Transfer-Encoding");
        if (a9 == null) {
            a9 = null;
        }
        if ("chunked".equalsIgnoreCase(a9)) {
            return -1L;
        }
        return j8.d.f(vVar);
    }

    @Override // n8.f
    public final x e(v vVar) {
        boolean a9 = n8.g.a(vVar);
        C4945n c4945n = vVar.f38371n;
        if (!a9) {
            return k((n) c4945n.f40491u, 0L);
        }
        String a10 = vVar.f38376y.a("Transfer-Encoding");
        if (a10 == null) {
            a10 = null;
        }
        if ("chunked".equalsIgnoreCase(a10)) {
            n nVar = (n) c4945n.f40491u;
            if (this.f39782d == 4) {
                this.f39782d = 5;
                return new c(this, nVar);
            }
            throw new IllegalStateException(("state: " + this.f39782d).toString());
        }
        long f2 = j8.d.f(vVar);
        if (f2 != -1) {
            return k((n) c4945n.f40491u, f2);
        }
        n url = (n) c4945n.f40491u;
        if (this.f39782d != 4) {
            throw new IllegalStateException(("state: " + this.f39782d).toString());
        }
        this.f39782d = 5;
        this.f39780b.d();
        h.e(url, "url");
        return new f(this, url);
    }

    @Override // n8.f
    public final u f(boolean z6) {
        C3404j1 c3404j1 = this.f39783e;
        int i = this.f39782d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.f39782d).toString());
        }
        try {
            String D8 = ((y8.r) c3404j1.f31944v).D(c3404j1.f31943u);
            c3404j1.f31943u -= D8.length();
            F.d o4 = Z2.d.o(D8);
            int i4 = o4.f917b;
            u uVar = new u();
            uVar.f38350b = (s) o4.f918c;
            uVar.f38351c = i4;
            uVar.f38352d = (String) o4.f919d;
            uVar.f38354f = c3404j1.h().d();
            if (z6 && i4 == 100) {
                return null;
            }
            if (i4 == 100) {
                this.f39782d = 3;
                return uVar;
            }
            if (102 > i4 || i4 >= 200) {
                this.f39782d = 4;
                return uVar;
            }
            this.f39782d = 3;
            return uVar;
        } catch (EOFException e9) {
            throw new IOException(AbstractC5128c.f("unexpected end of stream on ", this.f39780b.g().f38381a.f38193h.f()), e9);
        }
    }

    @Override // n8.f
    public final y8.v g(C4945n c4945n, long j6) {
        if ("chunked".equalsIgnoreCase(((l) c4945n.f40493w).a("Transfer-Encoding"))) {
            if (this.f39782d == 1) {
                this.f39782d = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.f39782d).toString());
        }
        if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f39782d == 1) {
            this.f39782d = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.f39782d).toString());
    }

    @Override // n8.f
    public final void h() {
        ((p) this.f39781c.f38918w).flush();
    }

    @Override // n8.f
    public final w i() {
        return this.f39781c;
    }

    @Override // n8.f
    public final n8.e j() {
        return this.f39780b;
    }

    public final d k(n nVar, long j6) {
        if (this.f39782d == 4) {
            this.f39782d = 5;
            return new d(this, nVar, j6);
        }
        throw new IllegalStateException(("state: " + this.f39782d).toString());
    }

    public final void l(l headers, String requestLine) {
        h.e(headers, "headers");
        h.e(requestLine, "requestLine");
        if (this.f39782d != 0) {
            throw new IllegalStateException(("state: " + this.f39782d).toString());
        }
        l4.g gVar = this.f39781c;
        p pVar = (p) gVar.f38918w;
        pVar.u(requestLine);
        pVar.u("\r\n");
        int size = headers.size();
        int i = 0;
        while (true) {
            p pVar2 = (p) gVar.f38918w;
            if (i >= size) {
                pVar2.u("\r\n");
                this.f39782d = 1;
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
