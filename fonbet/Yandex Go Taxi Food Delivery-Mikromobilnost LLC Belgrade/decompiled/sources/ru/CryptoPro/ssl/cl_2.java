package ru.CryptoPro.ssl;

import com.adjust.sdk.Constants;
import defpackage.pq61;
import defpackage.w511;
import java.net.Socket;
import java.security.AlgorithmConstraints;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import ru.CryptoPro.ssl.util.TLSSettings;

/* loaded from: classes4.dex */
final class cl_2 extends X509ExtendedTrustManager implements X509TrustManager {
    public final X509TrustManager a;

    public cl_2(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    public final void a(X509Certificate[] x509CertificateArr, Socket socket, boolean z) {
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
                cl_122.e(handshakeSession.getPeerHost(), endpointIdentificationAlgorithm, x509CertificateArr[0]);
            }
            b(x509CertificateArr, cl_84.b(handshakeSession.getProtocol()).n >= cl_84.z.n ? handshakeSession instanceof ExtendedSSLSession ? new cl_90(sSLSocket, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), true) : new cl_90(sSLSocket, true) : new cl_90(sSLSocket, true), z);
        }
    }

    public final void b(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, boolean z) {
        try {
            int length = x509CertificateArr.length;
            int i = length - 1;
            HashSet hashSet = new HashSet();
            X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
            if (acceptedIssuers != null && acceptedIssuers.length > 0) {
                Collections.addAll(hashSet, acceptedIssuers);
            }
            if (hashSet.contains(x509CertificateArr[i])) {
                i = length - 2;
            }
            if (i >= 0) {
                pq61 pq61Var = new pq61(null, algorithmConstraints);
                pq61Var.init(false);
                while (i >= 0) {
                    pq61Var.check(x509CertificateArr[i], Collections.EMPTY_SET);
                    i--;
                }
            }
        } catch (CertPathValidatorException e) {
            throw new CertificateException("Certificates do not conform to algorithm constraints", e);
        }
    }

    public final void c(X509Certificate[] x509CertificateArr, SSLEngine sSLEngine, boolean z) {
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
                cl_122.e(handshakeSession.getPeerHost(), endpointIdentificationAlgorithm, x509CertificateArr[0]);
            }
            b(x509CertificateArr, cl_84.b(handshakeSession.getProtocol()).n >= cl_84.z.n ? handshakeSession instanceof ExtendedSSLSession ? new cl_90(sSLEngine, ((ExtendedSSLSession) handshakeSession).getLocalSupportedSignatureAlgorithms(), true) : new cl_90(sSLEngine, true) : new cl_90(sSLEngine, true), z);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.a.checkClientTrusted(x509CertificateArr, str);
        a(x509CertificateArr, socket, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        this.a.checkServerTrusted(x509CertificateArr, str);
        a(x509CertificateArr, socket, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.a.checkClientTrusted(x509CertificateArr, str);
        c(x509CertificateArr, sSLEngine, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        this.a.checkServerTrusted(x509CertificateArr, str);
        c(x509CertificateArr, sSLEngine, false);
    }
}
