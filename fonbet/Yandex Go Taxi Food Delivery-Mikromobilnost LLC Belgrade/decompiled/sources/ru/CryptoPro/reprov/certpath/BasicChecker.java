package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.X500Name;
import ru.CryptoPro.reprov.x509.X500Principal;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes4.dex */
class BasicChecker extends PKIXCertPathChecker {
    public final PublicKey a;
    public final X500Principal b;
    public final Date c;
    public final String w;
    public final boolean x;
    public X500Principal y;
    public PublicKey z;

    public BasicChecker(TrustAnchor trustAnchor, Date date, String str) {
        X500Principal x500Principal;
        if (trustAnchor.getTrustedCert() != null) {
            this.a = trustAnchor.getTrustedCert().getPublicKey();
            if (trustAnchor.getTrustedCert().getSubjectX500Principal() != null) {
                x500Principal = new X500Principal(trustAnchor.getTrustedCert().getSubjectX500Principal().getEncoded());
                this.b = x500Principal;
            }
            this.b = null;
        } else {
            this.a = trustAnchor.getCAPublicKey();
            if (trustAnchor.getCA() != null) {
                x500Principal = new X500Principal(trustAnchor.getCA().getEncoded());
                this.b = x500Principal;
            }
            this.b = null;
        }
        this.c = date;
        this.w = str;
        this.x = true;
        init(false);
    }

    public static PublicKey a(PublicKey publicKey, PublicKey publicKey2) {
        String str;
        if ((publicKey instanceof DSAPublicKey) && (publicKey2 instanceof DSAPublicKey)) {
            DSAParams params = ((DSAPublicKey) publicKey2).getParams();
            if (params != null) {
                try {
                    return KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(((DSAPublicKey) publicKey).getY(), params.getP(), params.getQ(), params.getG()));
                } catch (GeneralSecurityException e) {
                    throw new CertPathValidatorException("Unable to generate key with inherited parameters: " + e.getMessage(), e);
                }
            }
            str = "Key parameters missing";
        } else {
            str = "Input key is not appropriate type for inheriting parameters";
        }
        dy31.r(str);
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (!this.x) {
            Date date = this.c;
            JCPLogger.finerFormat("---checking {0}: {1}...", ClidProvider.TIMESTAMP, date);
            try {
                x509Certificate.checkValidity(date);
                JCPLogger.finerFormat("{0} verified.", ClidProvider.TIMESTAMP);
                X500Principal x500Principal = this.y;
                if (x500Principal != null) {
                    JCPLogger.finerFormat("---checking {0}...", "subject/issuer name chaining");
                    X500Principal x500Principal2 = x509Certificate.getIssuerX500Principal() != null ? new X500Principal(x509Certificate.getIssuerX500Principal().getEncoded()) : null;
                    if (X500Name.asX500Name(x500Principal2).isEmpty()) {
                        if (er61.a()) {
                            throw new CertPathValidatorException("subject/issuer name chaining check failed: empty/null issuer DN in certificate is invalid", null, null, -1, PKIXReason.NAME_CHAINING);
                        }
                        dy31.r("subject/issuer name chaining check failed: empty/null issuer DN in certificate is invalid");
                        return;
                    } else {
                        if (!x500Principal2.equals(x500Principal)) {
                            if (er61.a()) {
                                throw new CertPathValidatorException("subject/issuer name chaining check failed", null, null, -1, PKIXReason.NAME_CHAINING);
                            }
                            dy31.r("subject/issuer name chaining check failed");
                            return;
                        }
                        JCPLogger.finerFormat("{0} verified.", "subject/issuer name chaining");
                    }
                }
            } catch (CertificateExpiredException e) {
                if (!er61.a()) {
                    throw new CertPathValidatorException("timestamp check failed", e);
                }
                throw new CertPathValidatorException("timestamp check failed", e, null, -1, CertPathValidatorException.BasicReason.EXPIRED);
            } catch (CertificateNotYetValidException e2) {
                if (!er61.a()) {
                    throw new CertPathValidatorException("timestamp check failed", e2);
                }
                throw new CertPathValidatorException("timestamp check failed", e2, null, -1, CertPathValidatorException.BasicReason.NOT_YET_VALID);
            }
        }
        PublicKey publicKey = this.z;
        String str = this.w;
        JCPLogger.finerFormat("---checking {0}...", X509CertImpl.SIGNATURE);
        try {
            x509Certificate.verify(publicKey, str);
            JCPLogger.finerFormat("{0} verified.", X509CertImpl.SIGNATURE);
            PublicKey publicKey2 = x509Certificate.getPublicKey();
            JCPLogger.finerFormat("BasicChecker.updateState issuer: {0}; subject: {1}; serial#: {2}", x509Certificate.getIssuerX500Principal(), x509Certificate.getSubjectX500Principal(), x509Certificate.getSerialNumber());
            if ((publicKey2 instanceof DSAPublicKey) && ((DSAPublicKey) publicKey2).getParams() == null) {
                publicKey2 = a(publicKey2, this.z);
                JCPLogger.finer("BasicChecker.updateState Made key with inherited params");
            }
            this.z = publicKey2;
            if (x509Certificate.getSubjectX500Principal() != null) {
                this.y = new X500Principal(x509Certificate.getSubjectX500Principal().getEncoded());
            }
        } catch (SignatureException e3) {
            if (!er61.a()) {
                throw new CertPathValidatorException("signature check failed", e3);
            }
            throw new CertPathValidatorException("signature check failed", e3, null, -1, CertPathValidatorException.BasicReason.INVALID_SIGNATURE);
        } catch (Exception e4) {
            throw new CertPathValidatorException("signature check failed", e4);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        return null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
        } else {
            this.z = this.a;
            this.y = this.b;
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
