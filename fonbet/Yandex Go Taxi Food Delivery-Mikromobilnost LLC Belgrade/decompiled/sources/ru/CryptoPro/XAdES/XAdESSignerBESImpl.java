package ru.CryptoPro.XAdES;

import defpackage.cr80;
import defpackage.g8e;
import defpackage.hw61;
import defpackage.lv61;
import defpackage.mv61;
import defpackage.mw61;
import defpackage.qu61;
import defpackage.qv61;
import defpackage.r0x;
import defpackage.sv61;
import defpackage.tr61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public class XAdESSignerBESImpl extends XAdESSignerBinaryImpl implements XAdESSignerBES {
    public final TreeMap z;

    public XAdESSignerBESImpl(Element element, Integer num) {
        super(element, num);
        this.z = new TreeMap();
    }

    public static sv61 l(qu61 qu61Var) {
        mv61 h = qu61Var.h();
        if (h.x == null) {
            Document document = h.z;
            sv61 sv61Var = new sv61(document, h, cl_63.h, h.b, h.c, h.w);
            sv61Var.x = document;
            h.x = sv61Var;
        }
        return h.x;
    }

    public static mw61 n(qu61 qu61Var) {
        qu61 qu61Var2;
        if (qu61Var.z == null) {
            Document document = qu61Var.A;
            String str = qu61Var.x;
            qu61Var2 = qu61Var;
            lv61 lv61Var = new lv61(document, qu61Var2, cl_63.A, qu61Var.b, qu61Var.c, qu61Var.w);
            lv61Var.x = document;
            lv61Var.a(null, "Id", str + "-UnsignedProperties");
            qu61Var2.z = lv61Var;
        } else {
            qu61Var2 = qu61Var;
        }
        lv61 lv61Var2 = qu61Var2.z;
        if (((mw61) lv61Var2.y) == null) {
            Document document2 = lv61Var2.x;
            mw61 mw61Var = new mw61(document2, lv61Var2, cl_64.x.b(), lv61Var2.b, lv61Var2.c, lv61Var2.w);
            mw61Var.x = new ArrayList();
            mw61Var.C = document2;
            lv61Var2.y = mw61Var;
        }
        return (mw61) lv61Var2.y;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num) throws XAdESException {
        JCPLogger.fine("%%% Enhancing signer (BES)... %%%");
        try {
            checkIfCanEnhance(num);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            List<X509Certificate> list2 = list;
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(list2);
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set);
            X509Certificate signerCertificate = getSignerCertificate();
            if (signerCertificate == null) {
                try {
                    findSignerCertificate(unmodifiableSet, list2);
                    signerCertificate = getSignerCertificate();
                    if (signerCertificate == null) {
                        throw new XAdESException("Signer certificate not found", IAdESException.ecSignerCertificateIsNull);
                    }
                } catch (AdESException e) {
                    throw new XAdESException(e, e.getErrorCode());
                }
            }
            if (str2 == null && !AdESUtility.isInternalImplemented(str)) {
                throw new XAdESException(g8e.o("Digest URI/URN is not supported by provider ", str), IAdESException.ecInternal);
            }
            String findDigestUriByKey = XAdESUtility.findDigestUriByKey(signerCertificate.getPublicKey());
            JCPLogger.fine("Enhancing digest URI: " + findDigestUriByKey);
            String findDigestOidByDigestName = XAdESUtility.findDigestOidByDigestName(XAdESUtility.findDigestNameByDigestUri(findDigestUriByKey));
            JCPLogger.fine("Enhancing digest OID: " + findDigestOidByDigestName);
            try {
                List<X509Certificate> build = build(signerCertificate, str, null);
                this.signatureCertificates.addAll(build);
                Integer num2 = XAdESParameters.XAdES_X_Long_Type_1;
                if (!num.equals(num2)) {
                    validate(build, str, null);
                }
                JCPLogger.fine("Initializing signature-timestamp...");
                SignatureTimeStampImpl signatureTimeStampImpl = new SignatureTimeStampImpl(str3);
                signatureTimeStampImpl.setDigestAlgorithm(findDigestOidByDigestName);
                signatureTimeStampImpl.setProvider(str);
                signatureTimeStampImpl.setCertificateValues(this.signatureCertificates);
                signatureTimeStampImpl.setCRLs(this.signatureCRLs);
                JCPLogger.fine("Initializing signer...");
                XAdESSignerTImpl xAdESSignerTImpl = new XAdESSignerTImpl(this.c);
                xAdESSignerTImpl.p(Collections.singletonList(signatureTimeStampImpl));
                JCPLogger.fine("Override signer certificate chain...");
                xAdESSignerTImpl.o(build);
                xAdESSignerTImpl.k(getSignerCertificate());
                Set<X509Certificate> set2 = this.signatureCertificates;
                xAdESSignerTImpl.signatureCertificates.clear();
                xAdESSignerTImpl.signatureCertificates.addAll(set2);
                Set<X509CRL> set3 = this.signatureCRLs;
                xAdESSignerTImpl.signatureCRLs.clear();
                xAdESSignerTImpl.signatureCRLs.addAll(set3);
                Element signatureValue = getSignatureValue();
                String attribute = signatureValue.getAttribute("Id");
                qu61 a = XAdESType.a(this.c);
                JCPLogger.fineFormat("Encoding unsigned properties: {0}, {1}...", this.x, attribute);
                xAdESSignerTImpl.j(a, this.x, signatureValue);
                if (!num.equals(num2)) {
                    xAdESSignerTImpl.e(str, null);
                }
                xAdESSignerTImpl.h();
                xAdESSignerTImpl.g();
                xAdESSignerTImpl.A = signatureTimeStampImpl;
                JCPLogger.fine("%%% Signer enhanced (BES - > T) %%%");
                if (!num.equals(num2)) {
                    return xAdESSignerTImpl;
                }
                JCPLogger.fine("Initializing signer...");
                IXAdESSigner iXAdESSigner = (XAdESSignerXLT1) xAdESSignerTImpl.enhance(str, str2, list2, str3, num2);
                JCPLogger.fine("%%% Signer enhanced (T - > X Long Type 1) %%%");
                return (XAdESSigner) iXAdESSigner;
            } catch (AdESException e2) {
                throw new XAdESException(e2, e2.getErrorCode());
            }
        } catch (AdESException e3) {
            throw new XAdESException(e3, e3.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final void findSignerCertificate(Collection collection, Collection collection2) {
        JCPLogger.subEnter();
        cr80 cr80Var = (cr80) this.y.getSignerCertificateReference();
        CertificateFinder certificateFinder = new CertificateFinder(collection, collection2);
        this.signerCertificateChain.clear();
        r0x r0xVar = cr80Var.b;
        this.signerCertificateChain.add(r0xVar == null ? certificateFinder.find(cr80Var) : certificateFinder.find(r0xVar));
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public final void g() {
        JCPLogger.subEnter();
        JCPLogger.fine("Validating signed properties' type...");
        try {
            new qv61().validate(getSignerInfo());
            JCPLogger.fine("Validation of signed properties' type completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getPkupValidationDate() {
        return ((tr61) this.y).getSigningTime();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return XAdESParameters.XAdES_BES;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public void i() {
        this.y = new tr61(this.c);
    }

    public void j(qu61 qu61Var, String str, Element element) {
    }

    public final void k(X509Certificate x509Certificate) {
        JCPLogger.subEnter();
        this.z.put(cl_64.g, new hw61(x509Certificate, this.provider));
        JCPLogger.subExit();
    }

    public final void m(Collection collection) {
        JCPLogger.subEnter();
        TreeMap treeMap = this.z;
        if (collection != null) {
            treeMap.put(cl_64.n, collection);
        } else {
            treeMap.remove(cl_64.n);
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws XAdESException {
        return enhance(str, str2, list, null, str3, num);
    }
}
