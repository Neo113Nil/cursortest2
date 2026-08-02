package ru.domesticroots.webview;

import java.security.cert.CertificateException;

/* loaded from: classes9.dex */
final class CertificateChainVerifier$NotTrustedException extends CertificateException {
    final CertificateChainVerifier$Result result;

    public CertificateChainVerifier$NotTrustedException(CertificateChainVerifier$Result certificateChainVerifier$Result) {
        super("Certificate chain is not trusted: " + certificateChainVerifier$Result);
        this.result = certificateChainVerifier$Result;
    }
}
