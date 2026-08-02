package ru.CryptoPro.XAdES;

import defpackage.bv61;
import defpackage.g8e;
import defpackage.kv61;
import defpackage.lw61;
import defpackage.m8z0;
import defpackage.mw61;
import defpackage.ot61;
import defpackage.qu61;
import defpackage.st61;
import defpackage.yu61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.exception.XMLTimeStampValidationException;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public class XAdESSignerTImpl extends XAdESSignerBESImpl implements XAdESSignerT {
    public SignatureTimeStamp A;

    public XAdESSignerTImpl(Element element, Integer num) {
        super(element, num);
        this.A = null;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public void e(String str, Options options) {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting internal timestamp...");
        List list = (List) this.z.get(cl_64.z);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        if (list.isEmpty()) {
            throw new XAdESException("Internal timestamp not found", IAdESException.ecTimestampNotFound);
        }
        boolean z = false;
        this.A = (SignatureTimeStamp) list.get(0);
        if (options == null || options.isEnableCertificateValidation() || (!getSignatureType().equals(XAdESParameters.XAdES_BES) && !getSignatureType().equals(XAdESParameters.XAdES_T))) {
            z = true;
        }
        JCPLogger.fine("Validating of the signer certificate chain...");
        BaseCertificateChainValidatorImpl baseCertificateChainValidatorImpl = new BaseCertificateChainValidatorImpl();
        baseCertificateChainValidatorImpl.setProvider(str);
        baseCertificateChainValidatorImpl.setCRLs(this.signatureCRLs);
        JCPLogger.fine("validateCertificateChain = " + z);
        baseCertificateChainValidatorImpl.setEnableCertificateValidation(z);
        try {
            baseCertificateChainValidatorImpl.validate(this.signerCertificateChain, (List) null);
            JCPLogger.fine("Validating of the signer certificate chain completed.");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new XAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num) throws XAdESException {
        JCPLogger.fine("%%% Enhancing signer (T)... %%%");
        try {
            checkIfCanEnhance(num);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(list);
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set);
            X509Certificate signerCertificate = getSignerCertificate();
            if (signerCertificate == null) {
                try {
                    findSignerCertificate(unmodifiableSet, list);
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
            JCPLogger.fine("Looking for a earliest valid internal timestamp...");
            if (this.A == null) {
                q();
            }
            try {
                List<X509Certificate> build = build(signerCertificate, str, null);
                this.signatureCertificates.addAll(build);
                this.A.setDoNotAddNode(true);
                ot61 enhance = this.A.enhance();
                this.A = enhance;
                ((st61) enhance).d();
                JCPLogger.fine("Initializing signer...");
                XAdESSignerXLT1Impl xAdESSignerXLT1Impl = new XAdESSignerXLT1Impl(this.c);
                TreeMap treeMap = xAdESSignerXLT1Impl.z;
                Set<X509Certificate> set2 = this.signatureCertificates;
                xAdESSignerXLT1Impl.signatureCertificates.clear();
                xAdESSignerXLT1Impl.signatureCertificates.addAll(set2);
                Set<X509CRL> set3 = this.signatureCRLs;
                xAdESSignerXLT1Impl.signatureCRLs.clear();
                xAdESSignerXLT1Impl.signatureCRLs.addAll(set3);
                xAdESSignerXLT1Impl.setDigestAlgorithm(findDigestOidByDigestName);
                xAdESSignerXLT1Impl.setProvider(str);
                bv61 bv61Var = (bv61) this.y;
                LinkedList linkedList = new LinkedList();
                for (SignatureTimeStamp signatureTimeStamp : (List) bv61Var.y.get(cl_64.z)) {
                    signatureTimeStamp.setDoNotAddNode(true);
                    linkedList.add(signatureTimeStamp);
                }
                JCPLogger.fine("Setting signature-timestamp list...");
                xAdESSignerXLT1Impl.p(linkedList);
                ot61 ot61Var = (ot61) this.A;
                JCPLogger.subEnter();
                if (ot61Var != null) {
                    treeMap.put(cl_64.N, ot61Var);
                } else {
                    treeMap.remove(cl_64.N);
                }
                JCPLogger.subExit();
                JCPLogger.fine("Initializing enhanced sig-and-refs-timestamp...");
                yu61 yu61Var = new yu61(str3);
                yu61Var.setDigestAlgorithm(findDigestOidByDigestName);
                yu61Var.setProvider(str);
                yu61Var.setDoNotAddNode(true);
                yu61Var.setCertificateValues(this.signatureCertificates);
                yu61Var.setCRLs(this.signatureCRLs);
                List singletonList = Collections.singletonList(yu61Var);
                JCPLogger.subEnter();
                if (singletonList == null || singletonList.size() <= 0) {
                    treeMap.remove(cl_64.K);
                } else {
                    treeMap.put(cl_64.K, singletonList);
                }
                JCPLogger.subExit();
                JCPLogger.fine("Override signer certificate chain...");
                xAdESSignerXLT1Impl.o(build);
                xAdESSignerXLT1Impl.k(getSignerCertificate());
                Element signatureValue = getSignatureValue();
                String attribute = signatureValue.getAttribute("Id");
                qu61 a = XAdESType.a(this.c);
                JCPLogger.fineFormat("Encoding unsigned properties: {0}, {1}...", this.x, attribute);
                xAdESSignerXLT1Impl.j(a, this.x, signatureValue);
                xAdESSignerXLT1Impl.e(str, null);
                xAdESSignerXLT1Impl.h();
                xAdESSignerXLT1Impl.g();
                xAdESSignerXLT1Impl.A = this.A;
                xAdESSignerXLT1Impl.B = (SigAndRefsTimeStamp) ((lw61) xAdESSignerXLT1Impl.y).i().get(0);
                JCPLogger.fine("%%% Signer enhanced (T -> X Long Type 1) %%%");
                return xAdESSignerXLT1Impl;
            } catch (AdESException e2) {
                throw new XAdESException(e2, e2.getErrorCode());
            }
        } catch (AdESException e3) {
            throw new XAdESException(e3, e3.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerT
    public m8z0 getEarliestValidSignatureTimeStampToken() {
        SignatureTimeStamp signatureTimeStamp = this.A;
        if (signatureTimeStamp != null) {
            return signatureTimeStamp.getTimestampToken();
        }
        return null;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getInternalDate() {
        return (Date) this.A.getTimestampToken().c.b;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getPkupValidationDate() {
        return getInternalDate();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerT, ru.CryptoPro.AdES.external.signature.AdESTSignatureModel, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    public List<m8z0> getSignatureTimestampTokens() {
        return ((bv61) this.y).getSignatureTimestampTokens();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return XAdESParameters.XAdES_T;
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl
    public void i() {
        this.y = new bv61(this.c);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl
    public void j(qu61 qu61Var, String str, Element element) {
        JCPLogger.subEnter();
        for (cl_64 cl_64Var : cl_64.values()) {
            Object obj = this.z.get(cl_64Var);
            if (obj != null && cl_64.z.equals(cl_64Var)) {
                mw61 n = XAdESSignerBESImpl.n(qu61Var);
                n.getClass();
                int i = 0;
                for (SignatureTimeStamp signatureTimeStamp : (List) obj) {
                    if (signatureTimeStamp.doNotAddNode()) {
                        n.x.add(signatureTimeStamp.getElement());
                        JCPLogger.fine("Enhancement is executing. Skip adding timestamp. Continue.");
                    } else {
                        n.x.add(new kv61(n.C, n, signatureTimeStamp, i, str, element, n.b, n.c, n.w).e());
                        i++;
                    }
                }
            }
        }
        JCPLogger.subExit();
    }

    public final void o(List list) {
        this.signerCertificateChain.clear();
        this.signerCertificateChain.addAll(list);
    }

    public final void p(List list) {
        JCPLogger.subEnter();
        TreeMap treeMap = this.z;
        if (list == null || list.size() <= 0) {
            treeMap.remove(cl_64.z);
        } else {
            treeMap.put(cl_64.z, list);
        }
        JCPLogger.subExit();
    }

    public final void q() {
        JCPLogger.subEnter();
        JCPLogger.fine("Looking for a valid timestamp.");
        XMLTimeStampValidationException xMLTimeStampValidationException = new XMLTimeStampValidationException(IAdESException.ecTimestampInvalid);
        List<SignatureTimeStamp> list = (List) ((bv61) this.y).y.get(cl_64.z);
        for (SignatureTimeStamp signatureTimeStamp : list) {
            try {
                JCPLogger.fine("Verifying signature timestamp...");
                signatureTimeStamp.verify(this.signatureCertificates, this.signatureCRLs);
                JCPLogger.fine("Valid timestamp found!");
                this.A = signatureTimeStamp;
                return;
            } catch (AdESException e) {
                if (list.size() == 1) {
                    throw new XMLTimeStampValidationException(e, e.getErrorCode());
                }
                JCPLogger.thrown(e);
                xMLTimeStampValidationException.add(e);
            }
        }
        if (this.A == null) {
            JCPLogger.fine("No XAdES XML signature-timestamp has been found.");
            throw xMLTimeStampValidationException;
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws XAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        if (num != null && !num.equals(XAdESParameters.XAdES_T) && !num.equals(XAdESParameters.XAdES_BES)) {
            JCPLogger.infoFormat("Signature type '{0}' ignored, default signature type used.", XAdESType.getSignatureTypeName(num));
            num = null;
        }
        if (num == null) {
            num = getSignatureType();
        }
        Integer num2 = XAdESParameters.XAdES_BES;
        if (num.equals(num2)) {
            try {
                XAdESSignerBESImpl xAdESSignerBESImpl = new XAdESSignerBESImpl(this.c, num2);
                xAdESSignerBESImpl.h();
                xAdESSignerBESImpl.verify(set, set2);
            } catch (AdESException e) {
                throw new XAdESException(e, e.getErrorCode());
            }
        } else {
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            this.signatureCertificates.addAll(set);
            this.signatureCRLs.addAll(set2);
            this.A = null;
            q();
            super.verify(set, set2, null, z);
        }
        JCPLogger.fine("%%% Signer is verified %%%");
        JCPLogger.subExit();
    }

    public XAdESSignerTImpl(Element element) {
        this(element, XAdESParameters.XAdES_T);
    }

    @Override // ru.CryptoPro.XAdES.XAdESSignerBESImpl, ru.CryptoPro.XAdES.XAdESSignerBinaryImpl, ru.CryptoPro.XAdES.XAdESSigner, ru.CryptoPro.XAdES.interfaces.external.IXAdESSigner
    public XAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws XAdESException {
        return enhance(str, str2, list, null, str3, num);
    }
}
