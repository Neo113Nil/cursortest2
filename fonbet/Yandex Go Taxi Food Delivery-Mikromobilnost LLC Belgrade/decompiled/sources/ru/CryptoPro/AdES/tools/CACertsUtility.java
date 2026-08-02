package ru.CryptoPro.AdES.tools;

import ru.CryptoPro.AdES.certificate.AbstractCertificateChainBuilder;

/* loaded from: classes4.dex */
public class CACertsUtility extends AbstractCertificateChainBuilder {
    public static boolean reload() {
        return AbstractCertificateChainBuilder.loadTrustedCertificates();
    }
}
