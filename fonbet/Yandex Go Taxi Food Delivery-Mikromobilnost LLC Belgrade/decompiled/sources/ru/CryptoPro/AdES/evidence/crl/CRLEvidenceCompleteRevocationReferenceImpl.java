package ru.CryptoPro.AdES.evidence.crl;

import defpackage.dqf;
import defpackage.er80;
import defpackage.fr80;
import defpackage.jc51;
import defpackage.l2;
import defpackage.m79;
import defpackage.rbf;
import defpackage.sbf;
import defpackage.u2;
import defpackage.ubf;
import defpackage.v3;
import defpackage.xr1;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import org.bouncycastle.cert.X509CRLHolder;
import ru.CryptoPro.AdES.evidence.AbstractEvidenceCompleteRevocationReference;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CRLEvidenceCompleteRevocationReferenceImpl extends AbstractEvidenceCompleteRevocationReference<X509CRL, sbf> {
    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidenceCompleteRevocationReference, ru.CryptoPro.AdES.evidence.AbstractCompleteRevocationReference, ru.CryptoPro.AdES.evidence.CompleteRevocationReferenceBase
    public sbf make(X509CRL x509crl) throws AdESException {
        JCPLogger.fine("Creating CRL complete revocation reference...");
        try {
            m79 convertX509CRL2CertificateList = AdESUtility.convertX509CRL2CertificateList(x509crl);
            X509CRLHolder x509CRLHolder = new X509CRLHolder(x509crl.getEncoded());
            BigInteger cRLSerialNumber = AdESUtility.getCRLSerialNumber(x509crl);
            jc51 m = jc51.m(x509CRLHolder.a.a.c);
            v3 v3Var = new v3(x509crl.getThisUpdate());
            rbf rbfVar = new rbf();
            rbfVar.a = m;
            rbfVar.b = v3Var;
            if (cRLSerialNumber != null) {
                rbfVar.c = new l2(cRLSerialNumber);
            }
            try {
                return new sbf(new ubf[]{new ubf(new er80(new fr80(new xr1(new u2(this.digestAlgorithm)), new dqf(AdESUtility.calculateDigest(this.provider, this.digestAlgorithm, convertX509CRL2CertificateList.getEncoded("DER"))))), rbfVar)});
            } catch (IOException e) {
                throw new AdESException(e, IAdESException.ecInternal);
            }
        } catch (IOException e2) {
            throw new AdESException(e2, IAdESException.ecRevocationInvalidCRL);
        } catch (CRLException e3) {
            throw new AdESException(e3, IAdESException.ecRevocationInvalidCRL);
        }
    }
}
