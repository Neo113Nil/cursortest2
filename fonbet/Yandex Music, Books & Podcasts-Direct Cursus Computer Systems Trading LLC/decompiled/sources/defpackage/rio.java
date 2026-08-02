package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class rio implements Closeable {
    public final m97 a;
    public final m97 b;
    public final String c;
    public final SocketFactory d;
    public Uri h;
    public qz7 j;
    public String k;
    public qio m;
    public anx n;
    public boolean p;
    public boolean q;
    public boolean r;
    public final ArrayDeque e = new ArrayDeque();
    public final SparseArray f = new SparseArray();
    public final x0 g = new x0(this);
    public bjo i = new bjo(new atn(this));
    public long l = 60000;
    public long s = -9223372036854775807L;
    public int o = -1;

    public rio(m97 m97Var, m97 m97Var2, String str, Uri uri, SocketFactory socketFactory) {
        this.a = m97Var;
        this.b = m97Var2;
        this.c = str;
        this.d = socketFactory;
        this.h = cjo.f(uri);
        this.j = cjo.d(uri);
    }

    public static void a(rio rioVar, pg5 pg5Var) {
        if (rioVar.p) {
            rioVar.b.c(pg5Var);
            return;
        }
        m97 m97Var = rioVar.a;
        String message = pg5Var.getMessage();
        if (message == null) {
            message = "";
        }
        m97Var.f(pg5Var, message);
    }

    public final void b() {
        long m0;
        uio uioVar = (uio) this.e.pollFirst();
        if (uioVar == null) {
            wio wioVar = (wio) this.b.b;
            long j = wioVar.n;
            if (j != -9223372036854775807L) {
                m0 = dvt.m0(j);
            } else {
                long j2 = wioVar.o;
                m0 = j2 != -9223372036854775807L ? dvt.m0(j2) : 0L;
            }
            wioVar.d.z(m0);
            return;
        }
        Uri uri = uioVar.b.b.b;
        vq1.B(uioVar.c);
        String str = uioVar.c;
        String str2 = this.k;
        x0 x0Var = this.g;
        ((rio) x0Var.d).o = 0;
        hld.v("Transport", str);
        x0Var.c0(x0Var.F(10, str2, vsn.g(1, new Object[]{"Transport", str}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qio qioVar = this.m;
        if (qioVar != null) {
            qioVar.close();
            this.m = null;
            Uri uri = this.h;
            String str = this.k;
            str.getClass();
            x0 x0Var = this.g;
            rio rioVar = (rio) x0Var.d;
            int i = rioVar.o;
            if (i != -1 && i != 0) {
                rioVar.o = 0;
                x0Var.c0(x0Var.F(12, str, vsn.g, uri));
            }
        }
        this.i.close();
    }

    public final Socket g(Uri uri) {
        vq1.v(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.d.createSocket(host, port);
    }

    public final void o(long j) {
        if (this.o == 2 && !this.r) {
            Uri uri = this.h;
            String str = this.k;
            str.getClass();
            x0 x0Var = this.g;
            rio rioVar = (rio) x0Var.d;
            vq1.A(rioVar.o == 2);
            x0Var.c0(x0Var.F(5, str, vsn.g, uri));
            rioVar.r = true;
        }
        this.s = j;
    }

    public final void z(long j) {
        Uri uri = this.h;
        String str = this.k;
        str.getClass();
        x0 x0Var = this.g;
        int i = ((rio) x0Var.d).o;
        vq1.A(i == 1 || i == 2);
        ejo ejoVar = ejo.c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i2 = dvt.a;
        x0Var.c0(x0Var.F(6, str, vsn.g(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
