package ru.CryptoPro.AdES.external.interfaces;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public interface IAdESSigner {
    Set<X509CRL> getSignatureCRLs();

    Set<X509Certificate> getSignatureCertificates();

    Integer getSignatureType();

    X509Certificate getSignerCertificate();

    void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws AdESException;

    void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws AdESException;
}
