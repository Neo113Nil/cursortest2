package ru.CryptoPro.sspiSSL;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import ru.CryptoPro.sspiSSL.SSLContextImpl;

/* loaded from: classes4.dex */
public class SSLServerSocketFactoryImpl extends SSLServerSocketFactory {
    public final SSLContextImpl a;

    public SSLServerSocketFactoryImpl() throws Exception {
        SSLContextImpl.DefaultSSLContext defaultSSLContext;
        SSLContextImpl.DefaultSSLContext defaultSSLContext2 = SSLContextImpl.DefaultSSLContext.w;
        synchronized (SSLContextImpl.DefaultSSLContext.class) {
            try {
                if (SSLContextImpl.DefaultSSLContext.w == null) {
                    new SSLContextImpl.DefaultSSLContext();
                }
                defaultSSLContext = SSLContextImpl.DefaultSSLContext.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = defaultSSLContext;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) throws IOException {
        return new SSLServerSocketImpl(i, 50, this.a);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.a.d(true).v();
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.a.j().v();
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() throws IOException {
        return new SSLServerSocketImpl(this.a);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) throws IOException {
        return new SSLServerSocketImpl(i, i2, this.a);
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) throws IOException {
        return new SSLServerSocketImpl(i, i2, inetAddress, this.a);
    }

    public SSLServerSocketFactoryImpl(SSLContextImpl sSLContextImpl) {
        this.a = sSLContextImpl;
    }
}
