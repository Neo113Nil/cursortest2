package ru.CryptoPro.AdES.evidence;

import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;

/* loaded from: classes4.dex */
public class ValidatingItem<T> {
    private final T revocationData;
    private final ValidatingData validatingCertificateData;

    public ValidatingItem(T t) {
        this.validatingCertificateData = null;
        this.revocationData = t;
    }

    public T getRevocationData() {
        return this.revocationData;
    }

    public ValidatingData getValidatingCertificateData() {
        return this.validatingCertificateData;
    }

    public ValidatingItem(ValidatingData validatingData, T t) {
        this.validatingCertificateData = validatingData;
        this.revocationData = t;
    }
}
