package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.oyr;
import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.CryptoPrimitive;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import ru.CryptoPro.reprov.x509.AlgorithmId;

/* loaded from: classes4.dex */
public final class AlgorithmChecker extends PKIXCertPathChecker {
    public static final Set w = Collections.unmodifiableSet(EnumSet.of(CryptoPrimitive.SIGNATURE));
    public static final DisabledAlgorithmConstraints x = new DisabledAlgorithmConstraints("jdk.certpath.disabledAlgorithms");
    public final AlgorithmConstraints a;
    public final PublicKey b;
    public PublicKey c;

    public AlgorithmChecker(TrustAnchor trustAnchor, AlgorithmConstraints algorithmConstraints) {
        if (trustAnchor == null) {
            ny61.g("The trust anchor cannot be null");
            throw null;
        }
        this.b = trustAnchor.getTrustedCert() != null ? trustAnchor.getTrustedCert().getPublicKey() : trustAnchor.getCAPublicKey();
        this.c = this.b;
        this.a = algorithmConstraints;
    }

    public static void a(PublicKey publicKey, X509CRL x509crl) {
        try {
            AlgorithmId algorithmId = AlgorithmId.get(x509crl.getSigAlgOID());
            String name = algorithmId.getName();
            if (x.permits(w, name, publicKey, algorithmId.getParameters())) {
                return;
            }
            if (!er61.a()) {
                throw new CertPathValidatorException(oyr.p("algorithm check failed: ", name, " is disabled"));
            }
            throw new CertPathValidatorException(oyr.p("algorithm check failed: ", name, " is disabled"), null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
        } catch (NoSuchAlgorithmException e) {
            throw new CertPathValidatorException(e);
        }
    }

    public final void b(TrustAnchor trustAnchor) {
        if (this.c == null) {
            if (trustAnchor == null) {
                ny61.g("The trust anchor cannot be null");
            } else if (trustAnchor.getTrustedCert() != null) {
                this.c = trustAnchor.getTrustedCert().getPublicKey();
            } else {
                this.c = trustAnchor.getCAPublicKey();
            }
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        AlgorithmConstraints algorithmConstraints;
        String str;
        if (!(certificate instanceof X509Certificate) || (algorithmConstraints = this.a) == null) {
            return;
        }
        PublicKey publicKey = certificate.getPublicKey();
        X509Certificate x509Certificate = (X509Certificate) certificate;
        String sigAlgName = x509Certificate.getSigAlgName();
        try {
            AlgorithmParameters parameters = AlgorithmId.get(((X509Certificate) certificate).getSigAlgOID()).getParameters();
            Set<CryptoPrimitive> set = w;
            if (!algorithmConstraints.permits(set, sigAlgName, parameters)) {
                if (!er61.a()) {
                    throw new CertPathValidatorException(g8e.o("Algorithm constraints check failed: ", sigAlgName));
                }
                throw new CertPathValidatorException(g8e.o("Algorithm constraints check failed: ", sigAlgName), null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
            }
            boolean[] keyUsage = x509Certificate.getKeyUsage();
            if (keyUsage == null || keyUsage.length >= 9) {
                if (keyUsage != null) {
                    EnumSet noneOf = EnumSet.noneOf(CryptoPrimitive.class);
                    if (keyUsage[0] || keyUsage[1] || keyUsage[5] || keyUsage[6]) {
                        noneOf.add(CryptoPrimitive.SIGNATURE);
                    }
                    if (keyUsage[2]) {
                        noneOf.add(CryptoPrimitive.KEY_ENCAPSULATION);
                    }
                    if (keyUsage[3]) {
                        noneOf.add(CryptoPrimitive.PUBLIC_KEY_ENCRYPTION);
                    }
                    if (keyUsage[4]) {
                        noneOf.add(CryptoPrimitive.KEY_AGREEMENT);
                    }
                    if (!noneOf.isEmpty() && !algorithmConstraints.permits(noneOf, publicKey)) {
                        if (er61.a()) {
                            throw new CertPathValidatorException("algorithm constraints check failed", null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
                        }
                        str = "algorithm constraints check failed";
                    }
                }
                PublicKey publicKey2 = this.c;
                if (publicKey2 != null) {
                    if (sigAlgName != null && !algorithmConstraints.permits(set, sigAlgName, publicKey2, parameters)) {
                        if (!er61.a()) {
                            throw new CertPathValidatorException("Algorithm constraints check failed: ".concat(sigAlgName));
                        }
                        throw new CertPathValidatorException("Algorithm constraints check failed: ".concat(sigAlgName), null, null, -1, CertPathValidatorException.BasicReason.ALGORITHM_CONSTRAINED);
                    }
                    if ((publicKey instanceof DSAPublicKey) && ((DSAPublicKey) publicKey).getParams() == null) {
                        PublicKey publicKey3 = this.c;
                        if (publicKey3 instanceof DSAPublicKey) {
                            DSAParams params = ((DSAPublicKey) publicKey3).getParams();
                            if (params != null) {
                                try {
                                    publicKey = KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(((DSAPublicKey) publicKey).getY(), params.getP(), params.getQ(), params.getG()));
                                } catch (GeneralSecurityException e) {
                                    throw new CertPathValidatorException("Unable to generate key with inherited parameters: " + e.getMessage(), e);
                                }
                            } else {
                                str = "Key parameters missing";
                            }
                        } else {
                            str = "Input key is not of a appropriate type for inheriting parameters";
                        }
                    }
                }
                this.c = publicKey;
                return;
            }
            if (er61.a()) {
                throw new CertPathValidatorException("incorrect KeyUsage extension", null, null, -1, PKIXReason.INVALID_KEY_USAGE);
            }
            str = "incorrect KeyUsage extension";
            dy31.r(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new CertPathValidatorException(e2);
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
            return;
        }
        PublicKey publicKey = this.b;
        if (publicKey != null) {
            this.c = publicKey;
        } else {
            this.c = null;
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }

    public AlgorithmChecker(TrustAnchor trustAnchor) {
        this(trustAnchor, x);
    }

    public AlgorithmChecker(AlgorithmConstraints algorithmConstraints) {
        this.c = null;
        this.b = null;
        this.a = algorithmConstraints;
    }
}
