package ru.CryptoPro.JCP.ASN.PKIXOCSP;

import ru.CryptoPro.JCP.ASN.CertificateExtensions.CRLDistPointsSyntax;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.DistributionPoint;

/* loaded from: classes4.dex */
public class CrlLocator extends CRLDistPointsSyntax {
    public CrlLocator() {
    }

    public CrlLocator(int i) {
        super(i);
    }

    public CrlLocator(DistributionPoint[] distributionPointArr) {
        super(distributionPointArr);
    }
}
