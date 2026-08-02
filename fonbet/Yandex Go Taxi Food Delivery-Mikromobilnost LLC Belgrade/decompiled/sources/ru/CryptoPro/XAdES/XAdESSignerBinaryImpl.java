package ru.CryptoPro.XAdES;

import defpackage.jt61;
import defpackage.lw61;
import java.security.NoSuchProviderException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.signature.AdESSigner;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public class XAdESSignerBinaryImpl extends XAdESSigner {
    public jt61 y;

    public XAdESSignerBinaryImpl(Element element, Integer num) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.w = null;
        this.x = null;
        JCPLogger.subEnter();
        this.c = element;
        this.x = element.getAttribute("Id");
        this.b = element.getOwnerDocument();
        this.w = XMLUtils.getChildElementByTagNameNS(element, "SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
        if (AdESSigner.verifiedSignatureTypes.contains(num)) {
            JCPLogger.subExit();
            this.y = null;
            i();
        } else {
            throw new XAdESException("Unsupported signature type " + XAdESType.getSignatureTypeName(num) + " to be verified", IAdESException.ecSignatureUnsupported);
        }
    }

    public void e(String str, Options options) {
    }

    @Override // ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num) throws XAdESException {
        throw new XAdESException("Unsupported method", IAdESException.ecInternal);
    }

    public final void f(X509Certificate x509Certificate) {
        boolean z;
        JCPLogger.subEnter();
        if (!AdESUtility.ifKeyUsageIsSignatureInCertificate(x509Certificate)) {
            throw new XAdESException(IAdESException.ecWrongKeyUsage);
        }
        DOMValidateContext dOMValidateContext = new DOMValidateContext(KeySelector.singletonKeySelector(x509Certificate.getPublicKey()), this.c);
        try {
            try {
                XMLSignature unmarshalXMLSignature = d().unmarshalXMLSignature(dOMValidateContext);
                try {
                    z = unmarshalXMLSignature.validate(dOMValidateContext);
                } catch (XMLSignatureException e) {
                    JCPLogger.warning("Invalid signature", (Throwable) e);
                    z = false;
                }
                if (z) {
                    JCPLogger.subExit();
                    return;
                }
                try {
                    if (!unmarshalXMLSignature.getSignatureValue().validate(dOMValidateContext)) {
                        throw new XAdESException(IAdESException.ecSignatureInvalid);
                    }
                    for (Reference reference : unmarshalXMLSignature.getSignedInfo().getReferences()) {
                        try {
                            if (!reference.validate(dOMValidateContext)) {
                                JCPLogger.warning("Invalid signature reference uri " + reference.getURI() + " (id: " + reference.getId() + Extension.C_BRAKE);
                            }
                        } catch (XMLSignatureException e2) {
                            throw new XAdESException((Exception) e2, IAdESException.ecSignatureInvalid);
                        }
                    }
                    throw new XAdESException(IAdESException.ecSignatureInvalid);
                } catch (XMLSignatureException e3) {
                    throw new XAdESException((Exception) e3, IAdESException.ecSignatureInvalid);
                }
            } catch (MarshalException e4) {
                throw new XAdESException((Exception) e4, IAdESException.ecSignatureMarshallingFailed);
            }
        } catch (NoSuchProviderException e5) {
            throw new XAdESException(e5, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public void findSignerCertificate(Collection collection, Collection collection2) {
        JCPLogger.subEnter();
        this.signerCertificateChain.clear();
        Set<X509Certificate> unmodifiableSet = Collections.unmodifiableSet(this.y.c);
        if (unmodifiableSet.isEmpty()) {
            if (!this.signatureCertificates.isEmpty()) {
                unmodifiableSet = this.signatureCertificates;
            }
            JCPLogger.subExit();
        }
        this.signerCertificateChain.add(unmodifiableSet.iterator().next());
        JCPLogger.subExit();
    }

    public void g() {
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getBuildingDate() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getExternalDate() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getInternalDate() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getPkupValidationDate() {
        return null;
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getValidationDate() {
        return null;
    }

    public final void h() {
        ArrayList arrayList;
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding XML DSig signature...");
        jt61 jt61Var = this.y;
        jt61Var.b = this.provider;
        jt61Var.decode();
        this.signatureCertificates.addAll(Collections.unmodifiableSet(this.y.c));
        this.signatureCertificates.addAll(Collections.unmodifiableSet(this.y.w));
        jt61 jt61Var2 = this.y;
        if (jt61Var2 instanceof lw61) {
            List unmodifiableList = Collections.unmodifiableList(((lw61) jt61Var2).D);
            this.signatureCertificates.addAll(unmodifiableList);
            arrayList = new ArrayList();
            arrayList.addAll(unmodifiableList);
        } else {
            arrayList = null;
        }
        try {
            findSignerCertificate(arrayList, this.signatureCertificates);
        } catch (AdESException e) {
            JCPLogger.ignoredException(e);
        }
        JCPLogger.subExit();
    }

    public void i() {
        this.y = new jt61(this.c);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Basic signature validation...");
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
        this.signatureCertificates.addAll(set);
        if (set2 == null) {
            set2 = Collections.EMPTY_SET;
        }
        this.signatureCRLs.addAll(set2);
        X509Certificate signerCertificate = getSignerCertificate();
        if (signerCertificate == null) {
            try {
                findSignerCertificate(unmodifiableSet, set);
                signerCertificate = getSignerCertificate();
                if (signerCertificate == null) {
                    throw new XAdESException("Signer certificate not found", IAdESException.ecSignerCertificateIsNull);
                }
            } catch (AdESException e) {
                throw new XAdESException(e, e.getErrorCode());
            }
        }
        JCPLogger.fine("Verifying XML signature...");
        f(signerCertificate);
        g();
        try {
            this.signerCertificateChain.clear();
            this.signerCertificateChain.addAll(build(signerCertificate, this.provider, getBuildingDate()));
            validate(this.signerCertificateChain, this.provider, getValidationDate());
            JCPLogger.fine("Basic signature validation completed.");
            JCPLogger.subExit();
        } catch (AdESException e2) {
            throw new XAdESException(e2, e2.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws XAdESException {
        return enhance(str, str2, list, null, str3, num);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws XAdESException {
        verify(set, set2, null, false);
    }
}
