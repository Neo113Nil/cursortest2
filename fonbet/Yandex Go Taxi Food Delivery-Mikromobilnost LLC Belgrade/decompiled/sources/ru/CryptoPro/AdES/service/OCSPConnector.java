package ru.CryptoPro.AdES.service;

import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface OCSPConnector extends ServiceConnector<OCSPServiceResponse> {
    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ OCSPServiceResponse getEncoded() throws AdESException;

    void setCheckableCertificate(X509Certificate x509Certificate);

    void setIssuerCertificate(X509Certificate x509Certificate);

    @Override // ru.CryptoPro.AdES.service.ServiceConnector, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ void setServiceEventListener(ServiceEventListener<OCSPServiceResponse> serviceEventListener);
}
