package ru.CryptoPro.AdES.tools.revocation.impl;

import ru.CryptoPro.AdES.tools.revocation.data.CertificateData;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingData;
import ru.CryptoPro.AdES.tools.revocation.data.ValidatingPermissionData;

/* loaded from: classes4.dex */
public class ValidatingRevocationPermissionData implements ValidatingPermissionData {
    private final ValidatingData revocationRecipientData;
    private final CertificateData validatingRevocationData;

    public ValidatingRevocationPermissionData(ValidatingData validatingData, CertificateData certificateData) {
        this.revocationRecipientData = validatingData;
        this.validatingRevocationData = certificateData;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingPermissionData
    public ValidatingData getRevocationRecipientData() {
        return this.revocationRecipientData;
    }

    @Override // ru.CryptoPro.AdES.tools.revocation.data.ValidatingPermissionData
    public CertificateData getValidatingRevocationData() {
        return this.validatingRevocationData;
    }
}
