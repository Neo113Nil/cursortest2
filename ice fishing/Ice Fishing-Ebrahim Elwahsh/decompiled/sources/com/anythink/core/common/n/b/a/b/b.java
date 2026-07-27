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
    private final List<l> f15106a;

    /* renamed from: b, reason: collision with root package name */
    private int f15107b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15108c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15109d;

    public b(List<l> list) {
        this.f15106a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i = this.f15107b; i < this.f15106a.size(); i++) {
            if (this.f15106a.get(i).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) {
        l lVar;
        int i = this.f15107b;
        int size = this.f15106a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = this.f15106a.get(i);
            if (lVar.a(sSLSocket)) {
                this.f15107b = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f15108c = b(sSLSocket);
            com.anythink.core.common.n.b.a.a.f15027a.a(lVar, sSLSocket, this.f15109d);
            return lVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f15109d + ", modes=" + this.f15106a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public final boolean a(IOException iOException) {
        this.f15109d = true;
        if (!this.f15108c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }
}
