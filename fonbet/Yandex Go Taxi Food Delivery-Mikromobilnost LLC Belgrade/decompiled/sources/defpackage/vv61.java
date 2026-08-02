package defpackage;

import java.security.AlgorithmConstraints;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.ssl.pc_10.cl_6;
import ru.CryptoPro.ssl.util.SecureChecker;

/* loaded from: classes4.dex */
public abstract class vv61 {
    public static final X509Certificate[] d = new X509Certificate[0];
    public static final CertificateFactory e;
    public final String a;
    public final ag1 b;
    public final String c;

    static {
        try {
            e = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        } catch (CertificateException e2) {
            ny61.j(e2);
        }
    }

    public vv61(String str, String str2) {
        this.a = str;
        this.c = str2;
        this.b = new ag1(str2, 10);
    }

    public abstract Collection a();

    public abstract X509Certificate[] b(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, Object obj);

    public final X509Certificate[] c(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, String str) {
        X509Certificate[] b = b(x509CertificateArr, algorithmConstraints, str);
        if (b.length > 1) {
            boolean equalsIgnoreCase = this.a.equalsIgnoreCase("PKIX");
            X509Certificate x509Certificate = b[0];
            ag1 ag1Var = this.b;
            String str2 = ag1Var.b;
            if (!str2.equals("generic")) {
                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                if (criticalExtensionOIDs == null) {
                    criticalExtensionOIDs = Collections.EMPTY_SET;
                }
                if (str2.equals("tls server")) {
                    if (!ag1.d(KeyUsage.STR_OID_PKIX_SERVER_AUTH, x509Certificate)) {
                        throw new cl_6("Extended key usage does not permit use for TLS server authentication", "End entity certificate extension check failed", x509Certificate);
                    }
                } else if (str2.equals("tls client")) {
                    if (!ag1.d("1.3.6.1.5.5.7.3.2", x509Certificate)) {
                        throw new cl_6("Extended key usage does not permit use for TLS client authentication", "End entity certificate extension check failed", x509Certificate);
                    }
                } else if (str2.equals("code signing") || str2.equals("jce signing") || str2.equals("plugin code signing")) {
                    ag1Var.b(x509Certificate, criticalExtensionOIDs);
                } else {
                    if (!str2.equals("tsa server")) {
                        throw new CertificateException("Unknown variant: ".concat(str2));
                    }
                    boolean[] keyUsage = x509Certificate.getKeyUsage();
                    if (keyUsage != null && (keyUsage.length <= 0 || !keyUsage[0])) {
                        throw new cl_6("KeyUsage does not allow digital signatures", "End entity certificate extension check failed", x509Certificate);
                    }
                    if (x509Certificate.getExtendedKeyUsage() == null) {
                        throw new cl_6("Certificate does not contain an extended key usage extension required for a TSA server", "End entity certificate extension check failed", x509Certificate);
                    }
                    if (!ag1.d("1.3.6.1.5.5.7.3.8", x509Certificate)) {
                        throw new cl_6("Extended key usage does not permit use for TSA server", "End entity certificate extension check failed", x509Certificate);
                    }
                    criticalExtensionOIDs.remove(AdESUtility.KEY_USAGE);
                    criticalExtensionOIDs.remove(AdESUtility.EXTENDED_KEY_USAGE);
                    ag1.c(criticalExtensionOIDs);
                }
                if (!equalsIgnoreCase) {
                    ag1.c(criticalExtensionOIDs);
                }
            }
        }
        SecureChecker.checkPublicKeys(b);
        return b;
    }
}
