package com.anythink.core.common.n.b.a.g;

import com.anythink.core.common.n.b.a.j.f;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.z;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15352a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final int f15353b = 5;

    /* renamed from: c, reason: collision with root package name */
    private static final c f15354c;

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f15355d;

    static {
        c a9 = a.a();
        if (a9 == null && (a9 = b.b()) == null) {
            throw new NullPointerException("No platform found on Android");
        }
        f15354c = a9;
        f15355d = Logger.getLogger(z.class.getName());
    }

    private static c d() {
        c a9 = a.a();
        if (a9 != null) {
            return a9;
        }
        c b9 = b.b();
        if (b9 != null) {
            return b9;
        }
        throw new NullPointerException("No platform found on Android");
    }

    public static c e() {
        return f15354c;
    }

    public static String f() {
        return aa.f15462a;
    }

    public static boolean g() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private static c h() {
        c a9 = a.a();
        if (a9 != null) {
            return a9;
        }
        c b9 = b.b();
        if (b9 != null) {
            return b9;
        }
        throw new NullPointerException("No platform found on Android");
    }

    private static void i() {
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String str) {
        return true;
    }

    public SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e9) {
            throw new IllegalStateException("No TLS provider", e9);
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    private static void a() {
    }

    public final com.anythink.core.common.n.b.a.j.c b(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager a9 = a(sSLSocketFactory);
        if (a9 != null) {
            return a(a9);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + f15354c + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public void a(SSLSocket sSLSocket, String str, List<ab> list) {
    }

    public X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a9 = a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a9 == null) {
                return null;
            }
            return (X509TrustManager) a(a9, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    private static boolean b() {
        if ("conscrypt".equals(com.anythink.core.common.n.b.a.c.a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(int i, String str, Throwable th) {
        f15355d.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object a(String str) {
        if (f15355d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    private static byte[] b(List<ab> list) {
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ab abVar = list.get(i);
            if (abVar != ab.HTTP_1_0) {
                cVar.l(abVar.toString().length());
                cVar.b(abVar.toString());
            }
        }
        return cVar.y();
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = AbstractC4404f.f(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    public f b(X509TrustManager x509TrustManager) {
        return new com.anythink.core.common.n.b.a.j.b(x509TrustManager.getAcceptedIssuers());
    }

    private static List<String> a(List<ab> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ab abVar = list.get(i);
            if (abVar != ab.HTTP_1_0) {
                arrayList.add(abVar.toString());
            }
        }
        return arrayList;
    }

    public com.anythink.core.common.n.b.a.j.c a(X509TrustManager x509TrustManager) {
        return new com.anythink.core.common.n.b.a.j.a(b(x509TrustManager));
    }

    public static <T> T a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = a(obj, (Class<Object>) Object.class, "delegate");
        } while (obj != null);
        return null;
    }
}
