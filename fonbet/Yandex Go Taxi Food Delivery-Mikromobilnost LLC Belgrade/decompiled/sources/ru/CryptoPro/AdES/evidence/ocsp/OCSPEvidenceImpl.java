package ru.CryptoPro.AdES.evidence.ocsp;

import defpackage.he5;
import java.security.cert.X509Certificate;
import java.util.List;
import ru.CryptoPro.AdES.evidence.AbstractEvidence;
import ru.CryptoPro.AdES.evidence.Evidence;

/* loaded from: classes4.dex */
public class OCSPEvidenceImpl extends AbstractEvidence<he5> {
    private final he5 basicOCSPResponse;

    public OCSPEvidenceImpl(he5 he5Var, X509Certificate x509Certificate, X509Certificate x509Certificate2, List<X509Certificate> list, List<X509Certificate> list2) {
        super(x509Certificate, x509Certificate2, list, list2);
        this.basicOCSPResponse = he5Var;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public Evidence.EvidenceType getType() {
        return Evidence.EvidenceType.etOCSP;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public he5 getEvidence() {
        return this.basicOCSPResponse;
    }
}
