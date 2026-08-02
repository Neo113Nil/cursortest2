package ru.CryptoPro.AdES.service;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.ProviderUtility;

/* loaded from: classes4.dex */
public interface ServiceConnector<T> extends ProviderUtility {
    T getEncoded() throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    void setServiceEventListener(ServiceEventListener<T> serviceEventListener);
}
