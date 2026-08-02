package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.X509Certificate;
import java.util.ResourceBundle;
import java.util.Vector;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public class KeyUsageProcessor extends ExtensionProcessor {
    public static final String[] b;

    static {
        ResourceBundle defaultBundle = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
        b = new String[]{defaultBundle.getString("digital.signature"), defaultBundle.getString("non.repudiation"), defaultBundle.getString("key.encipherment"), defaultBundle.getString("data.encipherment"), defaultBundle.getString("key.agreement"), defaultBundle.getString("keycert.sign"), defaultBundle.getString("crl.sign"), defaultBundle.getString("encipher.only"), defaultBundle.getString("decipher.only")};
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        Vector vector = new Vector(0);
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage == null) {
            return null;
        }
        for (int i = 0; i < keyUsage.length; i++) {
            if (keyUsage[i]) {
                vector.add(new Extension(b[i]));
            }
        }
        return new Extension(getName(), vector);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return AdESUtility.KEY_USAGE;
    }
}
