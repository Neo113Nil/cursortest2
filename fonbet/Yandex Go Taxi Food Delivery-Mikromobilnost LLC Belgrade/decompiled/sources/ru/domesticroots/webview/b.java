package ru.domesticroots.webview;

import defpackage.lb7;
import defpackage.tgz;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes9.dex */
public final class b {
    public final tgz a;
    public final lb7 b;

    public b(tgz tgzVar) {
        lb7 lb7Var = new lb7(tgzVar);
        this.a = tgzVar;
        this.b = lb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CertificateChainVerifier$Result a(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr, X509TrustManager x509TrustManager) {
        X509Certificate[] x509CertificateArr2;
        int length = x509CertificateArr.length;
        tgz tgzVar = this.a;
        if (length == 0) {
            tgzVar.r("Empty certificate chain");
            return CertificateChainVerifier$Result.TRANSIENT_FAILURE;
        }
        if (!x509CertificateArr[0].equals(x509Certificate)) {
            tgzVar.r("Found a mismatch between the leaf certificate in the chain and the certificate from the original SSLError.");
            return CertificateChainVerifier$Result.TRANSIENT_FAILURE;
        }
        try {
            x509TrustManager.checkServerTrusted(x509CertificateArr, "RSA");
            return CertificateChainVerifier$Result.TRUSTED;
        } catch (CertificateException unused) {
            tgzVar.getClass();
            lb7 lb7Var = this.b;
            lb7Var.getClass();
            tgz tgzVar2 = (tgz) lb7Var.c;
            try {
                x509CertificateArr2 = lb7Var.m(x509CertificateArr);
            } catch (RuntimeException e) {
                tgzVar2.s(e, "Failed to complete certificate chain via AIA");
                x509CertificateArr2 = x509CertificateArr;
            }
            if (x509CertificateArr2.length != x509CertificateArr.length) {
                try {
                    x509TrustManager.checkServerTrusted(x509CertificateArr2, "RSA");
                    return CertificateChainVerifier$Result.TRUSTED;
                } catch (CertificateException unused2) {
                    if (x509CertificateArr.length > 1) {
                        X509Certificate[] x509CertificateArr3 = {x509CertificateArr[0]};
                        try {
                            x509CertificateArr3 = lb7Var.m(x509CertificateArr3);
                        } catch (RuntimeException e2) {
                            tgzVar2.s(e2, "Failed to complete certificate chain via AIA");
                        }
                        if (x509CertificateArr3.length > 1) {
                            try {
                                x509TrustManager.checkServerTrusted(x509CertificateArr3, "RSA");
                                return CertificateChainVerifier$Result.TRUSTED;
                            } catch (CertificateException unused3) {
                                if (x509CertificateArr2.length != 0) {
                                }
                                return CertificateChainVerifier$Result.TRANSIENT_FAILURE;
                            }
                        }
                    }
                    if (x509CertificateArr2.length != 0) {
                        X509Certificate x509Certificate2 = x509CertificateArr2[x509CertificateArr2.length - 1];
                        if (x509Certificate2.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
                            for (X509Certificate x509Certificate3 : x509TrustManager.getAcceptedIssuers()) {
                                if (!x509Certificate3.equals(x509Certificate2)) {
                                }
                            }
                            return CertificateChainVerifier$Result.UNTRUSTED_ROOT;
                        }
                    }
                    return CertificateChainVerifier$Result.TRANSIENT_FAILURE;
                }
            }
            if (x509CertificateArr.length > 1) {
            }
            if (x509CertificateArr2.length != 0) {
            }
            return CertificateChainVerifier$Result.TRANSIENT_FAILURE;
        }
    }
}
