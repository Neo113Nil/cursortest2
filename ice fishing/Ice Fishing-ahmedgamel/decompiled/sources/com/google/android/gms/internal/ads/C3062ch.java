package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3062ch extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f30318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3116dh f30319b;

    public C3062ch(C3116dh c3116dh) {
        Objects.requireNonNull(c3116dh);
        this.f30319b = c3116dh;
        this.f30318a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public final void a(Socket socket) {
        C3116dh c3116dh = this.f30319b;
        int i = c3116dh.f30589K;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c3116dh.f30590L.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f30318a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f30318a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f30318a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i4) {
        Socket createSocket = this.f30318a.createSocket(str, i, inetAddress, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f30318a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i4) {
        Socket createSocket = this.f30318a.createSocket(inetAddress, i, inetAddress2, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z6) {
        Socket createSocket = this.f30318a.createSocket(socket, str, i, z6);
        a(createSocket);
        return createSocket;
    }
}
