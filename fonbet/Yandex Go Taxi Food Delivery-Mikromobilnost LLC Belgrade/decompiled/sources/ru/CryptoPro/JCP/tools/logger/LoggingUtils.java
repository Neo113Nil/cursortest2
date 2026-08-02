package ru.CryptoPro.JCP.tools.logger;

import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class LoggingUtils {
    public static void logBase64EncodedCertificate(String str, X509Certificate x509Certificate) {
        if (!JCPLogger.isFinerEnabled() || x509Certificate == null) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String encode = new Encoder().encode(x509Certificate.getEncoded());
            stringBuffer.append(str);
            stringBuffer.append("\nCertificate = ");
            stringBuffer.append("\n\tserial number: ");
            stringBuffer.append(x509Certificate.getSerialNumber().toString(16));
            stringBuffer.append("\n\tsubject: ");
            stringBuffer.append(x509Certificate.getSubjectDN());
            stringBuffer.append("\n\tissuer: ");
            stringBuffer.append(x509Certificate.getIssuerDN());
            stringBuffer.append("\n\tvalid from: ");
            stringBuffer.append(x509Certificate.getNotBefore());
            stringBuffer.append("\n\tvalid until: ");
            stringBuffer.append(x509Certificate.getNotAfter());
            stringBuffer.append("\n\t[BASE64]:\n");
            stringBuffer.append(encode);
        } catch (Exception e) {
            JCPLogger.ignoredException(e);
        }
        JCPLogger.finer(stringBuffer.toString());
    }

    public static void logBase64EncodedChain(String str, CertPath certPath) {
        if (!JCPLogger.isFinerEnabled() || certPath == null) {
            return;
        }
        Encoder encoder = new Encoder();
        List<? extends Certificate> certificates = certPath.getCertificates();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("\nCertificate chain size: ");
        stringBuffer.append(certificates.size());
        for (int i = 0; i < certificates.size(); i++) {
            X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
            stringBuffer.append("\nCertificate[");
            stringBuffer.append(i);
            stringBuffer.append("] = ");
            try {
                String encode = encoder.encode(x509Certificate.getEncoded());
                stringBuffer.append("\n\tserial number: ");
                stringBuffer.append(x509Certificate.getSerialNumber().toString(16));
                stringBuffer.append("\n\tsubject: ");
                stringBuffer.append(x509Certificate.getSubjectDN());
                stringBuffer.append("\n\tissuer: ");
                stringBuffer.append(x509Certificate.getIssuerDN());
                stringBuffer.append("\n\tvalid from: ");
                stringBuffer.append(x509Certificate.getNotBefore());
                stringBuffer.append("\n\tvalid until: ");
                stringBuffer.append(x509Certificate.getNotAfter());
                stringBuffer.append("\n\t[BASE64]:\n");
                stringBuffer.append(encode);
            } catch (Exception e) {
                JCPLogger.ignoredException(e);
            }
        }
        JCPLogger.finer(stringBuffer.toString());
    }

    public static void logBase64EncodedValue(String str, byte[] bArr) {
        if (!JCPLogger.isFinerEnabled() || bArr == null) {
            return;
        }
        JCPLogger.finer(str, new Encoder().encode(bArr));
    }
}
