package ru.CryptoPro.JCP.tools;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.reprov.RevCheck;

/* loaded from: classes4.dex */
public class CertChainParser {
    public final Certificate[] a;
    public Certificate[] b = null;
    public X509Certificate[] c = null;
    public PKIXBuilderParameters d;
    public final Certificate e;
    public final Certificate[] f;
    public Certificate g;

    public CertChainParser(Certificate[] certificateArr, Certificate certificate, Certificate[] certificateArr2) {
        Certificate[] certificateArr3 = new Certificate[certificateArr.length];
        this.a = certificateArr3;
        System.arraycopy(certificateArr, 0, certificateArr3, 0, certificateArr.length);
        this.e = certificate;
        Certificate[] certificateArr4 = new Certificate[certificateArr2.length];
        this.f = certificateArr4;
        System.arraycopy(certificateArr2, 0, certificateArr4, 0, certificateArr2.length);
    }

    public final PKIXCertPathBuilderResult a(Certificate certificate, Certificate[] certificateArr, HashSet hashSet, int i, Certificate certificate2, Certificate[] certificateArr2) {
        try {
            if (certificate == null) {
                if (i > 1) {
                    for (int i2 = 0; i2 < i; i2++) {
                        try {
                            return this.b(certificateArr, hashSet, certificate);
                        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | CertPathBuilderException unused) {
                        }
                    }
                    return null;
                }
                if (i == 0) {
                    try {
                        if (hashSet.size() != certificateArr.length) {
                            certificate = certificate2;
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        throw new ChainParserException(e.getMessage());
                    } catch (NoSuchAlgorithmException e2) {
                        throw new ChainParserException(e2.getMessage());
                    } catch (CertPathBuilderException e3) {
                        throw new ChainParserException(e3.getMessage());
                    }
                }
                if (i == 1) {
                    certificate = certificateArr2[0];
                }
            }
            return b(certificateArr, hashSet, certificate);
        } catch (NoSuchProviderException e4) {
            throw new ChainParserException(e4.getMessage());
        }
    }

    public final PKIXCertPathBuilderResult b(Certificate[] certificateArr, HashSet hashSet, Certificate certificate) {
        ArrayList arrayList = new ArrayList(0);
        for (Certificate certificate2 : certificateArr) {
            arrayList.add(certificate2);
        }
        this.d = new PKIXBuilderParameters(hashSet, (CertSelector) null);
        this.d.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
        X509CertSelector x509CertSelector = new X509CertSelector();
        x509CertSelector.setCertificate((X509Certificate) certificate);
        this.d.setTargetCertConstraints(x509CertSelector);
        this.d.setRevocationEnabled(false);
        return (PKIXCertPathBuilderResult) CertPathBuilder.getInstance(RevCheck.CP_REV_CHECK_ALG, RevCheck.PROVIDER_NAME).build(this.d);
    }

    public final X509Certificate c(HashSet hashSet, Certificate[] certificateArr) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            int length = certificateArr.length;
            Certificate[] certificateArr2 = new Certificate[length];
            for (int i = 0; i < length; i++) {
                certificateArr2[(length - 1) - i] = certificateArr[i];
            }
            certificateArr2[length - 1] = trustAnchor.getTrustedCert();
            try {
                CertPathValidator.getInstance(RevCheck.CP_REV_CHECK_ALG, RevCheck.PROVIDER_NAME).validate(CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertPath(Arrays.asList(certificateArr2)), this.d);
                return trustAnchor.getTrustedCert();
            } catch (CertPathValidatorException unused) {
            }
        }
        return null;
    }

    public Certificate[] getChain() {
        return this.b;
    }

    public X509Certificate[] getX509Chain() {
        return this.c;
    }

    public void parseChain() throws ChainParserException {
        Certificate[] certificateArr;
        PKIXCertPathBuilderResult a;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.getActualMinimum(1));
        Date time = calendar.getTime();
        HashSet hashSet = new HashSet(0);
        Certificate[] certificateArr2 = this.a;
        if (certificateArr2.length > 1) {
            Certificate[] certificateArr3 = new Certificate[certificateArr2.length];
            Certificate[] certificateArr4 = this.f;
            if (certificateArr4 != null) {
                for (Certificate certificate : certificateArr4) {
                    hashSet.add(new TrustAnchor((X509Certificate) certificate, null));
                }
            }
            Certificate certificate2 = this.e;
            Date date = time;
            Certificate certificate3 = certificate2 != null ? certificate2 : null;
            int i = 0;
            Certificate certificate4 = null;
            for (int i2 = 0; i2 < certificateArr2.length; i2++) {
                if (certificateArr4 == null && ((X509Certificate) certificateArr2[i2]).getBasicConstraints() > -1 && ((X509Certificate) certificateArr2[i2]).getIssuerX500Principal().getName().equals(((X509Certificate) certificateArr2[i2]).getSubjectX500Principal().getName())) {
                    hashSet.add(new TrustAnchor((X509Certificate) certificateArr2[i2], null));
                }
                if (certificate2 == null) {
                    if (((X509Certificate) certificateArr2[i2]).getBasicConstraints() == -1) {
                        certificateArr3[i] = certificateArr2[i2];
                        i++;
                    }
                    if (((X509Certificate) certificateArr2[i2]).getNotBefore().getTime() > date.getTime()) {
                        date = ((X509Certificate) certificateArr2[i2]).getNotBefore();
                        certificate4 = certificateArr2[i2];
                    }
                }
            }
            if (hashSet.size() == 0) {
                int i3 = 0;
                a = null;
                for (int i4 = 0; i4 < certificateArr2.length; i4++) {
                    hashSet = new HashSet(0);
                    hashSet.add(new TrustAnchor((X509Certificate) certificateArr2[i4], null));
                    try {
                        PKIXCertPathBuilderResult a2 = a(certificate3, certificateArr2, hashSet, i, certificate4, certificateArr3);
                        List<? extends Certificate> certificates = a2.getCertPath().getCertificates();
                        if (certificates.size() > i3) {
                            i3 = certificates.size();
                            try {
                                this.g = certificateArr2[i4];
                            } catch (NullPointerException | ChainParserException unused) {
                            }
                            a = a2;
                        }
                    } catch (NullPointerException | ChainParserException unused2) {
                    }
                }
            } else {
                a = a(certificate3, certificateArr2, hashSet, i, certificate4, certificateArr3);
            }
            if (a == null) {
                throw new ChainParserException("Chain not found");
            }
            try {
                List<? extends Certificate> certificates2 = a.getCertPath().getCertificates();
                int size = certificates2.size();
                certificateArr = new X509Certificate[size + 1];
                for (int i5 = 0; i5 < certificates2.size(); i5++) {
                    certificateArr[size - i5] = (X509Certificate) certificates2.get(i5);
                }
                Certificate certificate5 = this.g;
                if (certificate5 != null) {
                    certificateArr[0] = certificate5;
                } else if (hashSet.size() == 1) {
                    certificateArr[0] = ((TrustAnchor) hashSet.iterator().next()).getTrustedCert();
                } else {
                    certificateArr[0] = c(hashSet, certificateArr);
                }
            } catch (InvalidAlgorithmParameterException e) {
                throw new ChainParserException(e.getMessage());
            } catch (NoSuchAlgorithmException e2) {
                throw new ChainParserException(e2.getMessage());
            } catch (NoSuchProviderException e3) {
                throw new ChainParserException(e3.getMessage());
            } catch (CertificateException e4) {
                throw new ChainParserException(e4.getMessage());
            }
        } else {
            certificateArr = new Certificate[]{certificateArr2[0]};
        }
        this.b = new Certificate[certificateArr.length];
        this.c = new X509Certificate[certificateArr.length];
        for (int i6 = 0; i6 < certificateArr.length; i6++) {
            this.b[(r1.length - 1) - i6] = certificateArr[i6];
            this.c[(r1.length - 1) - i6] = (X509Certificate) certificateArr[i6];
        }
    }

    public CertChainParser(Certificate[] certificateArr, Certificate certificate) {
        Certificate[] certificateArr2 = new Certificate[certificateArr.length];
        this.a = certificateArr2;
        System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
        this.e = certificate;
    }

    public CertChainParser(Certificate[] certificateArr) {
        Certificate[] certificateArr2 = new Certificate[certificateArr.length];
        this.a = certificateArr2;
        System.arraycopy(certificateArr, 0, certificateArr2, 0, certificateArr.length);
    }
}
