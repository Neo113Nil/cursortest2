package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2876Yg extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f28843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2893Zg f28844b;

    public C2876Yg(C2893Zg c2893Zg) {
        Objects.requireNonNull(c2893Zg);
        this.f28844b = c2893Zg;
        this.f28843a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public final void a(Socket socket) {
        C2893Zg c2893Zg = this.f28844b;
        int i = c2893Zg.f29039K;
        if (i > 0) {
            socket.setReceiveBufferSize(i);
        }
        c2893Zg.f29040L.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        Socket createSocket = this.f28843a.createSocket(str, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f28843a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f28843a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i4) {
        Socket createSocket = this.f28843a.createSocket(str, i, inetAddress, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        Socket createSocket = this.f28843a.createSocket(inetAddress, i);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i4) {
        Socket createSocket = this.f28843a.createSocket(inetAddress, i, inetAddress2, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z8) {
        Socket createSocket = this.f28843a.createSocket(socket, str, i, z8);
        a(createSocket);
        return createSocket;
    }
}
