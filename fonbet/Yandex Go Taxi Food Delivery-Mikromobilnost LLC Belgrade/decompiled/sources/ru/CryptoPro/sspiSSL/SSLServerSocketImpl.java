package ru.CryptoPro.sspiSSL;

import defpackage.a441;
import defpackage.s421;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLServerSocket;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public class SSLServerSocketImpl extends SSLServerSocket {
    public SSLContextImpl a;
    public byte b;
    public boolean c;
    public boolean w;
    public a441 x;
    public s421 y;

    public SSLServerSocketImpl(int i, int i2, InetAddress inetAddress, SSLContextImpl sSLContextImpl) {
        super(i, i2, inetAddress);
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        a(sSLContextImpl);
    }

    public final void a(SSLContextImpl sSLContextImpl) {
        if (sSLContextImpl == null) {
            throw new SSLException("No Authentication context given");
        }
        this.a = sSLContextImpl;
        this.x = sSLContextImpl.d(true);
        this.y = this.a.a(true);
        this.b = (byte) TLSSettings.getDefaultAuth();
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
        SSLSocketImpl sSLSocketImpl = new SSLSocketImpl(this.a, this.c, this.x, this.b, this.w, this.y);
        implAccept(sSLSocketImpl);
        sSLSocketImpl.k();
        return sSLSocketImpl;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
        return this.w;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.x.v();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledProtocols() {
        return this.y.p();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
        return this.b == 2;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
        return this.a.j().v();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
        return this.a.i().p();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getUseClientMode() {
        return !this.c;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getWantClientAuth() {
        return this.b == 1;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setEnableSessionCreation(boolean z) {
        this.w = z;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnabledCipherSuites(String[] strArr) {
        this.x = new a441(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.y = new s421(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z) {
        this.b = z ? (byte) 2 : (byte) 0;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z) {
        if (this.c != (!z)) {
            SSLContextImpl sSLContextImpl = this.a;
            s421 s421Var = this.y;
            if (s421Var == sSLContextImpl.d || s421Var == sSLContextImpl.e) {
                this.y = sSLContextImpl.a(!z);
            }
        }
        this.c = !z;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z) {
        this.b = z ? (byte) 1 : (byte) 0;
    }

    public SSLServerSocketImpl(int i, int i2, SSLContextImpl sSLContextImpl) {
        super(i, i2);
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        a(sSLContextImpl);
    }

    public SSLServerSocketImpl(SSLContextImpl sSLContextImpl) {
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        a(sSLContextImpl);
    }
}
