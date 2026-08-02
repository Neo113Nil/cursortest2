package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class CertificateTemplateNameProcessor extends JCPRequestExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        String errorParamMessage;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("1.3.6.1.4.1.311.20.2"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        Asn1BMPString asn1BMPString = new Asn1BMPString();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            asn1BMPString.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            errorParamMessage = asn1BMPString.toString();
        } catch (Asn1Exception | IOException unused) {
            errorParamMessage = ExtensionProcessor.getErrorParamMessage();
        }
        return new Extension(getName(), new Extension(errorParamMessage));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "1.3.6.1.4.1.311.20.2";
    }
}
