package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.b490;
import defpackage.g8e;
import defpackage.m8z0;
import defpackage.rw61;
import defpackage.sw61;
import defpackage.u2;
import defpackage.vc3;
import defpackage.xc3;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.timestamp.TSPTimeStampValidatorImpl;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESCMSAttributeTableGenerationException;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.exception.TimeStampValidationException;
import ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampValidationProcessImpl;
import ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerTImpl extends CAdESSignerBESImpl implements CAdESSignerT {
    public m8z0 C;

    public CAdESSignerTImpl(acs0 acs0Var, Integer num, boolean z) {
        super(acs0Var, num, z);
        this.C = null;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num, xc3 xc3Var) throws CAdESException {
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
            X509Certificate a = a(list, unmodifiableSet);
            String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(str2, str, a.getPublicKey());
            if (checkAndGetDigestAlgorithm == null) {
                throw new CAdESException(g8e.o("Digest algorithm has not been found or is not supported by provider ", str), IAdESException.ecInternal);
            }
            JCPLogger.fine("Enhancing digest algorithm: ".concat(checkAndGetDigestAlgorithm));
            JCPLogger.fine("Looking for an earliest valid signature-timestamp...");
            if (this.C == null) {
                o();
            }
            try {
                List<X509Certificate> build = this.B ? this.signerCertificateChain : build(a, str, null);
                JCPLogger.fine("Initiating attribute table (T -> " + CAdESType.getSignatureTypeName(num) + ")...");
                n(num, checkAndGetDigestAlgorithm);
                sw61 j = j(build, str, checkAndGetDigestAlgorithm, str3, num, xc3Var, getSignatureTimestampTokens(), null, null, null);
                JCPLogger.fine("Generating attributes...");
                xc3 b = j.b(k());
                JCPLogger.fine("Replacing attributes...");
                CAdESSigner.replaceUnsignedAttributes(this, b);
                CAdESSignerTImpl l = l(j);
                JCPLogger.fine("%%% Signer has been enhanced %%%");
                if (l instanceof CAdESSignerAImpl) {
                    ((CAdESSignerAImpl) l).verify();
                }
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

    @Override // ru.CryptoPro.CAdES.CAdESSignerT
    public m8z0 getEarliestValidSignatureTimeStampToken() {
        return this.C;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public Date getInternalDate() {
        return (Date) this.C.c.b;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getPkupValidationDate() {
        return getInternalDate();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public m8z0 getSignatureTimestampToken() {
        return getEarliestValidSignatureTimeStampToken();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    @Deprecated
    public Collection<m8z0> getSignatureTimestampTokenList() {
        return getSignatureTimestampTokens();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.AdES.external.signature.AdESTSignatureModel, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    public List<m8z0> getSignatureTimestampTokens() {
        return Collections.unmodifiableList(((rw61) this.z).y);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return CAdESParameters.CAdES_T;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl
    public void i() {
        this.z = new rw61(this.a);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl
    public Map k() {
        JCPLogger.fine("Preparing attribute parameters (T -> X Long Type 1)...");
        xc3 unsignedAttributes = this.a.getUnsignedAttributes();
        u2 u2Var = b490.J3;
        Vector<vc3> attributes = CAdESUtility.getAttributes(unsignedAttributes, u2Var);
        if (attributes.size() > 1) {
            throw new CAdESException("Could not enhance signature with more than one signature-timestamp", IAdESException.ecUnexpectedTimestampCount);
        }
        vc3 vc3Var = attributes.get(0);
        Map k = super.k();
        HashMap hashMap = (HashMap) k;
        hashMap.put(u2Var, vc3Var);
        JCPLogger.fine("Adding freshest valid signature-timestamp (T -> X Long Type 1)...");
        hashMap.put("FreshestValidInternalTimeStamp", this.C);
        return k;
    }

    public final void o() {
        JCPLogger.subEnter();
        JCPLogger.fine("Looking for a valid timestamp...");
        TimeStampValidationException timeStampValidationException = new TimeStampValidationException(IAdESException.ecTimestampInvalid);
        TSPSignatureDataImpl tSPSignatureDataImpl = new TSPSignatureDataImpl(this.a.getSignature());
        tSPSignatureDataImpl.setProvider(this.provider);
        List<m8z0> unmodifiableList = Collections.unmodifiableList(((rw61) this.z).y);
        for (m8z0 m8z0Var : unmodifiableList) {
            TSPTimeStampValidatorImpl tSPTimeStampValidatorImpl = new TSPTimeStampValidatorImpl();
            try {
                InternalTimeStampValidationProcessImpl internalTimeStampValidationProcessImpl = new InternalTimeStampValidationProcessImpl(tSPSignatureDataImpl, m8z0Var);
                internalTimeStampValidationProcessImpl.setCertificateValues(this.signatureCertificates);
                internalTimeStampValidationProcessImpl.setCRLs(this.signatureCRLs);
                internalTimeStampValidationProcessImpl.setOptions(this.options);
                tSPTimeStampValidatorImpl.validate((TSPTimeStampValidationProcess) internalTimeStampValidationProcessImpl);
                JCPLogger.fine("Valid timestamp has been found!");
                this.C = m8z0Var;
                return;
            } catch (AdESException e) {
                if (unmodifiableList.size() == 1) {
                    throw new TimeStampValidationException(e, e.getErrorCode());
                }
                JCPLogger.thrown(e);
                timeStampValidationException.add(e);
            }
        }
        if (this.C == null) {
            JCPLogger.fine("No signature-timestamp has been found.");
            throw timeStampValidationException;
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying signer... %%%");
        if (num != null && !num.equals(CAdESParameters.CAdES_T) && !num.equals(CAdESParameters.CAdES_BES)) {
            JCPLogger.infoFormat("Signature type '{0}' ignored, default signature type used.", CAdESType.getSignatureTypeName(num));
            num = null;
        }
        if (num == null) {
            num = getSignatureType();
        }
        if (num.equals(CAdESParameters.CAdES_BES)) {
            try {
                CAdESSignerBESImpl cAdESSignerBESImpl = new CAdESSignerBESImpl(getSignerInfo());
                cAdESSignerBESImpl.setProvider(this.provider);
                cAdESSignerBESImpl.h();
                cAdESSignerBESImpl.verify(set, set2);
            } catch (AdESException e) {
                throw new CAdESException(e, e.getErrorCode());
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
            this.C = null;
            o();
            super.verify(set, set2, (Integer) null, z);
        }
        JCPLogger.fine("%%% Signer has been verified %%%");
        JCPLogger.subExit();
    }

    public CAdESSignerTImpl(acs0 acs0Var, boolean z) {
        this(acs0Var, CAdESParameters.CAdES_T, z);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        return enhance(str, str2, list, null, str3, num, xc3Var);
    }
}
