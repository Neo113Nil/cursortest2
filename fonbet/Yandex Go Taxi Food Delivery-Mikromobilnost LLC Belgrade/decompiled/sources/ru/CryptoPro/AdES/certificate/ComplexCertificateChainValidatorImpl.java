package ru.CryptoPro.AdES.certificate;

import defpackage.cr80;
import defpackage.d79;
import defpackage.e79;
import defpackage.he5;
import defpackage.i3;
import defpackage.l79;
import defpackage.m79;
import defpackage.mr60;
import defpackage.nr60;
import defpackage.sbf;
import defpackage.tbf;
import defpackage.ths0;
import defpackage.ubf;
import defpackage.v2k0;
import defpackage.vfc;
import defpackage.w2k0;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.CertificateIdentifierCalculator;
import ru.CryptoPro.AdES.evidence.EvidenceParameterValidatorImpl;
import ru.CryptoPro.AdES.evidence.crl.CRLEvidenceImpl;
import ru.CryptoPro.AdES.evidence.crl.CRLFinder;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.normalize.ReferenceValidator;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ComplexCertificateChainValidatorImpl extends BaseCertificateChainValidatorImpl implements ComplexCertificateChainValidator {
    private boolean signerMustHaveOcspEvidence = false;
    private final List<cr80> completeCertificateReferences = new LinkedList();
    private final List<tbf> completeRevocationReferences = new LinkedList();
    private v2k0 revocationValues = null;
    private boolean isIssuerSerialNeeded = true;
    private CertificateItem.CertificateRole signerCertificateRole = CertificateItem.CertificateRole.Unknown;
    private boolean enableRevocationReferenceSearchByRevocationValue = false;

    private tbf getCompleteRevocationReference(X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        CompleteCertificateReferenceFinder completeCertificateReferenceFinder = new CompleteCertificateReferenceFinder(this.completeCertificateReferences);
        completeCertificateReferenceFinder.setProvider(this.provider);
        Map.Entry<cr80, Integer> find = completeCertificateReferenceFinder.find(x509Certificate, this.isIssuerSerialNeeded);
        int intValue = find != null ? find.getValue().intValue() : -1;
        JCPLogger.fine("Certificate reference index: " + intValue);
        if (intValue == -1) {
            StringBuilder sb = new StringBuilder("Reference for the certificate: sn ");
            vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
            sb.append(" has not been found in complete-certificate-references attribute.");
            throw new AdESException(sb.toString(), IAdESException.ecRevocationWrongCertRef);
        }
        if (this.enableRevocationReferenceSearchByRevocationValue) {
            return worseRevocationReferenceSearchAlgorithm(x509Certificate, x509Certificate2);
        }
        if (intValue < this.completeRevocationReferences.size()) {
            return this.completeRevocationReferences.get(intValue);
        }
        StringBuilder sb2 = new StringBuilder("Reference for the certificate: sn ");
        vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
        sb2.append(" has been found in complete-certificate-references attribute but is absent in revocation-references attribute.");
        throw new AdESException(sb2.toString(), IAdESException.ecRevocationWrongCertRef);
    }

    private boolean isCRLAccepted(X509Certificate x509Certificate, X509Certificate x509Certificate2, X509CRL x509crl) {
        List list = Collections.EMPTY_LIST;
        try {
            new EvidenceParameterValidatorImpl(this.rootCert, this.validationDate).validate((EvidenceParameterValidatorImpl) new CRLEvidenceImpl(x509crl, x509Certificate, x509Certificate2, list, list));
            return true;
        } catch (AdESException e) {
            JCPLogger.ignoredException(e);
            return false;
        }
    }

    private void validate(X509Certificate x509Certificate, List<X509Certificate> list, boolean z) throws AdESException {
        JCPLogger.subEnter();
        X509Certificate x509Certificate2 = list.get(0);
        tbf completeRevocationReference = getCompleteRevocationReference(x509Certificate, x509Certificate2);
        if (completeRevocationReference.getOcspids() == null) {
            if (x509Certificate.equals(this.targetCert) && z) {
                StringBuilder sb = new StringBuilder("Certificate: sn ");
                vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
                sb.append(" MUST be among the OCSP responses. OCSP revocation reference is required for this certificate but not found.");
                throw new AdESException(sb.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
            }
        } else if (validateByOcsp(completeRevocationReference, x509Certificate, x509Certificate2)) {
            JCPLogger.fine("Certificate has been verified using OCSP evidences.");
            return;
        } else if (z) {
            StringBuilder sb2 = new StringBuilder("Certificate: sn ");
            vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
            sb2.append(" MUST be among the OCSP responses. OCSP revocation reference found but OCSP evidence ont found.");
            throw new AdESException(sb2.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
        }
        if (validateByCrl(completeRevocationReference, x509Certificate, x509Certificate2)) {
            JCPLogger.fine("Certificate has been verified using CRL evidences.");
            JCPLogger.subExit();
        } else {
            StringBuilder sb3 = new StringBuilder("Not enough revocation values for the certificate: sn ");
            vfc.B(x509Certificate, 16, sb3, ", subject ", ", issuer ");
            sb3.append(" . CRL not found for this certificate.");
            throw new AdESException(sb3.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
        }
    }

    private boolean validateByCrl(tbf tbfVar, X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        JCPLogger.fine("Validating certificate status by CRL...");
        m79[] crlVals = this.revocationValues.getCrlVals();
        int i = 0;
        if (crlVals == null) {
            return false;
        }
        CRLFinder cRLFinder = new CRLFinder(Arrays.asList(crlVals));
        cRLFinder.setProvider(this.provider);
        if (tbfVar.getCrlids() == null) {
            throw new AdESException("CRLListID inside the revocation reference is null. Check property ru.CryptoPro.AdES.require_tsp_evidence (require an evidence for the TSP certificate). The order of certificate and revocation reference can be invalid.", IAdESException.ecFinderWrongCrlRef);
        }
        List<X509CRL> find = cRLFinder.find(tbfVar.getCrlids());
        for (X509CRL x509crl : find) {
            if (isCRLAccepted(x509Certificate, x509Certificate2, x509crl)) {
                if (x509crl.isRevoked(x509Certificate)) {
                    X509CRLEntry revokedCertificate = x509crl.getRevokedCertificate(x509Certificate);
                    if (revokedCertificate.getRevocationDate().before(this.validationDate)) {
                        StringBuilder sb = new StringBuilder("[CRL STATUS] Certificate: sn ");
                        vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
                        sb.append(", time ");
                        sb.append(revokedCertificate.getRevocationDate());
                        sb.append(" status is REVOKED (before signing date: ");
                        sb.append(this.validationDate);
                        sb.append(").");
                        throw new AdESException(sb.toString(), IAdESException.ecRevocationCertificateStatusIsRevoked);
                    }
                }
                i++;
            }
        }
        if (i == find.size()) {
            JCPLogger.fineFormat("[CRL STATUS] Certificate\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tstatus is GOOD.", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
            return true;
        }
        StringBuilder sb2 = new StringBuilder("[CRL STATUS] Certificate: sn ");
        vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
        sb2.append(" status is UNKNOWN.");
        throw new AdESException(sb2.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
    }

    private boolean validateByOcsp(tbf tbfVar, X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        CertificateIdentifierCalculator certificateIdentifierCalculator;
        JCPLogger.fine("Validating certificate status by OCSP...");
        he5[] ocspVals = this.revocationValues.getOcspVals();
        if (ocspVals != null) {
            OCSPFinder oCSPFinder = new OCSPFinder(Arrays.asList(ocspVals));
            oCSPFinder.setProvider(this.provider);
            if (tbfVar.getOcspids() == null) {
                throw new AdESException("OcspListID inside the revocation reference is null. The order of certificate and revocation reference can be invalid.", IAdESException.ecFinderWrongCrlRef);
            }
            try {
                Iterator<he5> it = oCSPFinder.find(tbfVar.getOcspids()).iterator();
                while (it.hasNext()) {
                    i3 i3Var = it.next().a.x;
                    for (int i = 0; i < i3Var.size(); i++) {
                        ths0 m = ths0.m(i3Var.A(i));
                        d79 d79Var = m.a;
                        l79 l79Var = new l79(d79Var);
                        String str = d79Var.a.a.a;
                        try {
                            certificateIdentifierCalculator = new CertificateIdentifierCalculator(x509Certificate, x509Certificate2);
                            certificateIdentifierCalculator.setDigestAlgorithm(str);
                            certificateIdentifierCalculator.setProvider(this.provider);
                        } catch (Exception e) {
                            JCPLogger.ignoredException(e);
                        }
                        if (AdESUtility.compareCertificateID(l79Var, AdESUtility.fixCertificateID(certificateIdentifierCalculator.make((Void) null), str))) {
                            e79 e79Var = m.b;
                            int i2 = e79Var.a;
                            if (i2 == 0) {
                                JCPLogger.fineFormat("[OCSP STATUS] Certificate\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tstatus is GOOD.", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN());
                                return true;
                            }
                            if (i2 != 1) {
                                StringBuilder sb = new StringBuilder("[OCSP STATUS] Certificate: sn ");
                                vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
                                sb.append(" status is UNKNOWN.");
                                throw new AdESException(sb.toString(), IAdESException.ecRevocationCertificateStatusIsUnknown);
                            }
                            w2k0 w2k0Var = (w2k0) e79Var.b;
                            StringBuilder sb2 = new StringBuilder("[OCSP STATUS] Certificate: sn ");
                            vfc.B(x509Certificate, 16, sb2, ", subject ", ", issuer ");
                            sb2.append(", reason ");
                            sb2.append(w2k0Var.b.a.y());
                            sb2.append(", time ");
                            sb2.append(w2k0Var.a.A());
                            sb2.append(" status is REVOKED.");
                            throw new AdESException(sb2.toString(), IAdESException.ecRevocationCertificateStatusIsRevoked);
                        }
                    }
                }
            } catch (Exception e2) {
                JCPLogger.thrown(e2);
                return false;
            }
        }
        return false;
    }

    private tbf worseRevocationReferenceSearchAlgorithm(X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        ReferenceValidator referenceValidator = new ReferenceValidator(x509Certificate);
        referenceValidator.setProvider(this.provider);
        referenceValidator.setCertificateValues(Collections.singleton(x509Certificate2));
        for (he5 he5Var : this.revocationValues.getOcspVals()) {
            if (referenceValidator.isOCSPAccepted(he5Var)) {
                for (tbf tbfVar : this.completeRevocationReferences) {
                    mr60 ocspids = tbfVar.getOcspids();
                    if (ocspids != null) {
                        for (nr60 nr60Var : ocspids.m()) {
                            if (OCSPFinder.match(he5Var, nr60Var, this.provider)) {
                                return tbfVar;
                            }
                        }
                    }
                }
            }
        }
        for (m79 m79Var : this.revocationValues.getCrlVals()) {
            if (referenceValidator.isCRLAccepted(m79Var)) {
                for (tbf tbfVar2 : this.completeRevocationReferences) {
                    sbf crlids = tbfVar2.getCrlids();
                    if (crlids != null) {
                        for (ubf ubfVar : crlids.m()) {
                            if (CRLFinder.match(m79Var, ubfVar, this.provider)) {
                                return tbfVar2;
                            }
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Reference for the certificate: sn ");
        vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
        sb.append(" has not been found in complete-revocation-references attribute with searching by revocation value.");
        throw new AdESException(sb.toString(), IAdESException.ecRevocationWrongCertRef);
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator, ru.CryptoPro.AdES.evidence.SignerCertificateRole
    public void setCertificateRole(CertificateItem.CertificateRole certificateRole) {
        this.signerCertificateRole = certificateRole;
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setCompleteCertificateReferences(List<cr80> list) {
        this.completeCertificateReferences.addAll(list);
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setCompleteRevocationReferences(List<tbf> list) {
        this.completeRevocationReferences.addAll(list);
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator
    public void setEnableRevocationReferenceSearchByRevocationValue(boolean z) {
        this.enableRevocationReferenceSearchByRevocationValue = z;
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator
    public void setNeedOfIssuerSerial(boolean z) {
        this.isIssuerSerialNeeded = z;
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setRevocationValues(v2k0 v2k0Var) {
        this.revocationValues = v2k0Var;
    }

    @Override // ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setSignerMustHaveOcspEvidence(boolean z) {
        this.signerMustHaveOcspEvidence = z;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidatorImpl
    public void validate(List<X509Certificate> list, Set<TrustAnchor> set) throws AdESException {
        JCPLogger.subEnter();
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(set.iterator().next().getTrustedCert());
        if (AdESUtility.skipCertificateValidity(this.targetCert, this.signerCertificateRole) || AdESUtility.skipTSPCertificateValidity(this.targetCert, this.signerCertificateRole)) {
            JCPLogger.fineFormat("Skip validation of certificate\n\tserial:  {0}\n\tsubject: {1}\n\tissuer:  {2}\n\treason: pkix-ocsp-nocheck or self-signed, or {3} disabled.", this.targetCert.getSerialNumber().toString(16), this.targetCert.getSubjectDN(), this.targetCert.getIssuerDN(), AdESUtility.PROPERTY_REQUIRE_TSP_EVIDENCE);
        } else {
            validate(this.targetCert, arrayList, this.signerMustHaveOcspEvidence);
        }
        for (X509Certificate x509Certificate : list) {
            arrayList.remove(x509Certificate);
            validate(x509Certificate, arrayList, false);
        }
        JCPLogger.subExit();
    }
}
