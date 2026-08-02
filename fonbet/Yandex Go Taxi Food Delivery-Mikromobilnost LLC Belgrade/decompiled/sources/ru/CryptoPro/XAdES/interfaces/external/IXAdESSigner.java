package ru.CryptoPro.XAdES.interfaces.external;

import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.external.interfaces.IAdESSigner;
import ru.CryptoPro.XAdES.XAdESSigner;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public interface IXAdESSigner extends IAdESSigner {
    XAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws XAdESException;

    XAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCRLs();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCertificates();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ Integer getSignatureType();

    Element getSignatureValue();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ X509Certificate getSignerCertificate();

    Element getSignerInfo();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws XAdESException;
}
