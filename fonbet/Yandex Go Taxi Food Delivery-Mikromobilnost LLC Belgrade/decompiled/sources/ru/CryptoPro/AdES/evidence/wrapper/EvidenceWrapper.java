package ru.CryptoPro.AdES.evidence.wrapper;

import ru.CryptoPro.AdES.evidence.EvidenceIndex;

/* loaded from: classes4.dex */
public abstract class EvidenceWrapper<T> implements EvidenceIndex {
    private final T evidence;
    private String evidenceIndex = "0";

    public EvidenceWrapper(T t) {
        this.evidence = t;
    }

    public T getEvidence() {
        return this.evidence;
    }

    @Override // ru.CryptoPro.AdES.evidence.EvidenceIndex
    public String getIndex() {
        return this.evidenceIndex;
    }

    @Override // ru.CryptoPro.AdES.evidence.EvidenceIndex
    public void setIndex(String str) {
        this.evidenceIndex = str;
    }
}
