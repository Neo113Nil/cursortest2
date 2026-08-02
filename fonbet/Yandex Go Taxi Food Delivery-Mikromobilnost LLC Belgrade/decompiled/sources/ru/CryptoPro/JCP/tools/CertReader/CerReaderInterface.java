package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.X509Certificate;
import java.util.Collection;

/* loaded from: classes4.dex */
public interface CerReaderInterface {
    X509Certificate getCertificate();

    Extension getExtension(String str);

    Collection getNonRealizedCritical();

    Collection getNonRealizedNonCritical();

    Collection getRealizedCritical();

    Collection getRealizedNonCritical();

    void setCertificate(X509Certificate x509Certificate);
}
