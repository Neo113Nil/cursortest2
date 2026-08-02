package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.w511;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Vector;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import ru.CryptoPro.ssl.util.Cache;
import ru.CryptoPro.ssl.util.CacheConstants;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public final class SSLSessionContextImpl implements SSLSessionContext, CacheConstants {
    public static int e;
    public final Cache a;
    public final Cache b;
    public int c;
    public int d;

    public SSLSessionContextImpl() {
        int i;
        int i2 = 0;
        try {
            String str = (String) AccessController.doPrivileged(new cl_94());
            i = str != null ? Integer.valueOf(str).intValue() : TLSSettings.getDefaultSize();
        } catch (Exception unused) {
            i = 0;
        }
        if (i == -1) {
            i2 = -1;
        } else if (i > 0) {
            i2 = i;
        }
        this.c = i2;
        int defaultTime = TLSSettings.getDefaultTime() * 3600;
        this.d = defaultTime;
        int i3 = this.c;
        if (i3 != -1) {
            this.a = Cache.newSoftMemoryCache(i3, defaultTime);
            this.b = Cache.newSoftMemoryCache(this.c, this.d);
        }
    }

    public static String b(int i, String str) {
        StringBuilder v = oyr.v(str, ":");
        v.append(String.valueOf(i));
        return v.toString().toLowerCase(Locale.ENGLISH);
    }

    public final void a(SSLSessionImpl sSLSessionImpl) {
        if (d()) {
            return;
        }
        this.a.put(sSLSessionImpl.b, sSLSessionImpl);
        if (sSLSessionImpl.getPeerHost() != null && sSLSessionImpl.getPeerPort() != -1) {
            this.b.put(b(sSLSessionImpl.getPeerPort(), sSLSessionImpl.getPeerHost()), sSLSessionImpl);
        }
        if (sSLSessionImpl.n == null) {
            sSLSessionImpl.n = this;
        }
    }

    public final synchronized void c() {
        try {
            int i = e;
            if (i == 0) {
                SSLLogger.fine("openedSessions < 0");
            } else {
                e = i - 1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean d() {
        return this.c == -1;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration getIds() {
        if (d()) {
            return new Vector().elements();
        }
        cl_95 cl_95Var = new cl_95(this);
        this.a.accept(cl_95Var);
        return cl_95Var.a();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public SSLSession getSession(byte[] bArr) {
        if (bArr == null) {
            ny61.t("session id cannot be null");
            return null;
        }
        if (!d()) {
            SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) this.a.get(new cl_106(bArr));
            if (sSLSessionImpl != null && !sSLSessionImpl.a(this.d)) {
                return sSLSessionImpl;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionCacheSize() {
        if (d()) {
            return 0;
        }
        return this.c;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionTimeout() {
        return this.d;
    }

    public synchronized int getSessionsAmount() {
        return e;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionCacheSize(int i) throws IllegalArgumentException {
        if (i < 0) {
            w511.q();
            return;
        }
        if (d() || this.c == i) {
            return;
        }
        SSLLogger.fine("setSessionCacheSize() size: " + i);
        this.a.setCapacity(i);
        this.b.setCapacity(i);
        this.c = i;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionTimeout(int i) throws IllegalArgumentException {
        if (i < 0) {
            w511.q();
            return;
        }
        if (d() || this.d == i) {
            return;
        }
        SSLLogger.fine("setSessionTimeout() seconds: " + i);
        this.a.setTimeout(i);
        this.b.setTimeout(i);
        this.d = i;
    }
}
