package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class CertSrvCAVersionProcessor extends JCPRequestExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        String errorParamMessage;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("1.3.6.1.4.1.311.21.1"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        Asn1Integer asn1Integer = new Asn1Integer();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            asn1Integer.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            long j = asn1Integer.value;
            ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
            errorParamMessage = resourceBundle.getString("CertSrvCAVersion.cerIndex").concat(Extension.COLON_SPACE).concat(Long.toString(65535 & j)).concat(Extension.FIX_SPACE).concat(resourceBundle.getString("CertSrvCAVersion.keyIndex")).concat(Extension.COLON_SPACE).concat(Long.toString(j >>> 16));
        } catch (Asn1Exception | IOException unused) {
            errorParamMessage = ExtensionProcessor.getErrorParamMessage();
        }
        return new Extension(getName(), new Extension(errorParamMessage));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "1.3.6.1.4.1.311.21.1";
    }
}
