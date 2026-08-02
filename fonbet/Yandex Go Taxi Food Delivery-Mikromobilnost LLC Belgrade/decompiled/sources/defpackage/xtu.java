package defpackage;

import java.io.EOFException;
import java.net.Proxy;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes9.dex */
public final class xtu implements pjo {
    public static final meu f = wwg.z("OkHttp-Response-Body", "Truncated");
    public final OkHttpClient a;
    public final ojo b;
    public final jb7 c;
    public int d;
    public final jpb e;

    public xtu(OkHttpClient okHttpClient, ojo ojoVar, jb7 jb7Var) {
        this.a = okHttpClient;
        this.b = ojoVar;
        this.c = jb7Var;
        this.e = new jpb((jci0) jb7Var.c);
    }

    @Override // defpackage.pjo
    public final void a(d5j0 d5j0Var) {
        Proxy.Type type = this.b.getRoute().b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(d5j0Var.b);
        sb.append(HexString.CHAR_SPACE);
        kwu kwuVar = d5j0Var.a;
        if (kwuVar.f() || type != Proxy.Type.HTTP) {
            String b = kwuVar.b();
            String d = kwuVar.d();
            if (d != null) {
                b = oyr.f('?', b, d);
            }
            sb.append(b);
        } else {
            sb.append(kwuVar);
        }
        sb.append(" HTTP/1.1");
        l(d5j0Var.c, sb.toString());
    }

    @Override // defpackage.pjo
    public final void b() {
        ((ici0) this.c.w).flush();
    }

    @Override // defpackage.pjo
    public final k5t0 c() {
        return this.c;
    }

    @Override // defpackage.pjo
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.pjo
    public final void d() {
        ((ici0) this.c.w).flush();
    }

    @Override // defpackage.pjo
    public final y9t0 e(kvj0 kvj0Var) {
        d5j0 d5j0Var = kvj0Var.a;
        if (!lvu.a(kvj0Var)) {
            return k(d5j0Var.a, 0L);
        }
        String a = kvj0Var.y.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            kwu kwuVar = d5j0Var.a;
            if (this.d == 4) {
                this.d = 5;
                return new utu(this, kwuVar);
            }
            yci0.i(this.d, "state: ");
            return null;
        }
        long f2 = bg61.f(kvj0Var);
        if (f2 != -1) {
            return k(d5j0Var.a, f2);
        }
        kwu kwuVar2 = d5j0Var.a;
        if (this.d != 4) {
            yci0.i(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.b();
        return new wtu(this, kwuVar2);
    }

    @Override // defpackage.pjo
    public final uis0 f(d5j0 d5j0Var, long j) {
        if ("chunked".equalsIgnoreCase(d5j0Var.c.a("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = 2;
                return new ttu(this);
            }
            yci0.i(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            ny61.r("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new ocp(this);
        }
        yci0.i(this.d, "state: ");
        return null;
    }

    @Override // defpackage.pjo
    public final boolean g() {
        return this.d == 6;
    }

    @Override // defpackage.pjo
    public final cvj0 h(boolean z) {
        jpb jpbVar = this.e;
        qq6 qq6Var = (qq6) jpbVar.c;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            yci0.i(this.d, "state: ");
            return null;
        }
        try {
            String j1 = qq6Var.j1(jpbVar.b);
            jpbVar.b -= j1.length();
            suu O = rzo.O(j1);
            int i2 = O.b;
            cvj0 cvj0Var = new cvj0();
            cvj0Var.b = (Protocol) O.d;
            cvj0Var.c = i2;
            cvj0Var.d = (String) O.c;
            keu keuVar = new keu();
            while (true) {
                String j12 = qq6Var.j1(jpbVar.b);
                jpbVar.b -= j12.length();
                if (j12.length() == 0) {
                    break;
                }
                keuVar.b(j12);
            }
            cvj0Var.f = keuVar.d().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return cvj0Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return cvj0Var;
            }
            this.d = 3;
            return cvj0Var;
        } catch (EOFException e) {
            dac.g("unexpected end of stream on ".concat(this.b.getRoute().a.h.k()), e);
            return null;
        }
    }

    @Override // defpackage.pjo
    public final long i(kvj0 kvj0Var) {
        if (!lvu.a(kvj0Var)) {
            return 0L;
        }
        String a = kvj0Var.y.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return bg61.f(kvj0Var);
    }

    @Override // defpackage.pjo
    public final ojo j() {
        return this.b;
    }

    public final vtu k(kwu kwuVar, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new vtu(this, kwuVar, j);
        }
        yci0.i(this.d, "state: ");
        return null;
    }

    public final void l(meu meuVar, String str) {
        if (this.d != 0) {
            yci0.i(this.d, "state: ");
            return;
        }
        jb7 jb7Var = this.c;
        ici0 ici0Var = (ici0) jb7Var.w;
        ici0Var.p1(str);
        ici0Var.p1(Constants.LINE_SEPARATOR);
        int size = meuVar.size();
        int i = 0;
        while (true) {
            ici0 ici0Var2 = (ici0) jb7Var.w;
            if (i >= size) {
                ici0Var2.p1(Constants.LINE_SEPARATOR);
                this.d = 1;
                return;
            } else {
                ici0Var2.p1(meuVar.b(i));
                ici0Var2.p1(Extension.COLON_SPACE);
                ici0Var2.p1(meuVar.f(i));
                ici0Var2.p1(Constants.LINE_SEPARATOR);
                i++;
            }
        }
    }
}
