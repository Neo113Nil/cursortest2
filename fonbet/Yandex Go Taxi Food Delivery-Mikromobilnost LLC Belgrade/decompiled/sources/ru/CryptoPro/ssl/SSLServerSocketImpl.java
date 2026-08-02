package ru.CryptoPro.ssl;

import defpackage.oyr;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.AlgorithmConstraints;
import java.util.Collection;
import java.util.Collections;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
public final class SSLServerSocketImpl extends SSLServerSocket {
    public AlgorithmConstraints A;
    public Collection B;
    public String[] C;
    public boolean D;
    public SSLContextImpl a;
    public byte b;
    public boolean c;
    public boolean w;
    public cl_14 x;
    public cl_83 y;
    public String z;

    public SSLServerSocketImpl(int i, int i2, InetAddress inetAddress, SSLContextImpl sSLContextImpl) {
        super(i, i2, inetAddress);
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = Collections.EMPTY_LIST;
        this.C = new String[0];
        this.D = false;
        a(sSLContextImpl);
    }

    public final void a(SSLContextImpl sSLContextImpl) {
        if (sSLContextImpl == null) {
            throw new SSLException("No Authentication context given");
        }
        cl_112.a(sSLContextImpl);
        this.a = sSLContextImpl;
        this.x = sSLContextImpl.f(true);
        this.y = this.a.d(true);
        this.b = (byte) TLSSettings.getDefaultAuth();
    }

    @Override // java.net.ServerSocket
    public Socket accept() throws IOException {
        this.w = cl_112.a(this.a, false);
        SSLSocketImpl sSLSocketImpl = new SSLSocketImpl(this.a, this.c, this.x, this.b, this.w, this.y, this.z, this.A, this.B, this.D, this.C);
        implAccept(sSLSocketImpl);
        sSLSocketImpl.D();
        return sSLSocketImpl;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getEnableSessionCreation() {
        return this.w;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledCipherSuites() {
        return this.x.a();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized String[] getEnabledProtocols() {
        return this.y.a();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public boolean getNeedClientAuth() {
        return this.b == 2;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        sSLParameters = super.getSSLParameters();
        sSLParameters.setEndpointIdentificationAlgorithm(this.z);
        sSLParameters.setAlgorithmConstraints(this.A);
        sSLParameters.setSNIMatchers(this.B);
        sSLParameters.setUseCipherSuitesOrder(this.D);
        if (cl_68.b) {
            sSLParameters.setApplicationProtocols(this.C);
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedCipherSuites() {
        return this.a.k().a();
    }

    @Override // javax.net.ssl.SSLServerSocket
    public String[] getSupportedProtocols() {
        return this.a.j().a();
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
        this.x = new cl_14(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setEnabledProtocols(String[] strArr) {
        this.y = new cl_83(strArr);
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setNeedClientAuth(boolean z) {
        this.b = z ? (byte) 2 : (byte) 0;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public synchronized void setSSLParameters(SSLParameters sSLParameters) {
        try {
            super.setSSLParameters(sSLParameters);
            this.z = sSLParameters.getEndpointIdentificationAlgorithm();
            this.A = sSLParameters.getAlgorithmConstraints();
            this.D = sSLParameters.getUseCipherSuitesOrder();
            if (sSLParameters.getSNIMatchers() != null) {
                this.B = sSLParameters.getSNIMatchers();
            }
            if (cl_68.b) {
                this.C = sSLParameters.getApplicationProtocols();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setUseClientMode(boolean z) {
        if (this.c != (!z) && this.a.e(this.y)) {
            this.y = this.a.d(!z);
        }
        this.c = !z;
    }

    @Override // javax.net.ssl.SSLServerSocket
    public void setWantClientAuth(boolean z) {
        this.b = z ? (byte) 1 : (byte) 0;
    }

    @Override // javax.net.ssl.SSLServerSocket, java.net.ServerSocket
    public String toString() {
        return oyr.t(new StringBuilder("[SSL: "), super.toString(), "]");
    }

    public SSLServerSocketImpl(int i, int i2, SSLContextImpl sSLContextImpl) {
        super(i, i2);
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = Collections.EMPTY_LIST;
        this.C = new String[0];
        this.D = false;
        a(sSLContextImpl);
    }

    public SSLServerSocketImpl(SSLContextImpl sSLContextImpl) {
        this.b = (byte) 0;
        this.c = true;
        this.w = true;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = Collections.EMPTY_LIST;
        this.C = new String[0];
        this.D = false;
        a(sSLContextImpl);
    }
}
