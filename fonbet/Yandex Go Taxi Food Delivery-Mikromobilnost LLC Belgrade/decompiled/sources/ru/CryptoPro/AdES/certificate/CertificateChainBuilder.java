package ru.CryptoPro.AdES.certificate;

import defpackage.r0x;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.CertificateUtility;

/* loaded from: classes4.dex */
public interface CertificateChainBuilder extends CertificateChainBase, CertificateUtility {
    void build(X509Certificate x509Certificate) throws AdESException;

    void build(r0x r0xVar) throws AdESException;

    List<X509Certificate> getCertificateChain();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ String getProvider();

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ Date getValidationDate();

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBase
    /* synthetic */ void setValidationDate(Date date);
}
