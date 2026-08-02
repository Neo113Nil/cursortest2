package defpackage;

import java.security.AlgorithmConstraints;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCPRequest.KeyUsage;
import ru.CryptoPro.ssl.util.SecureChecker;
import ru.CryptoPro.sspiSSL.pc_3.cl_7;

/* loaded from: classes4.dex */
public abstract class qw61 {
    public static final X509Certificate[] d = new X509Certificate[0];
    public static final CertificateFactory e;
    public final String a;
    public final bg1 b;
    public final String c;

    static {
        try {
            e = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        } catch (CertificateException e2) {
            ny61.j(e2);
        }
    }

    public qw61(String str, String str2) {
        this.a = str;
        this.c = str2;
        this.b = new bg1(str2, 19);
    }

    public static qw61 a(String str, String str2, PKIXBuilderParameters pKIXBuilderParameters) {
        if (str.equals("LIBSSPI")) {
            return new wq61(str2);
        }
        if (str.equals("PKIX")) {
            return new nu61(str2, pKIXBuilderParameters);
        }
        ny61.g("getInstance(PKIXBuilderParameters) can only be used with PKIX validator");
        return null;
    }

    public abstract Collection b();

    public abstract X509Certificate[] c(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, Object obj);

    public final X509Certificate[] d(X509Certificate[] x509CertificateArr, es61 es61Var, String str) {
        X509Certificate[] c = c(x509CertificateArr, es61Var, str);
        if (c.length > 1) {
            boolean equalsIgnoreCase = this.a.equalsIgnoreCase("PKIX");
            X509Certificate x509Certificate = c[0];
            bg1 bg1Var = this.b;
            String str2 = bg1Var.b;
            if (!str2.equals("generic")) {
                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                if (criticalExtensionOIDs == null) {
                    criticalExtensionOIDs = Collections.EMPTY_SET;
                }
                if (str2.equals("tls server")) {
                    if (!bg1.k(KeyUsage.STR_OID_PKIX_SERVER_AUTH, x509Certificate)) {
                        throw new cl_7("Extended key usage does not permit use for TLS server authentication", "End entity certificate extension check failed", x509Certificate);
                    }
                } else if (str2.equals("tls client")) {
                    if (!bg1.k("1.3.6.1.5.5.7.3.2", x509Certificate)) {
                        throw new cl_7("Extended key usage does not permit use for TLS client authentication", "End entity certificate extension check failed", x509Certificate);
                    }
                } else if (str2.equals("code signing") || str2.equals("jce signing") || str2.equals("plugin code signing")) {
                    bg1Var.h(x509Certificate, criticalExtensionOIDs);
                } else {
                    if (!str2.equals("tsa server")) {
                        throw new CertificateException("Unknown variant: ".concat(str2));
                    }
                    boolean[] keyUsage = x509Certificate.getKeyUsage();
                    if (keyUsage != null && (keyUsage.length <= 0 || !keyUsage[0])) {
                        throw new cl_7("KeyUsage does not allow digital signatures", "End entity certificate extension check failed", x509Certificate);
                    }
                    if (x509Certificate.getExtendedKeyUsage() == null) {
                        throw new cl_7("Certificate does not contain an extended key usage extension required for a TSA server", "End entity certificate extension check failed", x509Certificate);
                    }
                    if (!bg1.k("1.3.6.1.5.5.7.3.8", x509Certificate)) {
                        throw new cl_7("Extended key usage does not permit use for TSA server", "End entity certificate extension check failed", x509Certificate);
                    }
                    criticalExtensionOIDs.remove(AdESUtility.KEY_USAGE);
                    criticalExtensionOIDs.remove(AdESUtility.EXTENDED_KEY_USAGE);
                    bg1.j(criticalExtensionOIDs);
                }
                if (!equalsIgnoreCase) {
                    bg1.j(criticalExtensionOIDs);
                }
            }
        }
        SecureChecker.checkPublicKeys(c);
        return c;
    }
}
