package ru.CryptoPro.CAdES;

import defpackage.acs0;
import defpackage.b64;
import defpackage.erd0;
import defpackage.sx61;
import defpackage.wbs0;
import defpackage.xc3;
import defpackage.yv61;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.certificate.PKUPParameterValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CAdESSignerPKCS7Impl extends CAdESSignerRawImpl {
    public static final boolean A = GetProperty.getBooleanProperty("CMS_signature_algorithm_oid_check", true);
    public erd0 z;

    public CAdESSignerPKCS7Impl(acs0 acs0Var, Integer num) {
        super(acs0Var, num);
        this.z = null;
        i();
    }

    public static void g(String str, String str2) {
        if ((str.equals("1.2.643.7.1.1.3.2") || str.equals("1.2.643.7.1.1.3.3") || str.equals("1.2.643.2.2.19")) && A && !str.equals(str2)) {
            throw new CAdESException(b64.l("Public Key Algorithm OID mismatch:signer's SignatureAlgorithm value: ", str, "signature certificate algorithm oid: ", str2), IAdESException.ecAlgorithmMismatch);
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public void addCountersigner(acs0 acs0Var) throws CAdESException {
        throw new CAdESException("Unsupported method", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, Set<X509CRL> set, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        throw new CAdESException("Unsupported method", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.AdES.external.signature.AdESSigner
    public void findSignerCertificate(Collection collection, Collection collection2) {
        JCPLogger.subEnter();
        wbs0 wbs0Var = (wbs0) this.z.c;
        CertificateFinder certificateFinder = new CertificateFinder(collection, collection2);
        this.signerCertificateChain.clear();
        this.signerCertificateChain.add(certificateFinder.find(wbs0Var));
        JCPLogger.subExit();
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

    public void h() {
        ArrayList arrayList;
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding PKCS7 signature...");
        erd0 erd0Var = this.z;
        erd0Var.a = this.provider;
        if ((erd0Var instanceof sx61) && !((sx61) erd0Var).i()) {
            ((sx61) this.z).G = this.b;
        }
        this.z.decode();
        this.signatureCertificates.addAll(Collections.unmodifiableSet((HashSet) this.z.w));
        erd0 erd0Var2 = this.z;
        if (erd0Var2 instanceof sx61) {
            List unmodifiableList = Collections.unmodifiableList(((sx61) erd0Var2).D);
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
        this.z = new yv61(this.a);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2, Integer num, boolean z) throws CAdESException {
        Options options;
        JCPLogger.subEnter();
        JCPLogger.fine("Basic signature validating...");
        if (set == null) {
            set = Collections.EMPTY_SET;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(this.signatureCertificates);
        this.signatureCertificates.addAll(set);
        if (set2 == null) {
            set2 = Collections.EMPTY_SET;
        }
        this.signatureCRLs.addAll(set2);
        X509Certificate a = a(set, unmodifiableSet);
        g(this.a.getEncryptionAlgOID(), AlgorithmUtility.keyAlgToKeyAlgorithmOid(a.getPublicKey().getAlgorithm()));
        JCPLogger.fine("Verifying binary signature...");
        verifyCryptographicSignature(a, this.provider);
        try {
            this.signerCertificateChain.clear();
            this.signerCertificateChain.addAll(build(a, this.provider, getBuildingDate()));
            Integer signatureType = getSignatureType();
            Integer num2 = AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
            boolean z2 = true;
            boolean z3 = signatureType.equals(num2) && !AdESUtility.VALIDATE_TSP;
            boolean z4 = getSignatureType().equals(AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE) && !AdESUtility.VALIDATE_OTHER_TSP;
            if (!getSignatureType().equals(num2) || (options = this.options) == null || options.isEnableCertificateValidation()) {
                z2 = false;
            }
            if (!z3 && !z4 && !z2) {
                validate(this.signerCertificateChain, this.provider, getValidationDate());
                JCPLogger.fine("%%% Basic signature validating completed %%%");
                JCPLogger.subExit();
            }
            JCPLogger.fine("ignoreSignatureTimestamp = " + z3 + ", ignoreOtherTimestamp = " + z4 + ", ignoreIfCertificateValidationDisabled = " + z2);
            JCPLogger.fine("Warning! Validating of the signer certificate chain of the timestamp has been disabled!");
            new PKUPParameterValidatorImpl(getPkupValidationDate(), null).validate((PKUPParameterValidatorImpl) this.signerCertificateChain.get(0));
            JCPLogger.fine("%%% Basic signature validating completed %%%");
            JCPLogger.subExit();
        } catch (AdESException e) {
            throw new CAdESException(e, e.getErrorCode());
        }
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num, xc3 xc3Var) throws CAdESException {
        return enhance(str, str2, list, null, str3, num, null);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner
    public CAdESSigner enhance(String str, String str2, List<X509Certificate> list, String str3, Integer num) throws CAdESException {
        return enhance(str, str2, list, str3, num, (xc3) null);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES, ru.CryptoPro.CAdES.CAdESSignerT, ru.CryptoPro.CAdES.CAdESSignerXLT1
    public void verify(Set<X509Certificate> set, Set<X509CRL> set2) throws CAdESException {
        JCPLogger.subEnter();
        verify(set, set2, (Integer) null, true);
        JCPLogger.subExit();
    }
}
