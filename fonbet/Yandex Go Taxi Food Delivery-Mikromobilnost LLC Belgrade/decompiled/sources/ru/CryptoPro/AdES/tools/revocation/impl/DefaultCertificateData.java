package ru.CryptoPro.AdES.tools.revocation.impl;

import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.tools.revocation.data.CertificateData;

/* loaded from: classes4.dex */
public class DefaultCertificateData implements CertificateData {
    private final X509Certificate certificate;
    private final X509Certificate issuerCertificate;

    public DefaultCertificateData(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.certificate = x509Certificate;
        this.issuerCertificate = x509Certificate2;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    public X509Certificate getCertificate() {
        return this.certificate;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    public X509Certificate getIssuerCertificate() {
        return this.issuerCertificate;
    }
}
