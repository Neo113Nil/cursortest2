package ru.CryptoPro.AdES.tools.revocation.data;

import ru.CryptoPro.AdES.certificate.CertificateItem;

/* loaded from: classes4.dex */
public interface CertificateRevocationData {
    CertificateItem.CertificateRole getCertificateRole();

    RevocationMethod getRevocationMethod();
}
