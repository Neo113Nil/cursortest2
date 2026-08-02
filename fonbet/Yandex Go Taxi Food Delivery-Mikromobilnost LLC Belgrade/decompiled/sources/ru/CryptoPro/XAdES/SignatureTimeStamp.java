package ru.CryptoPro.XAdES;

import defpackage.m8z0;
import defpackage.ot61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.tools.CRLUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.transform.HashDataInfoWrapper;

/* loaded from: classes4.dex */
public interface SignatureTimeStamp extends SignatureOptions, CRLUtility, CertificateUtility, DigestUtility, ProviderUtility {
    public static final String DEFAULT_CANONICALIZATION_ALGORITHM = "http://www.w3.org/2001/10/xml-exc-c14n#";
    public static final XPathFactory X_PATH_FACTORY = XPathFactory.newInstance();

    boolean doNotAddNode();

    boolean doNotValidateBecauseEnhancement();

    ot61 enhance() throws XAdESException;

    void generateEncapsulatedTimeStamp(Document document, String str) throws XAdESException;

    Document getDocument();

    Element getElement();

    List<HashDataInfoWrapper> getHashDataInfo();

    String getId();

    m8z0 getTimestampToken();

    /* synthetic */ void setCRLs(Collection collection);

    /* synthetic */ void setCertificateValues(Set set);

    /* synthetic */ void setDigestAlgorithm(String str);

    void setDoNotAddNode(boolean z);

    void setDoNotValidateBecauseEnhancement(boolean z);

    @Override // ru.CryptoPro.AdES.SignatureOptions
    /* synthetic */ void setOptions(Options options);

    /* synthetic */ void setProvider(String str);

    void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException;
}
