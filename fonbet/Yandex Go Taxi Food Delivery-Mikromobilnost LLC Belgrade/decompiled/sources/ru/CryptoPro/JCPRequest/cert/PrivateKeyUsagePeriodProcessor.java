package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.objsys.asn1j.runtime.Asn1OctetString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class PrivateKeyUsagePeriodProcessor extends JCPRequestExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        String errorParamMessage;
        String stringBuffer;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("2.5.29.16"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        PrivateKeyUsagePeriod privateKeyUsagePeriod = new PrivateKeyUsagePeriod();
        try {
            asn1OctetString.decode(asn1DerDecodeBuffer);
            privateKeyUsagePeriod.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            Asn1GeneralizedTime asn1GeneralizedTime = privateKeyUsagePeriod.notBefore;
            ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
            if (asn1GeneralizedTime != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(resourceBundle.getString("PrivateKeyUsagePeriodProcessor.validFrom"));
                stringBuffer2.append(" ");
                stringBuffer2.append(DateFormat.getDateTimeInstance().format(privateKeyUsagePeriod.notBefore.getTime().getTime()));
                stringBuffer2.append(" ");
                errorParamMessage = stringBuffer2.toString();
            } else {
                errorParamMessage = "";
            }
            if (privateKeyUsagePeriod.notAfter != null) {
                if (errorParamMessage.length() != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(errorParamMessage);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(resourceBundle.getString("PrivateKeyUsagePeriodProcessor.to"));
                    stringBuffer3.append(" ");
                    sb.append(stringBuffer3.toString());
                    stringBuffer = sb.toString();
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(resourceBundle.getString("PrivateKeyUsagePeriodProcessor.validTo"));
                    stringBuffer4.append(" ");
                    stringBuffer = stringBuffer4.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(stringBuffer);
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(DateFormat.getDateTimeInstance().format(privateKeyUsagePeriod.notAfter.getTime().getTime()));
                sb2.append(stringBuffer5.toString());
                errorParamMessage = sb2.toString();
            }
        } catch (Asn1Exception | IOException | ClassCastException unused) {
            errorParamMessage = ExtensionProcessor.getErrorParamMessage();
        }
        return new Extension(getName(), new Extension(errorParamMessage));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "2.5.29.16";
    }
}
