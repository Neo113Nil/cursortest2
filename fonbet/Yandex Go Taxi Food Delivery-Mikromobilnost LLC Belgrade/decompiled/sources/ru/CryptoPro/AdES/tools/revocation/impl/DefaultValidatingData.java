package ru.CryptoPro.AdES.tools.revocation.impl;

import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.tools.revocation.data.RevocationMethod;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;

/* loaded from: classes4.dex */
public class DefaultValidatingData implements ValidatingData {
    private final X509Certificate certificate;
    private final CertificateItem.CertificateRole certificateRole;
    private final X509Certificate issuerCertificate;
    private final RevocationMethod revocationMethod;

    public DefaultValidatingData(X509Certificate x509Certificate, X509Certificate x509Certificate2, CertificateItem.CertificateRole certificateRole, RevocationMethod revocationMethod) {
        this.certificate = x509Certificate;
        this.issuerCertificate = x509Certificate2;
        this.certificateRole = certificateRole;
        this.revocationMethod = revocationMethod;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingData, ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    public X509Certificate getCertificate() {
        return this.certificate;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingData, ru.CryptoPro.AdES.tools.revocation.data.CertificateRevocationData
    public CertificateItem.CertificateRole getCertificateRole() {
        return this.certificateRole;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingData, ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    public X509Certificate getIssuerCertificate() {
        return this.issuerCertificate;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingData, ru.CryptoPro.AdES.tools.revocation.data.CertificateRevocationData
    public RevocationMethod getRevocationMethod() {
        return this.revocationMethod;
    }
}
