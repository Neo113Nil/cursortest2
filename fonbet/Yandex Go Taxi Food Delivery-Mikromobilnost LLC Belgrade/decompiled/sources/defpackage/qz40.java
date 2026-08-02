package defpackage;

import com.google.android.gms.common.Feature;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes10.dex */
public final class qz40 implements gq60, dt61 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public qz40(Object obj) {
        this.c = new Object();
        this.a = 0;
        this.b = false;
        this.e = new HashMap();
        this.f = new CopyOnWriteArraySet();
        this.d = new AtomicReference(obj);
    }

    @Override // defpackage.gq60
    public void a(dq60 dq60Var) {
        synchronized (this.c) {
            l(dq60Var);
        }
    }

    @Override // defpackage.gq60
    public void b(Executor executor, dq60 dq60Var) {
        i5u0 i5u0Var;
        synchronized (this.c) {
            l(dq60Var);
            i5u0Var = new i5u0((AtomicReference) this.d, executor, dq60Var);
            ((HashMap) this.e).put(dq60Var, i5u0Var);
            ((CopyOnWriteArraySet) this.f).add(i5u0Var);
        }
        i5u0Var.a(0);
    }

    @Override // defpackage.gq60
    public euy c() {
        Object obj = ((AtomicReference) this.d).get();
        return obj instanceof j84 ? new hiv(1, ((j84) obj).a) : ni91.f(obj);
    }

    public void d(String str, Properties properties, Properties properties2) {
        if (!str.equalsIgnoreCase("POST")) {
            f(properties, str);
            JCPLogger.fine("Submit request (GET).");
            return;
        }
        String str2 = "";
        if (properties2 != null && properties2.size() > 0) {
            Set<String> stringPropertyNames = properties2.stringPropertyNames();
            int size = properties2.size();
            int i = 0;
            for (String str3 : stringPropertyNames) {
                str2 = str2 + str3 + "=" + properties2.getProperty(str3);
                if (i < size - 1) {
                    str2 = str2.concat("&");
                }
                i++;
            }
        }
        JCPLogger.fine("Submit request (POST): ", str2);
        e(str, properties, str2.getBytes("UTF-8"));
    }

    public void e(String str, Properties properties, byte[] bArr) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f;
        f(properties, str);
        if (str.equalsIgnoreCase("POST")) {
            JCPLogger.fine("Submit request (POST).");
            if (bArr != null && bArr.length > 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (bArr != null && bArr.length > 0) {
                outputStream.write(bArr);
            }
            outputStream.close();
        }
    }

    public void f(Properties properties, String str) {
        kr61 kr61Var;
        KeyManagerFactory keyManagerFactory;
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f;
        if ((httpURLConnection instanceof HttpsURLConnection) && (kr61Var = (kr61) this.e) != null) {
            SSLContext sSLContext = SSLContext.getInstance("GostTLS");
            KeyStore keyStore = kr61Var.a;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("GostX509");
            trustManagerFactory.init(kr61Var.c);
            if (keyStore != null) {
                keyManagerFactory = KeyManagerFactory.getInstance("GostX509");
                String str2 = kr61Var.b;
                keyManagerFactory.init(keyStore, str2 != null ? str2.toCharArray() : null);
            } else {
                keyManagerFactory = null;
            }
            sSLContext.init(keyManagerFactory != null ? keyManagerFactory.getKeyManagers() : null, trustManagerFactory.getTrustManagers(), null);
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
        }
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setUseCaches(false);
        if (str.equalsIgnoreCase("POST")) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        if (properties != null) {
            for (String str3 : properties.stringPropertyNames()) {
                httpURLConnection.setRequestProperty(str3, properties.getProperty(str3));
            }
        }
    }

    public byte[] g() {
        InputStream j = j();
        if (j == null) {
            ny61.v("Invalid input stream");
            return null;
        }
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = j.read(bArr);
            if (read == -1) {
                j.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public boolean h(int i, int i2) {
        wz40 wz40Var = (wz40) this.d;
        int i3 = this.a;
        d530 d530Var = (d530) wz40Var.a[i + i3];
        d530 d530Var2 = (d530) ((wz40) this.e).a[i3 + i2];
        return jl40.l(d530Var, d530Var2) || d530Var.getClass() == d530Var2.getClass();
    }

    public o8g0 i() {
        cvw.d("Must set register function", ((pui0) this.c) != null);
        cvw.d("Must set unregister function", ((pui0) this.d) != null);
        cvw.d("Must set holder", ((ouy) this.e) != null);
        luy luyVar = ((ouy) this.e).c;
        cvw.m(luyVar, "Key must not be null");
        return new o8g0(new yy81(this, (ouy) this.e, (Feature[]) this.f, this.b, this.a), new zy81(this, luyVar));
    }

    public InputStream j() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f;
        this.a = httpURLConnection.getResponseCode();
        this.c = httpURLConnection.getResponseMessage();
        this.d = httpURLConnection.getContentEncoding();
        JCPLogger.fineFormat("Response: code = {0}, message = {1}", Integer.valueOf(this.a), (String) this.c);
        if (this.a == 200) {
            return httpURLConnection.getInputStream();
        }
        JCPLogger.warning("Error occurred during http request.");
        return httpURLConnection.getErrorStream();
    }

    public void k(pui0 pui0Var) {
        this.c = pui0Var;
    }

    public void l(dq60 dq60Var) {
        i5u0 i5u0Var = (i5u0) ((HashMap) this.e).remove(dq60Var);
        if (i5u0Var != null) {
            i5u0Var.c.set(false);
            ((CopyOnWriteArraySet) this.f).remove(i5u0Var);
        }
    }

    public void m(wz40 wz40Var) {
        this.e = wz40Var;
    }

    public void n(wz40 wz40Var) {
        this.d = wz40Var;
    }

    public void o(int i) {
        this.a = i;
    }

    public void p(e530 e530Var) {
        this.c = e530Var;
    }

    public void q(int i) {
        this.a = i;
    }

    public void r(boolean z) {
        this.b = z;
    }

    public void s(kzo kzoVar) {
        this.d = kzoVar;
    }

    public void t(Object obj) {
        Iterator it;
        int i;
        synchronized (this.c) {
            try {
                if (Objects.equals(((AtomicReference) this.d).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.a + 1;
                this.a = i2;
                if (this.b) {
                    return;
                }
                this.b = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.f).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((i5u0) it2.next()).a(i2);
                    } else {
                        synchronized (this.c) {
                            try {
                                if (this.a == i2) {
                                    this.b = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.f).iterator();
                                    i = this.a;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    public void u(ouy ouyVar) {
        this.e = ouyVar;
    }

    public qz40(t300 t300Var, e530 e530Var, int i, wz40 wz40Var, wz40 wz40Var2, boolean z) {
        this.f = t300Var;
        this.c = e530Var;
        this.a = i;
        this.d = wz40Var;
        this.e = wz40Var2;
        this.b = z;
    }
}
