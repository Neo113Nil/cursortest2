package ru.CryptoPro.AdES.certificate;

import defpackage.cr80;
import defpackage.fxs;
import defpackage.gxs;
import defpackage.jc51;
import defpackage.r0x;
import defpackage.u2;
import defpackage.xr1;
import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.AdES.evidence.AbstractCompleteRevocationReference;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CertificateCompleteCertificateReferenceImpl extends AbstractCompleteRevocationReference<X509Certificate, cr80> {
    @Override // ru.CryptoPro.AdES.evidence.AbstractCompleteRevocationReference, ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public cr80 make(X509Certificate x509Certificate) throws AdESException {
        JCPLogger.fine("Creating complete certificate reference...");
        String checkAndGetDigestAlgorithm = AdESUtility.checkAndGetDigestAlgorithm(null, this.provider, x509Certificate.getPublicKey());
        if (checkAndGetDigestAlgorithm == null) {
            throw new AdESException("Digest algorithm has not been found or is not supported by provider " + this.provider, IAdESException.ecInternal);
        }
        JCPLogger.fine("Digest algorithm: ".concat(checkAndGetDigestAlgorithm));
        try {
            byte[] encoded = x509Certificate.getEncoded();
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(encoded);
            return new cr80(new xr1(new u2(checkAndGetDigestAlgorithm)), AdESUtility.calculateDigest(this.provider, checkAndGetDigestAlgorithm, encoded), new r0x(new gxs(new fxs(jc51.m(x509CertificateHolder.a.b.x))), x509CertificateHolder.a.b.c.x()));
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecInternal);
        } catch (CertificateEncodingException e2) {
            throw new AdESException(e2, IAdESException.ecInternal);
        }
    }
}
