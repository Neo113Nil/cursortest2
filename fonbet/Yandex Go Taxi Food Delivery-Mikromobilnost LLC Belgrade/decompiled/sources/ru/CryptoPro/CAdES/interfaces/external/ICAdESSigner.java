package ru.CryptoPro.CAdES.interfaces.external;

import defpackage.acs0;
import defpackage.m8z0;
import defpackage.xc3;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.external.interfaces.IAdESSigner;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public interface ICAdESSigner extends IAdESSigner {
    void addCountersigner(acs0 acs0Var) throws CAdESException;

    CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws CAdESException;

    CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    CAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Deprecated
    void enhance(String str, String str2, Collection<X509Certificate> collection, String str3, Integer num) throws CAdESException;

    @Deprecated
    void enhance(String str, String str2, Collection<X509Certificate> collection, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Deprecated
    m8z0 getCAdESCTimestampToken();

    @Deprecated
    Collection<m8z0> getCAdESCTimestampTokenList();

    CAdESSigner[] getCAdESCountersignerInfos();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCRLs();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCertificates();

    @Deprecated
    m8z0 getSignatureTimestampToken();

    @Deprecated
    Collection<m8z0> getSignatureTimestampTokenList();

    /* synthetic */ Integer getSignatureType();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ X509Certificate getSignerCertificate();

    acs0 getSignerInfo();

    xc3 getSignerSignedAttributes();

    xc3 getSignerUnsignedAttributes();

    @Deprecated
    void verify(Collection<X509Certificate> collection, Collection<X509CRL> collection2, Integer num, boolean z) throws CAdESException;

    void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws CAdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException;
}
