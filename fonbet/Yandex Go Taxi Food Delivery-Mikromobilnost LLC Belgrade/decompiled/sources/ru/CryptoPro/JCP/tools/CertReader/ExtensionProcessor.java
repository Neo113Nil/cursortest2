package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.params.OIDName;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public abstract class ExtensionProcessor {
    public static final String a = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres").getString("param.reading.error");

    public static String getErrorParamMessage() {
        return a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ExtensionProcessor) {
            return this == obj;
        }
        if (obj instanceof String) {
            return obj.equals(getOID());
        }
        return false;
    }

    public abstract Extension getExtension(X509Certificate x509Certificate);

    public String getName() {
        return OIDName.getName(getOID());
    }

    public abstract String getOID();

    public boolean registerNewProcessor() {
        return ExtendedCerReader.registerNewProcessor(getClass().getName());
    }
}
