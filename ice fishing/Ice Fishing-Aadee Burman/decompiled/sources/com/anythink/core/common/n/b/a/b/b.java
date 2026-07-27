package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<l> f14948a;

    /* renamed from: b, reason: collision with root package name */
    private int f14949b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14950c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14951d;

    public b(List<l> list) {
        this.f14948a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f14949b; i < this.f14948a.size(); i++) {
            if (this.f14948a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        int i = this.f14949b;
        int size = this.f14948a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f14948a.get(i);
            if (lVar.a(sSLSocket)) {
                this.f14949b = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f14950c = b(sSLSocket);
            com.anythink.core.common.n.b.a.a.f14869a.a(lVar, sSLSocket, this.f14951d);
            return lVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f14951d + ", modes=" + this.f14948a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean a(IOException iOException) {
        this.f14951d = true;
        if (!this.f14950c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
