package ru.CryptoPro.AdES.evidence;

import ru.CryptoPro.AdES.exception.AdESException;

/* loaded from: classes4.dex */
public abstract class AbstractCompleteRevocationReference<T, V> implements CompleteRevocationReferenceBase<T, V> {
    protected String provider = null;

    @Override // ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public abstract /* synthetic */ Object make(Object obj) throws AdESException;

    @Override // ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }
}
