package ru.CryptoPro.AdES.evidence.wrapper;

import defpackage.mr60;
import defpackage.sbf;
import defpackage.tbf;
import ru.CryptoPro.AdES.evidence.EvidenceIndex;

/* loaded from: classes4.dex */
public class CrlOcspRefWrapper extends tbf implements EvidenceIndex {
    private String evidenceIndex;

    public CrlOcspRefWrapper(sbf sbfVar, mr60 mr60Var) {
        super(sbfVar, mr60Var);
        this.evidenceIndex = "0";
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
