package ru.CryptoPro.AdES.service;

import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface CRLConnector extends ServiceConnector<CRLServiceResponse> {
    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ CRLServiceResponse getEncoded() throws AdESException;

    @Override // ru.CryptoPro.AdES.service.ServiceConnector, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    @Override // ru.CryptoPro.AdES.service.ServiceConnector
    /* synthetic */ void setServiceEventListener(ServiceEventListener<CRLServiceResponse> serviceEventListener);
}
