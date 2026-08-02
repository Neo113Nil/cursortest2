package ru.CryptoPro.sspiSSL;

import defpackage.mu61;
import defpackage.ny61;
import defpackage.or61;
import defpackage.oyr;
import defpackage.tt61;
import defpackage.vt61;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLPermission;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.CryptoPro.JCSP.MSCAPI.Sspi;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.cl_88;

/* loaded from: classes4.dex */
public class SSLSessionImpl implements SSLSession {
    public static final SSLSessionImpl r = new SSLSessionImpl();
    public static volatile int s = 0;
    public or61 a;
    public vt61 b;
    public X509Certificate[] c;
    public mu61 d;
    public final long e;
    public long f;
    public String g;
    public int h;
    public SSLSessionContextImpl i;
    public int j;
    public boolean k;
    public X509Certificate[] l;
    public PrivateKey m;
    public boolean n;
    public final long[] o;
    public final Hashtable p;
    public boolean q;

    public SSLSessionImpl(long[] jArr) {
        this.a = or61.w;
        this.b = new vt61();
        this.e = System.currentTimeMillis();
        this.f = 0L;
        this.g = null;
        this.h = -1;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = new long[]{jArr[0], jArr[1]};
        this.p = new Hashtable();
        this.q = GetProperty.getBooleanProperty("jsse.SSLEngine.acceptLargeFragments", false);
    }

    public final void a(or61 or61Var, mu61 mu61Var, vt61 vt61Var, String str, int i) {
        this.a = or61Var;
        this.b = vt61Var;
        this.c = null;
        this.d = mu61Var;
        this.g = str;
        this.h = i;
        int i2 = s + 1;
        s = i2;
        this.j = i2;
        this.n = true;
        SSLLogger.fine("%% Initialized session:", this);
    }

    public final void b(X509Certificate[] x509CertificateArr) {
        if (this.c == null) {
            this.c = x509CertificateArr;
        }
    }

    public final boolean c(int i) {
        if (i == 0) {
            return false;
        }
        if ((i * 1000) + getCreationTime() > System.currentTimeMillis()) {
            return false;
        }
        SSLLogger.fine("%% isTimedout:", this);
        invalidate();
        return true;
    }

    public final boolean d() {
        vt61 vt61Var = this.b;
        if (vt61Var == null || vt61Var.a.length == 0 || this.k) {
            return false;
        }
        PrivateKey privateKey = this.m;
        if (privateKey == null) {
            return true;
        }
        try {
            privateKey.getAlgorithm();
            return true;
        } catch (Exception unused) {
            invalidate();
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SSLSessionImpl) {
            SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) obj;
            vt61 vt61Var = this.b;
            if (vt61Var != null && vt61Var.equals(sSLSessionImpl.b)) {
                return true;
            }
        }
        return false;
    }

    public final void finalize() {
        for (String str : getValueNames()) {
            removeValue(str);
        }
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized int getApplicationBufferSize() {
        return getPacketBufferSize() - 5;
    }

    public X509Certificate[] getCertificateChain() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.c;
        if (x509CertificateArr != null) {
            return (X509Certificate[]) x509CertificateArr.clone();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return this.d.a;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return this.e;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        return (byte[]) this.b.a.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        long j = this.f;
        return j != 0 ? j : this.e;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        X509Certificate[] x509CertificateArr = this.l;
        if (x509CertificateArr == null) {
            return null;
        }
        return (Certificate[]) x509CertificateArr.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        X509Certificate[] x509CertificateArr = this.l;
        if (x509CertificateArr == null) {
            return null;
        }
        return x509CertificateArr[0].getSubjectX500Principal();
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized int getPacketBufferSize() {
        return this.q ? cl_88.r : cl_88.o;
    }

    public InetAddress getPeerAddress() {
        try {
            return InetAddress.getByName(this.g);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSession
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.c;
        if (x509CertificateArr == null) {
            throw new SSLPeerUnverifiedException("peer not authenticated");
        }
        javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
        int i = 0;
        while (true) {
            X509Certificate[] x509CertificateArr3 = this.c;
            if (i >= x509CertificateArr3.length) {
                return x509CertificateArr2;
            }
            try {
                x509CertificateArr2[i] = javax.security.cert.X509Certificate.getInstance(x509CertificateArr3[i].getEncoded());
                i++;
            } catch (CertificateEncodingException e) {
                throw new SSLPeerUnverifiedException(e.getMessage());
            } catch (CertificateException e2) {
                throw new SSLPeerUnverifiedException(e2.getMessage());
            }
        }
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.c;
        if (x509CertificateArr != null) {
            return (Certificate[]) x509CertificateArr.clone();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.g;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.h;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        X509Certificate[] x509CertificateArr = this.c;
        if (x509CertificateArr != null) {
            return x509CertificateArr[0].getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        return this.a.c;
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new SSLPermission("getSSLSessionContext"));
        }
        return this.i;
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        if (str != null) {
            return this.p.get(new tt61(str));
        }
        ny61.g("argument can not be null");
        return null;
    }

    @Override // javax.net.ssl.SSLSession
    public String[] getValueNames() {
        Vector vector = new Vector();
        SecurityManager securityManager = System.getSecurityManager();
        Object securityContext = securityManager != null ? securityManager.getSecurityContext() : null;
        if (securityContext == null) {
            securityContext = tt61.c;
        }
        Enumeration keys = this.p.keys();
        while (keys.hasMoreElements()) {
            tt61 tt61Var = (tt61) keys.nextElement();
            if (securityContext.equals(tt61Var.b)) {
                vector.addElement(tt61Var.a);
            }
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return strArr;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized void invalidate() {
        if (this == r) {
            return;
        }
        try {
            Sspi.freeCredentialsHandle(this.o);
            this.l = null;
            this.m = null;
            this.n = false;
            this.k = true;
            SSLLogger.fine("%% Invalidated: {0}", this);
            SSLSessionContextImpl sSLSessionContextImpl = this.i;
            if (sSLSessionContextImpl != null) {
                sSLSessionContextImpl.a(this.b);
                this.i = null;
            }
        } catch (MSException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized boolean isValid() {
        return d();
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            ny61.g("arguments can not be null");
            return;
        }
        Object put = this.p.put(new tt61(str), obj);
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(String str) {
        if (str == null) {
            ny61.g("argument can not be null");
            return;
        }
        Object remove = this.p.remove(new tt61(str));
        if (remove instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[Session-");
        sb.append(this.j);
        sb.append(Extension.FIX_SPACE);
        return oyr.t(sb, this.n ? getCipherSuite() : "not initialized", "]");
    }

    public SSLSessionImpl() {
        this.a = or61.w;
        this.b = new vt61();
        this.e = System.currentTimeMillis();
        this.f = 0L;
        this.g = null;
        this.h = -1;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = new long[2];
        this.p = new Hashtable();
        this.q = GetProperty.getBooleanProperty("jsse.SSLEngine.acceptLargeFragments", false);
    }
}
