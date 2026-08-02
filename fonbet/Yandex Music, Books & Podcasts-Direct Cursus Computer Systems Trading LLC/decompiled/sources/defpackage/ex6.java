package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* loaded from: classes6.dex */
public final class ex6 extends SSLSocketFactory {
    public final javax.net.ssl.SSLSocketFactory a;
    public final X509HostnameVerifier b;

    public ex6(String[] strArr, boolean z) {
        super(null);
        ix6 ix6Var = new ix6(strArr);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{new yx6(ix6Var, z)}, null);
        this.a = sSLContext.getSocketFactory();
        this.b = z ? SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER : SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (socket == null) {
            socket = this.a.createSocket();
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            sSLSocket.bind(new InetSocketAddress(inetAddress, i2));
        }
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        sSLSocket.connect(new InetSocketAddress(str, i), connectionTimeout);
        sSLSocket.setSoTimeout(soTimeout);
        try {
            this.b.verify(str, sSLSocket);
            return sSLSocket;
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        if (i == -1) {
            i = 443;
        }
        SSLSocket sSLSocket = (SSLSocket) this.a.createSocket(socket, str, i, z);
        this.b.verify(str, sSLSocket);
        return sSLSocket;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory
    public final X509HostnameVerifier getHostnameVerifier() {
        return this.b;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory
    public final void setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        throw new IllegalArgumentException("Only strict hostname verification (default)  is supported!");
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public final Socket createSocket() {
        return this.a.createSocket();
    }
}
