package ru.CryptoPro.AdES.service;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.DigestUtility;

/* loaded from: classes4.dex */
public interface TSPConnector extends ServiceConnector<TSPServiceResponse>, DigestUtility {
    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ TSPServiceResponse getEncoded() throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    void setImprint(byte[] bArr);

    @Override // ru.CryptoPro.AdES.service.ServiceConnector, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ void setServiceEventListener(ServiceEventListener<TSPServiceResponse> serviceEventListener);
}
