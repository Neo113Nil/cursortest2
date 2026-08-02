package ru.CryptoPro.AdES.external.decode;

import java.security.cert.X509Certificate;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface AdESAttributeDecoder<T> {
    void decode() throws AdESException;

    Set<X509Certificate> getExistingCertificateValues();

    T getSignerCertificateReference();

    void setProvider(String str);
}
