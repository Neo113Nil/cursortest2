package defpackage;

import com.yandex.mob.n;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Collections;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class sr20 extends SSLSocketFactory {
    public final SSLSocketFactory a;
    public final n b;

    public sr20(SSLSocketFactory sSLSocketFactory, n nVar) {
        this.a = sSLSocketFactory;
        this.b = nVar;
    }

    public final void a(String str, SSLSocket sSLSocket) {
        String str2 = (String) a.R(this.b.a(str));
        if (str2 != null) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(str2)));
            sSLSocket.setSSLParameters(sSLParameters);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        String hostAddress;
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(str, i, inetAddress, i2);
        if (inetAddress != null && (hostAddress = inetAddress.getHostAddress()) != null) {
            a(hostAddress, sSLSocket);
        }
        return sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(str, i);
        if (str != null) {
            a(str, sSLSocket);
        }
        return sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(socket, str, i, z);
        if (str != null) {
            a(str, sSLSocket);
        }
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        String hostAddress;
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(inetAddress, i);
        if (inetAddress != null && (hostAddress = inetAddress.getHostAddress()) != null) {
            a(hostAddress, sSLSocket);
        }
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        String hostAddress;
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(inetAddress, i, inetAddress2, i2);
        if (inetAddress != null && (hostAddress = inetAddress.getHostAddress()) != null) {
            a(hostAddress, sSLSocket);
        }
        return sSLSocket;
    }
}
