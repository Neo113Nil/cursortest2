package ru.CryptoPro.AdES.certificate;

import defpackage.cr80;
import defpackage.r0x;
import defpackage.t2f0;
import defpackage.vc51;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import ru.CryptoPro.AdES.AbstractFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CompleteCertificateReferenceFinder extends AbstractFinder<cr80> {
    public CompleteCertificateReferenceFinder(Collection<cr80> collection) {
        super(collection);
    }

    public Map.Entry<cr80, Integer> find(X509Certificate x509Certificate, boolean z) throws AdESException {
        JCPLogger.finerFormat("Looking for certificate\n\tserial number: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tneed issuerSerial: {3}", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), Boolean.valueOf(z));
        try {
            int i = 0;
            for (T t : this.collection) {
                if (z && t.b == null) {
                    throw new AdESException("Certificate reference is invalid. Issuer and serial number of certificate not found: sn " + x509Certificate.getSerialNumber().toString(16) + ", subject " + x509Certificate.getSubjectDN() + ", issuer " + x509Certificate.getIssuerDN(), IAdESException.ecFinderWrongCertRef);
                }
                byte[] calculateDigest = AdESUtility.calculateDigest(this.provider, t.m().a.a, x509Certificate.getEncoded());
                r0x r0xVar = t.b;
                if (z) {
                    BigInteger x = r0xVar.b.x();
                    vc51 b = t2f0.b(x509Certificate);
                    if (!x509Certificate.getSerialNumber().equals(x)) {
                        continue;
                    } else if (!AdESUtility.match(b, r0xVar)) {
                        continue;
                    }
                    i++;
                }
                if (Arrays.equals(t.n(), calculateDigest)) {
                    return new AbstractMap.SimpleEntry(t, Integer.valueOf(i));
                }
                i++;
            }
            return null;
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecFinderWrongCertRef);
        } catch (CertificateEncodingException e2) {
            throw new AdESException(e2, IAdESException.ecFinderWrongCertRef);
        }
    }
}
