package ru.CryptoPro.sspiSSL;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class SSLSocketFactoryImpl extends SSLSocketFactory {
    public final SSLContextImpl a;

    public SSLSocketFactoryImpl(SSLContextImpl sSLContextImpl) {
        this.a = sSLContextImpl;
    }

    public Socket createSocket(Socket socket, InputStream inputStream, boolean z) throws IOException {
        if (socket != null) {
            return new SSLSocketImpl(this.a, socket, inputStream, z);
        }
        ny61.t("the existing socket cannot be null");
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.a.d(false).v();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.a.j().v();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return new SSLSocketImpl(this.a, false, str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return new SSLSocketImpl(this.a, false, str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return new SSLSocketImpl(this.a, false, inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return new SSLSocketImpl(this.a, false, inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return new SSLSocketImpl(this.a, false);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return new SSLSocketImpl(this.a, socket, str, z);
    }
}
