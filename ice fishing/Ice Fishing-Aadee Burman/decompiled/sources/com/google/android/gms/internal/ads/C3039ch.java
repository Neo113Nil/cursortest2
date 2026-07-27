package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3039ch extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f29533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3093dh f29534b;

    public C3039ch(C3093dh c3093dh) {
        Objects.requireNonNull(c3093dh);
        this.f29534b = c3093dh;
        this.f29533a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public final void a(Socket socket) {
        C3093dh c3093dh = this.f29534b;
        int i = c3093dh.f29816K;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c3093dh.f29817L.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f29533a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f29533a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f29533a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i6) {
        Socket createSocket = this.f29533a.createSocket(str, i, inetAddress, i6);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f29533a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i6) {
        Socket createSocket = this.f29533a.createSocket(inetAddress, i, inetAddress2, i6);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z3) {
        Socket createSocket = this.f29533a.createSocket(socket, str, i, z3);
        a(createSocket);
        return createSocket;
    }
}
