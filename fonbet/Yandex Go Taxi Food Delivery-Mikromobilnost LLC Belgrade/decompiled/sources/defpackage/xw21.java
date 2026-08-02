package defpackage;

import android.net.http.SslCertificate;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public abstract class xw21 {
    public static X509Certificate a(SslCertificate sslCertificate) {
        return sslCertificate.getX509Certificate();
    }
}
