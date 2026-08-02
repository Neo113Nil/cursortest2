package ru.CryptoPro.AdES.evidence;

import defpackage.d79;
import defpackage.dqf;
import defpackage.j2;
import defpackage.l2;
import defpackage.l79;
import defpackage.t2f0;
import defpackage.u2;
import defpackage.xr1;
import defpackage.zyu0;
import java.security.cert.X509Certificate;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.DigestUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CertificateIdentifierCalculator implements CompleteRevocationReferenceBase<Void, l79>, DigestUtility {
    private X509Certificate cert;
    private X509Certificate issuer;
    private String digestAlgorithm = null;
    private String provider = null;

    public CertificateIdentifierCalculator(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.cert = x509Certificate;
        this.issuer = x509Certificate2;
    }

    @Override // ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public l79 make(Void r6) throws AdESException {
        JCPLogger.fine("Creating certificate identifier...");
        try {
            return new l79(new d79(new xr1(new u2(this.digestAlgorithm)), new dqf(AdESUtility.calculateDigest(this.provider, this.digestAlgorithm, t2f0.c(this.issuer).getEncoded())), new dqf(AdESUtility.calculateDigest(this.provider, this.digestAlgorithm, zyu0.m(new j2(this.issuer.getPublicKey().getEncoded()).n()).b.x())), new l2(this.cert.getSerialNumber())));
        } catch (Exception e) {
            throw new AdESException(e, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.digestAlgorithm = str;
    }

    @Override // ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }
}
