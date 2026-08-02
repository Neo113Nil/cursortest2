package ru.CryptoPro.AdES.evidence;

import defpackage.cr80;
import defpackage.mr60;
import defpackage.sbf;
import defpackage.tbf;
import defpackage.v2k0;
import defpackage.vfc;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateCompleteCertificateReferenceImpl;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.Evidence;
import ru.CryptoPro.AdES.evidence.crl.CRLEvidenceCompleteRevocationReferenceImpl;
import ru.CryptoPro.AdES.evidence.crl.CRLEvidenceImpl;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPEvidenceCompleteRevocationReferenceImpl;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPEvidenceImpl;
import ru.CryptoPro.AdES.evidence.wrapper.BasicOCSPResponseWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.CertificateListWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.CrlOcspRefWrapper;
import ru.CryptoPro.AdES.evidence.wrapper.RevocationValuesWrapper;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CertificateChainEvidenceBuilderImpl extends AbstractCertificateChainEvidence implements CertificateChainEvidenceBuilder {
    private final List<Evidence<?>> evidences = new LinkedList();
    private final Set<X509CRL> additionalCRLs = new HashSet();
    private boolean signerMustHaveOcspEvidence = false;
    private CertificateItem.CertificateRole signerCertificateRole = CertificateItem.CertificateRole.Unknown;
    private cr80 signerCertificateReference = null;
    private final List<cr80> completeCertificateReferences = new LinkedList();
    private final List<tbf> completeRevocationReferences = new LinkedList();
    private final List<X509Certificate> certificateValues = new LinkedList();
    private final List<BasicOCSPResponseWrapper> ocspRevocationValues = new LinkedList();
    private final List<CertificateListWrapper> crlRevocationValues = new LinkedList();
    private RevocationValuesWrapper revocationValuesWrapper = null;
    private Options options = null;

    /* renamed from: ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilderImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType;

        static {
            int[] iArr = new int[Evidence.EvidenceType.values().length];
            $SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType = iArr;
            try {
                iArr[Evidence.EvidenceType.etOCSP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType[Evidence.EvidenceType.etCRL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private Evidence<?> find(X509Certificate x509Certificate) throws AdESException {
        for (Evidence<?> evidence : this.evidences) {
            if (evidence.getCheckableCertificate().equals(x509Certificate)) {
                return evidence;
            }
        }
        StringBuilder sb = new StringBuilder("Evidence for certificate: sn ");
        vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
        sb.append(" not found.");
        throw new AdESException(sb.toString(), IAdESException.ecRevocationIsNull);
    }

    private void pack(List<X509Certificate> list, List<Evidence<?>> list2, Set<X509Certificate> set, Set<Evidence<?>> set2) throws AdESException {
        mr60 mr60Var;
        JCPLogger.subEnter();
        JCPLogger.fine("Packing evidence chain for certificate chain...");
        for (X509Certificate x509Certificate : list) {
            if (!set.contains(x509Certificate)) {
                this.certificateValues.add(x509Certificate);
                set.add(x509Certificate);
                CertificateCompleteCertificateReferenceImpl certificateCompleteCertificateReferenceImpl = new CertificateCompleteCertificateReferenceImpl();
                certificateCompleteCertificateReferenceImpl.setProvider(this.provider);
                this.completeCertificateReferences.add((cr80) certificateCompleteCertificateReferenceImpl.make((Object) x509Certificate));
                sbf sbfVar = null;
                String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(null, this.provider, x509Certificate.getPublicKey());
                if (checkAndGetDigestAlgorithm == null) {
                    throw new AdESException("Digest algorithm has not been found or is not supported by provider " + this.provider, IAdESException.ecInternal);
                }
                JCPLogger.fine("Digest algorithm: ".concat(checkAndGetDigestAlgorithm));
                Evidence<?> find = find(x509Certificate);
                set2.add(find);
                int i = AnonymousClass1.$SwitchMap$ru$CryptoPro$AdES$evidence$Evidence$EvidenceType[find.getType().ordinal()];
                if (i == 1) {
                    OCSPEvidenceImpl oCSPEvidenceImpl = (OCSPEvidenceImpl) find;
                    OCSPEvidenceCompleteRevocationReferenceImpl oCSPEvidenceCompleteRevocationReferenceImpl = new OCSPEvidenceCompleteRevocationReferenceImpl();
                    oCSPEvidenceCompleteRevocationReferenceImpl.setDigestAlgorithm(checkAndGetDigestAlgorithm);
                    oCSPEvidenceCompleteRevocationReferenceImpl.setProvider(this.provider);
                    mr60Var = (mr60) oCSPEvidenceCompleteRevocationReferenceImpl.make((Object) oCSPEvidenceImpl.getEvidence());
                    BasicOCSPResponseWrapper basicOCSPResponseWrapper = new BasicOCSPResponseWrapper(oCSPEvidenceImpl.getEvidence());
                    basicOCSPResponseWrapper.setIndex(find.getIndex());
                    this.ocspRevocationValues.add(basicOCSPResponseWrapper);
                } else if (i != 2) {
                    CrlOcspRefWrapper crlOcspRefWrapper = new CrlOcspRefWrapper(null, null);
                    crlOcspRefWrapper.setIndex(find.getIndex());
                    this.completeRevocationReferences.add(crlOcspRefWrapper);
                } else {
                    CRLEvidenceImpl cRLEvidenceImpl = (CRLEvidenceImpl) find;
                    CRLEvidenceCompleteRevocationReferenceImpl cRLEvidenceCompleteRevocationReferenceImpl = new CRLEvidenceCompleteRevocationReferenceImpl();
                    cRLEvidenceCompleteRevocationReferenceImpl.setDigestAlgorithm(checkAndGetDigestAlgorithm);
                    cRLEvidenceCompleteRevocationReferenceImpl.setProvider(this.provider);
                    sbf sbfVar2 = (sbf) cRLEvidenceCompleteRevocationReferenceImpl.make((Object) cRLEvidenceImpl.getEvidence());
                    try {
                        CertificateListWrapper certificateListWrapper = new CertificateListWrapper(AdESUtility.convertX509CRL2CertificateList(cRLEvidenceImpl.getEvidence()));
                        certificateListWrapper.setIndex(find.getIndex());
                        this.crlRevocationValues.add(certificateListWrapper);
                        sbfVar = sbfVar2;
                        mr60Var = null;
                    } catch (Exception e) {
                        throw new AdESException(e, IAdESException.ecRevocationInvalidCRL);
                    }
                }
                CrlOcspRefWrapper crlOcspRefWrapper2 = new CrlOcspRefWrapper(sbfVar, mr60Var);
                crlOcspRefWrapper2.setIndex(find.getIndex());
                this.completeRevocationReferences.add(crlOcspRefWrapper2);
            }
        }
        for (Evidence<?> evidence : list2) {
            if (!set2.contains(evidence)) {
                pack(evidence.getCheckableCertificateChain(), list2, set, set2);
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder
    public void build(List<X509Certificate> list) throws AdESException {
        RevocationValuesWrapper revocationValuesWrapper;
        JCPLogger.subEnter();
        JCPLogger.fine("Collecting evidences for certificate chain...");
        EvidenceCollectorImpl evidenceCollectorImpl = new EvidenceCollectorImpl();
        evidenceCollectorImpl.setProvider(this.provider);
        evidenceCollectorImpl.setExternalDate(this.externalDate);
        evidenceCollectorImpl.setInternalDate(this.internalDate);
        evidenceCollectorImpl.setIgnoreEvidenceTime(this.ignoreEvidenceTime);
        evidenceCollectorImpl.setCertificateValues(this.additionalCertificateValues);
        evidenceCollectorImpl.setCRLs(this.additionalCRLs);
        evidenceCollectorImpl.setOptions(this.options);
        CertificateItem.CertificateRole certificateRole = this.signerCertificateRole;
        if (certificateRole == CertificateItem.CertificateRole.Unknown) {
            throw new AdESException("Invalid certificate role: " + this.signerCertificateRole, IAdESException.ecInternal);
        }
        List<CertificateItem> performChainWithRoles = CertificateItem.performChainWithRoles(list, certificateRole);
        this.evidences.clear();
        evidenceCollectorImpl.collect(performChainWithRoles, this.evidences, this.signerMustHaveOcspEvidence);
        JCPLogger.fine("Creating evidence structures...");
        this.completeCertificateReferences.clear();
        this.completeRevocationReferences.clear();
        this.certificateValues.clear();
        this.revocationValuesWrapper = null;
        this.ocspRevocationValues.clear();
        this.crlRevocationValues.clear();
        pack(list, this.evidences, new HashSet(), new HashSet());
        this.signerCertificateReference = this.completeCertificateReferences.remove(0);
        if (!this.ocspRevocationValues.isEmpty() && !this.crlRevocationValues.isEmpty()) {
            revocationValuesWrapper = new RevocationValuesWrapper((CertificateListWrapper[]) this.crlRevocationValues.toArray(new CertificateListWrapper[this.crlRevocationValues.size()]), (BasicOCSPResponseWrapper[]) this.ocspRevocationValues.toArray(new BasicOCSPResponseWrapper[this.ocspRevocationValues.size()]));
        } else {
            if (this.ocspRevocationValues.isEmpty()) {
                if (!this.crlRevocationValues.isEmpty()) {
                    revocationValuesWrapper = new RevocationValuesWrapper((CertificateListWrapper[]) this.crlRevocationValues.toArray(new CertificateListWrapper[this.crlRevocationValues.size()]), null);
                }
                JCPLogger.subExit();
            }
            revocationValuesWrapper = new RevocationValuesWrapper(null, (BasicOCSPResponseWrapper[]) this.ocspRevocationValues.toArray(new BasicOCSPResponseWrapper[this.ocspRevocationValues.size()]));
        }
        this.revocationValuesWrapper = revocationValuesWrapper;
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<X509Certificate> getCertificateValues() {
        return Collections.unmodifiableList(this.certificateValues);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<cr80> getCompleteCertificateReferences() {
        return Collections.unmodifiableList(this.completeCertificateReferences);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public List<tbf> getCompleteRevocationReferences() {
        return Collections.unmodifiableList(this.completeRevocationReferences);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeParametersDecoder
    public v2k0 getRevocationValues() {
        return this.revocationValuesWrapper;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder
    public cr80 getSignerCertificateReference() {
        return this.signerCertificateReference;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractCertificateChainEvidence, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.additionalCRLs.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.evidence.SignerCertificateRole
    public void setCertificateRole(CertificateItem.CertificateRole certificateRole) {
        this.signerCertificateRole = certificateRole;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.options = options;
    }

    @Override // ru.CryptoPro.AdES.evidence.CertificateChainEvidenceBuilder, ru.CryptoPro.AdES.evidence.SignerCertificateEvidenceTypeAcquirable
    public void setSignerMustHaveOcspEvidence(boolean z) {
        this.signerMustHaveOcspEvidence = z;
    }
}
