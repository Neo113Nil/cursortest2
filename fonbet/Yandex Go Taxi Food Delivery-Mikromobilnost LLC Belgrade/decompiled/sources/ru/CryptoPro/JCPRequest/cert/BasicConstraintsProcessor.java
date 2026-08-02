package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.BasicConstraintsSyntax;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class BasicConstraintsProcessor extends JCPRequestExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        String errorParamMessage;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("2.5.29.19"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        BasicConstraintsSyntax basicConstraintsSyntax = new BasicConstraintsSyntax();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            basicConstraintsSyntax.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            Asn1Boolean asn1Boolean = basicConstraintsSyntax.cA;
            ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
            if (asn1Boolean != null) {
                errorParamMessage = resourceBundle.getString(asn1Boolean.equals(true) ? "BasicConstraintsProcessor.CAtrue" : "BasicConstraintsProcessor.CAfalse");
            } else {
                errorParamMessage = "";
            }
            if (basicConstraintsSyntax.pathLenConstraint != null) {
                String addSemicolonPost = Extension.addSemicolonPost(errorParamMessage);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(resourceBundle.getString("BasicConstraintsProcessor.ChainLengthConstraints"));
                stringBuffer.append(basicConstraintsSyntax.pathLenConstraint.toString());
                errorParamMessage = addSemicolonPost.concat(stringBuffer.toString());
            }
        } catch (Asn1Exception | IOException unused) {
            errorParamMessage = ExtensionProcessor.getErrorParamMessage();
        }
        return new Extension(getName(), new Extension(errorParamMessage));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "2.5.29.19";
    }
}
