package defpackage;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;

/* loaded from: classes4.dex */
public final class tq61 extends X509ExtendedKeyManager {
    public final X509KeyManager a;

    public tq61(X509KeyManager x509KeyManager) {
        this.a = x509KeyManager;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        return this.a.chooseClientAlias(strArr, principalArr, socket);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return this.a.chooseServerAlias(str, principalArr, socket);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        return this.a.getCertificateChain(str);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        return this.a.getClientAliases(str, principalArr);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        return this.a.getPrivateKey(str);
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return this.a.getServerAliases(str, principalArr);
    }
}
