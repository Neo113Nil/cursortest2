package ru.CryptoPro.AdES.evidence;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.AdES.evidence.Evidence;

/* loaded from: classes4.dex */
public abstract class AbstractEvidence<T> implements Evidence<T> {
    private final X509Certificate checkableCertificate;
    private final List<X509Certificate> checkableCertificateChain;
    private final List<X509Certificate> evidenceChain;
    private String index;
    private final X509Certificate issuerCertificate;

    public AbstractEvidence(X509Certificate x509Certificate, X509Certificate x509Certificate2, List<X509Certificate> list, List<X509Certificate> list2) {
        LinkedList linkedList = new LinkedList();
        this.checkableCertificateChain = linkedList;
        LinkedList linkedList2 = new LinkedList();
        this.evidenceChain = linkedList2;
        this.index = "0";
        this.checkableCertificate = x509Certificate;
        this.issuerCertificate = x509Certificate2;
        linkedList.addAll(list);
        linkedList2.addAll(list2);
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public X509Certificate getCheckableCertificate() {
        return this.checkableCertificate;
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public List<X509Certificate> getCheckableCertificateChain() {
        return Collections.unmodifiableList(this.checkableCertificateChain);
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public abstract /* synthetic */ Object getEvidence();

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public List<X509Certificate> getEvidenceChain() {
        return Collections.unmodifiableList(this.evidenceChain);
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence, ru.CryptoPro.AdES.evidence.EvidenceIndex
    public String getIndex() {
        return this.index;
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public X509Certificate getIssuerCertificate() {
        return this.issuerCertificate;
    }

    @Override // ru.CryptoPro.AdES.evidence.Evidence
    public abstract /* synthetic */ Evidence.EvidenceType getType();

    @Override // ru.CryptoPro.AdES.evidence.Evidence, ru.CryptoPro.AdES.evidence.EvidenceIndex
    public void setIndex(String str) {
        this.index = str;
    }
}
