package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.b490;
import defpackage.cr80;
import defpackage.dqf;
import defpackage.g8e;
import defpackage.m8z0;
import defpackage.p4x0;
import defpackage.rw61;
import defpackage.rza1;
import defpackage.sw61;
import defpackage.sx61;
import defpackage.tbf;
import defpackage.u2;
import defpackage.ut61;
import defpackage.v2k0;
import defpackage.vc3;
import defpackage.xc3;
import defpackage.zxs0;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.PKUPParameterValidatorImpl;
import ru.CryptoPro.AdES.evidence.RevocationValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.exception.TimeStampValidationException;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.EnhancedInternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.ExternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPAttributeDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TimeStampData;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerXLT1Impl extends CAdESSignerTImpl implements CAdESSignerXLT1 {
    public TimeStampData D;
    public final Hashtable E;

    public CAdESSignerXLT1Impl(acs0 acs0Var, Integer num, boolean z) {
        super(acs0Var, num, z);
        this.D = null;
        this.E = new Hashtable();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        JCPLogger.fine("%%% Enhancing signer (XLT1 or A)... %%%");
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
            String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(str2, str, a(list, unmodifiableSet).getPublicKey());
            if (checkAndGetDigestAlgorithm == null) {
                throw new CAdESException(g8e.o("Digest algorithm has not been found or is not supported by provider ", str), IAdESException.ecInternal);
            }
            JCPLogger.fine("Enhancing digest algorithm: ".concat(checkAndGetDigestAlgorithm));
            String digestAlgToDigestOid = AlgorithmUtility.digestAlgToDigestOid(checkAndGetDigestAlgorithm);
            boolean n = n(num, digestAlgToDigestOid);
            try {
                if (!this.B) {
                    verify();
                }
                JCPLogger.fine("Initiating attribute table (XLT1 or A -> " + CAdESType.getSignatureTypeName(num) + ")...");
                p(digestAlgToDigestOid, str, n ^ true);
                byte[] bArr = (byte[]) this.E.get(digestAlgToDigestOid);
                if (bArr == null) {
                    throw new CAdESException("No data hash found", IAdESException.ecCAdESAEnhancingFailure);
                }
                sw61 j = j(this.signerCertificateChain, str, digestAlgToDigestOid, str3, num, xc3Var, getSignatureTimestampTokens(), bArr, this.archiveSignatureCertificateToBeHashedStore, this.archiveSignatureValidationDataToBeHashedStore);
                JCPLogger.fine("Generating attributes...");
                xc3 b = j.b(k());
                JCPLogger.fine("Replacing attributes...");
                CAdESSigner.replaceUnsignedAttributes(this, b);
                CAdESSignerTImpl l = l(j);
                JCPLogger.fine("%%% Signer has been enhanced %%%");
                ((CAdESSignerAImpl) l).verify();
                return l;
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
            } catch (CAdESCMSAttributeTableGenerationException e2) {
                throw new CAdESException(e2, e2.getErrorCode());
            }
        } catch (AdESException e3) {
            throw new CAdESException(e3, e3.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getBuildingDate() {
        return getExternalDate();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public m8z0 getCAdESCTimestampToken() {
        return getEarliestValidCAdESCTimeStampToken();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public Collection<m8z0> getCAdESCTimestampTokenList() {
        return getCAdESCTimestampTokens();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1, ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel
    public List<m8z0> getCAdESCTimestampTokens() {
        return Collections.unmodifiableList(((sx61) this.z).F);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1, ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<X509Certificate> getCertificateValues() {
        return Collections.unmodifiableList(((sx61) this.z).D);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1, ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<cr80> getCompleteCertificateReferences() {
        return Collections.unmodifiableList(((sx61) this.z).B);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1, ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<tbf> getCompleteRevocationReferences() {
        return Collections.unmodifiableList(((sx61) this.z).C);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1
    public m8z0 getEarliestValidCAdESCTimeStampToken() {
        return this.D.getTimeStampToken();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getExternalDate() {
        return (Date) this.D.getTimeStampToken().c.b;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1, ru.CryptoPro.AdES.external.signature.AdESXLT1SignatureModel, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public v2k0 getRevocationValues() {
        return ((sx61) this.z).E;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return CAdESParameters.CAdES_X_Long_Type_1;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getValidationDate() {
        return getExternalDate();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl
    public void i() {
        this.z = new sx61(this.a);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public Map k() {
        JCPLogger.fine("Preparing attribute parameters (XLT1 -> A)...");
        if (this.C == null || this.D == null) {
            t();
        }
        Map k = super.k();
        JCPLogger.fine("Adding CAdES-C-timestamp attribute to parameters (XLT1 -> A)...");
        xc3 unsignedAttributes = this.a.getUnsignedAttributes();
        u2 u2Var = b490.P3;
        Vector<vc3> attributes = CAdESUtility.getAttributes(unsignedAttributes, u2Var);
        if (attributes.size() > 1) {
            throw new CAdESException("Could not enhance signature with more than one cAdES-C-timestamp", IAdESException.ecUnexpectedTimestampCount);
        }
        HashMap hashMap = (HashMap) k;
        hashMap.put(u2Var, attributes.get(0));
        hashMap.put("ExternalTimeStamp", this.D);
        JCPLogger.fine("Adding certificateRefs attribute to parameters (XLT1 -> A)...");
        xc3 unsignedAttributes2 = this.a.getUnsignedAttributes();
        u2 u2Var2 = b490.K3;
        hashMap.put(u2Var2, CAdESUtility.getSingleAttribute(unsignedAttributes2, u2Var2));
        JCPLogger.fine("Adding revocationRefs attribute to parameters (XLT1 -> A)...");
        xc3 unsignedAttributes3 = this.a.getUnsignedAttributes();
        u2 u2Var3 = b490.L3;
        hashMap.put(u2Var3, CAdESUtility.getSingleAttribute(unsignedAttributes3, u2Var3));
        JCPLogger.fine("Adding certificateValues attribute to parameters (XLT1 -> A)...");
        xc3 unsignedAttributes4 = this.a.getUnsignedAttributes();
        u2 u2Var4 = b490.M3;
        hashMap.put(u2Var4, CAdESUtility.getSingleAttribute(unsignedAttributes4, u2Var4));
        JCPLogger.fine("Adding revocationValues attribute to parameters (XLT1 -> A)...");
        xc3 unsignedAttributes5 = this.a.getUnsignedAttributes();
        u2 u2Var5 = b490.O3;
        hashMap.put(u2Var5, CAdESUtility.getSingleAttribute(unsignedAttributes5, u2Var5));
        return k;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public final boolean n(Integer num, String str) {
        JCPLogger.fine("Checking if the same digest algorithm is used for message-digest and archive-timestamp(s)...");
        String digestAlgOID = this.a.getDigestAlgOID();
        boolean equals = digestAlgOID.equals(str);
        if (getSignatureType().equals(CAdESParameters.CAdES_A)) {
            List j = ((ut61) this.z).j();
            for (int i = 0; i < j.size(); i++) {
                equals &= digestAlgOID.equals(((p4x0) ((m8z0) j.get(i)).c.a).c.a.a.a);
            }
        }
        if (!equals && this.x == null) {
            throw new CAdESException("Signature can not be enhanced. Signer digest algorithm and digest algorithms in archive timestamps are not identical. Only detached signature with different digest algorithms are supported.", IAdESException.ecCAdESANoIdenticDigAlgFailure);
        }
        JCPLogger.fine("Same digest algorithm used: " + equals);
        return equals;
    }

    public final void p(String str, String str2, boolean z) {
        JCPLogger.subEnter();
        try {
            String digestAlgOID = this.a.getDigestAlgOID();
            byte[] contentDigest = this.a.getContentDigest();
            Hashtable hashtable = this.E;
            if (z) {
                JCPLogger.fine("Need update digest table...");
                Hashtable hashtable2 = new Hashtable();
                hashtable.put(digestAlgOID, contentDigest);
                if (str != null && !hashtable.containsKey(str)) {
                    hashtable2.put(str, MessageDigest.getInstance(str, str2));
                }
                if (getSignatureType().equals(CAdESParameters.CAdES_A)) {
                    JCPLogger.fine("Collecting archive-timestamp digest algorithms...");
                    List j = ((ut61) this.z).j();
                    for (int i = 0; i < j.size(); i++) {
                        String str3 = ((p4x0) ((m8z0) j.get(i)).c.a).c.a.a.a;
                        if (!hashtable.containsKey(str3)) {
                            hashtable2.put(str3, MessageDigest.getInstance(str3, str2));
                        }
                    }
                }
                if (!hashtable2.isEmpty()) {
                    JCPLogger.fine("Digesting data...");
                    if (this.w) {
                        throw new CAdESException("Digest cannot be recalculated because the signed data is being required but raw digest has been set.", IAdESException.ecGetMessageDigestFailure);
                    }
                    Collection values = hashtable2.values();
                    if (this.x.markSupported()) {
                        this.x.reset();
                    }
                    byte[] bArr = new byte[32768];
                    while (true) {
                        int read = this.x.read(bArr, 0, 32768);
                        if (read <= 0) {
                            break;
                        }
                        Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((MessageDigest) it.next()).update(bArr, 0, read);
                        }
                    }
                    Enumeration keys = hashtable2.keys();
                    while (keys.hasMoreElements()) {
                        String str4 = (String) keys.nextElement();
                        hashtable.put(str4, ((MessageDigest) hashtable2.get(str4)).digest());
                    }
                }
            } else {
                JCPLogger.fine("Using the same signer digest...");
                vc3 singleAttribute = CAdESUtility.getSingleAttribute(getSignerSignedAttributes(), b490.u3);
                if (singleAttribute == null) {
                    throw new CAdESException("message-digest attribute not found", IAdESException.ecGetMessageDigestFailure);
                }
                dqf dqfVar = (dqf) singleAttribute.b.a[0];
                JCPLogger.fine("Checking content digests...");
                if (!Array.compare(contentDigest, dqfVar.a)) {
                    throw new CAdESException("message-digest is invalid", IAdESException.ecGetMessageDigestFailure);
                }
                hashtable.put(digestAlgOID, contentDigest);
            }
            JCPLogger.subExit();
        } catch (IOException e) {
            throw new CAdESException(e, IAdESException.ecGetMessageDigestFailure);
        } catch (NoSuchAlgorithmException e2) {
            throw new CAdESException(e2, IAdESException.ecGetMessageDigestFailure);
        } catch (NoSuchProviderException e3) {
            throw new CAdESException(e3, IAdESException.ecGetMessageDigestFailure);
        }
    }

    public final void q(Set set, Set set2, Integer num, boolean z, boolean z2) {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        if (num != null && !num.equals(CAdESParameters.CAdES_X_Long_Type_1) && !num.equals(CAdESParameters.CAdES_T) && !num.equals(CAdESParameters.CAdES_BES)) {
            JCPLogger.infoFormat("Signature type '{0}' ignored, default signature type used.", CAdESType.getSignatureTypeName(num));
            num = null;
        }
        if (num == null) {
            num = getSignatureType();
        }
        if (num.equals(CAdESParameters.CAdES_T) || num.equals(CAdESParameters.CAdES_BES)) {
            try {
                CAdESSignerPKCS7Impl a = CAdESSignerFactory.a(getSignerInfo(), num);
                a.setOptions(this.options);
                a.setProvider(this.provider);
                a.h();
                a.verify(set, set2);
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
            }
        } else {
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
            this.signatureCertificates.addAll(set);
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            this.signatureCRLs.addAll(set2);
            X509Certificate a2 = a(set, unmodifiableSet);
            CAdESSignerPKCS7Impl.g(this.a.getEncryptionAlgOID(), AlgorithmUtility.keyAlgToKeyAlgorithmOid(a2.getPublicKey().getAlgorithm()));
            if (!z2) {
                JCPLogger.fine("Verifying binary signature...");
                verifyCryptographicSignature(a2, this.provider);
            }
            Integer signatureType = getSignatureType();
            Integer num2 = CAdESParameters.CAdES_X_Long_Type_1;
            if (signatureType.equals(num2) || getSignatureType().equals(CAdESParameters.CAdES_A)) {
                t();
            }
            this.signerCertificateChain.clear();
            try {
                JCPLogger.fine("Validating signer certificate chain...");
                Date externalDate = getExternalDate();
                JCPLogger.fine("Building date: " + externalDate);
                this.signerCertificateChain.addAll(build(a2, this.provider, externalDate));
                JCPLogger.fine("Validating signer certificate chain...");
                ComplexCertificateChainValidatorImpl complexCertificateChainValidatorImpl = new ComplexCertificateChainValidatorImpl();
                complexCertificateChainValidatorImpl.setValidationDate(getExternalDate());
                complexCertificateChainValidatorImpl.setProvider(this.provider);
                boolean z3 = getSignatureType().equals(num2) || getSignatureType().equals(CAdESParameters.CAdES_A);
                complexCertificateChainValidatorImpl.setCertificateRole((getSignatureType().equals(AdESParameters.TSA_SIGNATURE_TIME_STAMP) || getSignatureType().equals(AdESParameters.TSA_CAdESC_TIME_STAMP) || getSignatureType().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) ? CertificateItem.CertificateRole.TSPSigner : CertificateItem.CertificateRole.Signer);
                complexCertificateChainValidatorImpl.setSignerMustHaveOcspEvidence(z3);
                complexCertificateChainValidatorImpl.setCompleteCertificateReferences(getCompleteCertificateReferences());
                complexCertificateChainValidatorImpl.setCompleteRevocationReferences(getCompleteRevocationReferences());
                complexCertificateChainValidatorImpl.setRevocationValues(getRevocationValues());
                Options options = this.options;
                if (options != null) {
                    complexCertificateChainValidatorImpl.setEnableRevocationReferenceSearchByRevocationValue(options.isEnableRevocationReferenceSearchByRevocationValue());
                }
                HashSet hashSet = new HashSet(this.signerCertificateChain);
                hashSet.remove(this.signerCertificateChain.get(0));
                try {
                    complexCertificateChainValidatorImpl.validate(this.signerCertificateChain, Collections.singletonList(new PKUPParameterValidatorImpl(getInternalDate(), hashSet)));
                    JCPLogger.fine("Validating evidences and its certificate chains...");
                    RevocationValidatorImpl revocationValidatorImpl = new RevocationValidatorImpl();
                    revocationValidatorImpl.setProvider(this.provider);
                    revocationValidatorImpl.setValidationDate(getExternalDate());
                    revocationValidatorImpl.setInternalDate(getInternalDate());
                    revocationValidatorImpl.setExternalDate(getExternalDate());
                    revocationValidatorImpl.setOptions(this.options);
                    if (getSignatureType().equals(AdESParameters.TSA_ARCHIVE_TIME_STAMP)) {
                        revocationValidatorImpl.setIgnoreEvidenceTime(true);
                    }
                    revocationValidatorImpl.setCompleteCertificateReferences(getCompleteCertificateReferences());
                    revocationValidatorImpl.setCompleteRevocationReferences(getCompleteRevocationReferences());
                    revocationValidatorImpl.setCertificateValues(new HashSet(getCertificateValues()));
                    revocationValidatorImpl.setCertificateValues(this.signatureCertificates);
                    revocationValidatorImpl.setRevocationValues(getRevocationValues());
                    try {
                        revocationValidatorImpl.validate((Object) null);
                        JCPLogger.fine("Validating the signature identifier...");
                        AdESUtility.compareSID2SigningCertificate(this.a.getSID(), (cr80) this.z.c);
                        if (getSignatureType().equals(num2) || getSignatureType().equals(CAdESParameters.CAdES_A)) {
                            m(set, set2, z);
                        }
                    } catch (AdESException e2) {
                        throw new CAdESException(e2, e2.getErrorCode());
                    }
                } catch (AdESException e3) {
                    throw new CAdESException(e3, e3.getErrorCode());
                }
            } catch (AdESException e4) {
                throw new CAdESException(e4, e4.getErrorCode());
            }
        }
        JCPLogger.fine("%%% Signer has been verified %%%");
        JCPLogger.subExit();
    }

    public Date r() {
        return null;
    }

    public void s() {
    }

    public final void t() {
        m8z0 convertAttributeValueToTimestampToken;
        EnhancedInternalTimeStampValidationProcessImpl enhancedInternalTimeStampValidationProcessImpl;
        JCPLogger.subEnter();
        JCPLogger.fine("Looking for a valid signature-timestamp and CAdES-C-timestamp...");
        TimeStampValidationException timeStampValidationException = new TimeStampValidationException(IAdESException.ecTimestampInvalid);
        JCPLogger.fine("Preparing timestamps' attributes...");
        byte[] signature = this.a.getSignature();
        Vector<vc3> attributes = CAdESUtility.getAttributes(this.a.getUnsignedAttributes(), b490.J3);
        Collections.sort(attributes, rw61.A);
        vc3 singleAttribute = CAdESUtility.getSingleAttribute(this.a.getUnsignedAttributes(), b490.K3);
        vc3 singleAttribute2 = CAdESUtility.getSingleAttribute(this.a.getUnsignedAttributes(), b490.L3);
        JCPLogger.fine("Reading timestamps and validating...");
        List<m8z0> unmodifiableList = Collections.unmodifiableList(((sx61) this.z).F);
        for (m8z0 m8z0Var : unmodifiableList) {
            JCPLogger.fine("Selecting valid signature-timestamps...");
            Vector vector = new Vector();
            Iterator<vc3> it = attributes.iterator();
            while (it.hasNext()) {
                vc3 next = it.next();
                try {
                    m8z0 convertAttributeValueToTimestampToken2 = CAdESUtility.convertAttributeValueToTimestampToken(next);
                    Date date = (Date) m8z0Var.c.b;
                    if (((Date) convertAttributeValueToTimestampToken2.c.b).after(date)) {
                        JCPLogger.fine("No valid signature-timestamp found before CAdES-C-timestamp " + date + ". Trying to find another signature-timestamp...");
                    } else {
                        vector.add(next);
                    }
                } catch (Exception e) {
                    JCPLogger.subThrown(e);
                }
            }
            JCPLogger.fine("Found valid signature-timestamp count: " + vector.size());
            zxs0 zxs0Var = m8z0Var.c;
            Date date2 = (Date) zxs0Var.b;
            if (vector.isEmpty()) {
                JCPLogger.fine("No one valid signature-timestamp has been found before " + date2 + ". Trying to find another one using next CAdES-C-timestamp if it exists...");
            } else {
                JCPLogger.fine("Combining attribute set for CAdES-C-timestamp...");
                int size = vector.size();
                vc3[] vc3VarArr = new vc3[size + 2];
                Vector<vc3> vector2 = attributes;
                System.arraycopy((vc3[]) vector.toArray(new vc3[size]), 0, vc3VarArr, 0, size);
                vc3VarArr[size] = singleAttribute;
                vc3VarArr[size + 1] = singleAttribute2;
                JCPLogger.fine("Validating CAdES-C-timestamp imprint...");
                String str = zxs0Var.p().a;
                TSPAttributeDataImpl tSPAttributeDataImpl = new TSPAttributeDataImpl(signature, vc3VarArr);
                tSPAttributeDataImpl.setDigestAlgorithm(str);
                tSPAttributeDataImpl.setProvider(this.provider);
                try {
                    tSPAttributeDataImpl.validateImprint(rza1.b(((p4x0) zxs0Var.a).c.b));
                    boolean isTimeStampEnhanced = CAdESType.isTimeStampEnhanced(m8z0Var);
                    Iterator it2 = vector.iterator();
                    while (it2.hasNext()) {
                        try {
                            convertAttributeValueToTimestampToken = CAdESUtility.convertAttributeValueToTimestampToken((vc3) it2.next());
                            JCPLogger.fine("Validating signature-timestamp...");
                            String str2 = convertAttributeValueToTimestampToken.c.p().a;
                            TSPSignatureDataImpl tSPSignatureDataImpl = new TSPSignatureDataImpl(signature);
                            tSPSignatureDataImpl.setDigestAlgorithm(str2);
                            tSPSignatureDataImpl.setProvider(this.provider);
                            enhancedInternalTimeStampValidationProcessImpl = new EnhancedInternalTimeStampValidationProcessImpl(tSPSignatureDataImpl, convertAttributeValueToTimestampToken);
                            enhancedInternalTimeStampValidationProcessImpl.setExternalDate(date2);
                            enhancedInternalTimeStampValidationProcessImpl.setParentalDecoder((AdESXLongType1AttributeDecoder) this.z);
                            enhancedInternalTimeStampValidationProcessImpl.setCertificateValues(this.signatureCertificates);
                            enhancedInternalTimeStampValidationProcessImpl.setCRLs(this.signatureCRLs);
                            enhancedInternalTimeStampValidationProcessImpl.setOptions(this.options);
                        } catch (Exception e2) {
                            if (unmodifiableList.size() == 1 && vector.size() == 1) {
                                throw new TimeStampValidationException(e2, IAdESException.ecTimestampInvalid);
                            }
                            JCPLogger.thrown(e2);
                            timeStampValidationException.add(new TimeStampValidationException(e2, IAdESException.ecTimestampInvalid));
                        }
                        try {
                            new TSPTimeStampValidatorImpl().validate((TSPTimeStampValidationProcess) enhancedInternalTimeStampValidationProcessImpl);
                            Set<X509Certificate> certificateValues = enhancedInternalTimeStampValidationProcessImpl.getCertificateValues();
                            try {
                                JCPLogger.fine("Validating CAdES-C-timestamp, is enhanced = " + isTimeStampEnhanced + "...");
                                TSPTimeStampValidationProcess enhancedExternalTimeStampValidationProcessImpl = isTimeStampEnhanced ? new EnhancedExternalTimeStampValidationProcessImpl(tSPAttributeDataImpl, m8z0Var) : new ExternalTimeStampValidationProcessImpl(tSPAttributeDataImpl, m8z0Var);
                                enhancedExternalTimeStampValidationProcessImpl.setCertificateValues(this.signatureCertificates);
                                enhancedExternalTimeStampValidationProcessImpl.setCertificateValues(certificateValues);
                                enhancedExternalTimeStampValidationProcessImpl.setExternalDate(r());
                                enhancedExternalTimeStampValidationProcessImpl.setCRLs(this.signatureCRLs);
                                enhancedExternalTimeStampValidationProcessImpl.setOptions(this.options);
                                new TSPTimeStampValidatorImpl().validate(enhancedExternalTimeStampValidationProcessImpl);
                                this.C = convertAttributeValueToTimestampToken;
                                this.D = new TimeStampData(m8z0Var, tSPAttributeDataImpl);
                                s();
                                JCPLogger.fine("Signature-timestamp and CAdES-C-timestamp have been found!");
                                return;
                            } catch (AdESException e3) {
                                e = e3;
                                if (unmodifiableList.size() == 1) {
                                    throw new TimeStampValidationException(e, e.getErrorCode());
                                }
                                JCPLogger.thrown(e);
                                timeStampValidationException.add(e);
                                attributes = vector2;
                            }
                        } catch (AdESException e4) {
                            if (unmodifiableList.size() == 1 && vector.size() == 1) {
                                throw new TimeStampValidationException(e4, e4.getErrorCode());
                            }
                            JCPLogger.thrown(e4);
                            timeStampValidationException.add(e4);
                        }
                    }
                } catch (AdESException e5) {
                    e = e5;
                    if (unmodifiableList.size() == 1) {
                        throw new TimeStampValidationException(e, e.getErrorCode());
                    }
                }
                attributes = vector2;
            }
        }
        if (this.C == null || this.D == null) {
            JCPLogger.fine("Neither signature-timestamp and nor CAdES-C-timestamp has been found.");
            throw timeStampValidationException;
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException {
        JCPLogger.subEnter();
        q(set, set2, num, z, false);
        JCPLogger.subExit();
    }

    public CAdESSignerXLT1Impl(acs0 acs0Var, boolean z) {
        this(acs0Var, CAdESParameters.CAdES_X_Long_Type_1, z);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws CAdESException {
        JCPLogger.subEnter();
        verify(set, set2, (Integer) null, true);
        JCPLogger.subExit();
    }

    public void verify() throws CAdESException {
        JCPLogger.subEnter();
        verify(null, null);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        return enhance(str, str2, list, null, str3, num, xc3Var);
    }
}
