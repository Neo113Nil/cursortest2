package ru.CryptoPro.JCP.KeyStore;

import defpackage.ny61;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
public final class JCPPrivateKeyEntry implements KeyStore.Entry {
    public final PrivateKey a;
    public final Certificate[] b;
    public final boolean c;

    public JCPPrivateKeyEntry(PrivateKey privateKey, Certificate[] certificateArr, boolean z, boolean z2, boolean z3) {
        Certificate[] certificateArr2;
        this.c = z3;
        if (!z2 && privateKey == null) {
            ny61.t("invalid null input for private key");
            throw null;
        }
        if (!z && certificateArr == null) {
            ny61.t("invalid null input for certificate chain");
            throw null;
        }
        if (!z && certificateArr.length == 0) {
            ny61.g("invalid zero-length input chain");
            throw null;
        }
        if (certificateArr == null || certificateArr.length <= 0) {
            certificateArr2 = null;
        } else {
            certificateArr2 = (Certificate[]) certificateArr.clone();
            String type = certificateArr2[0].getType();
            for (int i = 1; i < certificateArr2.length; i++) {
                if (!type.equals(certificateArr2[i].getType())) {
                    ny61.g("chain does not contain certificates of the same type");
                    throw null;
                }
            }
        }
        this.a = privateKey;
        if (certificateArr2 == null) {
            this.b = null;
            return;
        }
        if (!(certificateArr2[0] instanceof X509Certificate) || (certificateArr2 instanceof X509Certificate[])) {
            this.b = certificateArr2;
            return;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[certificateArr2.length];
        this.b = x509CertificateArr;
        System.arraycopy(certificateArr2, 0, x509CertificateArr, 0, certificateArr2.length);
    }

    public Certificate getCertificate() {
        Certificate[] certificateArr = this.b;
        if (certificateArr != null) {
            return certificateArr[0];
        }
        return null;
    }

    public Certificate[] getCertificateChain() {
        Certificate[] certificateArr = this.b;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    public PrivateKey getPrivateKey() {
        return this.a;
    }

    public boolean isExportable() {
        return this.c;
    }

    public String toString() {
        Certificate[] certificateArr = this.b;
        int length = certificateArr != null ? certificateArr.length : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Private key entry and certificate chain with " + length + " elements:\r\n");
        if (length > 0) {
            for (Certificate certificate : certificateArr) {
                sb.append(certificate);
                sb.append(Constants.LINE_SEPARATOR);
            }
        }
        return sb.toString();
    }

    public JCPPrivateKeyEntry(PrivateKey privateKey, Certificate[] certificateArr, boolean z) {
        this(privateKey, certificateArr, z, false);
    }

    public JCPPrivateKeyEntry(PrivateKey privateKey, Certificate[] certificateArr, boolean z, boolean z2) {
        this(privateKey, certificateArr, z, z2, true);
    }

    public JCPPrivateKeyEntry(PrivateKey privateKey, Certificate[] certificateArr) {
        this(privateKey, certificateArr, false);
    }
}
