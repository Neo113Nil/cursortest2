package com.anythink.core.common.n.b.a.g;

import android.os.Build;
import android.util.Log;
import com.anythink.core.common.n.b.a.j.f;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
class b extends com.anythink.core.common.n.b.a.g.c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f15338c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f15339d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f15340e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f15341f;

    /* renamed from: g, reason: collision with root package name */
    private final Method f15342g;

    /* renamed from: h, reason: collision with root package name */
    private final Method f15343h;
    private final Method i;

    /* renamed from: j, reason: collision with root package name */
    private final C0087b f15344j = C0087b.a();

    public static final class a extends com.anythink.core.common.n.b.a.j.c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f15345a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f15346b;

        public a(Object obj, Method method) {
            this.f15345a = obj;
            this.f15346b = method;
        }

        @Override // com.anythink.core.common.n.b.a.j.c
        public final List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f15346b.invoke(this.f15345a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e9) {
                throw new AssertionError(e9);
            } catch (InvocationTargetException e10) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
                sSLPeerUnverifiedException.initCause(e10);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        private final X509TrustManager f15350a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f15351b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f15351b = method;
            this.f15350a = x509TrustManager;
        }

        @Override // com.anythink.core.common.n.b.a.j.f
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f15351b.invoke(this.f15350a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e9) {
                throw new AssertionError("unable to get issues and signature", e9);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15350a.equals(cVar.f15350a) && this.f15351b.equals(cVar.f15351b);
        }

        public final int hashCode() {
            return (this.f15351b.hashCode() * 31) + this.f15350a.hashCode();
        }
    }

    public b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f15339d = cls;
        this.f15340e = cls2;
        this.f15341f = method;
        this.f15342g = method2;
        this.f15343h = method3;
        this.i = method4;
    }

    public static int d() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e9) {
            if (!com.anythink.core.common.n.b.a.c.a(e9)) {
                throw e9;
            }
            throw new IOException(e9);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e9) {
            throw new IllegalStateException("No TLS provider", e9);
        }
    }

    /* renamed from: com.anythink.core.common.n.b.a.g.b$b, reason: collision with other inner class name */
    public static final class C0087b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f15347a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f15348b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f15349c;

        private C0087b(Method method, Method method2, Method method3) {
            this.f15347a = method;
            this.f15348b = method2;
            this.f15349c = method3;
        }

        public final Object a(String str) {
            Method method = this.f15347a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f15348b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final boolean a(Object obj) {
            if (obj != null) {
                try {
                    this.f15349c.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public static C0087b a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new C0087b(method, method3, method2);
        }
    }

    private boolean b(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        Object a9 = com.anythink.core.common.n.b.a.g.c.a(sSLSocketFactory, this.f15339d, "sslParameters");
        if (a9 == null) {
            try {
                a9 = com.anythink.core.common.n.b.a.g.c.a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) com.anythink.core.common.n.b.a.g.c.a(a9, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) com.anythink.core.common.n.b.a.g.c.a(a9, X509TrustManager.class, "trustManager");
    }

    public static com.anythink.core.common.n.b.a.g.c b() {
        if (!com.anythink.core.common.n.b.a.g.c.g()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public void a(SSLSocket sSLSocket, String str, List<ab> list) {
        if (this.f15340e.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f15341f.invoke(sSLSocket, Boolean.TRUE);
                    this.f15342g.invoke(sSLSocket, str);
                } catch (IllegalAccessException e9) {
                    e = e9;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e10) {
                    e = e10;
                    throw new AssertionError(e);
                }
            }
            Method method = this.i;
            com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ab abVar = list.get(i);
                if (abVar != ab.HTTP_1_0) {
                    cVar.l(abVar.toString().length());
                    cVar.b(abVar.toString());
                }
            }
            method.invoke(sSLSocket, cVar.y());
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final f b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public String a(SSLSocket sSLSocket) {
        if (!this.f15340e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f15343h.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(int i, String str, Throwable th) {
        int min;
        int i6 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int indexOf = str.indexOf(10, i9);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i9 + f15338c);
                Log.println(i6, aa.f15462a, str.substring(i9, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i9 = min;
                }
            }
            i9 = min + 1;
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final Object a(String str) {
        return this.f15344j.a(str);
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final void a(String str, Object obj) {
        if (this.f15344j.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    private boolean a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    @Override // com.anythink.core.common.n.b.a.g.c
    public final com.anythink.core.common.n.b.a.j.c a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }
}
