package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import javax.crypto.SecretKey;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLPermission;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.util.Cache;

/* loaded from: classes4.dex */
public final class SSLSessionImpl extends ExtendedSSLSession {
    public static final SSLSessionImpl B = new SSLSessionImpl(cl_84.b, cl_8.a0, null, new cl_106(false, null), null, -1, false, null);
    public static volatile int C = 0;
    public static final boolean D = true;
    public final cl_84 a;
    public final cl_106 b;
    public byte[] c;
    public cl_8 g;
    public boolean i;
    public final String l;
    public final int m;
    public SSLSessionContextImpl n;
    public final int o;
    public boolean p;
    public X509Certificate[] q;
    public PrivateKey r;
    public final String[] s;
    public String[] t;
    public ArrayList u;
    public Principal v;
    public Principal w;
    public final String x;
    public long d = System.currentTimeMillis();
    public int e = 0;
    public final long j = System.currentTimeMillis();
    public long k = 0;
    public boolean y = false;
    public final Hashtable z = new Hashtable();
    public boolean A = GetProperty.getBooleanProperty("jsse.SSLEngine.acceptLargeFragments", false);
    public X509Certificate[] f = null;
    public SecretKey h = null;

    public SSLSessionImpl(cl_84 cl_84Var, cl_8 cl_8Var, Collection collection, cl_106 cl_106Var, String str, int i, boolean z, String str2) {
        this.a = cl_84Var;
        this.b = cl_106Var;
        this.g = cl_8Var;
        this.l = str;
        this.m = i;
        int i2 = C + 1;
        C = i2;
        this.o = i2;
        this.s = cl_109.f(collection);
        this.i = z;
        this.x = str2;
        SSLLogger.fine("%% Initialized:", this);
    }

    public final boolean a(int i) {
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

    public final boolean b() {
        byte[] bArr = this.c;
        cl_106 cl_106Var = this.b;
        if (bArr != null) {
            if (cl_106Var != null && !this.p) {
                PrivateKey privateKey = this.r;
                if (privateKey != null) {
                    try {
                        privateKey.getAlgorithm();
                    } catch (Exception unused) {
                        invalidate();
                        return false;
                    }
                }
                return true;
            }
        } else if (cl_106Var != null && cl_106Var.a.length != 0 && !this.p) {
            PrivateKey privateKey2 = this.r;
            if (privateKey2 != null) {
                try {
                    privateKey2.getAlgorithm();
                } catch (Exception unused2) {
                    invalidate();
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SSLSessionImpl) {
            SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) obj;
            cl_106 cl_106Var = this.b;
            if (cl_106Var != null && cl_106Var.equals(sSLSessionImpl.b)) {
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
        cl_11 cl_11Var = this.g.w;
        if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
            throw new SSLPeerUnverifiedException("no certificates expected for Kerberos cipher suites");
        }
        X509Certificate[] x509CertificateArr = this.f;
        if (x509CertificateArr != null) {
            return (X509Certificate[]) x509CertificateArr.clone();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.SSLSession
    public String getCipherSuite() {
        return this.g.a;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        return this.j;
    }

    @Override // javax.net.ssl.SSLSession
    public byte[] getId() {
        return this.b.b();
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        long j = this.k;
        return j != 0 ? j : this.j;
    }

    @Override // javax.net.ssl.SSLSession
    public Certificate[] getLocalCertificates() {
        X509Certificate[] x509CertificateArr = this.q;
        if (x509CertificateArr == null) {
            return null;
        }
        return (Certificate[]) x509CertificateArr.clone();
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getLocalPrincipal() {
        cl_11 cl_11Var = this.g.w;
        if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
            Principal principal = this.w;
            if (principal == null) {
                return null;
            }
            return principal;
        }
        X509Certificate[] x509CertificateArr = this.q;
        if (x509CertificateArr == null) {
            return null;
        }
        return x509CertificateArr[0].getSubjectX500Principal();
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public String[] getLocalSupportedSignatureAlgorithms() {
        String[] strArr = this.s;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized int getPacketBufferSize() {
        return this.A ? cl_88.r : cl_88.o;
    }

    public InetAddress getPeerAddress() {
        try {
            return InetAddress.getByName(this.l);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @Override // javax.net.ssl.SSLSession
    public javax.security.cert.X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        cl_11 cl_11Var = this.g.w;
        if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
            throw new SSLPeerUnverifiedException("no certificates expected for Kerberos cipher suites");
        }
        X509Certificate[] x509CertificateArr = this.f;
        if (x509CertificateArr == null) {
            throw new SSLPeerUnverifiedException("peer not authenticated");
        }
        javax.security.cert.X509Certificate[] x509CertificateArr2 = new javax.security.cert.X509Certificate[x509CertificateArr.length];
        int i = 0;
        while (true) {
            X509Certificate[] x509CertificateArr3 = this.f;
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
        cl_11 cl_11Var = this.g.w;
        if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
            throw new SSLPeerUnverifiedException("no certificates expected for Kerberos cipher suites");
        }
        X509Certificate[] x509CertificateArr = this.f;
        if (x509CertificateArr != null) {
            return (Certificate[]) x509CertificateArr.clone();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.SSLSession
    public String getPeerHost() {
        return this.l;
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        return this.m;
    }

    @Override // javax.net.ssl.SSLSession
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        cl_11 cl_11Var = this.g.w;
        if (cl_11Var == cl_11.n || cl_11Var == cl_11.o) {
            Principal principal = this.v;
            if (principal != null) {
                return principal;
            }
            throw new SSLPeerUnverifiedException("peer not authenticated");
        }
        X509Certificate[] x509CertificateArr = this.f;
        if (x509CertificateArr != null) {
            return x509CertificateArr[0].getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("peer not authenticated");
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public String[] getPeerSupportedSignatureAlgorithms() {
        String[] strArr = this.t;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    @Override // javax.net.ssl.SSLSession
    public String getProtocol() {
        return this.a.a;
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public List getRequestedServerNames() {
        ArrayList arrayList = this.u;
        return (arrayList == null || arrayList.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(this.u);
    }

    @Override // javax.net.ssl.SSLSession
    public SSLSessionContext getSessionContext() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new SSLPermission("getSSLSessionContext"));
        }
        return this.n;
    }

    @Override // javax.net.ssl.SSLSession
    public Object getValue(String str) {
        if (str != null) {
            return this.z.get(new cl_98(str));
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
            securityContext = cl_98.c;
        }
        Enumeration keys = this.z.keys();
        while (keys.hasMoreElements()) {
            cl_98 cl_98Var = (cl_98) keys.nextElement();
            if (securityContext.equals(cl_98Var.b)) {
                vector.addElement(cl_98Var.a);
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
        SSLSessionImpl sSLSessionImpl;
        if (this == B) {
            return;
        }
        this.p = true;
        SSLLogger.fine("%% Invalidated: {0}", this);
        SSLSessionContextImpl sSLSessionContextImpl = this.n;
        if (sSLSessionContextImpl != null) {
            cl_106 cl_106Var = this.b;
            Cache cache = sSLSessionContextImpl.a;
            if (!sSLSessionContextImpl.d() && (sSLSessionImpl = (SSLSessionImpl) cache.get(cl_106Var)) != null) {
                cache.remove(cl_106Var);
                sSLSessionContextImpl.b.remove(SSLSessionContextImpl.b(sSLSessionImpl.getPeerPort(), sSLSessionImpl.getPeerHost()));
            }
            this.n = null;
        }
    }

    @Override // javax.net.ssl.SSLSession
    public synchronized boolean isValid() {
        return b();
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            ny61.g("arguments can not be null");
            return;
        }
        Object put = this.z.put(new cl_98(str), obj);
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
        Object remove = this.z.remove(new cl_98(str));
        if (remove instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
    }

    public String toString() {
        return "[Session-" + this.o + Extension.FIX_SPACE + getCipherSuite() + "]";
    }
}
