package ru.CryptoPro.ssl;

import java.net.Socket;
import java.security.AlgorithmConstraints;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* loaded from: classes4.dex */
final class cl_115 extends X509ExtendedKeyManager implements X509KeyManager {
    public static AlgorithmConstraints a(Socket socket) {
        if (socket == null || !socket.isConnected() || !(socket instanceof SSLSocket)) {
            return new cl_90((SSLSocket) null, true);
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        SSLSession handshakeSession = sSLSocket.getHandshakeSession();
        if (handshakeSession == null || cl_84.b(handshakeSession.getProtocol()).n < cl_84.z.n) {
            return new cl_90(sSLSocket, true);
        }
        return new cl_90(sSLSocket, handshakeSession instanceof ExtendedSSLSession ? ((ExtendedSSLSession) handshakeSession).getPeerSupportedSignatureAlgorithms() : null, true);
    }

    public static AlgorithmConstraints b(SSLEngine sSLEngine) {
        SSLSession handshakeSession;
        if (sSLEngine == null || (handshakeSession = sSLEngine.getHandshakeSession()) == null || cl_84.b(handshakeSession.getProtocol()).n < cl_84.z.n) {
            return new cl_90(sSLEngine, true);
        }
        return new cl_90(sSLEngine, handshakeSession instanceof ExtendedSSLSession ? ((ExtendedSSLSession) handshakeSession).getPeerSupportedSignatureAlgorithms() : null, true);
    }

    public static ArrayList c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (strArr[0] == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            cl_120 cl_120Var = new cl_120();
            str.indexOf("_");
            arrayList.add(cl_120Var);
        }
        return arrayList;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        ArrayList c = c(strArr);
        cl_118 cl_118Var = cl_118.a;
        a(socket);
        if (c == null || c.isEmpty()) {
            return null;
        }
        if (principalArr == null) {
            throw null;
        }
        if (principalArr.length == 0) {
            throw null;
        }
        new HashSet(Arrays.asList(principalArr));
        throw null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        ArrayList c = c(strArr);
        cl_118 cl_118Var = cl_118.a;
        b(sSLEngine);
        if (c == null || c.isEmpty()) {
            return null;
        }
        if (principalArr == null) {
            throw null;
        }
        if (principalArr.length == 0) {
            throw null;
        }
        new HashSet(Arrays.asList(principalArr));
        throw null;
    }

    @Override // javax.net.ssl.X509ExtendedKeyManager
    public String chooseEngineServerAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        SSLSession handshakeSession;
        ArrayList c = c(str);
        cl_118 cl_118Var = cl_118.a;
        b(sSLEngine);
        int i = cl_122.f;
        if (sSLEngine == null || (handshakeSession = sSLEngine.getHandshakeSession()) == null || !(handshakeSession instanceof ExtendedSSLSession)) {
            List list = Collections.EMPTY_LIST;
        } else {
            ((ExtendedSSLSession) handshakeSession).getRequestedServerNames();
        }
        if (c == null || c.isEmpty()) {
            return null;
        }
        if (principalArr == null) {
            throw null;
        }
        if (principalArr.length == 0) {
            throw null;
        }
        new HashSet(Arrays.asList(principalArr));
        throw null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        ArrayList c = c(str);
        cl_118 cl_118Var = cl_118.a;
        a(socket);
        cl_122.c(socket);
        if (c == null || c.isEmpty()) {
            return null;
        }
        if (principalArr == null) {
            throw null;
        }
        if (principalArr.length == 0) {
            throw null;
        }
        new HashSet(Arrays.asList(principalArr));
        throw null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public X509Certificate[] getCertificateChain(String str) {
        if (str == null) {
            return null;
        }
        throw null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getClientAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, cl_118.b, null);
    }

    @Override // javax.net.ssl.X509KeyManager
    public PrivateKey getPrivateKey(String str) {
        if (str == null) {
            return null;
        }
        throw null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public String[] getServerAliases(String str, Principal[] principalArr) {
        return a(str, principalArr, cl_118.c, null);
    }

    public String[] a(String str, Principal[] principalArr, cl_118 cl_118Var, AlgorithmConstraints algorithmConstraints) {
        if (str == null) {
            return null;
        }
        if (principalArr != null && principalArr.length != 0) {
            new HashSet(Arrays.asList(principalArr));
        }
        c(str);
        throw null;
    }
}
