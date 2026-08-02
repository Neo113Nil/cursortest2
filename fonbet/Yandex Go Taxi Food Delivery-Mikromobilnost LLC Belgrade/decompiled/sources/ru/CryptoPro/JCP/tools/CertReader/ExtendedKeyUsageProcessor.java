package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.params.OIDName;

/* loaded from: classes4.dex */
public class ExtendedKeyUsageProcessor extends ExtensionProcessor {
    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        Vector vector = new Vector(0);
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage != null) {
                Iterator it = new ArrayList(extendedKeyUsage).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    vector.add(OIDName.getName(next.toString()).equals(next.toString()) ? new Extension(Extension.O_BRAKE_SPACE.concat(next.toString()).concat(Extension.C_BRAKE)) : new Extension(OIDName.getName(next.toString()).concat(Extension.O_BRAKE_SPACE).concat(next.toString()).concat(Extension.C_BRAKE)));
                }
            } else {
                vector.add(new Extension(ExtensionProcessor.getErrorParamMessage()));
            }
        } catch (CertificateParsingException unused) {
            vector.add(new Extension(ExtensionProcessor.getErrorParamMessage()));
        }
        return new Extension(getName(), vector);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return AdESUtility.EXTENDED_KEY_USAGE;
    }
}
