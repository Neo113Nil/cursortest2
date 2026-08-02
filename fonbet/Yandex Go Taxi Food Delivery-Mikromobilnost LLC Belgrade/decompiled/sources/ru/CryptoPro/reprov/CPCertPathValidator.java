package ru.CryptoPro.reprov;

import defpackage.kbs;
import defpackage.puu0;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.logger.LoggingUtils;
import ru.CryptoPro.reprov.certpath.CrlRevocationChecker;

/* loaded from: classes4.dex */
public class CPCertPathValidator extends CertPathValidatorSpi {
    public static final boolean a = RevocationSettings.getDisableTSPCertAppExtChecker();
    public static final boolean b = RevocationSettings.getDisableEnrollCertTypeExtChecker();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        if (!(certPathParameters instanceof PKIXParameters)) {
            kbs.t("inappropriate parameters, must be an instance of PKIXParameters");
            return null;
        }
        if (!JCP.CERTIFICATE_FACTORY_NAME.equals(certPath.getType()) && !"X509".equals(certPath.getType())) {
            kbs.t("inappropriate certification path type specified, must be X.509 or X509");
            return null;
        }
        boolean z = Platform.isAndroid;
        PKIXParameters pKIXParameters = z ? (PKIXParameters) certPathParameters.clone() : (PKIXParameters) certPathParameters;
        boolean isRevocationEnabled = pKIXParameters.isRevocationEnabled();
        boolean z2 = false;
        pKIXParameters.setRevocationEnabled(false);
        if (z) {
            pKIXParameters.addCertPathChecker(new AndroidExtKeyUsageCertPathChecker());
        }
        if (a) {
            JCPLogger.fine("Checker of TSP certificate's critical extensions (app_policies) disabled.");
        } else {
            pKIXParameters.addCertPathChecker(new TSPCertPolicyChecker());
        }
        if (b) {
            JCPLogger.fine("Checker of certificate enroll cert type's critical extensions disabled.");
        } else {
            pKIXParameters.addCertPathChecker(new EnrollCertTypeExtensionChecker());
        }
        if (isRevocationEnabled) {
            z2 = "true".equalsIgnoreCase((String) AccessController.doPrivileged(new puu0(3)));
            if (z2) {
                pKIXParameters.setRevocationEnabled(true);
            } else {
                pKIXParameters.addCertPathChecker(new CrlRevocationChecker(null, pKIXParameters));
            }
        }
        try {
            LoggingUtils.logBase64EncodedChain("%%% Validate the certificate chain", certPath);
            return CertPathValidator.getInstance("PKIX").validate(certPath, pKIXParameters);
        } catch (NoSuchAlgorithmException e) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException();
            invalidAlgorithmParameterException.initCause(e.getCause());
            throw invalidAlgorithmParameterException;
        } catch (CertPathValidatorException e2) {
            if (!z2 || !Platform.isIbm) {
                throw e2;
            }
            CertPathValidatorException certPathValidatorException = new CertPathValidatorException("Could not determine revocation status");
            certPathValidatorException.initCause(e2);
            throw certPathValidatorException;
        }
    }
}
