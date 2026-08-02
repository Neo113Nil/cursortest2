package ru.CryptoPro.AdES.external.signature;

import defpackage.ncc;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.AdESConfig;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl;
import ru.CryptoPro.AdES.certificate.DateParameterValidatorImpl;
import ru.CryptoPro.AdES.certificate.PKUPParameterValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.interfaces.IAdESSigner;
import ru.CryptoPro.AdES.tools.ProviderUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;

/* loaded from: classes4.dex */
public abstract class AdESSigner implements AdESParameters, SignatureOptions, IAdESSigner, ProviderUtility {
    public static final String PROVIDER = AdESConfig.getDefaultDigestSignatureProvider();
    protected static final List<Integer> createdSignatureTypes;
    protected static final List<Integer> enhancedSignatureTypes;
    protected static final List<Integer> verifiedSignatureTypes;
    protected final List<X509Certificate> signerCertificateChain = new LinkedList();
    protected final Set<X509Certificate> signatureCertificates = new HashSet();
    protected final Set<X509CRL> signatureCRLs = new HashSet();
    protected ncc archiveSignatureCertificateToBeHashedStore = null;
    protected ncc archiveSignatureValidationDataToBeHashedStore = null;
    protected String provider = PROVIDER;
    protected Options options = null;

    static {
        ArrayList arrayList = new ArrayList();
        verifiedSignatureTypes = arrayList;
        ArrayList arrayList2 = new ArrayList();
        createdSignatureTypes = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        enhancedSignatureTypes = arrayList3;
        Integer num = AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE;
        arrayList2.add(num);
        Integer num2 = AdESParameters.TSA_CAdESC_TIME_STAMP;
        arrayList2.add(num2);
        Integer num3 = AdESParameters.TSA_SIGNATURE_TIME_STAMP;
        arrayList2.add(num3);
        Integer num4 = AdESParameters.TSA_SIGNATURE_TIME_STAMP_SIMPLE;
        arrayList2.add(num4);
        Integer num5 = AdESParameters.TSA_ARCHIVE_TIME_STAMP;
        arrayList2.add(num5);
        Integer num6 = AdESParameters.TSA_ARCHIVE_TIME_STAMP_SIMPLE;
        arrayList2.add(num6);
        Integer num7 = AdESParameters._AdES_BES;
        arrayList2.add(num7);
        Integer num8 = AdESParameters._AdES_T;
        arrayList2.add(num8);
        Integer num9 = AdESParameters._AdES_X_Long_Type_1;
        arrayList2.add(num9);
        Integer num10 = AdESParameters._AdES_A;
        arrayList2.add(num10);
        arrayList.add(num);
        arrayList.add(num2);
        arrayList.add(num3);
        arrayList.add(num4);
        arrayList.add(num5);
        arrayList.add(num6);
        arrayList.add(num7);
        arrayList.add(num8);
        arrayList.add(num9);
        arrayList.add(num10);
        arrayList.add(AdESParameters._SIMPLE);
        arrayList3.add(num8);
        arrayList3.add(num9);
        arrayList3.add(num10);
        arrayList3.add(num3);
        arrayList3.add(num2);
        arrayList3.add(num5);
    }

    public AdESSigner() {
        SelfTester_Auxiliary.checkClass(AdESSigner.class);
    }

    public static List<Integer> CREATED_SIGNATURE_TYPES() {
        return Collections.unmodifiableList(createdSignatureTypes);
    }

    public List<X509Certificate> build(X509Certificate x509Certificate, String str, Date date) throws AdESException {
        JCPLogger.fine("Building signer certificate chain...");
        new DateParameterValidatorImpl(date).validate(x509Certificate);
        new DateParameterValidatorImpl(getPkupValidationDate()).validate(x509Certificate);
        CertificateChainBuilderImpl certificateChainBuilderImpl = new CertificateChainBuilderImpl();
        certificateChainBuilderImpl.setProvider(str);
        certificateChainBuilderImpl.setValidationDate(date);
        certificateChainBuilderImpl.setCertificateValues(this.signatureCertificates);
        certificateChainBuilderImpl.build(x509Certificate);
        return certificateChainBuilderImpl.getCertificateChain();
    }

    public void checkIfCanEnhance(Integer num) throws AdESException {
        JCPLogger.subEnter();
        Integer signatureType = getSignatureType();
        Integer num2 = AdESParameters._AdES_A;
        if (signatureType.equals(num2) && !num.equals(num2)) {
            throw new AdESException("The signature has type *AdES-A. Only this type should be used for enhancing", IAdESException.ecSignatureUnsupported);
        }
        if (num.equals(getSignatureType()) && !getSignatureType().equals(num2)) {
            throw new AdESException("The signature already has expected type", IAdESException.ecSignatureUnsupported);
        }
        if (!enhancedSignatureTypes.contains(num)) {
            throw new AdESException("The signature must be enhanced to the type *AdES-T or *AdES-X Long Type 1 only", IAdESException.ecSignatureUnsupported);
        }
        JCPLogger.subExit();
    }

    public abstract void findSignerCertificate(Collection<X509Certificate> collection, Collection<X509Certificate> collection2) throws AdESException;

    public abstract Date getBuildingDate();

    public abstract Date getExternalDate();

    public abstract Date getInternalDate();

    public abstract Date getPkupValidationDate();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public Set<X509CRL> getSignatureCRLs() {
        return Collections.unmodifiableSet(this.signatureCRLs);
    }

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public Set<X509Certificate> getSignatureCertificates() {
        return Collections.unmodifiableSet(this.signatureCertificates);
    }

    public abstract /* synthetic */ Integer getSignatureType();

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public X509Certificate getSignerCertificate() {
        if (this.signerCertificateChain.isEmpty()) {
            return null;
        }
        return this.signerCertificateChain.get(0);
    }

    public abstract Date getValidationDate();

    @Override // ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.options = options;
    }

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }

    public void validate(List<X509Certificate> list, String str, Date date) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Validating of the signer certificate chain...");
        BaseCertificateChainValidatorImpl baseCertificateChainValidatorImpl = new BaseCertificateChainValidatorImpl();
        baseCertificateChainValidatorImpl.setProvider(str);
        baseCertificateChainValidatorImpl.setValidationDate(date);
        baseCertificateChainValidatorImpl.setCRLs(this.signatureCRLs);
        HashSet hashSet = new HashSet(list);
        hashSet.remove(list.get(0));
        baseCertificateChainValidatorImpl.validate(list, Collections.singletonList(new PKUPParameterValidatorImpl(getPkupValidationDate(), hashSet)));
        JCPLogger.fine("Validating of the signer certificate chain completed.");
        JCPLogger.subExit();
    }

    public abstract /* synthetic */ void verify(Set set, Set set2) throws AdESException;

    @Override // ru.CryptoPro.AdES.external.interfaces.IAdESSigner
    public abstract /* synthetic */ void verify(Set set, Set set2, Integer num, boolean z) throws AdESException;
}
