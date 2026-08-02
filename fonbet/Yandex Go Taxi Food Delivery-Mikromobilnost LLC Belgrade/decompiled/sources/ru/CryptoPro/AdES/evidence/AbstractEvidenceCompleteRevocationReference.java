package ru.CryptoPro.AdES.evidence;

import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.tools.DigestUtility;

/* loaded from: classes4.dex */
public abstract class AbstractEvidenceCompleteRevocationReference<T, V> extends AbstractCompleteRevocationReference<T, V> implements DigestUtility {
    protected String digestAlgorithm = null;

    @Override // ru.CryptoPro.AdES.evidence.AbstractCompleteRevocationReference, ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public abstract /* synthetic */ Object make(Object obj) throws AdESException;

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.digestAlgorithm = str;
    }
}
