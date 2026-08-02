package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.m8z0;
import defpackage.xc3;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.external.signature.AdESTSignatureModel;
import ru.CryptoPro.CAdES.exception.CAdESException;

/* loaded from: classes4.dex */
public interface CAdESSignerT extends AdESTSignatureModel, CAdESSignerBES {
    @Override // ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ void addCountersigner(acs0 acs0Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ CAdESSigner enhance(String str, String str2, List list, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ CAdESSigner enhance(String str, String str2, List list, Set set, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ void enhance(String str, String str2, Collection collection, String str3, Integer num) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ void enhance(String str, String str2, Collection collection, String str3, Integer num, xc3 xc3Var) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ m8z0 getCAdESCTimestampToken();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ Collection getCAdESCTimestampTokenList();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    /* synthetic */ CAdESSigner[] getCAdESCountersignerInfos();

    m8z0 getEarliestValidSignatureTimeStampToken();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCRLs();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ Set getSignatureCertificates();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ m8z0 getSignatureTimestampToken();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ Collection getSignatureTimestampTokenList();

    @Override // ru.CryptoPro.AdES.external.signature.AdESTSignatureModel, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    /* synthetic */ List getSignatureTimestampTokens();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES
    /* synthetic */ Integer getSignatureType();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ X509Certificate getSignerCertificate();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    /* synthetic */ acs0 getSignerInfo();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    /* synthetic */ xc3 getSignerSignedAttributes();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    /* synthetic */ xc3 getSignerUnsignedAttributes();

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    /* synthetic */ void verify(Collection collection, Collection collection2, Integer num, boolean z) throws CAdESException;

    /* synthetic */ void verify(Set set, Set set2) throws CAdESException;

    @Override // ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws CAdESException;
}
