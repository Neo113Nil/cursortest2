package ru.CryptoPro.ssl.util;

import defpackage.unr0;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.ssl.SSLLogger;

/* loaded from: classes4.dex */
public class SecureChecker {
    public static void checkPublicKeys(X509Certificate[] x509CertificateArr) throws CertificateException {
        SSLLogger.subEnter();
        if (TLSSettings.getTlsProhibitDisabledValidation()) {
            SSLLogger.fine("Checking if every certificate has GOST algorithm...");
            for (X509Certificate x509Certificate : x509CertificateArr) {
                String algorithm = x509Certificate.getPublicKey().getAlgorithm();
                if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
                    StringBuilder x = unr0.x("Invalid public key algorithm ", algorithm, " in the certificate:\nsn ");
                    x.append(x509Certificate.getSerialNumber().toString(16));
                    x.append("\nissuer: ");
                    x.append(x509Certificate.getIssuerDN());
                    throw new CertificateException(x.toString());
                }
            }
            SSLLogger.fine("Check completed.");
        }
        SSLLogger.subExit();
    }
}
