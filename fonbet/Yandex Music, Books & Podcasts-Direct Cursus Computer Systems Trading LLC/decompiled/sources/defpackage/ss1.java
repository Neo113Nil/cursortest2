package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* loaded from: classes3.dex */
public final class ss1 implements dt1, aa7 {
    public static final SSLContext t;
    public final dt1 a;
    public final dj3 b;
    public boolean c;
    public final SSLEngine d;
    public boolean e;
    public final String f;
    public boolean g;
    public final HostnameVerifier h;
    public rs1 i;
    public X509Certificate[] j;
    public d6w k;
    public u97 l;
    public final boolean m;
    public boolean n;
    public Exception o;
    public final om3 p = new om3();
    public final osh q;
    public final om3 r;
    public pm5 s;

    static {
        try {
            t = SSLContext.getInstance("Default");
        } catch (Exception e) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                t = sSLContext;
                sSLContext.init(null, new TrustManager[]{new qs1(0)}, null);
            } catch (Exception e2) {
                e.printStackTrace();
                e2.printStackTrace();
            }
        }
    }

    public ss1(dt1 dt1Var, String str, SSLEngine sSLEngine, X509HostnameVerifier x509HostnameVerifier) {
        osh oshVar = new osh();
        oshVar.c = this;
        aa aaVar = new aa(1);
        aaVar.c = RemoteCameraConfig.Notification.ID;
        oshVar.a = aaVar;
        oshVar.b = new om3();
        this.q = oshVar;
        this.r = new om3();
        this.a = dt1Var;
        this.h = x509HostnameVerifier;
        this.m = true;
        this.d = sSLEngine;
        this.f = str;
        sSLEngine.setUseClientMode(true);
        dj3 dj3Var = new dj3(dt1Var);
        this.b = dj3Var;
        dj3Var.d = new znk(5, this);
        dt1Var.s(new ozw(8, this));
        dt1Var.c(oshVar);
    }

    @Override // defpackage.aa7
    public final ys1 a() {
        return this.a.a();
    }

    public final void b(SSLEngineResult.HandshakeStatus handshakeStatus) {
        dt1 dt1Var = this.a;
        SSLEngineResult.HandshakeStatus handshakeStatus2 = SSLEngineResult.HandshakeStatus.NEED_TASK;
        SSLEngine sSLEngine = this.d;
        if (handshakeStatus == handshakeStatus2) {
            sSLEngine.getDelegatedTask().run();
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            e(this.r);
        }
        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            this.q.Q(this, new om3());
        }
        try {
            try {
                if (this.e) {
                    return;
                }
                if (sSLEngine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && sSLEngine.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.FINISHED) {
                    return;
                }
                if (this.m) {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    boolean z = false;
                    Throwable e = null;
                    int i = 0;
                    while (true) {
                        if (i >= trustManagers.length) {
                            break;
                        }
                        try {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[i];
                            X509Certificate[] x509CertificateArr = (X509Certificate[]) sSLEngine.getSession().getPeerCertificates();
                            this.j = x509CertificateArr;
                            x509TrustManager.checkServerTrusted(x509CertificateArr, "SSL");
                            String str = this.f;
                            if (str != null) {
                                HostnameVerifier hostnameVerifier = this.h;
                                if (hostnameVerifier == null) {
                                    new StrictHostnameVerifier().verify(str, AbstractVerifier.getCNs(this.j[0]), AbstractVerifier.getDNSSubjectAlts(this.j[0]));
                                } else if (!hostnameVerifier.verify(str, sSLEngine.getSession())) {
                                    throw new SSLException("hostname <" + str + "> has been denied");
                                }
                            }
                            z = true;
                        } catch (GeneralSecurityException e2) {
                            e = e2;
                        } catch (SSLException e3) {
                            e = e3;
                        }
                        i++;
                    }
                    this.e = true;
                    if (!z) {
                        os1 os1Var = new os1("Peer not trusted by any of the system trust managers.", e);
                        i(os1Var);
                        throw os1Var;
                    }
                } else {
                    this.e = true;
                }
                this.i.I(null, this);
                this.i = null;
                dt1Var.d(null);
                dt1Var.a().c(new q9(6, this));
                f();
            } catch (os1 e4) {
                i(e4);
            }
        } catch (NoSuchAlgorithmException e5) {
            b6e.q(e5);
        } catch (GeneralSecurityException e6) {
            i(e6);
        }
    }

    @Override // defpackage.aa7
    public final void c(u97 u97Var) {
        this.l = u97Var;
    }

    @Override // defpackage.aa7
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.sa7
    public final void d(pm5 pm5Var) {
        this.a.d(pm5Var);
    }

    @Override // defpackage.sa7
    public final void e(om3 om3Var) {
        int capacity;
        om3 om3Var2 = this.r;
        if (this.g) {
            return;
        }
        dj3 dj3Var = this.b;
        if (dj3Var.c.c > 0) {
            return;
        }
        this.g = true;
        int i = (om3Var.c * 3) / 2;
        if (i == 0) {
            i = 8192;
        }
        ByteBuffer j = om3.j(i);
        SSLEngineResult sSLEngineResult = null;
        do {
            if (!this.e || om3Var.c != 0) {
                int i2 = om3Var.c;
                try {
                    ay0 ay0Var = om3Var.a;
                    ByteBuffer[] byteBufferArr = (ByteBuffer[]) ay0Var.toArray(new ByteBuffer[ay0Var.size()]);
                    ay0Var.clear();
                    om3Var.c = 0;
                    sSLEngineResult = this.d.wrap(byteBufferArr, j);
                    om3Var.b(byteBufferArr);
                    j.flip();
                    om3Var2.a(j);
                    if (om3Var2.c > 0) {
                        dj3Var.b(om3Var2, false);
                    }
                    capacity = j.capacity();
                } catch (SSLException e) {
                    e = e;
                }
                try {
                    if (sSLEngineResult.getStatus() == SSLEngineResult.Status.BUFFER_OVERFLOW) {
                        j = om3.j(capacity * 2);
                        i2 = -1;
                    } else {
                        int i3 = (om3Var.c * 3) / 2;
                        if (i3 == 0) {
                            i3 = 8192;
                        }
                        j = om3.j(i3);
                        b(sSLEngineResult.getHandshakeStatus());
                    }
                } catch (SSLException e2) {
                    e = e2;
                    j = null;
                    i(e);
                    if (i2 != om3Var.c) {
                    }
                }
                if (i2 != om3Var.c && (sSLEngineResult == null || sSLEngineResult.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_WRAP)) {
                    break;
                }
            } else {
                break;
            }
        } while (dj3Var.c.c == 0);
        this.g = false;
        om3.m(j);
    }

    @Override // defpackage.sa7
    public final void end() {
        this.a.end();
    }

    public final void f() {
        pm5 pm5Var;
        om3 om3Var = this.p;
        v7g.s(this, om3Var);
        if (!this.n || om3Var.i() || (pm5Var = this.s) == null) {
            return;
        }
        pm5Var.r(this.o);
    }

    @Override // defpackage.aa7
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.sa7
    public final void h(d6w d6wVar) {
        this.k = d6wVar;
    }

    public final void i(Exception exc) {
        rs1 rs1Var = this.i;
        if (rs1Var == null) {
            pm5 pm5Var = this.s;
            if (pm5Var != null) {
                pm5Var.r(exc);
                return;
            }
            return;
        }
        this.i = null;
        imp impVar = new imp();
        dt1 dt1Var = this.a;
        dt1Var.c(impVar);
        dt1Var.end();
        dt1Var.d(null);
        dt1Var.close();
        rs1Var.I(exc, null);
    }

    @Override // defpackage.sa7
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.aa7
    public final void m() {
        this.a.m();
        f();
    }

    @Override // defpackage.aa7
    public final void s(pm5 pm5Var) {
        this.s = pm5Var;
    }

    @Override // defpackage.aa7
    public final u97 u() {
        return this.l;
    }
}
