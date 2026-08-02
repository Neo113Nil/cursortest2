package bo.app;

import com.braze.support.BrazeLogger;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nf extends SSLSocketFactory {
    public final SSLSocketFactory a;

    public nf() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        socketFactory.getClass();
        this.a = socketFactory;
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            supportedProtocols.getClass();
            for (String str : supportedProtocols) {
                if (!Intrinsics.areEqual(str, "SSLv3")) {
                    str.getClass();
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(5, arrayList), 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        socket.getClass();
        str.getClass();
        Socket createSocket = this.a.createSocket(socket, str, i, z);
        createSocket.getClass();
        return a(createSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.a.getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.a.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.a.createSocket();
        createSocket.getClass();
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        str.getClass();
        Socket createSocket = this.a.createSocket(str, i);
        createSocket.getClass();
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        str.getClass();
        inetAddress.getClass();
        Socket createSocket = this.a.createSocket(str, i, inetAddress, i2);
        createSocket.getClass();
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        inetAddress.getClass();
        Socket createSocket = this.a.createSocket(inetAddress, i);
        createSocket.getClass();
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket createSocket = this.a.createSocket(inetAddress, i, inetAddress2, i2);
        createSocket.getClass();
        return a(createSocket);
    }

    public static final String a(List list) {
        return "Enabling SSL protocols: " + list;
    }
}
