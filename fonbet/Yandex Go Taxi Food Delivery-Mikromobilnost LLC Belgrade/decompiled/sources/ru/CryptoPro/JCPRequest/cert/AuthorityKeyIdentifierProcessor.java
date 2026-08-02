package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ResourceBundle;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.AuthorityKeyIdentifier;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.KeyIdentifier;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class AuthorityKeyIdentifierProcessor extends JCPRequestExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        Extension extension;
        Vector vector = new Vector(0);
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("2.5.29.35"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        AuthorityKeyIdentifier authorityKeyIdentifier = new AuthorityKeyIdentifier();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            authorityKeyIdentifier.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            KeyIdentifier keyIdentifier = authorityKeyIdentifier.keyIdentifier;
            ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
            if (keyIdentifier != null) {
                vector.add(new Extension(resourceBundle.getString("AuthorityKeyIdentifierProcessor.KeyID").concat(" = ").concat(Array.toHexLowString(authorityKeyIdentifier.keyIdentifier.value))));
            }
            if (authorityKeyIdentifier.authorityCertIssuer != null) {
                vector.add(new Extension(resourceBundle.getString("AuthorityKeyIdentifierProcessor.CertIssuer"), new GeneralNamesProcessor(authorityKeyIdentifier.authorityCertIssuer, resourceBundle.getString("AuthorityKeyIdentifierProcessor.names")).a(), 22));
            }
            if (authorityKeyIdentifier.authorityCertSerialNumber != null) {
                vector.add(new Extension(resourceBundle.getString("AuthorityKeyIdentifierProcessor.SerialNumber"), new Extension(authorityKeyIdentifier.authorityCertSerialNumber.value.toString(16)), 22));
            }
        } catch (Asn1Exception unused) {
            extension = new Extension(ExtensionProcessor.getErrorParamMessage());
            vector.add(extension);
            return new Extension(getName(), vector);
        } catch (IOException unused2) {
            extension = new Extension(ExtensionProcessor.getErrorParamMessage());
            vector.add(extension);
            return new Extension(getName(), vector);
        } catch (ClassCastException unused3) {
            extension = new Extension(ExtensionProcessor.getErrorParamMessage());
            vector.add(extension);
            return new Extension(getName(), vector);
        }
        return new Extension(getName(), vector);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "2.5.29.35";
    }
}
