package ru.CryptoPro.AdES.tools.revocation.data;

import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public interface CertificateData {
    X509Certificate getCertificate();

    X509Certificate getIssuerCertificate();
}
