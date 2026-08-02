package ru.CryptoPro.AdES.evidence;

import defpackage.cr80;
import defpackage.tbf;
import defpackage.v2k0;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.SignatureOptions;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class ComplexStatusValidatorImpl<T> implements BaseParameterValidator<T>, SignatureOptions, ComplexStatusValidator {
    protected boolean signerMustHaveOcspEvidence = false;
    protected boolean ignoreEvidenceTime = false;
    protected final List<cr80> otherCertIDs = new LinkedList();
    protected final List<tbf> crlOcspRefs = new LinkedList();
    protected final Set<X509Certificate> certificateValues = new HashSet();
    protected v2k0 revocationValues = null;
    protected Date internalDate = null;
    protected Date externalDate = null;
    protected Date validationDate = null;
    protected String provider = null;
    protected List<X509Certificate> evidenceChain = new LinkedList();
    protected Options options = null;

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public List<X509Certificate> getEvidenceChain() {
        return Collections.unmodifiableList(this.evidenceChain);
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.certificateValues.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setCompleteCertificateReferences(List<cr80> list) {
        this.otherCertIDs.addAll(list);
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setCompleteRevocationReferences(List<tbf> list) {
        this.crlOcspRefs.addAll(list);
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public void setExternalDate(Date date) {
        this.externalDate = date;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public void setIgnoreEvidenceTime(boolean z) {
        this.ignoreEvidenceTime = z;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public void setInternalDate(Date date) {
        this.internalDate = date;
    }

    @Override // ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.options = options;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public void setProvider(String str) {
        this.provider = str;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setRevocationValues(v2k0 v2k0Var) {
        this.revocationValues = v2k0Var;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator, ru.CryptoPro.AdES.evidence.StatusValidator
    public void setSignerMustHaveOcspEvidence(boolean z) {
        this.signerMustHaveOcspEvidence = z;
    }

    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidator
    public void setValidationDate(Date date) {
        this.validationDate = date;
    }

    @Override // ru.CryptoPro.AdES.BaseParameterValidator
    public abstract /* synthetic */ void validate(Object obj) throws AdESException;

    public void validate(List<X509Certificate> list) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Ignore validation of evidence's certificate chain during collecting.");
        JCPLogger.subExit();
    }
}
