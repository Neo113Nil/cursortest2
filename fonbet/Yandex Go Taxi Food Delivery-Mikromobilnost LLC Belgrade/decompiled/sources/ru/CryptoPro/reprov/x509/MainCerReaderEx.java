package ru.CryptoPro.reprov.x509;

import java.security.cert.X509Certificate;
import ru.CryptoPro.JCP.tools.CertReader.ExtendedCerReader;
import ru.CryptoPro.JCP.tools.CertReader.MainCerReader;

/* loaded from: classes4.dex */
public class MainCerReaderEx extends MainCerReader {
    public MainCerReaderEx(X509Certificate x509Certificate) {
        super(x509Certificate);
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.MainCerReader, ru.CryptoPro.JCP.tools.CertReader.CerReaderInterface
    public void setCertificate(X509Certificate x509Certificate) {
        ExtendedCerReader extendedCerReader = new ExtendedCerReader();
        this.eCR = extendedCerReader;
        extendedCerReader.setCertificate(x509Certificate);
        GeneralCerReaderEx generalCerReaderEx = new GeneralCerReaderEx();
        this.gCR = generalCerReaderEx;
        generalCerReaderEx.setCertificate(x509Certificate);
    }
}
