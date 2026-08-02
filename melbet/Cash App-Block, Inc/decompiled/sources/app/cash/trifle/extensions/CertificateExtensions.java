package app.cash.trifle.extensions;

import app.cash.trifle.Certificate;
import app.cash.trifle.validators.CertChainValidator$X509CertChainValidator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class CertificateExtensions {
    public static final CertificateFactory X509FACTORY = CertificateFactory.getInstance("X509");

    public static X509Certificate toX509Certificate(Certificate certificate) {
        certificate.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(certificate.certificate);
        try {
            java.security.cert.Certificate generateCertificate = X509FACTORY.generateCertificate(byteArrayInputStream);
            generateCertificate.getClass();
            X509Certificate x509Certificate = (X509Certificate) generateCertificate;
            byteArrayInputStream.close();
            return x509Certificate;
        } finally {
        }
    }

    /* renamed from: validate-0E7RQCE, reason: not valid java name */
    public static Object m1426validate0E7RQCE(Certificate certificate, ArrayList arrayList) {
        certificate.getClass();
        if (certificate.version == 0) {
            return new CertChainValidator$X509CertChainValidator(certificate).m1427validateIoAF18A(arrayList);
        }
        a$$ExternalSyntheticBUOutline0.m("Unsupported version of Trifle Certificate");
        return null;
    }
}
