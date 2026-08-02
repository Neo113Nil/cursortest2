package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocketFactory;
import ru.CryptoPro.ssl.SSLContextImpl;

/* loaded from: classes4.dex */
public final class SSLSocketFactoryImpl extends SSLSocketFactory {
    public SSLContextImpl a;

    public SSLSocketFactoryImpl() throws Exception {
        SSLContextImpl.DefaultSSLContext defaultSSLContext;
        SSLContextImpl.DefaultSSLContext defaultSSLContext2 = SSLContextImpl.DefaultSSLContext.s;
        synchronized (SSLContextImpl.DefaultSSLContext.class) {
            try {
                if (SSLContextImpl.DefaultSSLContext.s == null) {
                    new SSLContextImpl.DefaultSSLContext();
                }
                defaultSSLContext = SSLContextImpl.DefaultSSLContext.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = defaultSSLContext;
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
        return this.a.f(false).a();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.a.k().a();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return new SSLSocketImpl(this.a, str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return new SSLSocketImpl(this.a, str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return new SSLSocketImpl(this.a, inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return new SSLSocketImpl(this.a, inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return new SSLSocketImpl(this.a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return new SSLSocketImpl(this.a, socket, str, z);
    }
}
