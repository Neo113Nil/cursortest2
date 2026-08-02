package ru.CryptoPro.XAdES;

import defpackage.cs61;
import defpackage.dr61;
import defpackage.m8z0;
import defpackage.ot61;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public interface SigAndRefsTimeStamp extends SignatureTimeStamp {
    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ boolean doNotAddNode();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ boolean doNotValidateBecauseEnhancement();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ ot61 enhance() throws XAdESException;

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ void generateEncapsulatedTimeStamp(Document document, String str) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ Document getDocument();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ Element getElement();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ List getHashDataInfo();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ String getId();

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ m8z0 getTimestampToken();

    void setAdditionalHashData(List<ot61> list) throws XAdESException;

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.CRLUtility
    /* synthetic */ void setCRLs(Collection collection);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.CertificateUtility
    /* synthetic */ void setCertificateValues(Set set);

    void setCompleteCertificateReferences(dr61 dr61Var);

    void setCompleteRevocationReferences(cs61 cs61Var);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.DigestUtility
    /* synthetic */ void setDigestAlgorithm(String str);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ void setDoNotAddNode(boolean z);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ void setDoNotValidateBecauseEnhancement(boolean z);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp, ru.CryptoPro.AdES.tools.ProviderUtility
    /* synthetic */ void setProvider(String str);

    void setSignatureTimestampsDetailsElements(List<Element> list);

    @Override // ru.CryptoPro.XAdES.SignatureTimeStamp
    /* synthetic */ void verify(Set set, Set set2) throws XAdESException;
}
