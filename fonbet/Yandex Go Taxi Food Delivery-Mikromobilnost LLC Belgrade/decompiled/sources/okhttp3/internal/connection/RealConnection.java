package okhttp3.internal.connection;

import defpackage.b0l0;
import defpackage.b64;
import defpackage.bg61;
import defpackage.c5e;
import defpackage.cuu;
import defpackage.euu;
import defpackage.htx0;
import defpackage.jb7;
import defpackage.jci0;
import defpackage.jl40;
import defpackage.kwu;
import defpackage.l6r0;
import defpackage.luu;
import defpackage.mtx0;
import defpackage.muu;
import defpackage.nci0;
import defpackage.no0;
import defpackage.o6u;
import defpackage.ojo;
import defpackage.p79;
import defpackage.s4e;
import defpackage.vv60;
import defpackage.y1l0;
import defpackage.ypr;
import defpackage.ytu;
import defpackage.yuf0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final class RealConnection extends cuu implements s4e, ojo {
    public final mtx0 b;
    public final b0l0 c;
    public final Socket d;
    public final Socket e;
    public final o6u f;
    public final Protocol g;
    public final jb7 h;
    public final c5e i;
    public euu j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p = 1;
    public final ArrayList q = new ArrayList();
    public long r = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;

    public RealConnection(mtx0 mtx0Var, b0l0 b0l0Var, Socket socket, Socket socket2, o6u o6uVar, Protocol protocol, jb7 jb7Var, c5e c5eVar) {
        this.b = mtx0Var;
        this.c = b0l0Var;
        this.d = socket;
        this.e = socket2;
        this.f = o6uVar;
        this.g = protocol;
        this.h = jb7Var;
        this.i = c5eVar;
    }

    public static void d(OkHttpClient okHttpClient, b0l0 b0l0Var, IOException iOException) {
        if (b0l0Var.b.type() != Proxy.Type.DIRECT) {
            no0 no0Var = b0l0Var.a;
            no0Var.g.connectFailed(no0Var.h.l(), b0l0Var.b.address(), iOException);
        }
        y1l0 y1l0Var = okHttpClient.V;
        synchronized (y1l0Var) {
            y1l0Var.a.add(b0l0Var);
        }
    }

    @Override // defpackage.cuu
    public final void a(l6r0 l6r0Var) {
        synchronized (this) {
            this.p = (l6r0Var.a & 8) != 0 ? l6r0Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.ojo
    public final void b() {
        synchronized (this) {
            this.k = true;
        }
        this.i.getClass();
    }

    @Override // defpackage.cuu
    public final void c(luu luuVar) {
        luuVar.c(ErrorCode.REFUSED_STREAM, null);
    }

    @Override // defpackage.ojo
    public final void cancel() {
        bg61.d(this.d);
    }

    @Override // defpackage.ojo
    public final void e(nci0 nci0Var, IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.j != null) || (iOException instanceof ConnectionShutdownException)) {
                        z = !this.k;
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                d(nci0Var.a, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        z = !this.k;
                        this.k = true;
                        this.m++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !nci0Var.K) {
                    z = !this.k;
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.i.getClass();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (defpackage.vv60.b(r0, (java.security.cert.X509Certificate) r7.get(0)) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(no0 no0Var, List list) {
        kwu kwuVar = no0Var.h;
        TimeZone timeZone = bg61.a;
        if (this.q.size() < this.p && !this.k) {
            b0l0 b0l0Var = this.c;
            no0 no0Var2 = b0l0Var.a;
            no0 no0Var3 = b0l0Var.a;
            if (no0Var2.a(no0Var)) {
                if (jl40.l(kwuVar.d, no0Var3.h.d)) {
                    return true;
                }
                if (this.j != null && list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b0l0 b0l0Var2 = (b0l0) it.next();
                            Proxy.Type type = b0l0Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && b0l0Var.b.type() == type2 && jl40.l(b0l0Var.c, b0l0Var2.c)) {
                                if (no0Var.d == vv60.a) {
                                    TimeZone timeZone2 = bg61.a;
                                    kwu kwuVar2 = no0Var3.h;
                                    int i = kwuVar.e;
                                    String str = kwuVar.d;
                                    if (i == kwuVar2.e) {
                                        boolean l = jl40.l(str, kwuVar2.d);
                                        o6u o6uVar = this.f;
                                        if (!l) {
                                            if (!this.l && o6uVar != null) {
                                                List a = o6uVar.a();
                                                if (!a.isEmpty()) {
                                                }
                                            }
                                        }
                                        try {
                                            p79 p79Var = no0Var.e;
                                            o6uVar.a();
                                            Iterator it2 = p79Var.a.iterator();
                                            if (!it2.hasNext()) {
                                                return true;
                                            }
                                            b64.D(it2.next());
                                            throw null;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = bg61.a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        euu euuVar = this.j;
        if (euuVar != null) {
            synchronized (euuVar) {
                if (euuVar.y) {
                    return false;
                }
                if (euuVar.G < euuVar.F) {
                    if (nanoTime >= euuVar.H) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        jci0 jci0Var = (jci0) this.h.c;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !jci0Var.I1();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.ojo
    public final b0l0 getRoute() {
        return this.c;
    }

    public final void h() {
        this.r = System.nanoTime();
        Protocol protocol = this.g;
        if (protocol == Protocol.HTTP_2 || protocol == Protocol.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            ypr yprVar = ypr.a;
            yuf0 yuf0Var = new yuf0(this.b);
            jb7 jb7Var = this.h;
            String str = this.c.a.h.d;
            yuf0Var.c = jb7Var;
            yuf0Var.a = bg61.b + HexString.CHAR_SPACE + str;
            yuf0Var.d = this;
            yuf0Var.f = yprVar;
            euu euuVar = new euu(yuf0Var);
            this.j = euuVar;
            l6r0 l6r0Var = euu.S;
            this.p = (l6r0Var.a & 8) != 0 ? l6r0Var.b[3] : Integer.MAX_VALUE;
            muu muuVar = euuVar.P;
            synchronized (muuVar) {
                try {
                    if (muuVar.w) {
                        throw new IOException("closed");
                    }
                    Logger logger = muu.y;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(bg61.e(">> CONNECTION " + ytu.a.i(), new Object[0]));
                    }
                    muuVar.a.N0(ytu.a);
                    muuVar.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            muu muuVar2 = euuVar.P;
            l6r0 l6r0Var2 = euuVar.J;
            synchronized (muuVar2) {
                try {
                    if (muuVar2.w) {
                        throw new IOException("closed");
                    }
                    muuVar2.d(0, Integer.bitCount(l6r0Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & l6r0Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            muuVar2.a.writeShort(i);
                            muuVar2.a.writeInt(l6r0Var2.b[i]);
                        }
                    }
                    muuVar2.a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (euuVar.J.a() != 65535) {
                euuVar.P.v(0, r7 - 65535);
            }
            htx0.c(euuVar.z.d(), euuVar.c, 0L, euuVar.Q, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        b0l0 b0l0Var = this.c;
        sb.append(b0l0Var.a.h.d);
        sb.append(':');
        sb.append(b0l0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(b0l0Var.b);
        sb.append(" hostAddress=");
        sb.append(b0l0Var.c);
        sb.append(" cipherSuite=");
        o6u o6uVar = this.f;
        sb.append(o6uVar != null ? o6uVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
