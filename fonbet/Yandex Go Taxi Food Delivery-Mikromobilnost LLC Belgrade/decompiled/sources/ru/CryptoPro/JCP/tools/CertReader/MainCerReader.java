package ru.CryptoPro.JCP.tools.CertReader;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class MainCerReader implements CerReaderInterface {
    protected static final String RESOURCE_BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.logger";
    protected static final ResourceBundle resource = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, Locale.getDefault());
    protected ExtendedCerReader eCR;
    protected GeneralCerReader gCR;

    public MainCerReader(X509Certificate x509Certificate) {
        setCertificate(x509Certificate);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public X509Certificate getCertificate() {
        return this.gCR.getCertificate();
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public final Extension getExtension(String str) {
        Extension extension = this.gCR.getExtension(str);
        if (extension == null) {
            try {
                extension = this.eCR.getExtension(str);
            } catch (Exception e) {
                JCPLogger.ignoredException(e);
            }
        }
        if (extension != null) {
            return extension;
        }
        UnknownOIDProcessor unknownOIDProcessor = new UnknownOIDProcessor();
        unknownOIDProcessor.b = str;
        return unknownOIDProcessor.getExtension(getCertificate());
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedCritical() {
        return new Vector(0);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public Collection getNonRealizedNonCritical() {
        return new Vector(0);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public final Collection getRealizedCritical() {
        Vector vector = new Vector(0);
        vector.addAll(this.gCR.getRealizedCritical());
        Set<String> criticalExtensionOIDs = getCertificate().getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            criticalExtensionOIDs = Collections.EMPTY_SET;
        }
        vector.addAll(criticalExtensionOIDs);
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public final Collection getRealizedNonCritical() {
        Vector vector = new Vector(0);
        Set<String> nonCriticalExtensionOIDs = getCertificate().getNonCriticalExtensionOIDs();
        if (nonCriticalExtensionOIDs == null) {
            nonCriticalExtensionOIDs = Collections.EMPTY_SET;
        }
        vector.addAll(nonCriticalExtensionOIDs);
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public void setCertificate(X509Certificate x509Certificate) {
        ExtendedCerReader extendedCerReader = new ExtendedCerReader();
        this.eCR = extendedCerReader;
        extendedCerReader.setCertificate(x509Certificate);
        GeneralCerReader generalCerReader = new GeneralCerReader();
        this.gCR = generalCerReader;
        generalCerReader.setCertificate(x509Certificate);
    }
}
