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
    private final List<l> f15735a;

    /* renamed from: b, reason: collision with root package name */
    private int f15736b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15737c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15738d;

    public b(List<l> list) {
        this.f15735a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f15736b; i < this.f15735a.size(); i++) {
            if (this.f15735a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        int i = this.f15736b;
        int size = this.f15735a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f15735a.get(i);
            if (lVar.a(sSLSocket)) {
                this.f15736b = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f15737c = b(sSLSocket);
            com.anythink.core.common.n.b.a.a.f15656a.a(lVar, sSLSocket, this.f15738d);
            return lVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f15738d + ", modes=" + this.f15735a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean a(IOException iOException) {
        this.f15738d = true;
        if (!this.f15737c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
