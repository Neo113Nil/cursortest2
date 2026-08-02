package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class mxf extends SSLSocketFactory {
    public final nxf a;
    public final jyr b = btf.b(new v1e(24, this));

    public mxf(nxf nxfVar) {
        this.a = nxfVar;
    }

    public final SSLSocketFactory a() {
        return (SSLSocketFactory) this.b.getValue();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        socket.getClass();
        str.getClass();
        Socket createSocket = a().createSocket(socket, str, i, z);
        createSocket.getClass();
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = a().getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = a().getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        str.getClass();
        Socket createSocket = a().createSocket(str, i);
        createSocket.getClass();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        str.getClass();
        inetAddress.getClass();
        Socket createSocket = a().createSocket(str, i, inetAddress, i2);
        createSocket.getClass();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        inetAddress.getClass();
        Socket createSocket = a().createSocket(inetAddress, i);
        createSocket.getClass();
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket createSocket = a().createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.getClass();
        return createSocket;
    }
}
