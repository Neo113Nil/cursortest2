package ru.CryptoPro.ssl;

import com.adjust.sdk.Constants;
import defpackage.dv61;
import defpackage.nt61;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.vv61;
import defpackage.w511;
import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.ssl.util.HostnameChecker;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
final class cl_122 extends X509ExtendedTrustManager implements X509TrustManager {
    public static final /* synthetic */ int f = 0;
    public final String a;
    public final Collection b;
    public final PKIXBuilderParameters c;
    public volatile vv61 d;
    public volatile vv61 e;

    public cl_122(String str, KeyStore keyStore) {
        StringBuilder sb;
        StringBuilder sb2;
        X509Certificate x509Certificate;
        String sb3;
        Certificate[] certificateChain;
        this.a = str;
        this.c = null;
        if (keyStore == null) {
            this.b = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            try {
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    String nextElement = aliases.nextElement();
                    if (keyStore.isCertificateEntry(nextElement)) {
                        Certificate certificate = keyStore.getCertificate(nextElement);
                        if (Platform.isAndroid) {
                            try {
                                certificate = vv61.e.generateCertificate(new ByteArrayInputStream(certificate.getEncoded()));
                            } catch (CertificateException e) {
                                SSLLogger.thrown(e);
                            }
                        }
                        if (certificate instanceof X509Certificate) {
                            try {
                                ((X509Certificate) certificate).checkValidity();
                                x509Certificate = (X509Certificate) certificate;
                                hashSet.add(x509Certificate);
                            } catch (CertificateExpiredException e2) {
                                e = e2;
                                sb2 = new StringBuilder();
                                sb2.append("Certificate ");
                                sb2.append(((X509Certificate) certificate).getIssuerX500Principal().getName());
                                sb2.append(" expired. Ignored.");
                                sb3 = sb2.toString();
                                SSLLogger.subThrown(sb3, e);
                            } catch (CertificateNotYetValidException e3) {
                                e = e3;
                                sb = new StringBuilder();
                                sb.append("Certificate ");
                                sb.append(((X509Certificate) certificate).getIssuerX500Principal().getName());
                                sb.append(" not yet valid. Ignored.");
                                sb3 = sb.toString();
                                SSLLogger.subThrown(sb3, e);
                            }
                        }
                    } else if (keyStore.isKeyEntry(nextElement) && (certificateChain = keyStore.getCertificateChain(nextElement)) != null && certificateChain.length > 0) {
                        Certificate certificate2 = certificateChain[0];
                        if (certificate2 instanceof X509Certificate) {
                            if (Platform.isAndroid) {
                                try {
                                    certificate2 = vv61.e.generateCertificate(new ByteArrayInputStream(certificate2.getEncoded()));
                                } catch (CertificateException e4) {
                                    SSLLogger.thrown(e4);
                                }
                            }
                            try {
                                ((X509Certificate) certificate2).checkValidity();
                                x509Certificate = (X509Certificate) certificate2;
                                hashSet.add(x509Certificate);
                            } catch (CertificateExpiredException e5) {
                                e = e5;
                                sb2 = new StringBuilder();
                                sb2.append("Certificate ");
                                sb2.append(((X509Certificate) certificate2).getIssuerX500Principal().getName());
                                sb2.append(" expired. Ignored.");
                                sb3 = sb2.toString();
                                SSLLogger.subThrown(sb3, e);
                            } catch (CertificateNotYetValidException e6) {
                                e = e6;
                                sb = new StringBuilder();
                                sb.append("Certificate ");
                                sb.append(((X509Certificate) certificate2).getIssuerX500Principal().getName());
                                sb.append(" not yet valid. Ignored.");
                                sb3 = sb.toString();
                                SSLLogger.subThrown(sb3, e);
                            }
                        }
                    }
                }
            } catch (KeyStoreException unused) {
            }
            this.b = hashSet;
        }
        d();
    }

    public static List c(Socket socket) {
        SSLSession handshakeSession;
        return (socket != null && socket.isConnected() && (socket instanceof SSLSocket) && (handshakeSession = ((SSLSocket) socket).getHandshakeSession()) != null && (handshakeSession instanceof ExtendedSSLSession)) ? ((ExtendedSSLSession) handshakeSession).getRequestedServerNames() : Collections.EMPTY_LIST;
    }

    public static void e(String str, String str2, X509Certificate x509Certificate) {
        HostnameChecker hostnameChecker;
        if (str2.length() != 0) {
            if (str != null && str.startsWith("[") && str.endsWith("]")) {
                str = oyr.g(1, 1, str);
            }
            if (str2.equalsIgnoreCase("HTTPS")) {
                hostnameChecker = HostnameChecker.getInstance((byte) 1);
            } else {
                if (!str2.equalsIgnoreCase("LDAP") && !str2.equalsIgnoreCase("LDAPS")) {
                    throw new CertificateException("Unknown identification algorithm: ".concat(str2));
                }
                hostnameChecker = HostnameChecker.getInstance((byte) 2);
            }
            hostnameChecker.match(str, x509Certificate);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r6 instanceof javax.net.ssl.SNIHostName) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r6 = (javax.net.ssl.SNIHostName) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        r6 = new javax.net.ssl.SNIHostName(r6.getEncoded());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        ru.CryptoPro.ssl.SSLLogger.fine("Illegal server name: " + r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(SSLSession sSLSession, X509Certificate x509Certificate, String str, boolean z, List list) {
        String peerHost = sSLSession.getPeerHost();
        if (z) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SNIServerName sNIServerName = (SNIServerName) it.next();
                if (sNIServerName.getType() == 0) {
                    break;
                }
            }
            SNIHostName sNIHostName = null;
            String asciiName = sNIHostName != null ? sNIHostName.getAsciiName() : null;
            if (asciiName != null) {
                try {
                    e(asciiName, str, x509Certificate);
                    return;
                } catch (CertificateException e) {
                    if (asciiName.equalsIgnoreCase(peerHost)) {
                        throw e;
                    }
                }
            }
        }
        e(peerHost, str, x509Certificate);
    }

    public final vv61 a(String str) {
        PKIXBuilderParameters pKIXBuilderParameters = this.c;
        String str2 = this.a;
        if (pKIXBuilderParameters != null) {
            X509Certificate[] x509CertificateArr = vv61.d;
            if (str2.equals("PKIX")) {
                return new nt61(str, pKIXBuilderParameters);
            }
            ny61.g("getInstance(PKIXBuilderParameters) can only be used with PKIX validator");
            return null;
        }
        X509Certificate[] x509CertificateArr2 = vv61.d;
        boolean equals = str2.equals("Simple");
        Collection collection = this.b;
        if (equals) {
            return new dv61(str, collection);
        }
        if (str2.equals("PKIX")) {
            return new nt61(str, collection);
        }
        ny61.g("Unknown validator type: ".concat(str2));
        return null;
    }

    public final vv61 b(X509Certificate[] x509CertificateArr, String str, boolean z) {
        String str2;
        vv61 vv61Var;
        vv61 vv61Var2;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            str2 = "null or zero-length certificate chain";
        } else {
            if (str != null && str.length() != 0) {
                if (z) {
                    vv61 vv61Var3 = this.d;
                    if (vv61Var3 != null) {
                        return vv61Var3;
                    }
                    synchronized (this) {
                        try {
                            vv61Var2 = this.d;
                            if (vv61Var2 == null) {
                                vv61Var2 = a("tls client");
                                this.d = vv61Var2;
                            }
                        } finally {
                        }
                    }
                    return vv61Var2;
                }
                vv61 vv61Var4 = this.e;
                if (vv61Var4 != null) {
                    return vv61Var4;
                }
                synchronized (this) {
                    try {
                        vv61Var = this.e;
                        if (vv61Var == null) {
                            vv61Var = a("tls server");
                            this.e = vv61Var;
                        }
                    } finally {
                    }
                }
                return vv61Var;
            }
            str2 = "null or zero-length authentication type";
        }
        ny61.g(str2);
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        g(x509CertificateArr, str, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        g(x509CertificateArr, str, null, false);
    }

    public final void d() {
        SSLLogger.fine("\n%% adding as trusted certificates %%\n--------");
        if (SSLLogger.isFineEnabled()) {
            for (X509Certificate x509Certificate : this.b) {
                StringBuffer stringBuffer = new StringBuffer("adding as trusted cert:\n  Subject: ");
                stringBuffer.append(x509Certificate.getSubjectX500Principal());
                stringBuffer.append("\n  Issuer: ");
                stringBuffer.append(x509Certificate.getIssuerX500Principal());
                stringBuffer.append("\n  Algorithm: ");
                stringBuffer.append(x509Certificate.getPublicKey().getAlgorithm());
                stringBuffer.append("\n  Serial number: 0x");
                stringBuffer.append(x509Certificate.getSerialNumber().toString(16));
                stringBuffer.append("\n  Valid from ");
                stringBuffer.append(x509Certificate.getNotBefore());
                stringBuffer.append("\n until ");
                stringBuffer.append(x509Certificate.getNotAfter());
                stringBuffer.append("\n");
                SSLLogger.fine(stringBuffer.toString());
            }
        }
    }

    public final void g(X509Certificate[] x509CertificateArr, String str, Socket socket, boolean z) {
        cl_90 cl_90Var;
        X509Certificate[] c;
        vv61 b = b(x509CertificateArr, str, z);
        if (socket != null && socket.isConnected() && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSession = sSLSocket.getHandshakeSession();
            if (handshakeSession == null) {
                w511.y("No handshake session");
                return;
            }
            String endpointIdentificationAlgorithm = sSLSocket.getSSLParameters().getEndpointIdentificationAlgorithm();
            if (!z && ((endpointIdentificationAlgorithm == null || endpointIdentificationAlgorithm.length() == 0) && TLSSettings.getTlsProhibitDisabledValidation())) {
                endpointIdentificationAlgorithm = Constants.SCHEME;
            }
            if (endpointIdentificationAlgorithm != null && endpointIdentificationAlgorithm.length() != 0) {
                f(handshakeSession, x509CertificateArr[0], endpointIdentificationAlgorithm, z, c(socket));
            }
            cl_90Var = cl_84.b(handshakeSession.getProtocol()).n >= cl_84.z.n ? handshakeSession instanceof ExtendedSSLSession ? new cl_90(sSLSocket, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), false) : new cl_90(sSLSocket, false) : new cl_90(sSLSocket, false);
        } else {
            cl_90Var = null;
        }
        if (z) {
            try {
                c = b.c(x509CertificateArr, cl_90Var, str);
            } finally {
            }
        } else {
            try {
                c = b.c(x509CertificateArr, cl_90Var, str);
            } finally {
            }
        }
        SSLLogger.fine("Found trusted certificate:", c[c.length - 1]);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        Collection collection = this.b;
        X509Certificate[] x509CertificateArr = new X509Certificate[collection.size()];
        collection.toArray(x509CertificateArr);
        return x509CertificateArr;
    }

    public final void h(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine, boolean z) {
        cl_90 cl_90Var;
        X509Certificate[] c;
        vv61 b = b(x509CertificateArr, str, z);
        if (sSLEngine != null) {
            SSLSession handshakeSession = sSLEngine.getHandshakeSession();
            if (handshakeSession == null) {
                w511.y("No handshake session");
                return;
            }
            String endpointIdentificationAlgorithm = sSLEngine.getSSLParameters().getEndpointIdentificationAlgorithm();
            if (!z && ((endpointIdentificationAlgorithm == null || endpointIdentificationAlgorithm.length() == 0) && TLSSettings.getTlsProhibitDisabledValidation())) {
                endpointIdentificationAlgorithm = Constants.SCHEME;
            }
            if (endpointIdentificationAlgorithm != null && endpointIdentificationAlgorithm.length() != 0) {
                X509Certificate x509Certificate = x509CertificateArr[0];
                SSLSession handshakeSession2 = sSLEngine.getHandshakeSession();
                f(handshakeSession, x509Certificate, endpointIdentificationAlgorithm, z, (handshakeSession2 == null || !(handshakeSession2 instanceof ExtendedSSLSession)) ? Collections.EMPTY_LIST : ((ExtendedSSLSession) handshakeSession2).getRequestedServerNames());
            }
            cl_90Var = cl_84.b(handshakeSession.getProtocol()).n >= cl_84.z.n ? handshakeSession instanceof ExtendedSSLSession ? new cl_90(sSLEngine, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), false) : new cl_90(sSLEngine, false) : new cl_90(sSLEngine, false);
        } else {
            cl_90Var = null;
        }
        if (z) {
            try {
                c = b.c(x509CertificateArr, cl_90Var, str);
            } finally {
            }
        } else {
            try {
                c = b.c(x509CertificateArr, cl_90Var, str);
            } finally {
            }
        }
        SSLLogger.fine("Found trusted certificate:", c[c.length - 1]);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        g(x509CertificateArr, str, socket, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        g(x509CertificateArr, str, socket, false);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        h(x509CertificateArr, str, sSLEngine, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        h(x509CertificateArr, str, sSLEngine, false);
    }

    public cl_122(PKIXBuilderParameters pKIXBuilderParameters) {
        this.a = "PKIX";
        this.c = pKIXBuilderParameters;
        vv61 a = a("tls server");
        this.b = a.a();
        this.e = a;
        d();
    }
}
