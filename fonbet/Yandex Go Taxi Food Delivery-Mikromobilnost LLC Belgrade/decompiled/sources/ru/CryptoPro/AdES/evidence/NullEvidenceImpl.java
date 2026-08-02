package ru.CryptoPro.AdES.evidence;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.AdES.evidence.Evidence;

/* loaded from: classes4.dex */
public class NullEvidenceImpl extends AbstractEvidence<Void> {
    public NullEvidenceImpl(X509Certificate x509Certificate, X509Certificate x509Certificate2, List<X509Certificate> list) {
        super(x509Certificate, x509Certificate2, list, Collections.EMPTY_LIST);
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public Evidence.EvidenceType getType() {
        return Evidence.EvidenceType.etNull;
    }

    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidence, ru.CryptoPro.AdES.evidence.Evidence
    public Void getEvidence() {
        return null;
    }
}
