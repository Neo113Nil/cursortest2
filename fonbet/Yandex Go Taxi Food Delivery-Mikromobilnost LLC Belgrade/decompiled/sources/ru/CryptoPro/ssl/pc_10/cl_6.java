package ru.CryptoPro.ssl.pc_10;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public class cl_6 extends CertificateException {
    public static final /* synthetic */ int a = 0;
    private Object j;
    private X509Certificate k;

    public cl_6(String str, String str2, X509Certificate x509Certificate) {
        super(str);
        this.j = str2;
        this.k = x509Certificate;
    }

    public final Object a() {
        return this.j;
    }

    public cl_6(String str, GeneralSecurityException generalSecurityException) {
        super(str);
        initCause(generalSecurityException);
    }

    public cl_6(String str, X509Certificate x509Certificate) {
        super(str);
        this.j = str;
        this.k = x509Certificate;
    }

    public cl_6(String str, X509Certificate x509Certificate, GeneralSecurityException generalSecurityException) {
        this(str, x509Certificate);
        initCause(generalSecurityException);
    }
}
