package ru.CryptoPro.XAdES;

import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Element;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner;

/* loaded from: classes4.dex */
public interface XAdESSignerBES extends IXAdESSigner {
    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    /* synthetic */ XAdESSigner enhance(String str, String str2, List list, String str3, Integer num) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    /* synthetic */ XAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCRLs();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCertificates();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ Integer getSignatureType();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    /* synthetic */ Element getSignatureValue();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ X509Certificate getSignerCertificate();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    /* synthetic */ Element getSignerInfo();

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    /* synthetic */ void verify(Set set, Set set2) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws XAdESException;
}
