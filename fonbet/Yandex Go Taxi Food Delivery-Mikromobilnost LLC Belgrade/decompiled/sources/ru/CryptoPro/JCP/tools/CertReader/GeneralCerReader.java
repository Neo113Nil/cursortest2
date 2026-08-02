package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.Vector;
import ru.CryptoPro.JCP.params.OIDName;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class GeneralCerReader implements CerReaderInterface {
    private static final String b = "cer.Version";
    private static final String c = "cer.Serial.Number";
    private static final String d = "cer.AlgSign";
    private static final String e = "cer.Issuer";
    protected static final ResourceBundle extensionprivateresource = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    private static final String f = "cer.Valid.From";
    private static final String g = "cer.Valid.To";
    private static final String h = "cer.Owner";
    private static final String i = "cer.Signature";
    private static final String j = "cer.OpenKey";
    private X509Certificate a = null;

    public GeneralCerReader(X509Certificate x509Certificate) {
        setCertificate(x509Certificate);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public final X509Certificate getCertificate() {
        return this.a;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Extension getExtension(String str) {
        if (str.equals(b)) {
            return new Extension(extensionprivateresource.getString(b), new Extension(Integer.toString(getCertificate().getVersion())));
        }
        if (str.equals(c)) {
            return new Extension(extensionprivateresource.getString(c), new Extension(Array.toHexLowString(getCertificate().getSerialNumber().toByteArray())));
        }
        if (str.equals(d)) {
            String sigAlgName = getCertificate().getSigAlgName();
            try {
                String name = OIDName.getName(sigAlgName);
                if (!name.equals(sigAlgName)) {
                    sigAlgName = name;
                }
            } catch (NumberFormatException unused) {
            }
            return new Extension(extensionprivateresource.getString(d), new Extension(sigAlgName));
        }
        if (str.equals(e)) {
            return getIssuer();
        }
        if (str.equals(f)) {
            return new Extension(extensionprivateresource.getString(f), new Extension(DateFormat.getDateTimeInstance().format(getCertificate().getNotBefore())));
        }
        if (str.equals(g)) {
            return new Extension(extensionprivateresource.getString(g), new Extension(DateFormat.getDateTimeInstance().format(getCertificate().getNotAfter())));
        }
        if (str.equals(h)) {
            return getSubject();
        }
        if (str.equals(j)) {
            return new Extension(extensionprivateresource.getString(j), new Extension(getCertificate().getPublicKey().getAlgorithm()));
        }
        if (str.equals(i)) {
            return new Extension(extensionprivateresource.getString(i), new Extension(Array.toHexLowString(getCertificate().getSignature())));
        }
        return null;
    }

    public Extension getIssuer() {
        return new Extension(extensionprivateresource.getString(e), SplitDirectName.getExtensionsOfNames(SplitDirectName.splitName(getCertificate().getIssuerX500Principal().toString())));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedCritical() {
        Vector vector = new Vector(0);
        if (getCertificate() != null) {
            vector.addAll(getCertificate().getCriticalExtensionOIDs());
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedNonCritical() {
        Vector vector = new Vector(0);
        if (getCertificate() != null) {
            vector.addAll(getCertificate().getNonCriticalExtensionOIDs());
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getRealizedCritical() {
        Vector vector = new Vector(0);
        if (getCertificate() == null) {
            return vector;
        }
        if (getCertificate() == null) {
            return null;
        }
        Vector vector2 = new Vector(0);
        vector2.add(b);
        vector2.add(c);
        vector2.add(f);
        vector2.add(g);
        vector2.add(h);
        vector2.add(e);
        vector2.add(j);
        vector2.add(d);
        vector2.add(i);
        return vector2;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getRealizedNonCritical() {
        return new Vector(0);
    }

    public Extension getSubject() {
        return new Extension(extensionprivateresource.getString(h), SplitDirectName.getExtensionsOfNames(SplitDirectName.splitName(getCertificate().getSubjectX500Principal().toString())));
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public final void setCertificate(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    public GeneralCerReader() {
    }
}
