package ru.CryptoPro.sspiSSL;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.puu0;
import defpackage.rr41;
import defpackage.vt61;
import defpackage.w511;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Vector;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import ru.CryptoPro.ssl.SSLLogger;
import ru.CryptoPro.ssl.util.Cache;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public final class SSLSessionContextImpl implements SSLSessionContext {
    public final Cache a;
    public final Cache b;
    public int c;
    public int d;

    public SSLSessionContextImpl() {
        int i;
        try {
            String str = (String) AccessController.doPrivileged(new puu0(8));
            i = str != null ? Integer.valueOf(str).intValue() : TLSSettings.getDefaultSize();
        } catch (Exception unused) {
            i = 0;
        }
        this.c = i > 0 ? i : 0;
        int defaultTime = TLSSettings.getDefaultTime() * 3600;
        this.d = defaultTime;
        this.a = Cache.newSoftMemoryCache(this.c, defaultTime);
        this.b = Cache.newSoftMemoryCache(this.c, this.d);
    }

    public static String b(int i, String str) {
        StringBuilder v = oyr.v(str, ":");
        v.append(String.valueOf(i));
        return v.toString().toLowerCase(Locale.ENGLISH);
    }

    public final void a(vt61 vt61Var) {
        Cache cache = this.a;
        SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) cache.get(vt61Var);
        if (sSLSessionImpl != null) {
            cache.remove(vt61Var);
            this.b.remove(b(sSLSessionImpl.getPeerPort(), sSLSessionImpl.getPeerHost()));
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public Enumeration getIds() {
        rr41 rr41Var = new rr41(this);
        this.a.accept(rr41Var);
        Vector vector = (Vector) rr41Var.b;
        return vector != null ? vector.elements() : new Vector().elements();
    }

    @Override // javax.net.ssl.SSLSessionContext
    public SSLSession getSession(byte[] bArr) {
        if (bArr == null) {
            ny61.t("session id cannot be null");
            return null;
        }
        SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) this.a.get(new vt61(bArr, bArr.length));
        if (sSLSessionImpl == null || sSLSessionImpl.c(this.d)) {
            return null;
        }
        return sSLSessionImpl;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionCacheSize() {
        return this.c;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public int getSessionTimeout() {
        return this.d;
    }

    public synchronized int getSessionsAmount() {
        return 0;
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionCacheSize(int i) throws IllegalArgumentException {
        if (i < 0) {
            w511.q();
            return;
        }
        if (this.c != i) {
            SSLLogger.fine("setSessionCacheSize() size: " + i);
            this.a.setCapacity(i);
            this.b.setCapacity(i);
            this.c = i;
        }
    }

    @Override // javax.net.ssl.SSLSessionContext
    public void setSessionTimeout(int i) throws IllegalArgumentException {
        if (i < 0) {
            w511.q();
            return;
        }
        if (this.d != i) {
            SSLLogger.fine("setSessionTimeout() seconds: " + i);
            this.a.setTimeout(i);
            this.b.setTimeout(i);
            this.d = i;
        }
    }
}
