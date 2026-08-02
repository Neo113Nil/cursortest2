package ru.CryptoPro.AdES.tools.revocation.data;

import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.certificate.CertificateItem;

/* loaded from: classes4.dex */
public interface ValidatingData extends CertificateData, CertificateRevocationData {
    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    /* synthetic */ X509Certificate getCertificate();

    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateRevocationData
    /* synthetic */ CertificateItem.CertificateRole getCertificateRole();

    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateData
    /* synthetic */ X509Certificate getIssuerCertificate();

    @Override // ru.CryptoPro.AdES.tools.revocation.data.CertificateRevocationData
    /* synthetic */ RevocationMethod getRevocationMethod();
}
