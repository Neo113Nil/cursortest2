package ru.CryptoPro.JCPRequest.cert;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class SubjectAltNameProcessor extends AltNameProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        try {
            return a(x509Certificate.getSubjectAlternativeNames());
        } catch (CertificateParsingException unused) {
            return new Extension(this.getName(), new Extension(ExtensionProcessor.getErrorParamMessage()));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "2.5.29.17";
    }
}
